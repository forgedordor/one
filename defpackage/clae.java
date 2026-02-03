package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.receiver.SpatulaSettingsBroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class clae extends clca {
    private volatile boolean a = false;
    private final Object b = new Object();

    @Override // defpackage.cldg, defpackage.cldh
    public final void L(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((clbn) eyhi.a(context)).hu((SpatulaSettingsBroadcastReceiver) this);
                this.a = true;
            }
        }
    }

    @Override // defpackage.cldg, defpackage.cldb, defpackage.cldh, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        L(context);
        super.onReceive(context, intent);
    }
}
