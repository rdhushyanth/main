#lang racket
(define (square x)
  (* x x))
(define improv
  (lambda (guess x)
    (average  guess (/ x guess))))

(define (average x y)
  (/ (+ x y)
     2))


(square 10000000.00335)
(improv 10000000.00335000 100000000067000)
(/ 100000000067000 10000000.00335000)
(+ 10000000.003349999 10000000.00335)