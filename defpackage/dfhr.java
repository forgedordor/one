package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfhr extends BroadcastReceiver {
    final /* synthetic */ dfht a;

    public dfhr(dfht dfhtVar) {
        this.a = dfhtVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dfht dfhtVar = this.a;
        synchronized (dfhtVar) {
            if (!dfhtVar.e()) {
                dhja.q("LocalAlarmTimer is inactive, ignoring alarm (%s)!", intent.getAction());
                return;
            }
            String action = intent.getAction();
            dfhs dfhsVar = dfhtVar.a;
            if (dfhsVar == null || !dfhsVar.b.equals(action)) {
                dhja.q("Warning, unexpected alarm (%s) for %s", action, dfhtVar.a);
            } else {
                Thread thread = dfhtVar.a.a;
                dfhtVar.c();
                thread.start();
            }
        }
    }
}
