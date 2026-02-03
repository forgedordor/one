package defpackage;

import android.util.SparseIntArray;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnqx extends fdcy {
    final /* synthetic */ dnqy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnqx(Object obj, dnqy dnqyVar) {
        super(obj);
        this.a = dnqyVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dnqy dnqyVar = this.a;
        SparseIntArray sparseIntArray = dnqyVar.p;
        List list = (List) obj2;
        List list2 = (List) obj;
        if (sparseIntArray.indexOfKey(0) < 0) {
            sparseIntArray.put(0, 0);
        }
        if (dnqyVar.i.isEmpty()) {
            return;
        }
        dndw.b(dndw.a(fcva.am(list2, dnqyVar.q), fcva.am(list, dnqyVar.q), 0, null, null, 60), dnqyVar.q, dnqyVar);
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
