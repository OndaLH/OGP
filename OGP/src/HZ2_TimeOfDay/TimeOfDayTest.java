	package HZ2_TimeOfDay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay time = new TimeOfDay(10, 30);
        assertEquals(10, time.getHours());
        assertEquals(30, time.getMinutes());
	}

}
