(ns sketch.core
  (:require [sketch.dynamic :as dynamic])
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(q/defsketch sketch
  :title "You spin my circle right round"
  :size [500 500]
  ; update-state is called on each iteration before draw-state.
  :draw dynamic/draw)

(defn refresh []
  (use :reload 'sketch.dynamic)
  (.loop sketch))
