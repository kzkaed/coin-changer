(ns coin-changer.core-spec
  (:require [speclj.core :refer :all]
            [coin-changer.core :refer :all]))



(describe "coin changer"
  (it "can change 1 cent"
      (should= [1] (make-change 1)))
  
  (it "can change 2 cents"
      (should= [1 1] (make-change 2)))
  
  (it "can change 4 cents"
      (should= [1 1 1 1] (make-change 4)))
  
  
  (it "can change 5 cents as a nickel"
       (should= [5] (make-change 5)))
          
)

