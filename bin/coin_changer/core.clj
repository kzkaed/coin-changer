(ns coin-changer.core)

(defn change-for [amount]
  (if (<= amount 0)
    [amount]
	  (if(< amount 5)
	    (into [] (repeat amount 1) )
	    (into [5] (repeat (- amount 5) 1)) )))



