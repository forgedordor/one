package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fan implements ixm {
    public final fdae a;

    public fan(fdae fdaeVar) {
        this.a = fdaeVar;
    }

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
    public final ixn e(ixp ixpVar, final List list, long j) {
        return ixpVar.ej(kil.b(j), kil.a(j), fcvp.a, new fdap() { // from class: fam
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk iykVar = (iyk) obj;
                List listA = exb.a(list, this.a);
                if (listA != null) {
                    int size = listA.size();
                    for (int i = 0; i < size; i++) {
                        fcti fctiVar = (fcti) listA.get(i);
                        iyl iylVar = (iyl) fctiVar.a;
                        fdae fdaeVar = (fdae) fctiVar.b;
                        iykVar.t(iylVar, fdaeVar != null ? ((kjb) fdaeVar.invoke()).a : 0L, 0.0f);
                    }
                }
                return fctx.a;
            }
        });
    }
}
