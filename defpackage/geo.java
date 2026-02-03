package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class geo {
    public static final /* synthetic */ int a = 0;
    private static final egc b = efy.h(24.0f, 10.0f, 24.0f, 0.0f, 8);
    private static final float c = 16.0f;

    public static final kew a(hox hoxVar) {
        return (kew) hoxVar.a();
    }

    public static final void b(hox hoxVar, kew kewVar) {
        hoxVar.b(kewVar);
    }

    public static final void c(final Long l, final fdap fdapVar, final hhr hhrVar, final fddq fddqVar, final gfd gfdVar, final djll djllVar, final geq geqVar, final igr igrVar, hml hmlVar, final int i) {
        int i2;
        fddq fddqVar2;
        djll djllVar2;
        hml hmlVar2;
        hid hidVar;
        Locale locale;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-432341251);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(l) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(hhrVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            fddqVar2 = fddqVar;
            i2 |= true != hmlVarC.F(fddqVar2) ? 1024 : 2048;
        } else {
            fddqVar2 = fddqVar;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((i & 32768) == 0 ? hmlVarC.D(gfdVar) : hmlVarC.F(gfdVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            djllVar2 = djllVar;
            i2 |= true != hmlVarC.D(djllVar2) ? 65536 : 131072;
        } else {
            djllVar2 = djllVar;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.D(geqVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.D(igrVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        boolean z = false;
        if (hmlVarC.J((4793491 & i2) != 4793490, i2 & 1)) {
            Locale locale2 = hhrVar.a;
            boolean zD = hmlVarC.D(locale2);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = hhrVar.i(locale2);
                hmwVar.af(objS);
            }
            hid hidVar2 = (hid) objS;
            String strB = hjw.b(R.string.m3c_date_input_invalid_for_pattern, hmlVarC);
            String strB2 = hjw.b(R.string.m3c_date_input_invalid_year_range, hmlVarC);
            int i4 = i2;
            String strB3 = hjw.b(R.string.m3c_date_input_invalid_not_allowed, hmlVarC);
            boolean zD2 = hmlVarC.D(hidVar2);
            if ((i4 & 57344) == 16384 || ((i4 & 32768) != 0 && hmlVarC.D(gfdVar))) {
                z = true;
            }
            boolean z2 = zD2 | z;
            Object objS2 = hmwVar.S();
            if (z2 || objS2 == hmk.a) {
                hidVar = hidVar2;
                locale = locale2;
                gep gepVar = new gep(fddqVar2, djllVar2, hidVar, gfdVar, strB, strB2, strB3);
                hmwVar.af(gepVar);
                objS2 = gepVar;
            } else {
                hidVar = hidVar2;
                locale = locale2;
            }
            gep gepVar2 = (gep) objS2;
            String upperCase = hidVar.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String strB4 = hjw.b(R.string.m3c_date_input_label, hmlVarC);
            ics icsVarC = efy.c(egq.d(ics.e, 1.0f), b);
            gepVar2.a = l;
            int i5 = i4 << 3;
            hmlVar2 = hmlVarC;
            d(icsVarC, l, fdapVar, hhrVar, hxe.d(-752164549, new gei(strB4, upperCase), hmlVarC), hxe.d(-1179434278, new gek(upperCase), hmlVarC), gepVar2, hidVar, locale, geqVar, igrVar, hmlVar2, (i5 & 7168) | (i5 & 112) | 1794054 | (i5 & 896), (i4 >> 18) & 126);
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: geb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar3 = (hml) obj;
                    ((Integer) obj2).intValue();
                    Long l2 = l;
                    fdap fdapVar2 = fdapVar;
                    hhr hhrVar2 = hhrVar;
                    fddq fddqVar3 = fddqVar;
                    gfd gfdVar2 = gfdVar;
                    djll djllVar3 = djllVar;
                    int i6 = i;
                    geo.c(l2, fdapVar2, hhrVar2, fddqVar3, gfdVar2, djllVar3, geqVar, igrVar, hmlVar3, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final ics icsVar, Long l, final fdap fdapVar, final hhr hhrVar, final fdat fdatVar, final fdat fdatVar2, final gep gepVar, final hid hidVar, final Locale locale, geq geqVar, final igr igrVar, hml hmlVar, final int i, final int i2) {
        ics icsVar2;
        int i3;
        gep gepVar2;
        boolean z;
        boolean z2;
        int i4;
        final Long l2;
        hml hmlVar2;
        final geq geqVar2;
        Object obj;
        hhr hhrVar2;
        Locale locale2;
        hox hoxVar;
        float f;
        Object obj2;
        hml hmlVar3;
        boolean z3;
        int i5;
        hid hidVar2;
        hhr hhrVar3;
        Locale locale3;
        final hox hoxVar2;
        hox hoxVar3;
        int i6 = i & 6;
        hml hmlVarC = hmlVar.c(1456309913);
        if (i6 == 0) {
            icsVar2 = icsVar;
            i3 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i;
        } else {
            icsVar2 = icsVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(l) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.F(fdapVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.F(hhrVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != hmlVarC.F(fdatVar2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != hmlVarC.B(0) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            gepVar2 = gepVar;
            i3 |= true != hmlVarC.D(gepVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            gepVar2 = gepVar;
        }
        if ((100663296 & i) == 0) {
            z = true;
            i3 |= true != hmlVarC.D(hidVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            z = true;
        }
        if ((805306368 & i) == 0) {
            i3 |= z != hmlVarC.F(locale) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            z2 = true;
            i4 = i2 | (true != hmlVarC.D(geqVar) ? 2 : 4);
        } else {
            z2 = true;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= z2 != hmlVarC.D(igrVar) ? 16 : 32;
        }
        int i7 = i4;
        if (hmlVarC.J(((306783379 & i3) == 306783378 && (i7 & 19) == 18) ? false : true, i3 & 1)) {
            Object[] objArr = new Object[0];
            hyr hyrVar = kew.a;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj3 = hmk.a;
            if (objS == obj3) {
                objS = new fdae() { // from class: gec
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        int i8 = geo.a;
                        return new hpl(new kew((String) null, 0L, 7), hsi.a);
                    }
                };
                hmwVar.af(objS);
            }
            final hox hoxVarD = hxy.d(objArr, hyrVar, (fdae) objS, hmlVarC, 3072);
            Object[] objArr2 = {a(hoxVarD)};
            boolean zD = hmlVarC.D(hoxVarD);
            boolean z4 = (29360128 & i3) == 8388608;
            boolean zF = zD | z4 | hmlVarC.F(hhrVar);
            boolean z5 = (234881024 & i3) == 67108864;
            boolean zF2 = zF | z5 | hmlVarC.F(locale);
            boolean z6 = z5;
            boolean z7 = (i3 & 3670016) == 1048576;
            Object objS2 = hmwVar.S();
            if ((zF2 || z7) || objS2 == obj3) {
                final gep gepVar3 = gepVar2;
                obj = new fdae() { // from class: ged
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        String strA;
                        hox hoxVar4 = hoxVarD;
                        if (geo.a(hoxVar4).a().length() > 0) {
                            Locale locale4 = locale;
                            hid hidVar3 = hidVar;
                            strA = gepVar3.a(hhrVar.d(geo.a(hoxVar4).a(), hidVar3.c, locale4), locale4);
                        } else {
                            strA = "";
                        }
                        return new hpl(strA, hsi.a);
                    }
                };
                hhrVar2 = hhrVar;
                locale2 = locale;
                hoxVar = hoxVarD;
                hmwVar.af(obj);
            } else {
                obj = objS2;
                hhrVar2 = hhrVar;
                locale2 = locale;
                hoxVar = hoxVarD;
            }
            final hox hoxVar4 = hoxVar;
            final hox hoxVar5 = (hox) hxy.e(objArr2, null, (fdae) obj, hmlVarC, 0, 6);
            if (fdgn.H((CharSequence) hoxVar5.a())) {
                f = c;
            } else {
                egd egdVar = new egd(16.0f, 4.0f, 16.0f, 0.0f);
                f = c - (egdVar.b + egdVar.a);
            }
            float f2 = f;
            boolean z8 = z4;
            kew kewVarA = a(hoxVar4);
            boolean zD2 = z6 | hmlVarC.D(hoxVar4) | hmlVarC.D(hoxVar5) | ((i3 & 896) == 256) | hmlVarC.F(hhrVar2) | hmlVarC.F(locale2);
            Object objS3 = hmwVar.S();
            if ((z7 || (z8 | zD2)) || objS3 == obj3) {
                final hhr hhrVar4 = hhrVar2;
                hmlVar3 = hmlVarC;
                final Locale locale4 = locale2;
                z3 = false;
                i5 = 32;
                obj2 = new fdap() { // from class: gee
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        kew kewVar = (kew) obj4;
                        int i8 = geo.a;
                        int length = kewVar.a().length();
                        String str = hidVar.c;
                        if (length <= str.length()) {
                            String strA = kewVar.a();
                            int i9 = 0;
                            while (true) {
                                if (i9 >= strA.length()) {
                                    hox hoxVar6 = hoxVar4;
                                    fdap fdapVar2 = fdapVar;
                                    hox hoxVar7 = hoxVar5;
                                    geo.b(hoxVar6, kewVar);
                                    String string = fdgn.x(kewVar.a()).toString();
                                    Long lValueOf = null;
                                    if (string.length() != 0 && string.length() >= str.length()) {
                                        gep gepVar4 = gepVar;
                                        Locale locale5 = locale4;
                                        hhq hhqVarD = hhrVar4.d(string, str, locale5);
                                        hoxVar7.b(gepVar4.a(hhqVarD, locale5));
                                        if (((CharSequence) hoxVar7.a()).length() == 0 && hhqVarD != null) {
                                            lValueOf = Long.valueOf(hhqVarD.c);
                                        }
                                        fdapVar2.invoke(lValueOf);
                                    } else {
                                        hoxVar7.b("");
                                        fdapVar2.invoke(null);
                                    }
                                } else {
                                    if (!Character.isDigit(strA.charAt(i9))) {
                                        break;
                                    }
                                    i9++;
                                }
                            }
                        }
                        return fctx.a;
                    }
                };
                hidVar2 = hidVar;
                hhrVar3 = hhrVar4;
                locale3 = locale4;
                hoxVar2 = hoxVar5;
                hoxVar3 = hoxVar4;
                hmwVar.af(obj2);
            } else {
                hidVar2 = hidVar;
                hmlVar3 = hmlVarC;
                hoxVar2 = hoxVar5;
                obj2 = objS3;
                hoxVar3 = hoxVar4;
                locale3 = locale2;
                z3 = false;
                hhrVar3 = hhrVar2;
                i5 = 32;
            }
            fdap fdapVar2 = (fdap) obj2;
            ics icsVarJ = efy.j(icsVar2, 0.0f, 0.0f, 0.0f, f2, 7);
            boolean zD3 = hmlVar3.D(hoxVar2);
            Object objS4 = hmwVar.S();
            if (zD3 || objS4 == obj3) {
                objS4 = new fdap() { // from class: gef
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        jto jtoVar = (jto) obj4;
                        int i8 = geo.a;
                        hox hoxVar6 = hoxVar2;
                        if (!fdgn.H((CharSequence) hoxVar6.a())) {
                            jtk.e(jtoVar, (String) hoxVar6.a());
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS4);
            }
            geqVar2 = geqVar;
            hml hmlVar4 = hmlVar3;
            gpy.a(kewVarA, fdapVar2, jsh.c(icsVarJ, false, (fdap) objS4).a(igrVar != null ? igt.a(ics.e, igrVar) : ics.e), false, null, fdatVar, fdatVar2, null, hxe.d(-357881838, new gel(hoxVar2), hmlVar3), !fdgn.H((CharSequence) hoxVar2.a()), new gid(hidVar2), new fae(0, Boolean.valueOf(z3), 3, 7, 113), null, true, 0, 0, null, geqVar2.y, hmlVar4, (i3 << 6) & 33030144, 12779904, 0, 4001592);
            hmlVar2 = hmlVar4;
            int i8 = i7 & 112;
            fctx fctxVar = fctx.a;
            Object objS5 = hmwVar.S();
            if (i8 == i5 || objS5 == obj3) {
                objS5 = new gem(igrVar, null);
                hmwVar.af(objS5);
            }
            hob.g(fctxVar, (fdat) objS5, hmlVar2);
            boolean zF3 = hmlVar2.F(hhrVar3) | ((i3 & 112) == i5 ? true : z3) | z6 | hmlVar2.F(locale3) | hmlVar2.D(hoxVar3);
            Object objS6 = hmwVar.S();
            if (zF3 || objS6 == obj3) {
                gen genVar = new gen(l, hhrVar3, hidVar, locale3, hoxVar3, null);
                l2 = l;
                hmwVar.af(genVar);
                objS6 = genVar;
            } else {
                l2 = l;
            }
            hob.g(l2, (fdat) objS6, hmlVar2);
        } else {
            l2 = l;
            hmlVar2 = hmlVarC;
            geqVar2 = geqVar;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: geg
                @Override // defpackage.fdat
                public final Object a(Object obj4, Object obj5) {
                    hml hmlVar5 = (hml) obj4;
                    ((Integer) obj5).intValue();
                    ics icsVar3 = icsVar;
                    Long l3 = l2;
                    fdap fdapVar3 = fdapVar;
                    hhr hhrVar5 = hhrVar;
                    fdat fdatVar3 = fdatVar;
                    fdat fdatVar4 = fdatVar2;
                    gep gepVar4 = gepVar;
                    hid hidVar3 = hidVar;
                    Locale locale5 = locale;
                    int i9 = i;
                    geo.d(icsVar3, l3, fdapVar3, hhrVar5, fdatVar3, fdatVar4, gepVar4, hidVar3, locale5, geqVar2, igrVar, hmlVar5, hpy.a(i9 | 1), hpy.a(i2));
                    return fctx.a;
                }
            };
        }
    }
}
