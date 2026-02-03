package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dldk {
    public static final void a(final dlfg dlfgVar, hml hmlVar, final int i) {
        int i2;
        dlfgVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1792095837);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlfgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (dlfgVar instanceof dlfr) {
            hmlVarC.v(77790005);
            dldw.e((dlfr) dlfgVar, null, hmlVarC, 0, 2);
            ((hmw) hmlVarC).ab();
        } else {
            if (!(dlfgVar instanceof dldf)) {
                hmlVarC.v(77788612);
                ((hmw) hmlVarC).ab();
                throw new fctg();
            }
            hmlVarC.v(77791708);
            dldc.a((dldf) dlfgVar, null, hmlVarC, 0, 2);
            ((hmw) hmlVarC).ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dldg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dldk.a(dlfgVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dldx dldxVar, final ics icsVar, hml hmlVar, final int i) {
        hml hmlVarC = hmlVar.c(-1069537837);
        int i2 = (i & 6) == 0 ? (true != hmlVarC.D(dldxVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(true) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean z = false;
            ics icsVarI = efy.i(dpc.c(icsVar, dpc.a(0, hmlVarC, 0, 1), false & ((14 & 8) == 0), (14 & 2) != 0, true), 0.0f, 12.0f, 1);
            ixm ixmVarA = edl.a(ecr.g(0.0f), ibw.l, hmlVarC, 54);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarI);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i3 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i3))) {
                Integer numValueOf = Integer.valueOf(i3);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            edp edpVar = edp.a;
            hmlVarC.v(312737886);
            int i4 = 0;
            for (Object obj : dldxVar.a) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    fcva.m();
                }
                dlfg dlfgVar = (dlfg) obj;
                hmlVarC.v(995223969);
                hmlVarC.v(1849434622);
                Object objS = hmwVar.S();
                if (objS == hmk.a) {
                    objS = new dfw(Boolean.valueOf(z));
                    hmwVar.af(objS);
                }
                dfw dfwVar = (dfw) objS;
                hmwVar.ab();
                dfwVar.d(true);
                int i6 = i5 * 100;
                dap dapVarA = dae.e(dea.c(500, i6, null, 4), new fdap() { // from class: dldh
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        return Integer.valueOf(((Integer) obj2).intValue() / 2);
                    }
                }).a(dae.l(dea.c(500, i6, null, 4), 2));
                hwv hwvVarD = hxe.d(1306208913, new dldj(dlfgVar), hmlVarC);
                hmw hmwVar2 = hmwVar;
                cye.j(edpVar, dfwVar, null, dapVarA, null, null, hwvVarD, hmlVarC, 1572870);
                hmwVar2.ab();
                hmwVar = hmwVar2;
                i4 = i5;
                z = false;
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dldi
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dldx dldxVar2 = dldxVar;
                    int i7 = i;
                    dldk.b(dldxVar2, icsVar, (hml) obj2, hpy.a(i7 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
