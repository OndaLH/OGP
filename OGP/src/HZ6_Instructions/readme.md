Implementeer een methode "void execute(int[] registers, ?[] instructions)" die een programma uitvoert, gegeven als een array van instructies. Het elementtype van deze laatste array moet je zelf bepalen. De instructies kunnen de registers (de elementen van de array "registers") uitlezen en aanpassen. De mogelijke instructies zijn:

- LoadConstant(r, c): laadt de int-waarde c in het register op index r

- Decrement(r): verlaagt de waarde van het register op index r met 1

- Multiply(r1, r2): vervangt de waarde van het register op index r1 door haar product met de waarde van het register op index r2

- JumpIfZero(r, a): springt naar de instructie op index a in "instructions" als de waarde van het register op index r gelijk is aan 0

- Jump(a): springt naar de instructie op index a

- Halt(): stopt de uitvoering

Bijvoorbeeld: als je het volgende programmaatje uitvoert vertrekkende van een "registers"-array met op index 0 de waarde x en op index 1 de waarde y, dan zal na afloop op index 2 de waarde x tot de macht y zitten:

LoadConstant(2, 1)

JumpIfZero(1, 5)

Multiply(2, 0)

Decrement(1)

Jump(1)

Halt()

Definieer eerst de nodige klassen om de verschillende soorten instructies voor te stellen, en zodat je een elementtype kunt bepalen voor de instructions-array.

In de les over Polymorfisme: doe in de execute-methode van de Machine-klasse een gevalsanalyse op het type instructie en implementeer in diezelfde methode het gedrag van elke soort instructie.

In de les over Dynamische binding: implementeer het gedrag voor een soort instructie in de klasse voor die soort instructie, en pas dynamische binding toe zodat je de execute-methode van klasse Machine niet moet aanpassen wanneer je een nieuw soort instructie (bv. Add of Divide) toevoegt. Hint: Opdat een instructie de variabele kan aanpassen die de index van de huidige instructie bevat (typisch de program counter genoemd): maak van die variabele een veld van klasse Machine en geef het Machine-object door aan de instructie.
