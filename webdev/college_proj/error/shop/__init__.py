from flask import Flask
from flask_sqlalchemy import SQLAlchemy

# create the extension
# db = SQLAlchemy()
# create the app
app = Flask(__name__)
# configure the SQLite database, relative to the app instance folder
app.config["SQLALCHEMY_DATABASE_URI"] = "sqlite:///myshop.db"
# initialize the app with the extension
db = SQLAlchemy(app)
from shop import admin
