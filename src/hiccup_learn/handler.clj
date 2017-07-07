(ns hiccup-learn.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [hiccup-learn.views.home :as hp]
            [hiccup-learn.views.content :as hp2]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))


(defroutes app-routes
  (GET "/" [] "HOME")
  (GET "/some/:neo" [neo] (hp/home-page neo))
  (GET "/billion" [] (hp2/home-page-2))
  (route/resources "/")                                     ;;here's the resources
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
