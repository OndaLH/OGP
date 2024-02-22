Schrijf een klasse LinkedHashSet die de interface Set uit het hoofdstuk Lists, sets, and maps van de cursustekst implementeert. De methodes contains, add, en remove moeten werken in constante verwachte tijd (aangenomen dat de hashcodes van de elementen uniform verdeeld zijn en dat de load factor begrensd is), en toArray moet in lineaire tijd de elementen teruggeven in de volgorde waarin ze toegevoegd werden. (Het toevoegen van een element dat reeds in de set zit, heeft geen effect op de volgorde.)

Je mag geen gebruik maken van het Java Collections Framework. Je mag wel code uit de cursustekst hergebruiken.

Implementatietip: Houd de elementen bij in een dubbel gelinkte lijst, en gebruik een HashMap om in constante tijd de lijstknoop voor een gegeven element op te kunnen zoeken. (Merk op dat je de klasse LinkedList niet ongewijzigd kunt hergebruiken; je moet immers aan de knoop-objecten kunnen.)
