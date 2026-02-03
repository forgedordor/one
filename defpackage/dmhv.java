package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmhv {
    public static final void a(ics icsVar, final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(842604355);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS);
            }
            final fdjx fdjxVar = (fdjx) objS;
            hmlVarC.v(-1633490746);
            boolean zF = hmlVarC.F(fdjxVar) | hmlVarC.F(fdapVar);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == obj) {
                objS2 = new fdae() { // from class: dmhs
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdil.d(fdjxVar, null, null, new dmhu(fdapVar, null), 3);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            icsVar2 = icsVar;
            dtfk.b((fdae) objS2, icsVar2, false, null, null, dmhx.a, hmlVarC, ((i2 << 3) & 112) | 1572864, 60);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmht
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ics icsVar3 = icsVar2;
                    int i4 = i;
                    dmhv.a(icsVar3, fdapVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
