package defpackage;

import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ty implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    static final Comparator b = new tv();
    long d;
    public long e;
    public final ArrayList c = new ArrayList();
    private final ArrayList f = new ArrayList();

    private static final wv b(RecyclerView recyclerView, int i, long j) {
        int iB = recyclerView.h.b();
        for (int i2 = 0; i2 < iB; i2++) {
            wv wvVarK = RecyclerView.k(recyclerView.h.e(i2));
            if (wvVarK.c == i && !wvVarK.t()) {
                return null;
            }
        }
        wj wjVar = recyclerView.e;
        if (j == Long.MAX_VALUE) {
            try {
                if (lak.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.X(false);
                Trace.endSection();
            }
        }
        recyclerView.V();
        wv wvVarQ = wjVar.q(i, j);
        if (wvVarQ != null) {
            if (!wvVarQ.s() || wvVarQ.t()) {
                wjVar.d(wvVarQ, false);
            } else {
                wjVar.l(wvVarQ.a);
            }
        }
        return wvVarQ;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.r && this.d == 0) {
            this.d = RecyclerView.aH();
            recyclerView.post(this);
        }
        tw twVar = recyclerView.M;
        twVar.a = i;
        twVar.b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x015e  */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean, int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty.run():void");
    }
}
