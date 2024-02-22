Ontwikkel een abstractie die toelaat om grafen bestaande uit personen en de ... is vader van ...-relatie tussen personen op te slaan en te manipuleren. Zorg dat de abstractie goed geëncapsuleerd is en dat de consistentie van de bidirectionele associatie te allen tijde bewaard blijft. Laat de klant toe de vader van een persoon, alsook de verzameling van personen waarvan die persoon de vader is, op te vragen, en een is-vader-van-verbinding toe te voegen en te verwijderen tussen twee personen.

Uiteraard moet je zoals altijd alle geldigheidsvoorwaarden die moeten gelden op de abstracte en concrete toestand van de abstractie documenteren, waaronder in dit geval dus ook de consistentie van de bidirectionele associatie.

Je kan de klasse HashSet uit package java.util van de Java Platform API gebruiken: new HashSet<Person>() maakt een HashSet-object aan dat Person-objecten kan bevatten.

Voorzie een test suite die de abstractie grondig test. Je moet minstens zorgen dat elke statement van je abstractie getest wordt, behalve die statements die enkel uitgevoerd worden bij ongeldige oproepen.
