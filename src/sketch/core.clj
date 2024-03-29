(ns sketch.core
  (:require [sketch.dynamic :as dynamic])
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(q/defsketch sketch
  :title "You spin my circle right round"
  :size [1920 1080]
  :draw dynamic/draw
  :features [:keep-on-top])

(defn refresh []
  (use :reload 'sketch.dynamic)
  (.loop sketch))
