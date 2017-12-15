(ns consume_edualize.models.expenditure
  (:require [clj-http.client :as client]
            [clojure.data.json :as json]))

(defn parse-JSON
  [response-body]
  (json/read-str response-body))

(defn get-endpoint
  "get json from endpoint"
  [endpoint]
  (:body
    (client/get endpoint)))

(defn all
  []
  (parse-JSON
    (get-endpoint "https://edualize.herokuapp.com/api/v1/median_expenditures/totals")))
