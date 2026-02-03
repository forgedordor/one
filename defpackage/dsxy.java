package defpackage;

import android.util.SparseIntArray;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxy implements dsuj, dsxw {
    public final eohz a;
    public final List b;
    public final List c;
    public final SparseIntArray d;
    private final ekgb e;

    public dsxy(eohz eohzVar, List list, List list2, SparseIntArray sparseIntArray, List list3, SparseIntArray sparseIntArray2) {
        this.a = eohzVar;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = DesugarCollections.unmodifiableList(list2);
        this.d = sparseIntArray;
        DesugarCollections.unmodifiableList(list3);
        ejwl.b(!list.isEmpty(), "Must have at least one graft");
        ejwl.b(list2.size() == sparseIntArray.size() && list3.size() == sparseIntArray2.size(), "All children must have a parent specified.");
        this.e = ekgb.r(dsxv.a((dsxx) list.get(0)));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ejwl.a(dsxv.a((dsxx) it.next()).equals(this.e.get(0)));
        }
    }

    @Override // defpackage.dsxw
    public final /* synthetic */ dsvq a() {
        return dsxv.a(this);
    }

    @Override // defpackage.dsxw
    public final List b() {
        return this.e;
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        eohx eohxVar = dsxv.a(this).d;
        if (eohxVar == null) {
            eohxVar = eohx.a;
        }
        ejwfVarB.f("rootVeId", eohxVar.d);
        eohx eohxVar2 = dsxv.b(this).d;
        if (eohxVar2 == null) {
            eohxVar2 = eohx.a;
        }
        ejwfVarB.f("targetVeId", eohxVar2.d);
        return ejwfVarB.toString();
    }
}
