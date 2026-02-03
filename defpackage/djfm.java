package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djfm {
    public static final void a(final djfn djfnVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(366201116);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djfnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            List list = djfnVar.a;
            Integer num = djfnVar.b;
            djex djexVar = num != null ? (djex) list.get(num.intValue()) : null;
            if (djexVar == null || list.size() <= 1) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: djfb
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            djfm.a(djfnVar, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            b(djfnVar, djexVar, hmlVarC, i2 & 14);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: djfc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    djfm.a(djfnVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final djfn djfnVar, final djex djexVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-910740396);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djfnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(djexVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            hmlVarC.v(5004770);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new fdae() { // from class: djez
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        djfm.c(hoxVar, !djfm.f(r0));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            dtfk.b((fdae) objS2, null, false, null, null, hxe.d(1630715250, new djfi(djexVar, djfnVar, hoxVar), hmlVarC), hmlVarC, 1572870, 62);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djfa
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    djfn djfnVar2 = djfnVar;
                    int i4 = i;
                    djfm.b(djfnVar2, djexVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    public static final void d(final djfn djfnVar, final boolean z, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        fdaeVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1809627965);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djfnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtfz.b(z, fdaeVar, null, 0L, null, null, null, 0L, 0.0f, hxe.d(-603841240, new djfl(djfnVar, fdaeVar), hmlVarC), hmlVarC, (i2 >> 3) & 126, 48, 2044);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djfd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djfn djfnVar2 = djfnVar;
                    boolean z2 = z;
                    int i4 = i;
                    djfm.d(djfnVar2, z2, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final String str, String str2, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        final String str3;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1903894843);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str2) ? 16 : 32;
        }
        int i4 = i2;
        if ((i4 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            str3 = str2;
            hmlVar2 = hmlVarC;
        } else {
            ics icsVarF = efy.f(ics.e, 16.0f, 8.0f, 24.0f, 8.0f);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA = djey.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarF);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVar2 = hmlVarC;
            dthx.b(str, null, glz.a(hmlVarC).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).j, hmlVar2, i4 & 14, 0, 65530);
            str3 = str2;
            dthx.b(str3, null, glz.a(hmlVar2).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar2).k, hmlVar2, (i4 >> 3) & 14, 0, 65530);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djff
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str4 = str;
                    int i5 = i;
                    djfm.e(str4, str3, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final boolean f(hox hoxVar) {
        return ((Boolean) hoxVar.a()).booleanValue();
    }

    public static final void g(final dlcr dlcrVar, final String str, final String str2, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1514963409);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlcrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(str2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            h(dlcrVar, null, efy.j(ics.e, 16.0f, 0.0f, 0.0f, 0.0f, 14), hmlVarC, (i2 & 14) | 384);
            e(str, str2, hmlVarC, (i2 >> 3) & 126);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djfg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlcr dlcrVar2 = dlcrVar;
                    String str3 = str;
                    int i4 = i;
                    djfm.g(dlcrVar2, str3, str2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final dlcr dlcrVar, String str, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        hml hmlVar2;
        final String str2 = str;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1986870141);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlcrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
            hmlVar2 = hmlVarC;
        } else {
            int i4 = i2 & 112;
            if (dlcrVar != null) {
                hmlVarC.v(1904937534);
                hmlVarC.v(592120738);
                float f = true != ((Boolean) dljt.b(hmlVarC).j.invoke()).booleanValue() ? 4.0f : 2.0f;
                hmw hmwVar = (hmw) hmlVarC;
                hmwVar.ab();
                hmlVar2 = hmlVarC;
                icsVar2 = icsVar;
                djrv.a(dlcrVar.a, str2, efy.d(icsVar, f), null, null, null, null, null, 0.0f, null, null, null, null, null, null, null, hmlVar2, i4, 0, 524280);
                hmwVar.ab();
                str2 = str;
            } else {
                icsVar2 = icsVar;
                hmlVarC.v(1904289107);
                ixm ixmVarA = ecz.a(ibw.e, false);
                int iA = djey.a(hmg.b(hmlVarC));
                hmw hmwVar2 = (hmw) hmlVarC;
                hxi hxiVarAk = hmwVar2.ak();
                ics icsVarB = icj.b(hmlVarC, icsVar2);
                fdae fdaeVar = jbb.a;
                hmlVarC.x();
                if (hmwVar2.z) {
                    hmlVarC.j(fdaeVar);
                } else {
                    hmlVarC.z();
                }
                hsk.b(hmlVarC, ixmVarA, jbb.e);
                hsk.b(hmlVarC, hxiVarAk, jbb.d);
                fdat fdatVar = jbb.f;
                if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA))) {
                    Integer numValueOf = Integer.valueOf(iA);
                    hmwVar2.af(numValueOf);
                    hmlVarC.h(numValueOf, fdatVar);
                }
                hsk.b(hmlVarC, icsVarB, jbb.c);
                long j = ije.h;
                dlfw.a("", null, j, new khk(3), 0, 0, jyq.y(glz.d(hmlVarC).n, 0L, 0L, null, null, null, "tnum", 0L, null, 0, 0, 0L, null, null, 0, 16777151), hmlVarC, 0, 50);
                str2 = str;
                djco.a(djrs.b(djrr.az, hmlVarC), str2, null, j, hmlVarC, i4, 4);
                hmlVar2 = hmlVarC;
                hmlVar2.n();
                hmwVar2.ab();
            }
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djfe
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlcr dlcrVar2 = dlcrVar;
                    String str3 = str2;
                    int i5 = i;
                    djfm.h(dlcrVar2, str3, icsVar2, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
