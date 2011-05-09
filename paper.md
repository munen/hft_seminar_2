# Clojure

##1 Einführung/Abstract (_A_)
###1.1 Was ist Clojure?


##2 Funktionale Programmiersprache (_B_)
###2.1 Definition
##2.2 Vorteile/Nachteile

##3 Dynamische Programmiersprache (_A_)
###3.1 Definition
###3.2 Vorteile/Nachteile

#4 Lisp (_A_)
###4.1 Definition
*LISP* wurde 1960 von John McCarthy in einer wissenschaftlichen Arbeit
forciert. Diese Arbeit zeigt auf wie durch einige wenige einfache Operatoren
und einer definierten Notation von Funktionen eine vollwertige
Programmiersprache definiert wird.  Eine von McCarthy's grundlegend neuen Ideen
war eine einfache Datenstruktur sowohl für Code als auch für Daten zu
verwenden. Daher der Term *LISP* - er steht für "List processing". 

McCarthy definierte eine Sprache, die auf nur sechs Grundfunktionen fußte - car,
cdr, cons, cond, lambda und Rekursion. Dabei gab es damals weder verbreiteten
Nutzen von lambda Berechnungen noch von Rekursion. Noch vor McCarthy´s Lisp
wurde bei IBM debattiert zu welchem Zweck Rekursion eigentlich dienen möge und
kam zu keinem sinnigen Schluss. McCarthy klärte diese Fragen jedoch schon in den
ersten Vorträgen in denen er LISP vorstellte[[PG1][]].

In der Essenz gibt heute zwei Paradigmen Programme zu schreiben - der eine
Zweig bedient sich dem Vorbild C's und den aus diesem Gedankengut entstandenen
Sprachen, der andere Zweig sind LISPs und LISP ähnliche Sprachen.  *LISP*
selbst wurde lange Zeit vernachlässigt - aus guten und weniger berechtigten
Gründen. Doch je weiter die Zeit fortschreitet verwenden neue Sprachen zusehens
Denkweisen und Modelle aus *LISP* - beispielsweise "Garbage Collection" und
"Runtime Typing".


###4.2 Abgrenzung Lisp/Clojure
Clojure baut auf dem Stack der Java Virtual Machine auf. Dies bietet einerseits
den Entwicklern der Sprache selbst den Vorteil viele Probleme der Informatik
nicht selbst lösen zu müssen, sondern auf solide Grundlagen wie Datentypen,
Threading oder Portabilität der JVM zurückgreifen zu können. So können sie sich
ganz der Sprache und interessante neue Probleme konzentrieren statt etwa einen
eigenen Garbage Collector schreiben zu müssen. Anwender der Sprache hingegen
kommt dieser Ansatz ebenfalls zu Gute - die Sprache schnell weiter und kann so
in kurzen Iterationen auf neue Eingaben aus der Community reagieren. Abseits von
diesem grundlegenden Vorteil kommt ein wichtiger Business Aspekt: Clojure kann
direkt mit dem Java Ökosystem interagieren und hat so Zugang zu einem reichen
Quell bestehender Software, Bibliotheken und Datenbanken.





































Aufgrund der speziellen Syntax steht im Jargon File[[PG2][]] eine alternative
Beschreibung: "Lots of Irritating Superfluous Parantheses".

#5 Programmiersprachen in der JVM (_B_)
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
###6.1.2 Lösung in Java (_B_)
####6.1.2.1 Konzeptionelle Lösung
####6.1.2.2 Code Beispiel
###6.1.3 Lösung in Ruby (_B_)
####6.1.3.1 Konzeptionelle Lösung
####6.1.3.2 Code Beispiel
###6.1.4 Lösung in Python (_A_)
####6.1.4.1 Konzeptionelle Lösung
####6.1.4.2 Code Beispiel
###6.1.5 Lösung in Clojure (_A_)
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
 * Listen, map, filter, reduce 
 * Keine Variable

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


#7 Zusammenfassung/Schlusswort (_B_)
##7.1 Alleinstellungsmerkmale
##7.2 Einsatzgebiete von Clojure

#8 Bibliographie
[PG1]: http://www.paulgraham.com/mcilroy.html "Doug McIlroy: McCarthy presents LISP"
[PG2]: http://www.paulgraham.com/jargon96.html "Jargon File entry"


#9 Scratch
