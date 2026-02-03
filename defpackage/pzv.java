package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzv extends qbx {
    public final List a = new CopyOnWriteArrayList();

    @Override // defpackage.qbx
    public final qaq a(Context context, String str, WorkerParameters workerParameters) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                qaq qaqVarA = ((qbx) it.next()).a(context, str, workerParameters);
                if (qaqVarA != null) {
                    return qaqVarA;
                }
            } catch (Throwable th) {
                qas.c();
                Log.e(pzw.a, "Unable to instantiate a ListenableWorker (" + str + ')', th);
                throw th;
            }
        }
        return null;
    }
}
