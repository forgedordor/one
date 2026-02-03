package defpackage;

import android.util.SparseArray;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zv implements zx {
    final SparseArray a = new SparseArray();

    @Override // defpackage.zx
    public final uy a(int i) {
        List list = (List) this.a.get(i);
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException(a.g(i, "Cannot find the wrapper for global view type "));
        }
        return (uy) list.get(0);
    }

    @Override // defpackage.zx
    public final zw b(uy uyVar) {
        return new zu(this, uyVar);
    }
}
