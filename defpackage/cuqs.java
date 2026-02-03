package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.ui.appsettings.SimFullReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cuqs extends cldb {
    private volatile boolean a = false;
    private final Object b = new Object();

    @Override // defpackage.cldh
    public final void L(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((cuyv) eyhi.a(context)).hp((SimFullReceiver) this);
                this.a = true;
            }
        }
    }

    @Override // defpackage.cldb, defpackage.cldh, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        L(context);
        super.onReceive(context, intent);
    }
}
