(ns consume_edualize.controllers.expenditures
  (:require [compojure.core :refer [defroutes GET]]
            [clojure.string :as str]
            [ring.util.response :as ring]
            [consume_edualize.views.expenditures.index :as index]
            [consume_edualize.models.expenditure :as model]))

(defn index
  []
  (index/display-index (model/all)))

(defroutes routes
  (GET "/" [] (index)))
