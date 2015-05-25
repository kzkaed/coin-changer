(ns coin-changer.core)

(defn get-coin [cents]
  (cond
    (< cents 5) 1
    (< cents 10) 5
    (< cents 25) 10
    (< cents 100) 25
  ))

(defn make-change [cents]
  (loop [cents cents
         change []]
    (if (= cents 0)
      change
      (recur (- cents (get-coin cents)) (conj change (get-coin cents))))))





; 