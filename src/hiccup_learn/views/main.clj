(ns hiccup-learn.views.main
  (:require [hiccup.page :as hiccup]
            [hiccup-learn.views.utilities :as util]))

(defn my-main [input-body input-title]
  (hiccup/html5
    [:head
      [:title input-title]
      [:link {:rel  "stylesheet"
              :href "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"}]
      [:style "  .button {
                        background-color: #4CAF50; /* Green */
                        border: none;
                        color: white;
                        padding: 15px 32px;
                        text-align: center;
                        text-decoration: none;
                        display: inline-block;
                        font-size: 16px;
                  }

                 .nav-ul {
                        list-style-type: none;
                        margin: 0;
                        padding: 0;
                        overflow: hidden;
                        background-color: #333;
                    }
                 .nav-li {
                        float: left;
                    }

                 .nav-li a {
                        display: block;
                        color: white;
                        text-align: center;
                        padding: 14px 16px;
                        text-decoration: none;
                    }

                 .nav-li a:hover:not(.active) {
                        background-color: #111;
                    }

                 .active {
                        background-color: #4CAF50;
                    }

                 "]]
    [:body
     (util/header)
      (input-body)
     (util/footer)]))
