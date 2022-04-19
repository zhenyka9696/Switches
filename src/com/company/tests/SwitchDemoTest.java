package com.company.tests;

import com.company.switches.SwitchDemo;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SwitchDemoTest {
    @Test
    public void getDayOfWeek(){
assertEquals("Monday", SwitchDemo.getDayOfWeek(1));
assertEquals("Tuesday", SwitchDemo.getDayOfWeek(2));
assertEquals("Wednesday", SwitchDemo.getDayOfWeek(3));
assertEquals("Error", SwitchDemo.getDayOfWeek(0));
}
}