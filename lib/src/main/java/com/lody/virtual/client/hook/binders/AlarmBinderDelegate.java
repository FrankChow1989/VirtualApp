package com.lody.virtual.client.hook.binders;


import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;

import com.lody.virtual.client.hook.base.HookBinderDelegate;

import mirror.android.app.IAlarmManager;
import mirror.android.os.ServiceManager;

/**
 * @author Lody
 *
 */
public class AlarmBinderDelegate extends HookBinderDelegate {

	@Override
	protected IInterface createInterface() {
		IBinder binder = ServiceManager.getService.call(Context.ALARM_SERVICE);
		return IAlarmManager.Stub.asInterface.call(binder);
	}
}
