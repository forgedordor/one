package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djkd {
    public static final void a(final ego egoVar, final djkj djkjVar, final igr igrVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1433315823);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(egoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(djkjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(igrVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            eeq.b(dpc.c(egoVar.a(joj.a(ics.e, "ContactSearchBar"), 1.0f, true), dpc.a(0, hmlVarC, 0, 1), true & ((14 & 8) == 0), (14 & 2) != 0, true), ecr.g(4.0f), null, null, 0, 0, hxe.d(303743116, new djjy(djkjVar, igrVar), hmlVarC), hmlVarC, 1572912, 60);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djjq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ego egoVar2 = egoVar;
                    djkj djkjVar2 = djkjVar;
                    int i4 = i;
                    djkd.a(egoVar2, djkjVar2, igrVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final boolean z, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(569445051);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(jqu.b(z ? R.string.contact_bar_hint_filled : R.string.contact_bar_hint_empty, hmlVarC), null, glz.a(hmlVarC).s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, glz.d(hmlVarC).k, hmlVar2, 0, 3120, 55290);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djjx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    djkd.b(z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.hml r25, int r26) {
        /*
            r0 = 1862085784(0x6efd2c98, float:3.917681E28)
            r1 = r25
            hml r0 = r1.c(r0)
            if (r26 != 0) goto L1b
            boolean r1 = r0.I()
            r2 = 0
            if (r1 != 0) goto L15
            r24 = r2
            goto L1d
        L15:
            r0.s()
            r20 = r0
            goto L5f
        L1b:
            r24 = r26
        L1d:
            ico r1 = defpackage.ics.e
            r5 = 0
            r6 = 9
            r2 = 0
            r3 = 1096810496(0x41600000, float:14.0)
            r4 = 1099956224(0x41900000, float:18.0)
            ics r2 = defpackage.efy.j(r1, r2, r3, r4, r5, r6)
            r1 = 2132083534(0x7f15034e, float:1.9807213E38)
            java.lang.String r1 = defpackage.jqu.b(r1, r0)
            gda r3 = defpackage.glz.a(r0)
            long r3 = r3.q
            hcr r5 = defpackage.glz.d(r0)
            jyq r5 = r5.k
            r22 = 0
            r23 = 65528(0xfff8, float:9.1824E-41)
            r19 = r5
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 48
            r20 = r0
            defpackage.dthx.b(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = r24
        L5f:
            hpx r0 = r20.L()
            if (r0 == 0) goto L6c
            djjw r1 = new djjw
            r1.<init>()
            r0.d = r1
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djkd.c(hml, int):void");
    }

    public static final void d(final efd efdVar, final djkj djkjVar, final igr igrVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-115612018);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(efdVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(djkjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(igrVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            List list = djkjVar.a;
            hmlVarC.v(566006589);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dizs.e((dizu) it.next(), null, hmlVarC, 0);
            }
            ((hmw) hmlVarC).ab();
            boolean zIsEmpty = true ^ list.isEmpty();
            int i4 = i2;
            hsf hsfVar = djkjVar.e;
            fdap fdapVar = djkjVar.b;
            fdae fdaeVar = djkjVar.c;
            fdae fdaeVar2 = djkjVar.d;
            djki djkiVar = djkjVar.f;
            e(efdVar, zIsEmpty, hsfVar, fdapVar, fdaeVar, fdaeVar2, igrVar, djkiVar.b, djkiVar.c, hmlVarC, (i4 & 14) | ((i4 << 12) & 3670016));
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djjs
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    efd efdVar2 = efdVar;
                    djkj djkjVar2 = djkjVar;
                    int i5 = i;
                    djkd.d(efdVar2, djkjVar2, igrVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final efd efdVar, final boolean z, final hsf hsfVar, final fdap fdapVar, final fdae fdaeVar, final fdae fdaeVar2, final igr igrVar, final boolean z2, final boolean z3, hml hmlVar, final int i) {
        int i2;
        ics icsVarA;
        kfp kfpVar;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1700399693);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(efdVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(hsfVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.D(igrVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != hmlVarC.E(z3) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((38347923 & i2) == 38347922 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            int i4 = 57344 & i2;
            long j = glz.a(hmlVarC).a;
            hmlVarC.v(5004770);
            boolean zC = hmlVarC.C(j);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zC || objS == hmk.a) {
                hpl hplVar = new hpl(new ikt(j), hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            hmlVarC.v(-1996511859);
            ics icsVarA2 = igt.a(efdVar.a(ics.e, 1.0f, true), igrVar);
            if (z3) {
                hmlVarC.v(1250932572);
                hmlVarC.v(5004770);
                Object objS2 = hmwVar.S();
                if (i4 == 16384 || objS2 == hmk.a) {
                    objS2 = new djjz(fdaeVar);
                    hmwVar.af(objS2);
                }
                hmwVar.ab();
                icsVarA = iqk.b(icsVarA2, (fdap) objS2);
                hmwVar.ab();
            } else {
                hmlVarC.v(1251162251);
                hmlVarC.v(5004770);
                Object objS3 = hmwVar.S();
                if (i4 == 16384 || objS3 == hmk.a) {
                    objS3 = new djka(fdaeVar);
                    hmwVar.af(objS3);
                }
                hmwVar.ab();
                icsVarA = iqk.a(icsVarA2, (fdap) objS3);
                hmwVar.ab();
            }
            hmwVar.ab();
            ics icsVarA3 = joj.a(icsVarA, "ContactSearchField");
            ikt iktVar = (ikt) hoxVar.a();
            fae faeVar = new fae(2, null, 0, 7, 118);
            jyq jyqVarY = jyq.y(glz.d(hmlVarC).k, glz.a(hmlVarC).q, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
            hmlVarC.v(5004770);
            int i5 = 458752 & i2;
            Object objS4 = hmwVar.S();
            if (i5 == 131072 || objS4 == hmk.a) {
                objS4 = new fdap() { // from class: djjt
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((fac) obj).getClass();
                        fdaeVar2.invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS4);
            }
            hmwVar.ab();
            fad fadVar = new fad((fdap) objS4, null, null, null, 62);
            String str = (String) hsfVar.a();
            if (z2) {
                kfp kfpVar2 = dlfz.a;
                kfpVar = dlfz.a;
            } else {
                kfpVar = kfo.a;
            }
            kfp kfpVar3 = kfpVar;
            hmlVarC.v(5004770);
            int i6 = i2 & 7168;
            Object objS5 = hmwVar.S();
            if (i6 == 2048 || objS5 == hmk.a) {
                objS5 = new fdap() { // from class: djju
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        String str2 = (String) obj;
                        str2.getClass();
                        fdapVar.invoke(str2);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS5);
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            ewj.c(str, (fdap) objS5, icsVarA3, false, jyqVarY, faeVar, fadVar, true, 0, 0, kfpVar3, null, null, iktVar, hxe.d(2074171094, new djkc(hsfVar, z), hmlVarC), hmlVar2, 102236160, 196608, 13848);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djjv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    efd efdVar2 = efdVar;
                    boolean z4 = z;
                    hsf hsfVar2 = hsfVar;
                    fdap fdapVar2 = fdapVar;
                    fdae fdaeVar3 = fdaeVar;
                    fdae fdaeVar4 = fdaeVar2;
                    igr igrVar2 = igrVar;
                    boolean z5 = z2;
                    djkd.e(efdVar2, z4, hsfVar2, fdapVar2, fdaeVar3, fdaeVar4, igrVar2, z5, z3, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final djkj djkjVar, final ics icsVar, final igr igrVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-677013339);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djkjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(igrVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmlVarC.v(-2069748471);
            ics icsVarF = egq.f(egq.d(icsVar, 1.0f), 48.0f, 120.0f);
            if (!djkjVar.f.a) {
                icsVarF = icsVarF.a(dkl.a(ics.e, glz.a(hmlVarC).F, ikj.a));
            }
            ics icsVar2 = icsVarF;
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            ics icsVarJ = efy.j(icsVar2, 20.0f, 0.0f, 16.0f, 0.0f, 10);
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVarC, 0);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            egp egpVar = egp.a;
            c(hmlVarC, 0);
            a(egpVar, djkjVar, igrVar, hmlVarC, (i2 & 896) | ((i2 << 3) & 112) | 6);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djjr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djkj djkjVar2 = djkjVar;
                    ics icsVar3 = icsVar;
                    int i5 = i;
                    djkd.f(djkjVar2, icsVar3, igrVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
