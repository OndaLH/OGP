Implementeer de interface List uit het hoofdstuk Lists, sets, and maps van de cursustekst zodanig dat je in constante tijd:

    -een element vooraan kunt toevoegen (aangenomen dat de capaciteit groter is dan de grootte)
    -een element vooraan kunt verwijderen
    -een element achteraan kunt toevoegen(aangenomen dat de capaciteit groter is dan de grootte)
    -een element achteraan kunt verwijderen
    -het element op een gegeven index kunt teruggeven.

Laat de gebruiker toe een capaciteit op te geven. Er mogen meer elementen toegevoegd worden dan de capaciteit; in dat geval hoeven de performance-vereisten echter niet voldaan te worden. Telkens wanneer de capaciteit overschreden wordt, moet de capaciteit verdubbeld worden.

Implementatietip: implementeer een ringbuffer. Dit is een array waarbij je, zoals bij een ArrayList, extra ruimte laat voor toe te voegen elementen, en dus een size-veld hebt, maar ook een start-veld hebt om bij te houden waar de elementen staan in de array. De elementen staan dus niet noodzakelijkerwijze vooraan in de array. Het is mogelijk dat de lijst van elementen achteraan in de array begint en vooraan verderloopt.

(Deze datastructuur is beschikbaar in het Java Collections Framework onder de naam ArrayDeque.)
