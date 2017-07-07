(ns hiccup-learn.views.home
    (:require [hiccup.page :as hiccup]))

;;:refer (html5 include-css include-js)

(declare neo-home-page)

(def data-from-db
  ["Black's apple is delicious"
   "I was assigned a gold bullion"
   "I am in the same group as orange"
   "The weather in the mountains changes often. Like yesterday, it rained hard"
   "I'm not in the same group as white"
   "I'm not in the same group as green"
   "Red's apple is probably delicious"])

(defn home-page [input]
      (hiccup/html5
        [:head
         [:title "Level 1"]]
        [:body
         [:div {:style "background-color : silver;"}
          [:center
           [:h1 "There are seven dwarves"]
           [:h2 "each with a different colored apple"]]

          [:div {:style "width : 50px; backround-color: white;"}[:img {:src "/img/IMG_0400.PNG"}]]
          [:h4 "This is what dwarf says"]
          (into [:ul] (mapv #(do [:li %]) data-from-db))]
         [:p "click Here for"]]))


(defn neo-home-page [input]
      (if (symbol? (read-string input))
        [:center
         [:h1 {:style "font-size : 99px;"} "Eh harusnya angka kali"]]
        (hiccup/html5
          [:center
           [:h1 {:style "font-size : 99px;"} (str (inc (read-string input)))]])))

