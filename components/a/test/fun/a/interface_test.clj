(ns fun.a.interface-test
  (:require [clojure.test :as test :refer :all]
            [fun.a.interface :as a]))

(deftest dummy-test
  (testing "test SHOULD run"
    (is (= :a (a/a)))))
