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
  
  (it "can change 6 cents "
       (should= [5 1] (make-change 6)))
  
  (it "can change 8 cents "
      (should= [5 1 1 1] (make-change 8)))
  
   (it "can change 10 cents as a dime "
      (should= [10] (make-change 10)))
   
   (it "can change 11 cents as a dime and penny"
      (should= [10 1] (make-change 11)))
   
    (it "can change 15 cents as a dime and nickel"
      (should= [10 5] (make-change 15)))
    
        (it "can change 25 cents as a quarter"
      (should= [25] (make-change 25)))
        
           (it "can change 66 cents "
      (should= [25 25 10 5 1] (make-change 66)))
                                  
)

