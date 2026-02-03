package defpackage;

import android.util.SparseIntArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class zs implements zw {
    final uy a;
    final /* synthetic */ zt b;
    private final SparseIntArray c = new SparseIntArray(1);
    private final SparseIntArray d = new SparseIntArray(1);

    public zs(zt ztVar, uy uyVar) {
        this.b = ztVar;
        this.a = uyVar;
    }

    @Override // defpackage.zw
    public final int a(int i) {
        SparseIntArray sparseIntArray = this.d;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        throw new IllegalStateException("requested global type " + i + " does not belong to the adapter:" + this.a.b);
    }

    @Override // defpackage.zw
    public final int b(int i) {
        SparseIntArray sparseIntArray = this.c;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        zt ztVar = this.b;
        uy uyVar = this.a;
        int i2 = ztVar.b;
        ztVar.b = i2 + 1;
        ztVar.a.put(i2, uyVar);
        sparseIntArray.put(i, i2);
        this.d.put(i2, i);
        return i2;
    }
}
