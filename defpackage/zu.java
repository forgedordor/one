package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class zu implements zw {
    final uy a;
    final /* synthetic */ zv b;

    public zu(zv zvVar, uy uyVar) {
        this.b = zvVar;
        this.a = uyVar;
    }

    @Override // defpackage.zw
    public final int b(int i) {
        SparseArray sparseArray = this.b.a;
        List arrayList = (List) sparseArray.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList();
            sparseArray.put(i, arrayList);
        }
        uy uyVar = this.a;
        if (!arrayList.contains(uyVar)) {
            arrayList.add(uyVar);
        }
        return i;
    }

    @Override // defpackage.zw
    public final int a(int i) {
        return i;
    }
}
