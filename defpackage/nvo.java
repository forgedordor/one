package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nvo implements nnu {
    private final nnu a;
    private final nvl b;
    private final SparseArray c = new SparseArray();
    private boolean d;

    public nvo(nnu nnuVar, nvl nvlVar) {
        this.a = nnuVar;
        this.b = nvlVar;
    }

    @Override // defpackage.nnu
    public final nox p(int i, int i2) {
        if (i2 != 3) {
            this.d = true;
            return this.a.p(i, i2);
        }
        SparseArray sparseArray = this.c;
        nvq nvqVar = (nvq) sparseArray.get(i);
        if (nvqVar != null) {
            return nvqVar;
        }
        nvq nvqVar2 = new nvq(this.a.p(i, 3), this.b);
        sparseArray.put(i, nvqVar2);
        return nvqVar2;
    }

    @Override // defpackage.nnu
    public final void r() {
        this.a.r();
        if (!this.d) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            ((nvq) sparseArray.valueAt(i)).d = true;
            i++;
        }
    }

    @Override // defpackage.nnu
    public final void w(noq noqVar) {
        this.a.w(noqVar);
    }
}
