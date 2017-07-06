(ns hiccup-learn.views.home
    (:require [hiccup.page :as hiccup]))

;;:refer (html5 include-css include-js)

(defn home-page [input input-2]
      (hiccup/html5
        [:head
         [:title "Hiccup learn"]]

        [:body
         [:div
          input]
         [:div
          input-2]]))

(defn neo-home-page [input]
      (if (symbol? (read-string input))
        [:center
         [:h1 {:style "font-size : 99px;"} "Eh harusnya angka kali"]]
        (hiccup/html5
          [:center
           [:h1 {:style "font-size : 99px;"} (str (inc (read-string input)))]])))

