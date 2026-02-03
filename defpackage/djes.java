package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djes {
    public static final void a(final ede edeVar, final djew djewVar, final djdm djdmVar, final hox hoxVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1750383547);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(djewVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(djdmVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(hoxVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.E(z) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final dljn dljnVarD = dljt.d(hmlVarC);
            ics icsVarB = edeVar.b(ics.e);
            Boolean boolValueOf = Boolean.valueOf(z);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(dljnVarD);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdap() { // from class: djeh
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((cxg) obj).getClass();
                        dljn dljnVar = dljnVarD;
                        dljl dljlVar = dljnVar.q;
                        dljm dljmVar = dljnVar.r;
                        return new cyt(dae.n(new dia(BasePaymentResult.ERROR_REQUEST_FAILED, 100, dljmVar.f), 0.0f, 0L, 6), dae.o(dea.c(100, 0, dljmVar.b, 2), 0.0f, 0L, 6));
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            cwx.a(boolValueOf, icsVarB, (fdap) objS, null, "combined_icon_animation", null, hxe.d(-1508192706, new djep(edeVar, djewVar, djdmVar, hoxVar), hmlVarC), hmlVarC, ((i2 >> 12) & 14) | 1597440, 40);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djei
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ede edeVar2 = edeVar;
                    djew djewVar2 = djewVar;
                    djdm djdmVar2 = djdmVar;
                    hox hoxVar2 = hoxVar;
                    djes.a(edeVar2, djewVar2, djdmVar2, hoxVar2, z, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final ede edeVar, final boolean z, final djew djewVar, final djdm djdmVar, final hox hoxVar, final boolean z2, hml hmlVar, final int i) {
        int i2;
        djjn djjnVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1172847718);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(djewVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(djdmVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(hoxVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarA = ics.e;
            ics icsVarB = edeVar.b(icsVarA);
            ixm ixmVarA = ecz.a(ibw.e, false);
            int iA = djee.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarB);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            int i4 = i2;
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
            hsk.b(hmlVarC, icsVarB2, jbb.c);
            if (z) {
                hmlVarC.v(93531392);
                e(djewVar, hmlVarC, (i4 >> 6) & 14);
                hmwVar.ab();
            } else {
                hmlVarC.v(93585921);
                if (!z2 && (djjnVar = djdmVar.b) != null) {
                    icsVarA = djjl.a(icsVarA, hoxVar, djjnVar, djdmVar.i);
                }
                ics icsVar = icsVarA;
                djjn djjnVar2 = djdmVar.b;
                f(djjnVar2 != null ? djjnVar2.b : true, djdmVar.a == djdi.f, icsVar, djdmVar.h.a, hmlVarC, 0);
                hmwVar.ab();
            }
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djel
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ede edeVar2 = edeVar;
                    boolean z3 = z;
                    djew djewVar2 = djewVar;
                    djdm djdmVar2 = djdmVar;
                    hox hoxVar2 = hoxVar;
                    djes.b(edeVar2, z3, djewVar2, djdmVar2, hoxVar2, z2, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final djew djewVar, boolean z, boolean z2, ics icsVar, hml hmlVar, final int i, final int i2) {
        int i3;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(-81076941);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(djewVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        boolean z3 = i5 == 0;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        int i6 = i2 & 4;
        boolean z4 = i6 == 0;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != hmlVarC.E(z2) ? 128 : 256;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            z &= z3;
            z2 &= z4;
            if (i7 != 0) {
                icsVar = ics.e;
            }
            g(djewVar.b, djewVar.c, djewVar.f, joj.a(icsVar, "Compose:Draft:Send"), hxe.d(-1105820683, new djeq(z, djewVar, z2), hmlVarC), hmlVarC, 24576);
        }
        final boolean z5 = z;
        final boolean z6 = z2;
        final ics icsVar2 = icsVar;
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djeg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djew djewVar2 = djewVar;
                    boolean z7 = z5;
                    boolean z8 = z6;
                    djes.c(djewVar2, z7, z8, icsVar2, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final djcy djcyVar, final djdm djdmVar, final hox hoxVar, hml hmlVar, final int i) {
        int i2;
        hoxVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2081205287);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djcyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(djdmVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(hoxVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarK = egq.k(joj.a(ics.e, "Compose:Draft:Send"), djbc.a(hmlVarC));
            djew djewVar = djcyVar.d;
            boolean zD = (!djewVar.g.a || djcyVar.a() || djdmVar.f) ? djewVar.f : djco.d(djdi.f, djdmVar);
            hmlVarC.v(-1633490746);
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & 112) == 32;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z | z2) || objS == hmk.a) {
                objS = new fdae() { // from class: djeo
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        djcy djcyVar2 = djcyVar;
                        djew djewVar2 = djcyVar2.d;
                        if (!djewVar2.g.a || djcyVar2.a()) {
                            djewVar2.b.invoke();
                        } else {
                            djdmVar.i.invoke(djdi.f);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            fdae fdaeVar = djewVar.c;
            hmwVar.ab();
            g((fdae) objS, fdaeVar, zD, icsVarK, hxe.d(1852108503, new djer(djdmVar, djcyVar, hoxVar), hmlVarC), hmlVarC, 24576);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djef
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djcy djcyVar2 = djcyVar;
                    djdm djdmVar2 = djdmVar;
                    int i4 = i;
                    djes.d(djcyVar2, djdmVar2, hoxVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final djew djewVar, hml hmlVar, final int i) {
        int i2;
        long jF;
        long j;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2025191757);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djewVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            djev djevVar = djewVar.g;
            ico icoVar = ics.e;
            ics icsVarC = efs.c(icoVar, 1.0f, 0.0f, 2);
            String str = djewVar.e;
            if (str != null) {
                icsVarC = icsVarC.a(efs.c(icoVar, 0.0f, -4.0f, 1));
            }
            ics icsVarA = djrq.a(icsVarC, (kji) hmlVarC.e(jmh.j));
            inz inzVarB = djrs.b(djewVar.a, hmlVarC);
            String strB = djewVar.d;
            hmlVarC.v(589106950);
            if (strB == null) {
                strB = jqu.b(R.string.compose_icon_send_content_description, hmlVarC);
            }
            String str2 = strB;
            boolean z2 = djevVar.b;
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            if (djewVar.f) {
                hmlVarC.v(1082573709);
                if (z2) {
                    hmlVarC.v(1082611932);
                    jF = glz.a(hmlVarC).b;
                    hmwVar.ab();
                } else {
                    hmlVarC.v(1082674366);
                    long j2 = glz.a(hmlVarC).a;
                    hmwVar.ab();
                    z = false;
                    jF = j2;
                }
                hmwVar.ab();
            } else {
                hmlVarC.v(1082749293);
                if (z2) {
                    hmlVarC.v(1082785997);
                    long j3 = glz.a(hmlVarC).b;
                    jF = ijg.f(ije.d(j3), ije.c(j3), ije.b(j3), 0.38f, ije.f(j3));
                    hmwVar.ab();
                } else {
                    hmlVarC.v(1082895117);
                    long j4 = glz.a(hmlVarC).q;
                    long jF2 = ijg.f(ije.d(j4), ije.c(j4), ije.b(j4), 0.38f, ije.f(j4));
                    hmwVar.ab();
                    z = false;
                    jF = jF2;
                }
                hmwVar.ab();
            }
            dtfn.a(inzVarB, str2, icsVarA, jF, hmlVarC, 0, 0);
            if (str != null) {
                ics icsVarC2 = dihi.c(efs.b(icoVar, 1.0f, 10.0f));
                jyq jyqVar = dljt.e(hmlVarC).e;
                if (z) {
                    hmlVarC.v(-176643362);
                    j = glz.a(hmlVarC).b;
                    hmwVar.ab();
                } else {
                    hmlVarC.v(-176580928);
                    j = glz.a(hmlVarC).a;
                    hmwVar.ab();
                }
                dlfw.a(str, icsVarC2, j, null, 0, 0, jyqVar, hmlVarC, 0, 56);
                hmlVarC = hmlVarC;
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djem
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    djes.e(djewVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final boolean z, final boolean z2, ics icsVar, final djit djitVar, hml hmlVar, final int i) {
        int i2;
        long jF;
        ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1176073398);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.B(djitVar.ordinal()) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            inz inzVarB = djrs.b(djrr.aB, hmlVarC);
            String strF = djco.f(djdi.f, z2, hmlVarC);
            if (!z) {
                hmlVarC.v(-1940250648);
                long j = glz.a(hmlVarC).q;
                jF = ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.38f, ije.f(j));
                ((hmw) hmlVarC).ab();
            } else if (z2) {
                hmlVarC.v(-1940123827);
                int iOrdinal = djitVar.ordinal();
                if (iOrdinal == 1) {
                    hmlVarC.v(630155332);
                    jF = glz.a(hmlVarC).e;
                    ((hmw) hmlVarC).ab();
                } else if (iOrdinal != 2) {
                    hmlVarC.v(630160125);
                    jF = glz.a(hmlVarC).a;
                    ((hmw) hmlVarC).ab();
                } else {
                    hmlVarC.v(630158430);
                    jF = glz.a(hmlVarC).j;
                    ((hmw) hmlVarC).ab();
                }
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-1939832334);
                int iOrdinal2 = djitVar.ordinal();
                if (iOrdinal2 == 1) {
                    hmlVarC.v(630164703);
                    jF = glz.a(hmlVarC).b;
                    ((hmw) hmlVarC).ab();
                } else if (iOrdinal2 != 2) {
                    hmlVarC.v(630170086);
                    jF = glz.a(hmlVarC).s;
                    ((hmw) hmlVarC).ab();
                } else {
                    hmlVarC.v(630168041);
                    jF = glz.a(hmlVarC).m;
                    ((hmw) hmlVarC).ab();
                }
                ((hmw) hmlVarC).ab();
            }
            long j2 = jF;
            icsVar2 = icsVar;
            dtfn.a(inzVarB, strF, icsVar2, j2, hmlVarC, i2 & 896, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final ics icsVar3 = icsVar2;
            hpxVarL.d = new fdat() { // from class: djen
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z3 = z;
                    boolean z4 = z2;
                    ics icsVar4 = icsVar3;
                    djes.f(z3, z4, icsVar4, djitVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final fdae fdaeVar, final fdae fdaeVar2, final boolean z, final ics icsVar, final fdau fdauVar, hml hmlVar, final int i) {
        fdae fdaeVar3;
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1959351197);
        if (i3 == 0) {
            fdaeVar3 = fdaeVar;
            i2 = (true != hmlVarC.F(fdaeVar3) ? 2 : 4) | i;
        } else {
            fdaeVar3 = fdaeVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarA = iex.a(egq.k(gks.a(icsVar), 40.0f), evn.a);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new ebk();
                hmwVar.af(objS);
            }
            ebk ebkVar = (ebk) objS;
            hmwVar.ab();
            dnk dnkVarA = grb.a(false, 20.0f, 0L, 4);
            jrw jrwVar = new jrw(0);
            hmlVarC.v(5004770);
            int i4 = i2 & 112;
            Object objS2 = hmwVar.S();
            if (i4 == 32 || objS2 == obj) {
                objS2 = new fdae() { // from class: djej
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdaeVar2.invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            ics icsVarF = dli.f(icsVarA, ebkVar, dnkVarA, z, jrwVar, (fdae) objS2, fdaeVar3, 424);
            int i5 = ((i2 >> 3) & 7168) | 48;
            ixm ixmVarA = ecz.a(ibw.e, false);
            int iA = djee.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarF);
            fdae fdaeVar4 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar4);
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
            fdauVar.a(edf.a, hmlVarC, Integer.valueOf(((i5 >> 6) & 112) | 6));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djek
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    fdae fdaeVar5 = fdaeVar;
                    fdae fdaeVar6 = fdaeVar2;
                    boolean z2 = z;
                    ics icsVar2 = icsVar;
                    djes.g(fdaeVar5, fdaeVar6, z2, icsVar2, fdauVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
