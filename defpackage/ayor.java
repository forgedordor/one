package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.datamodel.action.execution.PendingActionReceiver;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ayor extends clca {
    private volatile boolean a = false;
    private final Object b = new Object();

    @Override // defpackage.cldg, defpackage.cldh
    public final void L(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((ayot) eyhi.a(context)).hf((PendingActionReceiver) this);
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
