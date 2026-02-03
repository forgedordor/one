package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.qas;
import defpackage.qee;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = qas.d("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        qas qasVarC = qas.c();
        String str = a;
        Objects.toString(intent);
        qasVarC.a(str, "Received intent ".concat(String.valueOf(intent)));
        try {
            qee qeeVarM = qee.m(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (qee.b) {
                BroadcastReceiver.PendingResult pendingResult = qeeVarM.j;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                qeeVarM.j = pendingResultGoAsync;
                if (qeeVarM.i) {
                    qeeVarM.j.finish();
                    qeeVarM.j = null;
                }
            }
        } catch (IllegalStateException e) {
            qas.c();
            Log.e(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
