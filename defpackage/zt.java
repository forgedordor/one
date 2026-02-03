package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zt implements zx {
    final SparseArray a = new SparseArray();
    int b = 0;

    @Override // defpackage.zx
    public final uy a(int i) {
        uy uyVar = (uy) this.a.get(i);
        if (uyVar != null) {
            return uyVar;
        }
        throw new IllegalArgumentException(a.g(i, "Cannot find the wrapper for global view type "));
    }

    @Override // defpackage.zx
    public final zw b(uy uyVar) {
        return new zs(this, uyVar);
    }
}
