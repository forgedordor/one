package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ybw {
    public static final void a(final ics icsVar, final yby ybyVar, final igr igrVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(950396217);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(ybyVar) : hmlVarC.F(ybyVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(igrVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ybn ybnVar = ybyVar.c;
            hmlVarC.v(-1497261033);
            boolean z = false;
            if (((ybm) ybnVar).a && dpip.d(hmlVarC)) {
                z = true;
            }
            ((hmw) hmlVarC).ab();
            b(hxe.d(1219446143, new ybs(ybyVar, icsVar, igrVar, ddu.c(true != z ? 0.15f : 0.8f, null, null, hmlVarC, 0, 30)), hmlVarC), hmlVarC, 6);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ybp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    yby ybyVar2 = ybyVar;
                    int i4 = i;
                    ybw.a(icsVar2, ybyVar2, igrVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-234740085);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdatVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hpt hptVar = dljf.a;
            dljd dljdVar = (dljd) hmlVarC.e(hptVar);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new fdae() { // from class: ybq
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return false;
                    }
                };
                hmwVar.af(objS);
            }
            fdae fdaeVar = (fdae) objS;
            hmwVar.ab();
            boolean z = dljdVar.a;
            fdae fdaeVar2 = dljdVar.b;
            fdae fdaeVar3 = dljdVar.c;
            fdae fdaeVar4 = dljdVar.d;
            fdae fdaeVar5 = dljdVar.e;
            fdae fdaeVar6 = dljdVar.f;
            fdae fdaeVar7 = dljdVar.g;
            fdae fdaeVar8 = dljdVar.h;
            fdae fdaeVar9 = dljdVar.i;
            fdae fdaeVar10 = dljdVar.k;
            fdae fdaeVar11 = dljdVar.l;
            fdae fdaeVar12 = dljdVar.m;
            fdae fdaeVar13 = dljdVar.n;
            fdae fdaeVar14 = dljdVar.o;
            fdaeVar.getClass();
            hnj.a(hptVar.c(new dljd(fdaeVar2, fdaeVar3, fdaeVar4, fdaeVar5, fdaeVar6, fdaeVar7, fdaeVar8, fdaeVar9, fdaeVar, fdaeVar10, fdaeVar11, fdaeVar12, fdaeVar13, fdaeVar14)), hxe.d(-528123445, new ybv(fdatVar), hmlVarC), hmlVarC, 56);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ybr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ybw.b(fdatVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final yby ybyVar, final ics icsVar, final igr igrVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(745607218);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(ybyVar) : hmlVarC.F(ybyVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 = i2 | 176;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = i3 & (-897);
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                icsVar = ics.e;
                igrVar = igr.a;
            } else {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmlVarC.v(-730992825);
            a(icsVar, ybyVar, igrVar, hmlVarC, ((i4 >> 3) & 14) | ((i4 << 3) & 112));
            ((hmw) hmlVarC).ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ybo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    yby ybyVar2 = ybyVar;
                    ics icsVar2 = icsVar;
                    int i5 = i;
                    ybw.c(ybyVar2, icsVar2, igrVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
