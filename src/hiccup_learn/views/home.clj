(ns hiccup-learn.views.home
    (:require [hiccup.page :as hiccup]))

;;:refer (html5 include-css include-js)

(declare neo-home-page)

(def data-from-db
  ["This is whatever this is"
      "Lorem yang banyak "
      "Another whooooaaa"])

(defn home-page [input]
      (hiccup/html5
        [:head
         [:title "Hiccup learn"]]
        [:body
         [:div
          (into [:ul]
                (mapv #(do [:li (str "what the " %)]) (range (read-string input))))]
         [:div
          [:img {:src "/img/IMG_0400.JPG"}]
          [:h4 "This is the passage"]
          (into [:ol] (mapv #(do [:li %]) data-from-db))]]))


(defn neo-home-page [input]
      (if (symbol? (read-string input))
        [:center
         [:h1 {:style "font-size : 99px;"} "Eh harusnya angka kali"]]
        (hiccup/html5
          [:center
           [:h1 {:style "font-size : 99px;"} (str (inc (read-string input)))]])))


(defn newthings []
  (+ 3 3))