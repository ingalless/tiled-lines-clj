(ns sketch.dynamic
  (:require [quil.core :refer :all]))

(defn draw-line [x y w h]
  (let [width (+ x w)
        height (+ y h)]
    (if (> (random 0 2) 1)
      (line x y width height)
      (line width y x height))))


(defn draw []
  (no-loop)
  (color-mode :hsb 360 100 100 1.0)
  (stroke-weight 4)
  (background 220 49 30)
  (stroke 45 30 65)
  (doseq [x (range 0 (width) 30)
          y (range 0 (height) 30)]
    (draw-line x y 30 30))
  (save "sketch.tif")
  (save "sketch.png"))
