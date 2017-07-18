(ns hiccup-learn.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [hiccup-learn.views.article :as art]
            [hiccup-learn.views.home :as hp]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [hiccup-learn.views.utilities :as util]
            [hiccup-learn.views.main :as main]))


(defroutes app-routes
  (GET "/" [] (main/my-main hp/home-page "HOME"))
  (GET "/rehan/article" [] (main/my-main art/elon-content "Article"))
  (GET "/rehan/home" [] (main/my-main hp/home-page "Hiccup Learn"))
  (GET "/rehan/tribute" [] (main/my-main hp/tribute-page  "Template"))
  (route/resources "/")                                     ;;here's the resources
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
