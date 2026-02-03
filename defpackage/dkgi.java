package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkgi implements ixm {
    final /* synthetic */ hsf a;
    final /* synthetic */ hsf b;
    final /* synthetic */ dkgv c;
    final /* synthetic */ hsf d;

    public dkgi(hsf hsfVar, hsf hsfVar2, dkgv dkgvVar, hsf hsfVar3) {
        this.a = hsfVar;
        this.b = hsfVar2;
        this.c = dkgvVar;
        this.d = hsfVar3;
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
        final iyl iylVarE = ((ixk) list.get(0)).e(j);
        final iyl iylVarE2 = ((ixk) list.get(1)).e(j);
        final hsf hsfVar = this.a;
        final int i = dkgm.a(hsfVar) > 0.1f ? iylVarE.a : iylVarE2.a;
        final hsf hsfVar2 = this.b;
        final dkgv dkgvVar = this.c;
        final hsf hsfVar3 = this.d;
        return ixpVar.ej(i, dkgm.d(hsfVar2), fcvp.a, new fdap() { // from class: dkgf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk iykVar = (iyk) obj;
                iykVar.getClass();
                dkgv dkgvVar2 = dkgvVar;
                dkgv dkgvVar3 = dkgv.c;
                final long jA = ila.a(dkgvVar2 == dkgvVar3 ? 1.0f : 0.0f, 1.0f);
                int i2 = i;
                iyl iylVar = iylVarE;
                int i3 = dkgvVar2 == dkgvVar3 ? i2 - iylVar.a : 0;
                final hsf hsfVar4 = hsfVar;
                hsf hsfVar5 = hsfVar2;
                iyl iylVar2 = iylVarE2;
                iykVar.u(iylVar, i3, dkgm.d(hsfVar5) - iylVar.b, 1.0f, new fdap() { // from class: dkgg
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ikl iklVar = (ikl) obj2;
                        iklVar.getClass();
                        iklVar.C(jA);
                        hsf hsfVar6 = hsfVar4;
                        iklVar.x(Math.max(dkgm.a(hsfVar6), 0.0f));
                        iklVar.y(Math.max(dkgm.a(hsfVar6), 0.0f));
                        return fctx.a;
                    }
                });
                int i4 = dkgvVar2 == dkgvVar3 ? i2 - iylVar2.a : 0;
                final hsf hsfVar6 = hsfVar3;
                iykVar.u(iylVar2, i4, dkgm.d(hsfVar5) - iylVar2.b, 2.0f, new fdap() { // from class: dkgh
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ikl iklVar = (ikl) obj2;
                        iklVar.getClass();
                        iklVar.C(jA);
                        hsf hsfVar7 = hsfVar6;
                        iklVar.x(dkgm.b(hsfVar7));
                        iklVar.y(dkgm.b(hsfVar7));
                        return fctx.a;
                    }
                });
                return fctx.a;
            }
        });
    }
}
