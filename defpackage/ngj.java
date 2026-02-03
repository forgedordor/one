package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ngj {
    public int a;
    public final SparseArray b;
    public final meo c;

    public ngj() {
        this(new meo() { // from class: ngi
            @Override // defpackage.meo
            public final void a(Object obj) {
            }
        });
    }

    public final Object a(int i) {
        SparseArray sparseArray;
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 <= 0 || i >= this.b.keyAt(i2)) {
                break;
            }
            this.a--;
        }
        while (true) {
            int i3 = this.a;
            sparseArray = this.b;
            if (i3 >= sparseArray.size() - 1 || i < sparseArray.keyAt(this.a + 1)) {
                break;
            }
            this.a++;
        }
        return sparseArray.valueAt(this.a);
    }

    public final Object b() {
        return this.b.valueAt(r0.size() - 1);
    }

    public final boolean c() {
        return this.b.size() == 0;
    }

    public ngj(meo meoVar) {
        this.b = new SparseArray();
        this.c = meoVar;
        this.a = -1;
    }
}
