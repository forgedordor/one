package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvwb extends AsyncTask {
    final /* synthetic */ dvwd a;

    public dvwb(dvwd dvwdVar) {
        this.a = dvwdVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        dvia.b();
        final dvwe dvweVar = this.a.s;
        return dvtq.a(dvweVar.d, new Callable() { // from class: dvvz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dvwe dvweVar2 = dvweVar;
                dvwd dvwdVar = dvweVar2.c;
                Uri uri = dvwdVar.k;
                String[] strArr = dvwdVar.l;
                String str = dvwdVar.m;
                String[] strArr2 = dvwdVar.n;
                String str2 = dvwdVar.p;
                Cursor cursorH = dvweVar2.d.h(uri, strArr, str, strArr2, dvwdVar.o, dvwdVar.q);
                try {
                    Object objApply = dvwdVar.a.apply(cursorH);
                    if (cursorH != null) {
                        cursorH.close();
                    }
                    return objApply;
                } catch (Throwable th) {
                    if (cursorH == null) {
                        throw th;
                    }
                    try {
                        cursorH.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.os.AsyncTask
    protected final void onPostExecute(Object obj) {
        dvwd dvwdVar = this.a;
        dvwdVar.i();
        dvwdVar.r = false;
        if (dvwdVar.d) {
            dvhv.a("DatabaseUriMonitor", "delivering: ".concat(String.valueOf(String.valueOf(dvwdVar.j))));
            dvwdVar.s.c(obj);
        }
    }
}
