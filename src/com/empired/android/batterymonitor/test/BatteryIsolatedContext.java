package com.empired.android.batterymonitor.test;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.test.IsolatedContext;

public class BatteryIsolatedContext extends IsolatedContext {

	public BatteryIsolatedContext(ContentResolver resolver,
			Context targetContext) {
		super(resolver, targetContext);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter) {
		Intent intent = new Intent();
		intent.putExtra(BatteryManager.EXTRA_STATUS, BatteryManager.BATTERY_STATUS_CHARGING );
		intent.putExtra(BatteryManager.EXTRA_PLUGGED, BatteryManager.BATTERY_PLUGGED_AC );
		intent.putExtra(BatteryManager.EXTRA_LEVEL, 26);
		intent.putExtra(BatteryManager.EXTRA_SCALE, 100);
		return intent;
	}
	
	
}
