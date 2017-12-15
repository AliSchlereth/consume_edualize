(ns consume_edualize.views.expenditures.index
  (:require [consume_edualize.views.layout :as layout]
            [hiccup.core :refer [h]]
            [ring.util.anti-forgery :as anti-forgery]))

(defn display-by-state
  [expenditures]
  [:div {:class "all-states"}
  [:ul
    (map
      (fn [expenditure] [:li {:class "state"}
                        [:p "State: " (h (:state expenditure))]
                        [:p "School Type: "(h (:type expenditure))]
                        [:p "Total Expenditure: "(h (:total expenditure))]])
      expenditures)]])

(defn display-index
  [expenditures]
  (layout/common "Edualize"
                  [:div {:class "clear"}]
                    (display-by-state expenditures)))
