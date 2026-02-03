package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gtn implements ixm {
    final /* synthetic */ gtx a;

    public gtn(gtx gtxVar) {
        this.a = gtxVar;
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
        int iMax;
        int iMax2;
        int i;
        int i2;
        int iB;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ixk ixkVar = (ixk) list.get(i3);
            if (iwa.b(ixkVar) == gsu.a) {
                final iyl iylVarE = ixkVar.e(j);
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ixk ixkVar2 = (ixk) list.get(i4);
                    if (iwa.b(ixkVar2) == gsu.b) {
                        gtx gtxVar = this.a;
                        dwm dwmVar = gtxVar.e;
                        dwm dwmVar2 = dwm.a;
                        final iyl iylVarE2 = dwmVar == dwmVar2 ? ixkVar2.e(kil.m(kim.l(j, 0, -iylVarE.b, 1), 0, 0, 0, 0, 14)) : ixkVar2.e(kil.m(kim.l(j, -iylVarE.a, 0, 2), 0, 0, 0, 0, 11));
                        final fdcg fdcgVar = new fdcg();
                        float fB = gtxVar.b();
                        float[] fArr = gtxVar.c;
                        if (!fdbq.d(fB, null)) {
                            fdbq.d(fB, null);
                        }
                        iylVarE2.ei(gtt.a);
                        if (gtxVar.e == dwmVar2) {
                            iMax = Math.max(iylVarE2.a, iylVarE.a);
                            int i5 = iylVarE.b;
                            int i6 = iylVarE2.b;
                            iMax2 = i5 + i6;
                            i = (iMax - iylVarE2.a) / 2;
                            i2 = i5 / 2;
                            iB = (iMax - iylVarE.a) / 2;
                            fdcgVar.a = fdcu.b(i6 * fB);
                        } else {
                            iMax = iylVarE.a + iylVarE2.a;
                            iMax2 = Math.max(iylVarE2.b, iylVarE.b);
                            i = iylVarE.a / 2;
                            i2 = (iMax2 - iylVarE2.b) / 2;
                            iB = fdcu.b(iylVarE2.a * fB);
                            fdcgVar.a = (iMax2 - iylVarE.b) / 2;
                        }
                        final int i7 = i2;
                        final int i8 = i;
                        final int i9 = iB;
                        gtxVar.j.i(iMax);
                        gtxVar.k.i(iMax2);
                        return ixpVar.ej(iMax, iMax2, fcvp.a, new fdap() { // from class: gtm
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) {
                                iyk iykVar = (iyk) obj;
                                iyk.A(iykVar, iylVarE2, i8, i7);
                                iyk.A(iykVar, iylVarE, i9, fdcgVar.a);
                                return fctx.a;
                            }
                        });
                    }
                }
                kjw.a("Collection contains no element matching the predicate.");
                throw new fcta();
            }
        }
        kjw.a("Collection contains no element matching the predicate.");
        throw new fcta();
    }
}
