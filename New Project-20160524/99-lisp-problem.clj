(O 
 "P05 (*) Reverse a list."
 (reverse '(1, 1, 2, 3, 5, 8))
)

; 
(O 
 "P06 (*) Find out whether a list is a palindrome."
 (= "mom" (apply str (reverse "mom")))
)

(O
 "P07 (**) Flatten a nested list structure."
 (flatten '(((1, 1), 2, (3 (5, 8)))))
)

(O
 "P08 (**) Eliminate consecutive duplicates of list elements."
 (reverse (into '() (set '(a, a, a, a, b, c, c, a, a, d, e, e, e, e))))
)

(O
 "P09 (**) Pack consecutive duplicates of list elements into sublists."
 '(a, a, a, a, b, c, c, a, a, d, e, e, e, e)
)

(O
 "p10.lisp P10 (*) Run-length encoding of a list."
 '(group-by count? '(a a a a b c c a a d e e e e))
)

