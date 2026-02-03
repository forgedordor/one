package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmc implements ixm {
    public static final kmc a = new kmc();

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
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iC = 0;
        int iD = 0;
        for (int i = 0; i < size; i++) {
            iyl iylVarE = ((ixk) list.get(i)).e(j);
            iD = Math.max(iD, iylVarE.a);
            iC = Math.max(iC, iylVarE.b);
            arrayList.add(iylVarE);
        }
        if (list.isEmpty()) {
            iD = kil.d(j);
            iC = kil.c(j);
        }
        return ixpVar.ej(iD, iC, fcvp.a, new kmb(arrayList));
    }
}
