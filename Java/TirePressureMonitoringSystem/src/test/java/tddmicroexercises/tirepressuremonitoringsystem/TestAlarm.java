package tddmicroexercises.tirepressuremonitoringsystem;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAlarm {

    public static final boolean ON = true;
    public static final boolean OFF = false;

    @Test
    public void uncheckedAlarmIsOff() {
        Alarm alarm = new Alarm();
        boolean actual = alarm.isAlarmOn();
        assertEquals(OFF, actual);
    }

    @Test
    public void checkedAlarmWithLowPressureTurnsAlarmOn() {
        double pressure = 16.9;
        checkAlarm(pressure, ON);
    }

    @Test
    public void checkedAlarmWithPrettyHghPressureKeepsAlarmOff() {
        double pressure = 21;
        boolean expected = OFF;

        checkAlarm(pressure, expected);
    }

    private void checkAlarm(double pressure, boolean expected) {
        Sensor stubSensor = () -> pressure;
        Alarm alarm = new Alarm(stubSensor);
        alarm.check();

        boolean actual = alarm.isAlarmOn();
        assertEquals(expected, actual);
    }

}
