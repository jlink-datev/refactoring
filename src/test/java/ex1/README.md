## Refactoring Exercise 1

### Goal

The class `Account` has an `accountType` attribute that differentiates between three types of accounts.
This leads to conditional logic in method `isWithdrawCovered`.

Replace the conditional logic by polymorphism in three subclasses of `Account`:
- `CheckingAccount`
- `InstantAccessAccount`
- `SavingsAccount`

The tests in `AccountTests` can remain unchanged.