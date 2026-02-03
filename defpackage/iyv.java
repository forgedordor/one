package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyv extends jco {
    public static final iyv a = new iyv();

    private iyv() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // defpackage.ixm
    public final ixn e(ixp ixpVar, List list, long j) {
        int size = list.size();
        if (size == 0) {
            return ixpVar.ej(kil.d(j), kil.c(j), fcvp.a, iys.a);
        }
        if (size == 1) {
            iyl iylVarE = ((ixk) list.get(0)).e(j);
            return ixpVar.ej(kim.c(j, iylVarE.a), kim.b(j, iylVarE.b), fcvp.a, new iyt(iylVarE));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            iyl iylVarE2 = ((ixk) list.get(i)).e(j);
            iMax = Math.max(iylVarE2.a, iMax);
            iMax2 = Math.max(iylVarE2.b, iMax2);
            arrayList.add(iylVarE2);
        }
        return ixpVar.ej(kim.c(j, iMax), kim.b(j, iMax2), fcvp.a, new iyu(arrayList));
    }
}
