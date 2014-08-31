(ns fibonacci_sum_even.t-core
  (:use midje.sweet)
  (:use [fibonacci_sum_even.core]))

(facts "about 'fibonacci sequence'"
  (fact "it returns a sequence with the number 1 when asked for a sequence with one number"
    (fibonacci 1) => '(1))

  (fact "it returns a sequence with the number 1 twice when asked for a sequence with two numbers"
    (fibonacci 2) => '(1 1))

  (fact "it return a correct sequence with 8 elements"
    (fibonacci 8) => '(1 1 2 3 5 8 13 21)))

(facts "about 'summing even numbers from fibonacci sequence'"
  (fact "it returns 0 for a sequence with just one element"
    (sum-even 1) => 0)

  (fact "it returns 2 for a sequence with three elements"
    (sum-even 3) => 2)

  (fact "it returns 10 for a sequence with eight elements"
    (sum-even 8) => 10)

  (fact "it returns 44 for a sequence with ten elements"
    (sum-even 10) => 44))