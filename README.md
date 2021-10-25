# Refactoring

## Material

- [Folien](./material/refactoring.pdf)
- [Online Refactoring Catalog](https://refactoring.com/catalog/)

## Exercises

Alle Übungen in [`src/test/java`](./src/test/java) haben ein `before` und `after` Package.
Beginne mit dem Code in `before` und benutze den Refactoring-Rhythmus um ihn zu verändern:

__Refactoring Rhythm:__

1. Entscheide dich, was dein Ziel ist
2. Überprüfe, dass alle Tests laufen
3. Führe einen kleinen und sicheren Refactoring-Schritt durch
4. Lass alle Tests laufen, um sicherzustellen, dass du nichts kaputt gemacht hast
   - Wenn OK: Commit lokal
   - Wenn nicht OK: Resette den Code auf die letzte funktionierende Version
5. Wiederhole ab Punkt 3 bis dein Ziel ereicht ist
