#lang racket
(define (sqrt-iter guess x)
  (if (good-enough? guess x)
      guess
      (sqrt-iter (improv guess x)
                 x)))
(define improv
  (lambda (guess x)
    (average  guess (/ x guess))))

(define (average x y)
  (/ (+ x y)
     2))

(define (good-enough? guess x)
  (display guess)(newline)
  (< (abs (- (* guess guess) x)) 0.001))

(define (sqrt-g x)
  (sqrt-iter 1.0 x))
(define (square x)
  (* x x))

(sqrt-g 100000000067000)
(square (sqrt-g 100000000067000))
