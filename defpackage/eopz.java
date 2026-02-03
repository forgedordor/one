package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eopz extends eoqb {
    public eopz(ekfn ekfnVar, boolean z) {
        super(ekfnVar, z);
        t();
    }

    @Override // defpackage.eoqb
    public final /* bridge */ /* synthetic */ Object w(List list) {
        ArrayList arrayListD = ekjz.d(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eoqa eoqaVar = (eoqa) it.next();
            arrayListD.add(eoqaVar != null ? eoqaVar.a : null);
        }
        return DesugarCollections.unmodifiableList(arrayListD);
    }
}
