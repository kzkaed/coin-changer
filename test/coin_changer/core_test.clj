(ns coin-changer.core-test
  (:require [clojure.test :refer :all]
            [coin-changer.core :refer :all]))

(deftest change-for-test 
  (testing "change start"
    (is (= [0] (change-for 0)))))


(deftest change-for-one
  (testing "change for one"
           (is (= [1] (change-for 1)))))

(deftest change-for-two
  (testing "change for two"
           (is (= [1 1] (change-for 2)))))

(deftest change-for-three
  (testing "change for three"
           (is (= [1 1 1] (change-for 3)))))

(deftest change-for-four
  (testing "change for four"
           (is (= [1 1 1 1] (change-for 4)))))

(deftest change-for-nickel
  (testing "change for nickel"
           (is (= [5] (change-for 5)))))

(deftest change-for-five
  (testing "change for six cents"
           (is (= [5 1] (change-for 6)))))