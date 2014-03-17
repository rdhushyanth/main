#lang racket

  (define (element r c)
     (cond ((or (> c r) (< r 1) (< c 1)) 0)
           ((= r 1) 1)
           (else (+ (element (- r 1) (- c 1))
                    (element (- r 1) c)))))
   
(element 5 3)