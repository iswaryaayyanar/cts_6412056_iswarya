Time Complexity
Recursive Calculation:

Relation: Value(t) = Value(t - 1) × (1 + rate)

Time: O(n)

Space: O(n) (due to recursion stack)

Memoized Calculation:

Time: O(n)

Space: O(n) (for cache + recursion stack)

Avoids recalculating the same year multiple times