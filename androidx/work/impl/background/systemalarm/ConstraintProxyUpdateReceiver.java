package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.qas;
import defpackage.qee;
import defpackage.qfl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = qas.d("ConstrntProxyUpdtRecvr");
    public static final /* synthetic */ int b = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            qee.m(context).m.a(new qfl(intent, context, goAsync()));
        } else {
            qas.c().a(a, "Ignoring unknown action ".concat(String.valueOf(action)));
        }
    }
}
