(ns fun.b.interface-test
  (:require [clojure.test :as test :refer :all]
            [fun.b.interface :as b]))

(deftest dummy-test
  (testing "test should not run"
    (is (= :b (b/b)))))
