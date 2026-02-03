package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftw implements ixm {
    public static final ftw a = new ftw();

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
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        boolean z = false;
        int i = Integer.MIN_VALUE;
        int iMax = 0;
        int iEi = Integer.MIN_VALUE;
        int iEi2 = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            iyl iylVarE = ((ixk) list.get(i2)).e(j);
            arrayList.add(iylVarE);
            ivg ivgVar = iuc.a;
            if (iylVarE.ei(ivgVar) != Integer.MIN_VALUE && (iEi == Integer.MIN_VALUE || iylVarE.ei(ivgVar) < iEi)) {
                iEi = iylVarE.ei(ivgVar);
            }
            ivg ivgVar2 = iuc.b;
            if (iylVarE.ei(ivgVar2) != Integer.MIN_VALUE && (iEi2 == Integer.MIN_VALUE || iylVarE.ei(ivgVar2) > iEi2)) {
                iEi2 = iylVarE.ei(ivgVar2);
            }
            iMax = Math.max(iMax, iylVarE.b);
        }
        if (iEi != Integer.MIN_VALUE) {
            if (iEi2 != Integer.MIN_VALUE) {
                z = true;
            } else {
                iEi2 = Integer.MIN_VALUE;
            }
            i = iEi;
        }
        final int iMax2 = Math.max(ixpVar.ep((i == iEi2 || !z) ? 48.0f : 68.0f), iMax);
        return ixpVar.ej(kil.b(j), iMax2, fcvp.a, new fdap() { // from class: ftv
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ArrayList arrayList2 = arrayList;
                iyk iykVar = (iyk) obj;
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    int i4 = iMax2;
                    iyl iylVar = (iyl) arrayList2.get(i3);
                    iyk.A(iykVar, iylVar, 0, (i4 - iylVar.b) / 2);
                }
                return fctx.a;
            }
        });
    }
}
