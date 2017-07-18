(ns hiccup-learn.views.article
  (:require [hiccup.page :as hiccup]))


(defn elon-content []
  [:div
   [:div
    (into [:ul]
          (mapv #(do [:li (str "what the " %)]) (range 10)))]
   [:div
    [:img {:src  "/img/IMG_0400.JPG"
           :size "750px;"}]
    [:h4 "This is the passage"]
    (into [:ol] (mapv #(do [:li %]) (range 1 20)))]
   [:div
    [:center
     [:h4
      [:a {:href "/rehan/tribute"} "back"]]]]])

