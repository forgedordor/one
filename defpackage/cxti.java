package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.ui.debug.LoadRepliesReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cxti extends cldb {
    private volatile boolean a = false;
    private final Object b = new Object();

    @Override // defpackage.cldh
    public final void L(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((cxuj) eyhi.a(context)).gZ((LoadRepliesReceiver) this);
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
