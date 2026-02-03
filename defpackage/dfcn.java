package defpackage;

import android.os.AsyncTask;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfcn extends AsyncTask {
    final /* synthetic */ dfco a;

    public dfcn(dfco dfcoVar) {
        this.a = dfcoVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        List list = this.a.a;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        return null;
    }
}
