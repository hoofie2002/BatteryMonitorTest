package com.empired.android.batterymonitor.test;

import android.content.Context;
import android.content.Intent;
import android.test.AndroidTestCase;

import com.empired.android.batterymonitor.BatteryStatus;
import com.empired.android.batterymonitor.impl.BatteryStatusImpl;

public class BatteryStatusTest extends AndroidTestCase {

	BatteryStatus status = null;
	Intent intent = new Intent();
	
	public void setUp() {
	    final Context context = new BatteryIsolatedContext(null, getContext());
		status = new BatteryStatusImpl(context);
		
	}
	
	public void testIsCharged() {
		assertTrue(status.isBatteryCharging());
	}

	public void testIsFull() {
		assertFalse(status.isBatteryFull());
	}

	public void testPercentage() {
		assertEquals(26, status.getBatteryChargePercentage());
	}
	
	public void testIsOnAC() {
		assertTrue(status.isBatteryOnAC());
	}

	public void testIsOnUSB() {
		assertFalse(status.isBatteryOnUSB());
	}

	
}
