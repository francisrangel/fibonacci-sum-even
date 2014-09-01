(ns fibonacci_sum_even.t-core
  (:use midje.sweet)
  (:use [fibonacci_sum_even.core]))

(facts "about 'fibonacci sequence'"
  (fact "it returns a fibonacci sequence"
    (fibonacci 1) => '(1)
    (fibonacci 2) => '(1 1)
    (fibonacci 8) => '(1 1 2 3 5 8 13 21)))

(facts "about 'summing even numbers from fibonacci sequence'"
  (fact "it sums the even numbers on a fibonacci sequence"
    (sum-even 1) => 0
    (sum-even 2) => 0
    (sum-even 3) => 2
    (sum-even 10) => 44))
