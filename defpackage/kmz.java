package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmz implements ixm {
    public static final kmz a = new kmz();

    @Override // defpackage.ixm
    public final /* synthetic */ int a(ivu ivuVar, List list, int i) {
        return ixl.a(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int b(ivu ivuVar, List list, int i) {
        return ixl.b(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int c(ivu ivuVar, List list, int i) {
        return ixl.c(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int d(ivu ivuVar, List list, int i) {
        return ixl.d(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final ixn e(ixp ixpVar, List list, long j) {
        int size = list.size();
        if (size == 0) {
            return ixpVar.ej(0, 0, fcvp.a, kmw.a);
        }
        if (size == 1) {
            iyl iylVarE = ((ixk) list.get(0)).e(j);
            return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new kmx(iylVarE));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            iyl iylVarE2 = ((ixk) list.get(i)).e(j);
            iMax = Math.max(iMax, iylVarE2.a);
            iMax2 = Math.max(iMax2, iylVarE2.b);
            arrayList.add(iylVarE2);
        }
        return ixpVar.ej(iMax, iMax2, fcvp.a, new kmy(arrayList));
    }
}
