package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvbc extends qbx {
    private final ahou a;

    public dvbc(ahou ahouVar) {
        this.a = ahouVar;
    }

    @Override // defpackage.qbx
    public final qaq a(Context context, String str, WorkerParameters workerParameters) {
        Log.d("MddListenableWorkerFactory", "createWorker for class: ".concat(str));
        ahou ahouVar = this.a;
        ahouVar.b = workerParameters;
        eyij.a(ahouVar.b, WorkerParameters.class);
        fcsu fcsuVar = (fcsu) ekgp.l("com.google.android.libraries.mdi.download.workmanager.workers.PeriodicWorker", new ahow(ahouVar.a, ahouVar.b).b).get(str);
        if (fcsuVar == null) {
            return null;
        }
        return (qaq) fcsuVar.b();
    }
}
