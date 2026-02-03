package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwch {
    public static final void a(final dihq dihqVar, final fdae fdaeVar, final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1668114160);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dihqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            djrr djrrVar = dihqVar.b;
            if (djrrVar != null) {
                ics icsVarA = joj.a(ics.e, "MiniCdpActionItem");
                hmlVarC.v(-1746271574);
                boolean z = (i2 & 112) == 32;
                boolean z2 = (i2 & 14) == 4;
                boolean z3 = (i2 & 896) == 256;
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                if ((z2 | z | z3) || objS == hmk.a) {
                    objS = new fdae() { // from class: cwcc
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fdaeVar.invoke();
                            dihq dihqVar2 = dihqVar;
                            dihqVar2.k.invoke();
                            fdapVar.invoke(dihqVar2.a);
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS);
                }
                hmwVar.ab();
                dtfk.b((fdae) objS, icsVarA, false, null, null, hxe.d(-2047501350, new cwce(djrrVar, dihqVar), hmlVarC), hmlVarC, 1572912, 60);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cwcd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dihq dihqVar2 = dihqVar;
                    fdae fdaeVar2 = fdaeVar;
                    int i4 = i;
                    cwch.a(dihqVar2, fdaeVar2, fdapVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1975986156);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdauVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarI = efy.i(egq.e(ics.e, 56.0f), 8.0f, 0.0f, 2);
            int i4 = ((i2 << 9) & 7168) | 390;
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVarC, 48);
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
            int i5 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i5))) {
                Integer numValueOf = Integer.valueOf(i5);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdauVar.a(egp.a, hmlVarC, Integer.valueOf(((i4 >> 6) & 112) | 6));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cwbz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    cwch.b(fdauVar, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        final fdau fdauVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-400689932);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdauVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            fdauVar2 = fdauVar;
        } else {
            fdauVar2 = fdauVar;
            dtdn.a(efy.j(ics.e, 0.0f, 10.0f, 0.0f, 0.0f, 13), evn.b(24.0f), dtdj.b(glz.a(hmlVarC).D, 0L, hmlVarC, 14), null, null, fdauVar2, hmlVarC, ((i2 << 15) & 458752) | 6, 24);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cwby
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cwch.c(fdauVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final cwbx cwbxVar, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2050461664);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(cwbxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (cwbxVar == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: cwca
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            cwch.d(null, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            c(hxe.d(863189485, new cwcg(cwbxVar, fdaeVar), hmlVarC), hmlVarC, 6);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: cwcb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cwbx cwbxVar2 = cwbxVar;
                    int i4 = i;
                    cwch.d(cwbxVar2, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
