package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.qas;
import defpackage.qau;
import defpackage.qav;
import defpackage.qbq;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a = qas.d("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        qas.c().a(a, "Requesting diagnostics");
        try {
            qbq.a(context).d((qav) new qau(DiagnosticsWorker.class).b());
        } catch (IllegalStateException e) {
            qas.c();
            Log.e(a, "WorkManager is not initialized", e);
        }
    }
}
