package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfl implements Runnable {
    final /* synthetic */ Intent a;
    final /* synthetic */ Context b;
    final /* synthetic */ BroadcastReceiver.PendingResult c;

    public qfl(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
        this.a = intent;
        this.b = context;
        this.c = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Intent intent = this.a;
            boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
            boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
            qas.c().a(ConstraintProxyUpdateReceiver.a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
            Context context = this.b;
            qli.a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
            qli.a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
            qli.a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
            qli.a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
        } finally {
            this.c.finish();
        }
    }
}
