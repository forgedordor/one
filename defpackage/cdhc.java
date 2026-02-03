package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.flaggedmessages.FlaggedMessageAlertReceiver;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cdhc extends cldb {
    private volatile boolean a = false;
    private final Object b = new Object();

    @Override // defpackage.cldh
    public final void L(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((cdgz) eyhi.a(context)).gT((FlaggedMessageAlertReceiver) this);
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
