(ns coin-changer.core)

(defn change-for [amount]
  (if(<= amount 0)
  [amount]
  (into [] (repeat amount 1))))
