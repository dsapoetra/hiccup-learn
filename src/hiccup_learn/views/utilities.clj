(ns hiccup-learn.views.utilities
  (:require [hiccup.page :as hiccup]))

(declare gen-buttons)

(defn header []
  [:div
      ;;[:img {:src "http://www.digitalimpulse.com/wp-content/uploads/2014/03/create-header.jpg"}]
      [:ul.nav-ul
       [:li.nav-li [:a.active {:href "#home"} "Home"]]
       [:li.nav-li [:a {:href "#news"} "News"]]
       [:li.nav-li [:a {:href "#contact"} "Contact"]]
       [:li.nav-li [:a {:href "#about"} "About"]]
       ]
      ])

(defn gen-buttons []
  [:div
   [:button {:type "button"} "Lorem"]
   [:button {:type "button"} "Ipsum"]
   [:button {:type "button"} "Dolor"]])

(defn footer []
  (hiccup/html5
    [:head
     [:link {:rel  "stylesheet"
             :href "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"}]
     [:link {:rel "stylesheet"
             :href "//maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css"}]
     [:style "
            $primary-light-blue: #8DB9ED;
            $primary-line-color: #ccc;
            * {
              box-sizing: border-box
            }
            html, body {
              height: 100%
            }
            body {
              font: 11px \"Open Sans\", sans-serif;
              -webkit-font-smoothing: antialiased;
              -moz-osx-font-smoothing: grayscale;
              margin: auto;
              display: flex;
              flex-flow: column nowrap;
              //This justify-content is essentially unnecessary in Firefox and Chrome due to the flex: 1 1 auto on the main.  However, it's needed to push the footer down on IE11
              justify-content: space-between
            }
            ul {
              list-style: none
            }
            a {
              text-decoration: none
            }
            .generic-anchor {
              color: $primary-light-blue;
              &:visited {
                color: $primary-light-blue
              }
              &:hover {
                color: $primary-line-color
              }
            }
            .flex-rw {
              display: flex;
              flex-flow: row wrap;
            }

            footer {
              background: rgb(55,55,55) !important;
              margin-top: auto;
              width: 100%
            }
            .footer-list-top {
              width: 33.333%
            }
            .footer-list-top > li {
              text-align: center;
              padding-bottom: 10px
            }
            .footer-list-header {
              padding: 10px 0 5px 0;
              color: #fff;
              font: 2.3vw \"Oswald\", sans-serif
            }
            .footer-list-anchor {
              font: 1.3em \"Open Sans\", sans-serif
            }
            .footer-social-section {
              width: 100%;
              align-items: center;
              justify-content: space-around;
              position: relative;
              margin-top: 5px;
            }
            .footer-social-section::after {
              content: "";
              position: absolute;
              z-index: 1;
              top: 50%;
              left: 10px;
              border-top: 1px solid $primary-line-color;
              width: calc(100% - 20px)
            }
            .footer-social-overlap {
              position: relative;
              z-index: 2;
              background: rgb(55,55,55);
              padding: 0 20px
            }
            .footer-social-connect {
              display: flex;
              align-items: center;
              font: 3.5em \"Oswald\", sans-serif;
              color: #fff
            }
            .footer-social-small {
              font-size: 0.6em;
              padding: 0px 20px
            }
            .footer-social-overlap > a {
              font-size: 3em
            }
            .footer-social-overlap > a:not(:first-child) {
              margin-left: 0.38em
            }
            .footer-bottom-section {
              width: 100%;
              padding: 10px;
              border-top: 1px solid $primary-line-color;
              margin-top: 10px
            }
            .footer-bottom-section > div:first-child {
              margin-right: auto
            }
            .footer-bottom-wrapper {
              font-size: 1.5em;
              color: #fff
            }
            .footer-address {
              display: inline;
              font-style: normal
            }
            @media only screen and (max-width: 768px) {
              .footer-list-header {
                font-size: 2em
              }
              .footer-list-anchor {
                font-size: 1.1em
              }
              .footer-social-connect {
                font-size: 2.5em
              }
              .footer-social-overlap > a {
                font-size: 2.24em
              }
              .footer-bottom-wrapper {
                font-size: 1.3em
              }
            }
            @media only screen and (max-width: 568px) {
              main {
                font-size: 5em
              }
              .footer-list-top {
                width: 100%
              }
              .footer-list-header {
                font-size: 3em;
              }
              .footer-list-anchor {
                font-size: 1.5em
              }
              .footer-social-section {
                justify-content: center
              }
              .footer-social-section::after {
                top: 25%
              }
              .footer-social-connect {
                margin-bottom: 10px;
                padding: 0 10px
              }
              .footer-social-overlap {
                display: flex;
                justify-content: center;
              }
              .footer-social-icons-wrapper {
                width: 100%;
                padding: 0
              }
              .footer-social-overlap > a:not(:first-child) {
                margin-left: 20px;
              }
              .footer-bottom-section {
                padding: 0 5px 10px 5px
              }
              .footer-bottom-wrapper {
                text-align: center;
                width: 100%;
                margin-top: 10px
              }
            }
            @media only screen and (max-width: 480px) {
              .footer-social-overlap > a {
                margin: auto
              }
              .footer-social-overlap > a:not(:first-child) {
                margin-left: 0;
              }
              .footer-bottom-rights {
                display: block
              }
            }
            @media only screen and (max-width: 320px) {
              .footer-list-header {
                font-size: 2.2em
              }
              .footer-list-anchor {
                font-size: 1.2em
              }
              .footer-social-connect {
                font-size: 2.4em
              }
              .footer-social-overlap > a {
                font-size: 2.24em
              }
              .footer-bottom-wrapper {
                font-size: 1.3em
              }
            }"]]
    [:body
     [:link {:href "https://fonts.googleapis.com/css?family=Open+Sans" :rel "stylesheet"}]
     [:footer.flex-rw
      [:ul.footer-list-top
       [:li [:h4.footer-list-header "About Lorem"]]
       [:li [:a.generic-anchor.footer-list-anchor {:href "#"
                                                   :itemprop "significantLink"} "GET TO KNOW US"]]
       [:li [:a.generic-anchor.footer-list-anchor {:href     "#"
                                                   :itemprop "significantLink"} "PROMOS"]]
       [:li [:a.generic-anchor.footer-list-anchor {:href     "#"
                                                   :itemprop "significantLink"} "BECOME A RETAILER"]]
       [:li [:a.generic-anchor.footer-list-anchor {:href "#"
                                                   :itemprop "significantLink"} "JOB OPENINGS"]]
       [:li [:a.generic-anchor.footer-list-anchor {:href "#"
                                                   :itemprop "significantLink"} "EVENTS"]]]
      [:ul.footer-list-top
       [:li [:h4.footer-list-header "The Gift Selection"]]
       [:li [:a.generic-anchor.footer-list-anchor {:href "#"} "ANGEL FIGURINES"]]
       [:li [:a.generic-anchor.footer-list-anchor {:href "#"} "HOME DECOR"]]
       [:li [:a.generic-anchor.footer-list-anchor {:href "#"} "MUGS"]]
       [:li [:a.generic-anchor.footer-list-anchor {:href "#"} "PET LOVER"]]
       [:li [:a.generic-anchor.footer-list-anchor {:href "#"
                                                   :target "_blank"} "HANDBAGS & JEWELRY"]]

       ]

      [:ul.footer-list-top
       [:li#help [:h4.footer-list-header "Please Help Me"]]
       [:li [:a.generic-anchor.footer-list-anchor {:href "#"
                                                   :itemprop "significantLink"} "CONTACT"]]
       [:li [:a.generic-anchor.footer-list-anchor {:href "#"
                                                   :itemprop "significantLink"} "FAQ"]]
       [:li#find-a-store [:a.generic-anchor.footer-list-anchor {:href "#"
                                                   :itemprop "significantLink"} "STORE LOCATOR"]]
       [:li#user-registration [:a.generic-anchor.footer-list-anchor {:href "#"
                                                                     :itemprop "significantLink"} "NEW USERS"]]
       [:li#order-tracking [:a.generic-anchor.footer-list-anchor {:href "#"
                                                                  :itemprop "significantLink"} "ORDER STATUS"]]
       [:li ]]

      [:section.footer-social-section.flex-rw
       [:span.footer-social-overlap.footer-social-connect "CONNECT "
        [:span.footer-social-small "with"] "US"]
       [:span.footer-social-overlap.footer-social-icons-wrapper
        [:a.generic-anchor {:href "#" :target "_blank" :title "Pinterest" :itemprop "significantLink"}
         [:i.fa.fa-pinterest]]
        [:a.generic-anchor {:href "#" :target "_blank" :title "Facebook" :itemprop "significantLink"}
         [:i.fa.fa-facebook]]
        [:a.generic-anchor {:href "#" :target "_blank" :title "Twitter" :itemprop "significantLink"}
         [:i.fa.fa-twitter]]
        [:a.generic-anchor {:href "#" :target "_blank" :title "Instagram" :itemprop "significantLink"}
         [:i.fa.fa-instagram]]
        [:a.generic-anchor {:href "#" :target "_blank" :title "Youtube" :itemprop "significantLink"}
         [:i.fa.fa-youtube]]
        [:a.generic-anchor {:href "#" :target "_blank" :title "Google Plus" :itemprop "significantLink"}
         [:i.fa.fa-google-plus]]
        ]]

      [:section.footer-bottom-section.flex-rw
       [:div.footer-bottom-wrapper
        [:i.fa.fa-copyright {:role "copyright"}] "2017 "
        [:address.footer-address {:role "company address"} "DEPOK, JABAR"]
        [:span.footer-bottom-rights " - All Rights Reserved - "]]
       [:div.footer-bottom-wrapper
        [:a.generic-anchor {:href "#" :rel "nofollow" } "Terms"] "|"
        [:a.generic-anchor {:href "#" :rel "nofollow" } "Privacy"]
        ]]]
      ]))