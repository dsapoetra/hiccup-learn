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


(defn template-page []
   (hiccup/html5
     [:head
      [:title "Template"]]
     [:body
      [:div
       [:h1 "This is Template"]]]))

(declare elon-content)

(defn tribute-page []
  (hiccup/html5
    [:head
     [:title "Tribute Page"]
     [:style ""]]

    [:body
     [:div {:style "background-color: #d3d3d3; padding: auto; border-radius: 6px; margin: auto;"}
      [:center
       [:h1 {:style "font-size : 60px; font-family: Average;"} "ELON MUSK"]
       [:h2 [:i "The man inventing the future"]]

       [:div {:style "background-color: white; border-radius: 3px;  max-width: 650px;"}
        [:img
         {:src "http://cdn2.accionpreferente.com/wp-content/uploads/2015/01/elon-musk_31838-620x288.jpg"}]
        [:h6 "Elon Musk"]]

       (elon-content)]]]))

(defn elon-content []
  [:div {:style "margin: 10px 200px 10px 200px;"}
   [:h6 "Elon Musk Recognition"
    [:p
     (into [:ul]
           (mapv #(do [:li %]) (range 1 40)))]]])

(def style "h1 {color: red;}")

