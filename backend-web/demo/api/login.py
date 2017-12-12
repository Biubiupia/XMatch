#!/usr/bin/env python 
from flask import session
from flask_restful import Resource, marshal_with, fields, reqparse, request
from . import format_response_with, success, failure, api, desc, db
from models.models import DepManager

global_fields = {
    "code": fields.Integer,
    "result": fields.String,
    "object": fields.List(fields.Raw),
}

class Login(Resource):
    @format_response_with(None)
    def post(self):
        parser = reqparse.RequestParser()
        parser.add_argument('username', type=str, required=True)
        parser.add_argument('password', type=str, required=True)
        args = parser.parse_args()
        supervisor = DepManager.query.filter_by(manager_name=args.username, role_supervisor=2, password=args.password)
        if supervisor is None:
            return failure(-1,'there is no such supervisor')
        # Add to session
        else:
            session['logged_in'] = True
            return success(None)

api.add_resource(Login, '/login', methods=['POST'])