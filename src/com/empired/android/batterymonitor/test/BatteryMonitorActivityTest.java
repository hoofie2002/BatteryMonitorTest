package com.empired.android.batterymonitor.test;

import com.empired.android.batterymonitor.BatteryMonitorMain;

import android.test.ActivityInstrumentationTestCase2;

public class BatteryMonitorActivityTest extends
		ActivityInstrumentationTestCase2<BatteryMonitorMain> {

	BatteryMonitorMain mActivity = null;
	
	public BatteryMonitorActivityTest() {
		super("com.empired.android.batterymonitor", BatteryMonitorMain.class);
		// TODO Auto-generated constructor stub
	}


	  @Override
	  protected void setUp() throws Exception {
	    super.setUp();

	    setActivityInitialTouchMode(false);

	    mActivity = getActivity();



	  } // end of setUp() method definition

	  
	  public void testActivity() {
		  
	  }
	  
}
