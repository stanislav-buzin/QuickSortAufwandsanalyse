

# QuickSortAufwandsanalyse

**Projektzweck:**
Analyse des Laufzeitverhaltens (Anzahl der Vergleiche und Tauschoperationen) des Quick-Sort-Algorithmus mit linker Pivot-Wahl bei auf- und absteigend vorsortierten Datenmengen (Worst-Case-Betrachtung) mit regulierbarer Array-Größe.

**Version und Datum:**
1.0 (25.11.2026)

**Autor:**
Stanislav Buzin

**Wie ist das Projekt zu starten (Variante A):**
Über Konsole / Standard-IDE wie VS Code, IntelliJ oder Eclipse starten (`main`-Methode).

**Wie ist das Projekt zu starten (Variante B):**
1 - Das Projekt in BlueJ über die obere Menüleiste ("Projekt" -> "Projekt öffnen...") öffnen.
2 - Über Rechtsklick auf die Klasse `QuickSortAufwandsanalyse` und über Linksklick auf `new QuickSortAufwandsanalyse()` eine neue Instanz erzeugen.
3 - Über Rechtsklick auf das erzeugte Objekt die Methode `void analysiereAufwand(int stellen, int modus)` aufrufen.

**Benutzerhinweise:**
Die Methode `analysiereAufwand(int stellen, int modus)` fordert zwei ganzzahlige Parameter:
`stellen`: Anzahl der Elemente des zu sortierenden Arrays (z. B. 5, 10 oder 100; muss >= 1 sein).
`modus`: Art der Ausgangsbelegung des Arrays:
 `0` = aufsteigend sortiertes Array `{1, 2, ..., n}`
 `1` = absteigend sortiertes Array `{n, ..., 2, 1}`

In der Konsole werden anschließend das aufsteigend sortierte Ergebnis-Array sowie die Gesamtanzahl der durchgeführten Vergleiche und Tausche ausgegeben.
