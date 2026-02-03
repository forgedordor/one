package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmb implements ixm {
    public static final fmb a = new fmb();

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
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            iyl iylVarE = ((ixk) list.get(i)).e(j);
            iMax = Math.max(iMax, iylVarE.a);
            iMax2 = Math.max(iMax2, iylVarE.b);
            arrayList.add(iylVarE);
        }
        return ixpVar.ej(iMax, iMax2, fcvp.a, new fdap() { // from class: fma
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                List list2 = arrayList;
                iyk iykVar = (iyk) obj;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    iykVar.s((iyl) list2.get(i2), 0, 0, 0.0f);
                }
                return fctx.a;
            }
        });
    }
}
