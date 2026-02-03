package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlob {
    public static final void a(final dlmg dlmgVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        fctx fctxVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(943301237);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlmgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        int i4 = i2;
        if ((i4 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(274393506);
            if (dlmgVar == null) {
                fctxVar = null;
            } else {
                dlmf.c(dlmgVar, null, 0L, 0L, 0L, fdatVar, hmlVarC, (i4 << 12) & 458752);
                fctxVar = fctx.a;
            }
            ((hmw) hmlVarC).ab();
            if (fctxVar == null) {
                fdatVar.a(hmlVarC, Integer.valueOf((i4 >> 3) & 14));
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlnr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlmg dlmgVar2 = dlmgVar;
                    int i5 = i;
                    dlob.a(dlmgVar2, fdatVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dlnq dlnqVar, final igr igrVar, hml hmlVar, final int i) {
        int i2;
        igrVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1083361201);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlnqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(igrVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (dlnqVar instanceof dlnp) {
            hmlVarC.v(-1728023256);
            e((dlnp) dlnqVar, hmlVarC, 0);
            ((hmw) hmlVarC).ab();
        } else if (dlnqVar instanceof dlnn) {
            hmlVarC.v(-1728021063);
            c((dlnn) dlnqVar, igrVar, hmlVarC, i2 & 112);
            ((hmw) hmlVarC).ab();
        } else {
            if (!(dlnqVar instanceof dlnk)) {
                hmlVarC.v(-1728024800);
                ((hmw) hmlVarC).ab();
                throw new fctg();
            }
            hmlVarC.v(-2028966287);
            ((hmw) hmlVarC).ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlnx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlnq dlnqVar2 = dlnqVar;
                    int i4 = i;
                    dlob.b(dlnqVar2, igrVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dlnn dlnnVar, final igr igrVar, hml hmlVar, final int i) {
        int i2;
        jyq jyqVar;
        kfp kfpVar;
        hml hmlVar2;
        String strB;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(738665632);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlnnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(igrVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            long j = glz.a(hmlVarC).q;
            hmlVarC.v(5004770);
            boolean zC = hmlVarC.C(j);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zC || objS == hmk.a) {
                objS = new hpl(new ikt(j), hsi.a);
                hmwVar.af(objS);
            }
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            String str = dlnnVar.a;
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(str);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == hmk.a) {
                objS2 = new hpl(str, hsi.a);
                hmwVar.af(objS2);
            }
            final hox hoxVar2 = (hox) objS2;
            hmwVar.ab();
            final iga igaVar = (iga) hmlVarC.e(jmh.f);
            if (dlnnVar.c) {
                hmlVarC.v(-1824120975);
                jyqVar = glz.d(hmlVarC).k;
                hmwVar.ab();
            } else {
                hmlVarC.v(-1824066384);
                jyqVar = dljt.e(hmlVarC).f;
                hmwVar.ab();
            }
            jyq jyqVar2 = jyqVar;
            ics icsVarA = joj.a(igt.a(ics.e, igrVar), "search_box_text_field_test_tag");
            ikt iktVar = (ikt) hoxVar.a();
            fae faeVar = new fae(0, null, 0, 3, 118);
            hmlVarC.v(-1633490746);
            boolean z = (i2 & 14) == 4;
            boolean zF = hmlVarC.F(igaVar) | z;
            Object objS3 = hmwVar.S();
            if (zF || objS3 == hmk.a) {
                objS3 = new fdap() { // from class: dlns
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((fac) obj).getClass();
                        dlnnVar.e.invoke();
                        igaVar.a(false);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            fad fadVar = new fad(null, null, (fdap) objS3, null, 47);
            jyq jyqVarY = jyq.y(jyqVar2, glz.a(hmlVarC).q, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
            String strF = f(hoxVar2);
            if (dlnnVar.f.b) {
                kfp kfpVar2 = dlfz.a;
                kfpVar = dlfz.a;
            } else {
                kfpVar = kfo.a;
            }
            kfp kfpVar3 = kfpVar;
            hmlVarC.v(-1633490746);
            boolean zD2 = hmlVarC.D(hoxVar2) | z;
            Object objS4 = hmwVar.S();
            if (zD2 || objS4 == hmk.a) {
                objS4 = new fdap() { // from class: dlnt
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        String str2 = (String) obj;
                        str2.getClass();
                        hoxVar2.b(str2);
                        dlnnVar.d.invoke(str2);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS4);
            }
            hmwVar.ab();
            ewj.c(strF, (fdap) objS4, icsVarA, false, jyqVarY, faeVar, fadVar, true, 0, 0, kfpVar3, null, null, iktVar, null, hmlVarC, 102236160, 0, 46616);
            if (f(hoxVar2).length() != 0 || ((strB = dlnnVar.b) != null && strB.length() <= 0)) {
                hmlVar2 = hmlVarC;
            } else {
                hmlVarC.v(1188117833);
                if (strB == null) {
                    strB = jqu.b(R.string.top_app_bar_default_hint_text, hmlVarC);
                }
                hmwVar.ab();
                dthx.b(strB, null, glz.a(hmlVarC).s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, jyqVar2, hmlVarC, 0, 3120, 55290);
                hmlVar2 = hmlVarC;
            }
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlnu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlnn dlnnVar2 = dlnnVar;
                    int i4 = i;
                    dlob.c(dlnnVar2, igrVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1434485277);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(str, null, glz.a(hmlVarC).s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, glz.d(hmlVarC).l, hmlVar2, i2 & 14, 3120, 55290);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlnw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlob.d(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final dlnp dlnpVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-850010560);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlnpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean z = dlnpVar.d;
            hmlVarC.v(5004770);
            boolean zE = hmlVarC.E(z);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zE || objS == hmk.a) {
                objS = ddq.a(0.0f);
                hmwVar.af(objS);
            }
            ddp ddpVar = (ddp) objS;
            hmwVar.ab();
            a(dlnpVar.e, hxe.d(-1404530718, new dlnz(dlnpVar, ddpVar, dlnpVar.c), hmlVarC), hmlVarC, 48);
            der derVar = dljt.d(hmlVarC).m;
            Boolean boolValueOf = Boolean.valueOf(z);
            hmlVarC.v(-1746271574);
            boolean zF = hmlVarC.F(ddpVar) | ((i2 & 14) == 4) | hmlVarC.F(derVar);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == hmk.a) {
                objS2 = new dloa(dlnpVar, ddpVar, derVar, null);
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            hob.g(boolValueOf, (fdat) objS2, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlnv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlob.e(dlnpVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final String f(hox hoxVar) {
        return (String) hoxVar.a();
    }
}
