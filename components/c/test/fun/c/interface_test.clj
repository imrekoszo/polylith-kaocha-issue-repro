(ns fun.c.interface-test
  (:require [clojure.test :as test :refer :all]
            [fun.c.interface :as c]))

(deftest dummy-test
  (testing "test should not run"
    (is (= :c (c/c)))))
