package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cldh extends BroadcastReceiver {
    private volatile boolean U = false;
    private final Object V = new Object();

    public void L(Context context) {
        if (this.U) {
            return;
        }
        synchronized (this.V) {
            if (!this.U) {
                ((cldc) eyhi.a(context)).gF((cldb) this);
                this.U = true;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        throw null;
    }
}
