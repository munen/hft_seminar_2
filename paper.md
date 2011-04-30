# Clojure

##1 Einführung/Vorwort
###1.1 Was ist Clojure?


##2 Funktionale Programmiersprache
###2.1 Definition
##2.2 Vorteile/Nachteile

##3 Dynamische Programmiersprache
###3.1 Definition
###3.2 Vorteile/Nachteile

#4 Lisp
###4.1 Definition
*LISP* wurde 1960 von John McCarthy in einer wissenschaftlichen Arbeit
forciert. Diese Arbeit zeigt auf wie durch einige wenige einfache Operatoren
und einer definierten Notation von Funktionen eine vollwertige
Programmiersprache definiert wird.  Eine von McCarthy's grundlegend neuen Ideen
war eine einfache Datenstruktur sowohl für Code als auch für Daten zu
verwenden. Daher der Term *LISP* - er steht für "List processing". 

In der Essenz gibt heute zwei Paradigmen Programme zu schreiben - der eine
Zweig bedient sich dem Vorbild C's und den aus diesem Gedankengut entstandenen
Sprachen, der andere Zweig sind LISPs und LISP ähnliche Sprachen.  *LISP*
selbst wurde lange Zeit vernachlässigt - aus guten und weniger berechtigten
Gründen. Doch je weiter die Zeit fortschreitet verwenden neue Sprachen zusehens
Denkweisen und Modelle aus *LISP* - beispielsweise "Garbage Collection" und
"Runtime Typing".


###4.2 Abgrenzung Lisp/Clojure

#5 Programmiersprachen in der JVM
##5.1 Beispiele
##5.2 Vorteile/Nachteile
##Notes
* JVM: interessante Platform
  * Performanz
  * ubiquitaer
  * "business-proof"

* Sprachportierungen: jRuby, Jython, etc

#6 Probleme und deren Lösungen in unterschiedlichen Programmiersprachen
##6.1 Multithreading/Nebenläufigkeit
###6.1.1 Definition des Problems
###6.1.2 Lösung in Java
####6.1.2.1 Konzeptionelle Lösung
####6.1.2.2 Code Beispiel
###6.1.3 Lösunge in (Common) Lisp
####6.1.3.1 Konzeptionelle Lösung
####6.1.3.2 Code Beispiel
###6.1.4 Lösung in Scala
####6.1.4.1 Konzeptionelle Lösung
####6.1.4.2 Code Beispiel
###6.1.5 Lösung in Clojure
####6.1.5.1 Konzeptionelle Lösung
####6.1.5.2 Code Beispiel
##6.2 *Erweiterbar je nach gewünschtem/erforderlichem  Umfang*
##Notes

* Multithreading Schwachstelle imperativer Ansatz
 * Locking
 * Implementierung (Ruby/Python GIL[Global Interpreter Lock])
 * Fehleranfaellig

* Funktionale Vorteile
 * Immutability
 * Listen, map, filter, reduce -> Keine Variable

* LISP
 * Konziser Code Macros
  * Durch Uebersichtlichkeit weniger fehleranfaellig

* Clojure
 * Software Transactional Memory
 * Laziness
 * Closures


* Code Beispiel
 * Darstellung von Nebenlaeufigkeit
 * Moeglichkeiten
  * Heuristischer Algorithmus (Agenten)
  * Zellulaerer Automat (Brians Brain, Game of Life)
  * Sortier Algorithmen
 * Vorteile Locking vs. echte Nebenlaeufigkeit herausstellen


#7 Zusammenfassung/Schlusswort
##7.1 Alleinstellungsmerkmale
##7.2 Einsatzgebiete von Clojure
