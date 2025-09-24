package com.apollo.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AppointmentModule {
	@Test
public void requestAppointment() {
	Reporter.log("requestAppointment",true);
	System.out.println("requestAppointment has been passed");
}
	@Test
public void cancelAppointment() {
	Reporter.log("cancelAppointment",true);
}
}
