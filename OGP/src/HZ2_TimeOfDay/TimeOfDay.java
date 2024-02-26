package HZ2_TimeOfDay;

// Hoe ontwikkel ik een data-abstractie?
//	1) De API definieren: hoe kunnen & moeten klanten de abstractie gebruiken?
//	  a) Korte informele documentatie bij classe documentatie bij classe zelf: wat slaat een instantie o (mutable abstraction) of stelt voor?(immutable abstraction)
//	  b)De rauwe abstractietoestandsruimte definieren: de getters declareren
//	2) De abstractie implementeren in termen van java-constructies: velden en method/constructor bodies toevoegen
//	  a) Een represenatie kiezen
//		i. Rauwe concretetoestandsruimte introduceren
//		ii. Geldige concretetoestandsruimte definieren = invarianten noteren (@invar-clausules bij de velden)
//		iii. Abstractierelatie definieren (getters implementeren)
//		Sanity checks:
//		1) De getters mogen voor geen enkele geldige toestand crashen
//		2) De getters moeten elke geldige concrete toestand afbeelden op  een gedige abstracte toestand
//	  b) Implementeran van de constructoren en mutatoren		

/**Elke instantie van deze klasse slaat een tijdstip op, gegeven door een aantal uren sinds middernacht en een aantal minuten binnen het uur
 * 
 * @invar | getMinutesSinceMidnight() == getHours() * 60 + getMinutes()
 * @invar | 0 <= getHours() && getHours() <=23
 * @invar | 0 <= getMinutes() && getMinutes() <=23
 */
public class TimeOfDay {
	/**
	 * @invar | 0 <= hours && hours <= 23
	 * @invar | 0 <= minutes && minutes <= 59
	 */
    private int hours;
    private int minutes;
    
    /**
     * Constructs a TimeOfDay object with the given hours and minutes.
     * @pre | 0 <= hours && hours <= 23
     * @pre | 0 <= minutes && minutes <= 59
     * 
     * @post | getHours() == hours
     * @post | getMinutes() == minutes
     */
    public TimeOfDay(int hours, int minutes) {
        setHours(hours);
        setMinutes(minutes);
    }
    
    /**
     * Gets hours van TimeOfDay.

     */
    public int getHours() {
        return hours;
    }
    

    public int getMinutesSinceMidnight() {
    	return getHours()*60 + getMinutes();    
    	}
    
    /**
     * Sets amount of minutes after midnight
     * @pre | 0 <= MinutesSinceMidnight && MinutesSinceMidnight <= 24*60
     * 
     * @mutates | this
     * 
     * @post | getMinutesSinceMidnight() == MinutesSinceMidnight
     */
    public void setMinutesSinceMidnight(int MinutesSinceMidnight) {
    	hours = MinutesSinceMidnight / 60;
    	minutes = MinutesSinceMidnight % 60;
    }
    
    /**
	 * Set uur van TimeOfDay
	 * 
     * @pre | 0 <= newhours && newhours <=23
     * 
     * @mutates | this
     * 
     * @post | getHours() == newhours
     * @post | getMinutes() == old(getMinutes())
	 */
    public void setHours(int newhours) {
            hours = newhours;
    }

    /**
     * Gets minutes van TimeOfDay.
     * @return minutes.
     */
    public int getMinutes() {
        return minutes;
    }
    
    /**
	 * Set minutes van TimeOfDay
	 * 
     * @pre | 0 <= newminutes && newminutes <=23
     * 
     * @mutates | this
     * 
     * @post | getMinutes() == newminutes
     * @post | getHours() == old(getHours())
	 */
    public void setMinutes(int newminutes) {
            minutes = newminutes;
    }
}

