package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lqm {
    public lqq a;
    private final SparseArray b;

    private lqm() {
        this(1);
    }

    final lqm a(int i) {
        return (lqm) this.b.get(i);
    }

    final void b(lqq lqqVar, int i, int i2) {
        lqm lqmVarA = a(lqqVar.a(i));
        if (lqmVarA == null) {
            lqmVarA = new lqm(1);
            this.b.put(lqqVar.a(i), lqmVarA);
        }
        if (i2 > i) {
            lqmVarA.b(lqqVar, i + 1, i2);
        } else {
            lqmVarA.a = lqqVar;
        }
    }

    public lqm(int i) {
        this.b = new SparseArray(i);
    }
}
