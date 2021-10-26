# Refactoring

## Material

- [Folien](./material/refactoring.pdf)
- [Online Refactoring Catalog](https://refactoring.com/catalog/)

## Exercises

Alle Übungen in [`src/test/java`](./src/test/java) haben ein `before` und `after` Package.
Beginne mit dem Code in `before` und benutze den 
[Refactoring-Rhythmus](#refactoring-rhythm) um ihn in den Zielzustand zu bringen.
Im Package `after` liegt der (ungefähre) Zielzustand.

- [Exercise 0](./src/test/java/ex0): Extract shared code
- [Exercise 1](./src/test/java/ex1): Replace the conditional with polymorphism
- [Exercise 2](./src/test/java/ex2): Replace primitive with value type

### Refactoring Rhythm

1. Entscheide dich, was dein Ziel ist
2. Überprüfe, dass alle Tests laufen
3. Führe einen kleinen und sicheren Refactoring-Schritt durch
4. Lass alle Tests laufen, um sicherzustellen, dass du nichts kaputt gemacht hast
   - Wenn OK: Commit lokal
   - Wenn nicht OK: Resette den Code auf die letzte funktionierende Version
5. Wiederhole ab Punkt 3 bis dein Ziel ereicht ist


