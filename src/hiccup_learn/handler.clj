(ns hiccup-learn.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [hiccup-learn.views.home :as hp]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] "HOME")
  (GET "/:neo" [neo] (hp/home-page (hp/neo-home-page neo)))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
