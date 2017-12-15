(ns consume_edualize.views.expenditures.index
  (:require [consume_edualize.views.layout :as layout]
            [hiccup.core :refer [h]]
            [ring.util.anti-forgery :as anti-forgery]))

(defn display-by-state
  [expenditures]
  [:div {:class "all-states"}
  (println expenditures)
    (map
      (fn [expenditure] [:ul {:class "state"} [:li (h (:state expenditure))] [:li (h (:type expenditure))] [:li (h (:total expenditure))]])
      expenditures)])

(defn display-index
  [expenditures]
  (layout/common "Edualize"
                  [:div {:class "clear"}]
                    (display-by-state expenditures)))
