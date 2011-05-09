# Clojure

##1 Einführung/Abstract (_A_)
###1.1 Was ist Clojure?
"Clojure ist ein LISP Dialekt, die als gemeinsame Philosophie *Code als Daten*,
*Macros* und *S-Expressions* haben. Clojure ist eine primär funktionale
Programmiersprache, die ein reiches Angebot an unveränderbaren Datenstrukturen
mit sich bringt. Falls benötigt, bietet Clojure neue Ansätze für veränderbare
Zustände - namentlich *Software transactional memory* und *Agenten* für korrekte
und übersichtliche Implementierung von multi-threaded Designs."[[Clojure.org][]]



* * *


##2 Funktionale Programmiersprache (_B_)
###2.1 Definition
##2.2 Vorteile/Nachteile

* * *

##3 Lisp (_A_)
###3.1 Definition
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
"Runtime Typing". Der Ansatz des *Code als Daten* und der Macros heben LISP
allerdings bis heute eindeutig aus der restlichen Sprachvielfalt hervor.


###3.2 Abgrenzung Lisp/Java/Clojure
Clojure baut auf dem Stack der *Java Virtual Machine* auf. Dies bietet
einerseits den Entwicklern der Sprache selbst den Vorteil viele Probleme der
Informatik nicht selbst lösen zu müssen, sondern auf solide Grundlagen wie
Datentypen, Threading oder Portabilität der JVM zurückgreifen zu können. So
können sie sich ganz der Sprache und interessante neue Probleme konzentrieren
statt etwa einen eigenen Garbage Collector schreiben zu müssen. Anwender der
Sprache hingegen kommt dieser Ansatz ebenfalls zu Gute - die Sprache schnell
weiter und kann so in kurzen Iterationen auf neue Eingaben aus der Community
reagieren. Abseits von diesem grundlegenden Vorteil kommt ein wichtiger Business
Aspekt: Clojure kann direkt mit dem Java Ökosystem interagieren und hat so
Zugang zu einem reichen Quell bestehender Software, Bibliotheken und
Datenbanken.

Mit diesem Modell lößt Clojure gleich mehrere Probleme. Auf Seiten der Sprache
selbst bietet sich eine grundsolide Platform, die zugleich performant wie
portabel ist. Hierfür hat Sun Microsystems über mehr als ein Jahrzehnt hinweg
mehr Resouren investiert als einigen wenigen Entwicklern einer neuen Sprache
möglich ist. Wissend um diese Vorteile der JVM gibt es viele Programmierer, die
bisher willentlich darauf verzichtet haben, da Java verglichen mit Alternativen
weder unbedingt als schön, bündig oder leicht bezeichnet werden kann.

Viele dieser Programmier suchten bisher Zuflucht in anderen Sprachen wie Python
oder Ruby, die noch dazu den Vorteil haben dynamisch getypt zu sein haben. Doch
diese Zuflucht kommt nicht ohne Kosten - Python und Ruby sind in der Ausführung
zwei Größenordnungen langsamer [[Citation needed][]]. Clojure Code kompiliert
jedoch in JVM Bytecode, ist also mit Java binärkompatibel, hat ähnliche
Performanz-Eigenschaften, umgeht aber die ungeliebte Java Syntax.

Andererseits gibt es Programmierer, die die klassische LISP Syntax, die auf
S-Expressions fusst[[Citation needed2][]] (wie sie etwa in Common LISP)
implementiert ist) für zu Klammer-lastig befinden.  Aufgrund dieser speziellen
Syntax steht im Jargon File[[PG2][]] eine alternative Beschreibung des Akrynyms
LISP: "Lots of Irritating Superfluous Parantheses". Auch hier räumt Clojure auf,
indem es ähnlich wie Ruby mit unnötigen Klammern spart. Die Syntax wird um Vectors und Maps

allerdings ohne die
Syntax der S-Expressions zu verlassen, sodass am Ende im Vergleich mit anderen
Sprachen dennoch überproportional viele Klammern übrig bleiben.



* * *


##4 Clojure ist dynamisch (_A_)
###4.1 Definition
Die urprüngliche Definition aus den 1950ern von "dynamischer Programmierung" ist
nicht mehr deckend mit dem heutigen Verständnis. Damals stand es dafür eine
rekursive Funktion zu memoisieren - das bedeutet einen Cache innert einer
rekursiven Funktion zu bisherigen Ergebnissen anzulegen. Heute ist es ein
schwammig verwendeter Begriff, der gültig ist für eine Untermenge aus folgenden
Attributen:
 * Dynanisches Allozieren von Speicher
  * Bereits C erfüllt dieses Kriterium mit malloc() und free()
 * Dynamisch wachsende Datenstrukturen
  * Java erfüllt dieses Kriterium (etwa mit Vector und ArrayList)
 * Dynamisches Generieren von Funktionen und Objekten
  * Auch bekannt als *First Level Functions*
 * Dynamisches Aufrufen einer 'eval' Methode
  * eval ist meist so implementiert, dass Code als String der Methode übergeben
    wird. Mittels dieses Mechanismus kann die Absenz von First Level Funktionen
    abstrahieren.
 * Closures
  * Eine Closure ist die Möglichkeit innerhalb des Kontextes einer Funktion eine
    neue Funktion zu schreiben, die Zugang zum ersten Kontext hat.
 * Macros
  * Mittels Macros ist es möglich dynamisch zur Laufzeit neuen Code zu
    generieren. Richtig eingesetzt bieten Macros beispielsweise die Möglichkeit
    die Syntax der Programmiersprache zu verändern. 

Die Definition geht hier also weit auseinander - nach mancher Definition ist
schon C eine dynamische Sprache. Meist jedoch wird eine Sprache dynamisch
genannt sobald sie *Runtime Types* unterstützt, also Datentypen erst zur
Laufzeit bestimmt. Clojure ist unter den LISPs eine der wenigen dynamisch
getypten Sprachen - jedoch unterstützt Clojure *type hints* aus Gründen der
Performanz.

Clojure ist eine dynamische Programmiersprache, die auf der Java Virtual Machine
und der Microsoft CLR[[Citation needed][]] läuft. Sie ist als universelle
Programmiersprache ausgelegt, die die Zügänglichkeit und die interaktive
Entwicklung von Scriptsprachen mit Effizienz und Robstusteit paart. Obwohl
Clojure in Java Bytecode kompiliert bleibt die Sprache dynamisch, da alle
Clojure Funktionen zur Laufzeit verfügbar sind. 






Für Clojure bedeutet "dynamisch sein" nicht nur eine 






###4.2 Vorteile/Nachteile









* * *



























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
`(defun foo `
`          (list))`
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


* * *


#7 Zusammenfassung/Schlusswort (_B_)
##7.1 Alleinstellungsmerkmale
##7.2 Einsatzgebiete von Clojure

* * *

#8 Bibliographie
[PG1]: http://www.paulgraham.com/mcilroy.html "Doug McIlroy: McCarthy presents LISP"

[PG2]: http://www.paulgraham.com/jargon96.html "Jargon File entry"

[Citation needed]: http://www.alioth.org "Great shootout"

[Citation needed]: http://www.wikipedia.org "S Expressions"

[Clojure.org]: http://clojure.org/ "Clojure Introduction"
