(ns fibonacci_sum_even.core)

(def fib-seq
  ((fn rfib [a b]
    (lazy-seq (cons a (rfib b (+ a b)))))
  1 1))

(defn fibonacci [n]
	(take n fib-seq))

(defn sum-even [n]
  (let [ sequence (fibonacci n)]
    (reduce + (filter even? sequence))))