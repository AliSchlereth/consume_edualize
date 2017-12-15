(ns consume_edualize.web
  (:require [compojure.core :refer [defroutes]]
            [ring.adapter.jett :as ring]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defualts site-defaults]]
            [consume_edualize.controllers.expenditures :as expenditures]
            [consume_edualize.views.layout :as layout]
            [consume_edualize.models.migration :as schema])
  (:gen-class))
