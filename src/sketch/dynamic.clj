(ns sketch.dynamic
  (:require [quil.core :refer :all]))

(defn draw-line [x y w h]
  (if (> (random 0 2) 1)
    (line x y w h)
    (line (+ x w) y x h)))

(defn draw []
  (no-loop)
  (color-mode :hsb 360 100 100 1.0)
  (background 220 49 30)
  (stroke 360)
  (for [x (range 0 (width) 20)
        y (range 0 (height) 20)]
    [(println [x y])])
    ;[(draw-line x y 20 20)])
  (save "sketch.tif"))
