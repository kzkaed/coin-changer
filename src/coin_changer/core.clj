(ns coin-changer.core)
  
(def COINS [1 5 10 25])
            


(defn make-change [amount]
  (if (<= amount 0)
    []
    (repeat amount 1)))