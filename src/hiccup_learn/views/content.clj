(ns hiccup-learn.views.content
    (:require [hiccup.page :as hiccup]
      [hiccup-learn.views.home :refer [data-from-db]]))

(defn home-page-2 []
      (hiccup/html5
        [:head
         [:title "Level 2"]
         ;;<link rel="stylesheet" href="styles.css">
         [:link {:rel "stylesheet"
                 :href "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"}]]
        [:body
         [:div {:style "background-color : silver;"}
          [:center
           [:h1 "There are seven BILLION dwarves"]
           [:h2 "each with a different colored apple"]]

          [:div {:style "width : 50px; backround-color: white;"}]
          [:a {:href "/some/10"} [:h4 "This is what dwarf says"]]
          (into [:ul] (mapv #(do [:li %]) data-from-db))]
         [:p "click Here for"]]))
