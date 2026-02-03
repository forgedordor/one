package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmqh {
    public static final void a(final ede edeVar, final dmso dmsoVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-977795027);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.B(dmsoVar.ordinal()) ? 16 : 32;
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
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            boolean zA = dmsoVar.a();
            Boolean boolValueOf = Boolean.valueOf(zA);
            hmlVarC.v(-1633490746);
            boolean zE = hmlVarC.E(zA);
            Object objS2 = hmwVar.S();
            if (zE || objS2 == obj) {
                objS2 = new dmqf(zA, hoxVar, null);
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            hob.g(boolValueOf, (fdat) objS2, hmlVarC);
            dhk dhkVarD = dhy.d(Boolean.valueOf(c(hoxVar)), null, hmlVarC, 0, 2);
            iby ibyVar = dmsoVar == dmso.d ? ibw.d : ibw.f;
            boolean z = ((Boolean) dhkVarD.e()).booleanValue() || c(hoxVar);
            hmlVarC.v(5004770);
            boolean zE2 = hmlVarC.E(z);
            Object objS3 = hmwVar.S();
            if (zE2 || objS3 == obj) {
                ics icsVarA = edeVar.a(efy.d(ics.e, 20.0f), ibyVar);
                int iOrdinal = dmsoVar.ordinal();
                objS3 = iwl.a(ifi.a(icsVarA, iOrdinal != 1 ? iOrdinal != 3 ? 0.0f : 90.0f : -90.0f), new fdau() { // from class: dmpy
                    @Override // defpackage.fdau
                    public final Object a(Object obj2, Object obj3, Object obj4) {
                        ixp ixpVar = (ixp) obj2;
                        ixk ixkVar = (ixk) obj3;
                        ixpVar.getClass();
                        ixkVar.getClass();
                        final iyl iylVarE = ixkVar.e(((kil) obj4).a);
                        return ixpVar.ej(iylVarE.b, iylVarE.a, fcvp.a, new fdap() { // from class: dmqe
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj5) {
                                iyk iykVar = (iyk) obj5;
                                iykVar.getClass();
                                iyl iylVar = iylVarE;
                                int i4 = iylVar.a;
                                iykVar.s(iylVar, (-i4) / 2, (i4 - iylVar.b) / 2, 0.0f);
                                return fctx.a;
                            }
                        });
                    }
                });
                hmwVar.af(objS3);
            }
            ics icsVarA2 = (ics) objS3;
            hmwVar.ab();
            final String strB = jqu.b(R.string.rotate_device_to_access_gallery, hmlVarC);
            hmlVarC.v(936851691);
            if (c(hoxVar)) {
                ico icoVar = ics.e;
                hmlVarC.v(5004770);
                boolean zD = hmlVarC.D(strB);
                Object objS4 = hmwVar.S();
                if (zD || objS4 == obj) {
                    objS4 = new fdap() { // from class: dmpz
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            jto jtoVar = (jto) obj2;
                            jtoVar.getClass();
                            jtk.n(jtoVar, 0);
                            jtk.k(jtoVar, strB);
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS4);
                }
                hmwVar.ab();
                icsVarA2 = icsVarA2.a(jsh.b(icoVar, (fdap) objS4));
            }
            ics icsVar = icsVarA2;
            hmwVar.ab();
            dia diaVarC = dea.c(500, 0, new den(0.0f, 0.0f, 0.0f, 1.0f), 2);
            hmlVarC.v(1849434622);
            Object objS5 = hmwVar.S();
            if (objS5 == obj) {
                objS5 = new fdap() { // from class: dmqa
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return Integer.valueOf(iIntValue + iIntValue);
                    }
                };
                hmwVar.af(objS5);
            }
            hmwVar.ab();
            dap dapVarE = dae.e(diaVarC, (fdap) objS5);
            dia diaVarC2 = dea.c(100, 0, new den(0.3f, 0.0f, 0.8f, 0.15f), 2);
            hmlVarC.v(1849434622);
            Object objS6 = hmwVar.S();
            if (objS6 == obj) {
                objS6 = new fdap() { // from class: dmqb
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return Integer.valueOf(iIntValue + iIntValue);
                    }
                };
                hmwVar.af(objS6);
            }
            hmwVar.ab();
            dar darVarH = dae.h(diaVarC2, (fdap) objS6);
            hmlVarC.v(1849434622);
            Object objS7 = hmwVar.S();
            if (objS7 == obj) {
                objS7 = new fdap() { // from class: dmqc
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        Boolean bool = (Boolean) obj2;
                        bool.booleanValue();
                        return bool;
                    }
                };
                hmwVar.af(objS7);
            }
            hmwVar.ab();
            cye.h(dhkVarD, (fdap) objS7, icsVar, dapVarE, darVarH, hxe.d(1787213046, new dmqg(strB), hmlVarC), hmlVarC, 224304);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmqd
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ede edeVar2 = edeVar;
                    int i4 = i;
                    dmqh.a(edeVar2, dmsoVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    public static final boolean c(hox hoxVar) {
        return ((Boolean) hoxVar.a()).booleanValue();
    }
}
