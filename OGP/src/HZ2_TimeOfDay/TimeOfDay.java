package HZ2_TimeOfDay;

public class TimeOfDay {
    private int hours;
    private int minutes;
    
    /**
     * Constructs a TimeOfDay object with the given hours and minutes.
     * @param hours (0 - 23).
     * @param minutes (0 - 59).
     */
    public TimeOfDay(int hours, int minutes) {
        setHours(hours);
        setMinutes(minutes);
    }
    
    /**
     * Gets hours van TimeOfDay.
     * @return hours.
     */
    public int getHours() {
        return hours;
    }
    
    /**
	 * Set uur van TimeOfDay
	 * 
	 * @pre 0 <= hours <= 23
	 */
    public void setHours(int hours) {
            this.hours = hours;
    }

    /**
     * Gets minutes van TimeOfDay.
     * @return minutes.
     */
    public int getMinutes() {
        return minutes;
    }
    
    /**
	 * Set minute van TimeOfDay
	 * 
	 * @pre 0 <= minutes <= 59
	 */
    public void setMinutes(int minutes) {
            this.minutes = minutes;
    }
}

