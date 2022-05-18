(ns fun.s.interface
  (:require [clojure.spec.alpha :as s]))

(defn s [n]
  (* n (if (zero? (rand-int 10)) 3 2)))

(s/fdef s
  :args (s/cat :n (s/and pos-int? #(< % 10000)))
  :ret pos-int?
  :fn #(= (:ret %) (-> % :args :n (* 2))))
