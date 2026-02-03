package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bxgj implements bach {
    protected final SparseArray a = new SparseArray();

    @Override // defpackage.bach
    public final synchronized void a() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((bxgi) sparseArray.valueAt(i)).c();
        }
        sparseArray.clear();
    }

    protected abstract bxgi b(int i);

    public final synchronized bxgi c(int i) {
        SparseArray sparseArray = this.a;
        bxgi bxgiVar = (bxgi) sparseArray.get(i);
        if (bxgiVar != null) {
            return bxgiVar;
        }
        bxgi bxgiVarB = b(i);
        sparseArray.put(i, bxgiVarB);
        return bxgiVarB;
    }
}
