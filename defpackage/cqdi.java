package defpackage;

import android.os.AsyncTask;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqdi extends cqdf {
    private final WeakReference a;

    public cqdi(cqdj cqdjVar) {
        super("SafeAsyncTask.doInBackground");
        this.a = new WeakReference(cqdjVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        cqdj cqdjVar = (cqdj) this.a.get();
        if (cqdjVar != null && cqdjVar.getStatus() == AsyncTask.Status.RUNNING) {
            ekrw ekrwVarJ = cqdj.d.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/common/SafeAsyncTask$TimeoutTracker", "run", 180, "SafeAsyncTask.java")).t("%s timed out and is canceled", cqdjVar);
            cqdjVar.cancel(true);
        }
    }
}
