package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtw {
    public final mar a;
    private final SparseArray b;

    public mtw(mar marVar, SparseArray sparseArray) {
        this.a = marVar;
        SparseArray sparseArray2 = new SparseArray(marVar.b());
        for (int i = 0; i < marVar.b(); i++) {
            int iA = marVar.a(i);
            mtv mtvVar = (mtv) sparseArray.get(iA);
            mee.f(mtvVar);
            sparseArray2.append(iA, mtvVar);
        }
        this.b = sparseArray2;
    }

    public final int a() {
        return this.a.b();
    }

    public final mtv b(int i) {
        mtv mtvVar = (mtv) this.b.get(i);
        mee.f(mtvVar);
        return mtvVar;
    }

    public final boolean c(int i) {
        return this.a.c(i);
    }
}
