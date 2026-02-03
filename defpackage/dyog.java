package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyog extends BroadcastReceiver {
    final /* synthetic */ dzdb a;

    public dyog(dzdb dzdbVar) {
        this.a = dzdbVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
            this.a.hh();
        }
    }
}
