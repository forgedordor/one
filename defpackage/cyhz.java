package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyhz {
    public final cyhb a;
    public final List b = fcva.g("Overview", "Tools");
    private final fctc c;

    public cyhz(cyhb cyhbVar) {
        this.a = cyhbVar;
        fctc fctcVarB = fctd.b(3, new cyhv(new cyhu(cyhbVar)));
        int i = fdcj.a;
        this.c = new lxf(new fdbi(cyha.class), new cyhw(fctcVarB), new cyhy(cyhbVar, fctcVarB), new cyhx(fctcVarB));
    }

    public static final boolean d(hsf hsfVar) {
        return ((Boolean) hsfVar.a()).booleanValue();
    }

    private final cyha g() {
        return (cyha) this.c.a();
    }

    public final void a(final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1170585426);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            gvk.c(icsVar, null, glz.a(hmlVarC).p, 0L, 0.0f, 0.0f, null, hxe.d(1980449929, new cyho(this), hmlVarC), hmlVarC, 122);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cyhg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cyhz cyhzVar = this.a;
                    int i4 = i;
                    cyhzVar.a(icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void b(hml hmlVar, final int i) {
        int i2 = i & 1;
        hml hmlVarC = hmlVar.c(-479562167);
        if (i2 == 0 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dthx.b("This is the overview tab", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVarC, 6, 0, 131070);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cyhf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    this.a.b((hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void c(hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1502958748);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtct.a(cygd.a, null, hxe.d(1994526122, new cyhq(this), hmlVarC), null, 0.0f, null, null, null, hmlVarC, 390, 250);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cyhc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    this.a.c((hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void e(ics icsVar, final boolean z, final String str, final String str2, final fdae fdaeVar, hml hmlVar, final int i) {
        hml hmlVar2;
        final ics icsVar2;
        hml hmlVarC = hmlVar.c(865086422);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(str) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(str2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
            hmlVar2 = hmlVarC;
        } else {
            ico icoVar = ics.e;
            hmlVar2 = hmlVarC;
            gvk.c(efy.e(icoVar, 8.0f, 4.0f), null, glz.a(hmlVarC).a, 0L, 0.0f, 0.0f, null, hxe.d(-1494242255, new cyhj(str, fdaeVar, z, str2), hmlVarC), hmlVar2, 122);
            icsVar2 = icoVar;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cyhh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cyhz cyhzVar = this.a;
                    ics icsVar3 = icsVar2;
                    boolean z2 = z;
                    String str3 = str;
                    String str4 = str2;
                    cyhzVar.e(icsVar3, z2, str3, str4, fdaeVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void f(ics icsVar, hml hmlVar, final int i) {
        final ics icsVar2;
        hml hmlVarC = hmlVar.c(1448283308);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            icsVar2 = ics.e;
            final hsf hsfVarA = hro.a(g().g, hmlVarC);
            final oxm oxmVarA = oxr.a(g().h, null, hmlVarC, 1);
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVar2);
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
            edf edfVar = edf.a;
            ics icsVarD = efy.d(icsVar2, 4.0f);
            hmlVarC.v(-1746271574);
            boolean zF = hmlVarC.F(oxmVarA) | hmlVarC.F(this) | hmlVarC.D(hsfVarA);
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdap() { // from class: cyhd
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        eio eioVar = (eio) obj;
                        eioVar.getClass();
                        oxm oxmVar = oxmVarA;
                        ejk.b(eioVar, oxmVar.a(), null, new hxd(-859686008, true, new cyhr(oxmVar, this, hsfVarA)), 6);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            eig.a(icsVarD, null, null, false, null, null, null, false, null, (fdap) objS, hmlVarC, 6, 510);
            hmlVarC.v(-2129075558);
            if (d(hsfVarA)) {
                dtgm.a(edfVar.a(icsVar2, ibw.e), glz.a(hmlVarC).f, 0.0f, glz.a(hmlVarC).r, 0, 0.0f, hmlVarC, 0, 52);
                hmlVarC = hmlVarC;
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cyhe
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cyhz cyhzVar = this.a;
                    int i4 = i;
                    cyhzVar.f(icsVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
