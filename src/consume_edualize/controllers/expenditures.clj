(ns consume_edualize.expenditures
  (:require [compojure.core :refer [defroutes GET]]
            [clojure.string :as str]
            [ring.util.response :as ring]
            [consume_edualize.views.expenditures.index :as index]
            [consume_edualize.models.expenditure :as model]))

(defn index
  []
  (index/format (model/get-endpoint)))

(defroutes routes
  (GET "/" [] (index)))
