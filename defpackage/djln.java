package defpackage;

import com.google.android.apps.messaging.R;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djln {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final ics icsVar, final djml djmlVar, hml hmlVar, final int i) {
        int i2;
        Object obj;
        Object obj2;
        boolean z;
        djll djllVar;
        icsVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1877236062);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(djmlVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = Float.compare(djmd.g(hmlVarC), 336.0f) <= 0 ? 1 : 0;
            final ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            zoneIdSystemDefault.getClass();
            Object[] objArr = new Object[0];
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj3 = hmk.a;
            if (objS == obj3) {
                objS = new fdae() { // from class: djla
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return new hpl(djlo.a, hsi.a);
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            final hox hoxVar = (hox) hxy.a(objArr, (fdae) objS, hmlVarC, 48);
            Instant instant = djmlVar.b;
            Instant instant2 = instant.atZone(zoneIdSystemDefault).v(ZoneOffset.UTC).toInstant();
            instant2.getClass();
            final Long lValueOf = Long.valueOf(instant2.toEpochMilli());
            final djll djllVar2 = new djll(djmlVar);
            egc egcVar = ghx.a;
            gev gevVar = gev.a;
            final fddq fddqVar = gev.b;
            final Locale localeA = gay.a(hmlVarC);
            int i5 = i2;
            Object[] objArr2 = new Object[0];
            hyr hyrVarA = hxu.a(new fdat() { // from class: ghz
                @Override // defpackage.fdat
                public final Object a(Object obj4, Object obj5) {
                    gib gibVar = (gib) obj5;
                    Long lD = gibVar.d();
                    Long lValueOf2 = Long.valueOf(gibVar.a());
                    fddq fddqVar2 = gibVar.a;
                    return fcva.g(lD, lValueOf2, Integer.valueOf(fddqVar2.a), Integer.valueOf(fddqVar2.b), Integer.valueOf(gibVar.c()));
                }
            }, new fdap() { // from class: gia
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    List list = (List) obj4;
                    Long l = (Long) list.get(0);
                    Long l2 = (Long) list.get(1);
                    Object obj5 = list.get(2);
                    obj5.getClass();
                    int iIntValue = ((Integer) obj5).intValue();
                    Object obj6 = list.get(3);
                    obj6.getClass();
                    fddq fddqVar2 = new fddq(iIntValue, ((Integer) obj6).intValue());
                    Object obj7 = list.get(4);
                    obj7.getClass();
                    return new gib(l, l2, fddqVar2, ((Integer) obj7).intValue(), djllVar2, localeA);
                }
            });
            boolean zD = hmlVarC.D(lValueOf) | hmlVarC.D(lValueOf) | hmlVarC.F(fddqVar) | hmlVarC.B(i4) | hmlVarC.D(djllVar2) | hmlVarC.F(localeA);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == obj3) {
                obj = obj3;
                final int i6 = i4;
                obj2 = new fdae() { // from class: ggj
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        egc egcVar2 = ghx.a;
                        return new gib(lValueOf, lValueOf, fddqVar, i6, djllVar2, localeA);
                    }
                };
                z = i6;
                djllVar = djllVar2;
                hmwVar.af(obj2);
            } else {
                obj2 = objS2;
                obj = obj3;
                z = i4;
                djllVar = djllVar2;
            }
            final gib gibVar = (gib) hxy.e(objArr2, hyrVarA, (fdae) obj2, hmlVarC, 0, 4);
            gibVar.d.b(djllVar);
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instant, zoneIdSystemDefault);
            localDateTimeOfInstant.getClass();
            final boolean z2 = djmlVar.c;
            final int hour = localDateTimeOfInstant.getHour();
            final int minute = localDateTimeOfInstant.getMinute();
            float f = hbj.a;
            Object[] objArr3 = new Object[0];
            hyu hyuVar = new hyu(new fdat() { // from class: hbm
                @Override // defpackage.fdat
                public final Object a(Object obj4, Object obj5) {
                    hbo hboVar = (hbo) obj5;
                    return fcva.g(Integer.valueOf(hboVar.d()), Integer.valueOf(hboVar.e()), Boolean.valueOf(hboVar.a));
                }
            }, new fdap() { // from class: hbn
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    List list = (List) obj4;
                    Object obj5 = list.get(0);
                    obj5.getClass();
                    int iIntValue = ((Integer) obj5).intValue();
                    Object obj6 = list.get(1);
                    obj6.getClass();
                    int iIntValue2 = ((Integer) obj6).intValue();
                    Object obj7 = list.get(2);
                    obj7.getClass();
                    return new hbo(iIntValue, iIntValue2, ((Boolean) obj7).booleanValue());
                }
            });
            boolean zB = hmlVarC.B(hour) | hmlVarC.B(minute) | hmlVarC.E(z2);
            Object objS3 = hmwVar.S();
            if (zB || objS3 == obj) {
                objS3 = new fdae() { // from class: gzq
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        float f2 = hbj.a;
                        return new hbo(hour, minute, z2);
                    }
                };
                hmwVar.af(objS3);
            }
            final hbo hboVar = (hbo) hxy.e(objArr3, hyuVar, (fdae) objS3, hmlVarC, 0, 4);
            hmlVarC.v(5004770);
            boolean zD2 = hmlVarC.D(hoxVar);
            Object objS4 = hmwVar.S();
            if (zD2 || objS4 == obj) {
                objS4 = new fdae() { // from class: djlb
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        djln.b(hoxVar, djlo.b);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS4);
            }
            fdae fdaeVar = (fdae) objS4;
            hmwVar.ab();
            hmlVarC.v(5004770);
            boolean zD3 = hmlVarC.D(hoxVar);
            Object objS5 = hmwVar.S();
            if (zD3 || objS5 == obj) {
                objS5 = new fdae() { // from class: djlc
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        djln.b(hoxVar, djlo.a);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS5);
            }
            fdae fdaeVar2 = (fdae) objS5;
            hmwVar.ab();
            hmlVarC.v(-1224400529);
            boolean zD4 = hmlVarC.D(gibVar) | hmlVarC.F(hboVar) | hmlVarC.F(zoneIdSystemDefault);
            boolean z3 = (i5 & 112) == 32;
            Object objS6 = hmwVar.S();
            if ((zD4 | z3) || objS6 == obj) {
                objS6 = new fdae() { // from class: djld
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        Long lD = gibVar.d();
                        if (lD == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        djml djmlVar2 = djmlVar;
                        ZoneId zoneId = zoneIdSystemDefault;
                        hbl hblVar = hboVar;
                        djmlVar2.f.invoke(Long.valueOf(LocalDateTime.ofInstant(Instant.ofEpochMilli(lD.longValue() + TimeUnit.HOURS.toMillis(hblVar.d()) + TimeUnit.MINUTES.toMillis(hblVar.e())), ZoneId.ofOffset("UTC", ZoneOffset.UTC)).y(zoneId).toInstant().toEpochMilli()));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS6);
            }
            final fdae fdaeVar3 = (fdae) objS6;
            hmwVar.ab();
            int iOrdinal = ((djlo) hoxVar.a()).ordinal();
            if (iOrdinal == 0) {
                hmlVarC.v(32606953);
                float fG = z != 0 ? (djmd.g(hmlVarC) * 0.9f) / 336.0f : 1.0f;
                dten.a(djmlVar.i, hxe.d(977108524, new djlh(fdaeVar, gibVar), hmlVarC), ifj.a(dpc.c(icsVar, dpc.a(0, hmlVarC, 0, 1), false & ((14 & 8) == 0), (14 & 2) != 0, true), fG, fG), hxe.d(1880029102, new djli(djmlVar), hmlVarC), null, 0.0f, null, null, hxe.d(-848006397, new djlj(gibVar), hmlVarC), hmlVarC, 100666416);
                hmlVarC = hmlVarC;
                hmwVar.ab();
            } else {
                if (iOrdinal != 1) {
                    hmlVarC.v(-137496297);
                    hmwVar.ab();
                    throw new fctg();
                }
                hmlVarC.v(33760153);
                ics icsVarC = dpc.c(icsVar, dpc.a(0, hmlVarC, 0, 1), false & ((14 & 8) == 0), (14 & 2) != 0, true);
                fdae fdaeVar4 = djmlVar.i;
                dktq dktqVar = new dktq(jqu.b(R.string.datetime_picker_dialog_back_button, hmlVarC), fdaeVar2);
                dktq dktqVar2 = djmlVar.g;
                String strB = dktqVar2 != null ? dktqVar2.a : null;
                hmlVarC.v(-137446005);
                if (strB == null) {
                    strB = jqu.b(R.string.datetime_picker_dialog_finish_button, hmlVarC);
                }
                hmwVar.ab();
                hmlVarC.v(-1633490746);
                boolean zD5 = z3 | hmlVarC.D(fdaeVar3);
                Object objS7 = hmwVar.S();
                if (zD5 || objS7 == obj) {
                    objS7 = new fdae() { // from class: djle
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fdaeVar3.invoke();
                            dktq dktqVar3 = djmlVar.g;
                            if (dktqVar3 != null) {
                                dktqVar3.c.invoke();
                            }
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS7);
                }
                hmwVar.ab();
                c(icsVarC, fdaeVar4, dktqVar, new dktq(strB, (fdae) objS7), hxe.d(1211234615, new djlk(z, hboVar), hmlVarC), hmlVarC, 24576);
                hmlVarC = hmlVarC;
                hmwVar.ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djlf
                @Override // defpackage.fdat
                public final Object a(Object obj4, Object obj5) {
                    ((Integer) obj5).intValue();
                    ics icsVar2 = icsVar;
                    int i7 = i;
                    djln.a(icsVar2, djmlVar, (hml) obj4, hpy.a(i7 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(hox hoxVar, djlo djloVar) {
        hoxVar.b(djloVar);
    }

    public static final void c(final ics icsVar, final fdae fdaeVar, final dktq dktqVar, final dktq dktqVar2, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(793444922);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(dktqVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(dktqVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final String strB = jqu.b(R.string.time_picker_dialog_pane_title, hmlVarC);
            ics icsVarB = efm.b(icsVar, 1);
            ico icoVar = ics.e;
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(strB);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdap() { // from class: djky
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        jtoVar.getClass();
                        jtk.o(jtoVar, strB);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            djmd.d(icsVarB.a(jsh.c(icoVar, false, (fdap) objS)), false, fdaeVar, new knl(false, 3), hxe.d(1027460724, new djlm(dktqVar2, dktqVar, fdatVar), hmlVarC), hmlVarC, ((i2 << 3) & 896) | 27648, 2);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djkz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    fdae fdaeVar2 = fdaeVar;
                    dktq dktqVar3 = dktqVar;
                    dktq dktqVar4 = dktqVar2;
                    djln.c(icsVar2, fdaeVar2, dktqVar3, dktqVar4, fdatVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
