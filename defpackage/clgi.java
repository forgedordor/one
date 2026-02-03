package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.reportissue.ReportIssueReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class clgi extends cldb {
    private volatile boolean a = false;
    private final Object b = new Object();

    @Override // defpackage.cldh
    public final void L(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((clgy) eyhi.a(context)).hi((ReportIssueReceiver) this);
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
