package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vsj {
    public static final void a(final vsk vskVar, final long j, final float f, final boolean z, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-889326263);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(vskVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.A(f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        int i4 = i2;
        if ((i4 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            long jF = ijg.f(ije.d(j), ije.c(j), ije.b(j), f, ije.f(j));
            b(jF, hxe.d(-432356050, new vsc(vskVar, j, jF, z), hmlVarC), hmlVarC, 48);
            Context context = (Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b);
            fctx fctxVar = fctx.a;
            hmlVarC.v(-1633490746);
            boolean zF = hmlVarC.F(context) | ((i4 & 14) == 4);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new vsd(vskVar, context, null);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.g(fctxVar, (fdat) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: vry
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    vsk vskVar2 = vskVar;
                    long j2 = j;
                    float f2 = f;
                    vsj.a(vskVar2, j2, f2, z, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final long j, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-786145169);
        if (i3 == 0) {
            i2 = (true != hmlVarC.C(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = (i2 >> 3) & 14;
            if (((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue()) {
                hmlVarC.v(406187968);
                ics icsVarA = dkl.a(ics.e, j, ikj.a);
                ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
                int iA = vrt.a(hmg.b(hmlVarC));
                hmw hmwVar = (hmw) hmlVarC;
                hxi hxiVarAk = hmwVar.ak();
                ics icsVarB = icj.b(hmlVarC, icsVarA);
                fdae fdaeVar = jbb.a;
                hmlVarC.x();
                if (hmwVar.z) {
                    hmlVarC.j(fdaeVar);
                } else {
                    hmlVarC.z();
                }
                hsk.b(hmlVarC, ixmVarA, jbb.e);
                hsk.b(hmlVarC, hxiVarAk, jbb.d);
                fdat fdatVar2 = jbb.f;
                if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                    Integer numValueOf = Integer.valueOf(iA);
                    hmwVar.af(numValueOf);
                    hmlVarC.h(numValueOf, fdatVar2);
                }
                hsk.b(hmlVarC, icsVarB, jbb.c);
                fdatVar.a(hmlVarC, Integer.valueOf(i4));
                hmlVarC.n();
                hmwVar.ab();
            } else {
                hmlVarC.v(406274272);
                fdatVar.a(hmlVarC, Integer.valueOf(i4));
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: vru
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    long j2 = j;
                    int i5 = i;
                    vsj.b(j2, fdatVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dijt dijtVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2126555103);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(dijtVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarA = joj.a(ehr.b(efy.e(dkl.a(egq.d(icoVar, 1.0f), glz.a(hmlVarC).I, evn.d(4.0f, 4.0f, 0.0f, 0.0f, 12)), 30.0f, 20.0f)), ((diju) dijtVar).a);
            ixm ixmVarA = ecz.a(ibw.e, false);
            int iA = vrt.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
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
            dijr.f(dijtVar, null, joj.a(icoVar, "Compose:Disabled"), 0L, null, null, 0L, null, false, null, null, null, null, hmlVarC, (i2 & 14) | 384, 0, 8186);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: vrx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    vsj.c(dijtVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(vrs vrsVar, final ics icsVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        dew dewVar;
        long j;
        final vrs vrsVar2 = vrsVar;
        hml hmlVarC = hmlVar.c(-252141443);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(vrsVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarD = egq.d(icsVar, 1.0f);
            hmlVarC.v(5004770);
            int i3 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i3 == 4 || objS == hmk.a) {
                objS = new fdap() { // from class: vrv
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ivy ivyVar = (ivy) obj;
                        ivyVar.getClass();
                        long jG = ivyVar.g() & 4294967295L;
                        yil yilVar = vrsVar2.d;
                        if (!yilVar.c.contains("bottom_content_insets")) {
                            HashMap map = yilVar.b;
                            map.put("bottom_content_insets", Integer.valueOf(fddu.f((int) jG, 0)));
                            fduf fdufVar = yilVar.e;
                            Collection collectionValues = map.values();
                            collectionValues.getClass();
                            fdufVar.f(Integer.valueOf(fcva.H(collectionValues)));
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarA = ixy.a(icsVarD, (fdap) objS);
            ecq ecqVar = ecr.c;
            ibx ibxVar = ibw.j;
            ixm ixmVarA = edl.a(ecqVar, ibxVar, hmlVarC, 0);
            int iA = vrt.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar4);
            fdvc fdvcVar = vrsVar2.b;
            edp edpVar = edp.a;
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(fdvcVar);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == hmk.a) {
                fdto fdtoVar = new fdto(new fcti(null, false), fdvcVar, new vrz(null));
                hmwVar.af(fdtoVar);
                objS2 = fdtoVar;
            }
            hmwVar.ab();
            fcti fctiVar = (fcti) hsb.b((fdpl) objS2, new fcti(null, false), null, hmlVarC, 2).a();
            dkff dkffVar = (dkff) fctiVar.a;
            boolean zBooleanValue = ((Boolean) fctiVar.b).booleanValue();
            ico icoVar = ics.e;
            cye.f(edpVar, zBooleanValue, efy.i(edp.a(icoVar, ibw.k), 8.0f, 0.0f, 2), null, null, null, hxe.d(-28862901, new vsa(dkffVar), hmlVarC), hmlVarC, 1572870, 28);
            ics icsVarD2 = egq.d(icoVar, 1.0f);
            ixm ixmVarA2 = edl.a(ecqVar, ibxVar, hmlVarC, 0);
            int iA2 = vrt.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarD2);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar4);
            vrsVar2 = vrsVar;
            hsf hsfVarA = hro.a(vrsVar2.a, hmlVarC);
            wgl wglVar = ((vsk) hsfVarA.a()).e;
            if (wglVar != null) {
                hmlVarC.v(-1815154594);
                c(wglVar.a, hmlVarC, 0);
                hmwVar.ab();
            } else {
                hmlVarC.v(-1815035368);
                boolean zBooleanValue2 = ((Boolean) hsb.b(((vsk) hsfVarA.a()).d, false, null, hmlVarC, 2).a()).booleanValue();
                float f = true != zBooleanValue2 ? 0.96f : 0.25f;
                if (zBooleanValue2) {
                    hmlVarC.v(-1814703420);
                    dewVar = dljt.d(hmlVarC).j;
                    hmwVar.ab();
                } else {
                    hmlVarC.v(-1814613179);
                    dewVar = dljt.d(hmlVarC).i;
                    hmwVar.ab();
                }
                hsf hsfVarC = ddu.c(f, dewVar, null, hmlVarC, 3072, 20);
                vsk vskVar = (vsk) hsfVarA.a();
                hmlVarC.v(400030459);
                hmlVarC.v(-2117781954);
                boolean zBooleanValue3 = ((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue();
                hmwVar.ab();
                if (zBooleanValue3) {
                    hmlVarC.v(-2117779902);
                    j = glz.a(hmlVarC).p;
                    hmwVar.ab();
                } else {
                    hmlVarC.v(-2117779214);
                    boolean zH = dljt.h(hmlVarC);
                    hmwVar.ab();
                    if (zH) {
                        hmlVarC.v(-2117777147);
                        j = dljt.a(hmlVarC).d.a;
                        hmwVar.ab();
                    } else if (z) {
                        hmlVarC.v(-2117775348);
                        j = dljt.a(hmlVarC).E;
                        hmwVar.ab();
                    } else {
                        hmlVarC.v(-2117773566);
                        j = glz.a(hmlVarC).p;
                        hmwVar.ab();
                    }
                }
                hmwVar.ab();
                a(vskVar, j, ((Number) hsfVarC.a()).floatValue(), vrsVar2.c.a, hmlVarC, 0);
                hmwVar.ab();
            }
            hmlVarC.n();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: vrw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    vrs vrsVar3 = vrsVar2;
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    vsj.d(vrsVar3, icsVar2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
