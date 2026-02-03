package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.ui.debug.LoadReactionsReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cxth extends cldb {
    private volatile boolean a = false;
    private final Object b = new Object();

    @Override // defpackage.cldh
    public final void L(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((cxuf) eyhi.a(context)).gY((LoadReactionsReceiver) this);
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
