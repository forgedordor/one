package defpackage;

import android.util.SparseIntArray;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dckx {
    public final SparseIntArray a;
    public dcdu b;

    public dckx() {
        this(dcdt.a);
    }

    public final void a() {
        SparseIntArray sparseIntArray = this.a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
    }

    public final int b(int i) {
        int i2;
        SparseIntArray sparseIntArray = this.a;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(i, -1);
        }
        return i2;
    }

    public dckx(dcdu dcduVar) {
        this.a = new SparseIntArray();
        dclh.m(dcduVar);
        this.b = dcduVar;
    }
}
