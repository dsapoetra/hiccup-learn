(ns hiccup-learn.views.home
    (:require [hiccup.page :as hiccup]))

;;:refer (html5 include-css include-js)

(declare neo-home-page)

(def data-from-db
  ["This is whatever this is"
   "Lorem yang banyak "
   "Another whooooaaa"])

(defn home-page []
  [:center
   [:div
    [:h1 {:style "font-size = 99px;"} "Welcome HOME!"]]]
  )
(declare elon-content)

(defn tribute-page []
  (hiccup/html5
    [:head
     [:title "Tribute Page"]
     [:link {:rel "stylesheet"
             :href "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"}]
     [:style ".font-h1 {
                   font-family: Average;
                   font-size: 100px !important;
                   color: black !important;
              }"]]
    [:body
     [:div {:style "background-color: #d3d3d3; padding: auto; border-radius: 6px; margin: auto;"}
      [:center
       [:h1.font-h1 {:style "font-size : 60px; font-family: Average;"} "ELON MUSK"]
       [:h2 [:i "The man inventing the future"]]
       [:div {:style "background-color: white; border-radius: 3px;  max-width: 650px;"}
        [:img
         {:src "http://cdn2.accionpreferente.com/wp-content/uploads/2015/01/elon-musk_31838-620x288.jpg"}]
        [:h6 "Elon Musk"]]

       (elon-content)]]
     [:div
      [:center
       [:h4 "Go to our "
        [:a {:href "/rehan/article"} "article"] "!"]]]]))

(defn elon-content []
  [:div {:style "margin: 10px 200px 10px 200px;"}
   [:h6 "Elon Musk Recognition"
    [:p
     (into [:ul]
           (mapv #(do [:li %]) (range 1 40)))]]])

(def style "h1 {color: red;}")

