package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkge implements ixm {
    final /* synthetic */ hox a;
    final /* synthetic */ hox b;

    public dkge(hox hoxVar, hox hoxVar2) {
        this.a = hoxVar;
        this.b = hoxVar2;
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
    public final ixn e(ixp ixpVar, List list, long j) {
        ixpVar.getClass();
        if (list.size() != 2) {
            throw new IllegalArgumentException("TransitionBubble should contain exactly 2 children.");
        }
        final iyl iylVarE = ((ixk) list.get(0)).e(j);
        iyl iylVarE2 = ((ixk) list.get(1)).e(j);
        hox hoxVar = this.a;
        if (dkgm.c(hoxVar) == 0) {
            hox hoxVar2 = this.b;
            if (dkgm.e(hoxVar2) == 0) {
                hoxVar.b(Integer.valueOf(iylVarE.b));
                hoxVar2.b(Integer.valueOf(iylVarE2.b));
            }
        }
        return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: dkgd
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk iykVar = (iyk) obj;
                iykVar.getClass();
                iykVar.s(iylVarE, 0, 0, 0.0f);
                return fctx.a;
            }
        });
    }
}
