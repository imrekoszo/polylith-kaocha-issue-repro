(ns fun.d.core-test
  (:require [clojure.test :as test :refer :all]
            [fun.d.core :as core]))

(deftest dummy-test
  (testing "test SHOULD run"
    (is (= [:a :b :c 0] (core/stuff)))))
