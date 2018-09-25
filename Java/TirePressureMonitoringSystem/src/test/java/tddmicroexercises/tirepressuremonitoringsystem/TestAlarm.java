package tddmicroexercises.tirepressuremonitoringsystem;


import org.assertj.core.api.Condition;
import org.junit.*;
import static org.junit.Assert.*;

public class TestAlarm {

    @Test
    public void uncheckedAlarmIsOff() {
        Alarm alarm = new Alarm();
        assertEquals(false, alarm.isAlarmOn());
    }

    @Test
    public void checkedAlarmWithLowPressureTurnsAlarmOn() {
        Alarm alarm = new Alarm();
        alarm.check();
        assertEquals(true, alarm.isAlarmOn());



    }
}
