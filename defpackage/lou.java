package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lou {
    public lol a;
    private final SparseArray b;

    private lou() {
        this(1);
    }

    final lou a(int i) {
        return (lou) this.b.get(i);
    }

    final void b(lol lolVar, int i, int i2) {
        lou louVarA = a(lolVar.a(i));
        if (louVarA == null) {
            louVarA = new lou(1);
            this.b.put(lolVar.a(i), louVarA);
        }
        if (i2 > i) {
            louVarA.b(lolVar, i + 1, i2);
        } else {
            louVarA.a = lolVar;
        }
    }

    public lou(int i) {
        this.b = new SparseArray(i);
    }
}
