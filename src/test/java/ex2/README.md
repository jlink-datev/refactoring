## Refactoring Exercise 2

### Goal

The class `Account` so far uses type `int` to store the `balance` and in 
its `withdraw` and `deposit` methods.

Replace `int` with value type `Euro` in both the public interface and 
as internal storage mechanism.

The tests in `AccountTests` will have to be adapted and maybe complemented.