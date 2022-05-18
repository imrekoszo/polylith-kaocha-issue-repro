(ns fun.s.interface
  (:require [clojure.spec.alpha :as s]))

(defn s [n]
  (* n 2))

(s/fdef s
  :args (s/cat :n (s/and pos-int? #(< % 10000)))
  :ret pos-int?
  :fn #(= (:ret %) (-> % :args :n (* 2))))
