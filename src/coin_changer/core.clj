(ns coin-changer.core)
  
(def COINS [1 5 10 25])
            


(defn make-change [cents]
  (if (< cents 5)
    (into [] (repeat cents 1))
    (into [5] (repeat (- cents 5) 1))))

