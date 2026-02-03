package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqo {
    public static final void a(final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-709502251);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdauVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (hmlVarC.J((i2 & 3) != 2, i2 & 1)) {
            hpt hptVar = hyo.a;
            final hyk hykVar = (hyk) hmlVarC.e(hptVar);
            hmlVarC.v(1967007797);
            Object[] objArr = new Object[0];
            hyr hyrVar = hyi.a;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new fdae() { // from class: hyj
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return new hyi((byte[]) null);
                    }
                };
                hmwVar.af(objS);
            }
            final hyi hyiVar = (hyi) hxy.b(objArr, hyrVar, (fdae) objS, hmlVarC, 384);
            hyiVar.d = (hyk) hmlVarC.e(hptVar);
            hmwVar.ab();
            Object[] objArr2 = {hykVar};
            hyu hyuVar = new hyu(new fdat() { // from class: eqh
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    Map mapB = ((eqk) obj3).b();
                    if (mapB.isEmpty()) {
                        return null;
                    }
                    return mapB;
                }
            }, new fdap() { // from class: eqi
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    return new eqk(hykVar, (Map) obj2, hyiVar);
                }
            });
            boolean zF = hmlVarC.F(hykVar) | hmlVarC.F(hyiVar);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == obj) {
                objS2 = new fdae() { // from class: eql
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return new eqk(hykVar, fcvp.a, hyiVar);
                    }
                };
                hmwVar.af(objS2);
            }
            eqk eqkVar = (eqk) hxy.b(objArr2, hyuVar, (fdae) objS2, hmlVarC, 0);
            hnj.a(hptVar.c(eqkVar), hxe.d(-412824043, new eqn(fdauVar, eqkVar), hmlVarC), hmlVarC, 56);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: eqm
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i4 = i;
                    eqo.a(fdauVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
