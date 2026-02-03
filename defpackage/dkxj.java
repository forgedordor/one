package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxj {
    private static final int A(ixk ixkVar) {
        return ixkVar.c(Alert.DURATION_SHOW_INDEFINITELY);
    }

    private static final iyl B(ixk ixkVar, dkxl dkxlVar, int i) {
        return ixkVar.e(kil.m(dkxlVar.a(), 0, 0, 0, i, 7));
    }

    private static final jyq C(hml hmlVar) {
        hmlVar.v(-214503550);
        jyq jyqVar = glz.d(hmlVar).j;
        ((hmw) hmlVar).ab();
        return jyqVar;
    }

    private static final jyq D(hml hmlVar) {
        hmlVar.v(1805427584);
        jyq jyqVar = glz.d(hmlVar).h;
        ((hmw) hmlVar).ab();
        return jyqVar;
    }

    private static final long E(long j, boolean z, hml hmlVar) {
        hmlVar.v(1001084755);
        if (!z) {
            ((hmw) hmlVar).ab();
            return j;
        }
        long jH = ijg.h(dkvo.p(hmlVar), j);
        ((hmw) hmlVar).ab();
        return jH;
    }

    public static final ixn a(ixp ixpVar, final dkwa dkwaVar) {
        fcww fcwwVar = new fcww((byte[]) null);
        fcwwVar.add(dkwaVar.a);
        fcwwVar.add(dkwaVar.b);
        fcwwVar.add(dkwaVar.c);
        fcwwVar.addAll(dkwaVar.e);
        fcwwVar.add(dkwaVar.f);
        final List listA = fcva.a(fcwwVar);
        Iterator it = listA.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int i = ((iyl) it.next()).a;
        while (it.hasNext()) {
            int i2 = ((iyl) it.next()).a;
            if (i < i2) {
                i = i2;
            }
        }
        Iterator it2 = listA.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            i3 += ((iyl) it2.next()).b;
        }
        return ixpVar.ej(i, i3, fcvp.a, new fdap() { // from class: dkwg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk iykVar = (iyk) obj;
                iykVar.getClass();
                int i4 = 0;
                for (iyl iylVar : listA) {
                    iyk.A(iykVar, iylVar, 0, i4);
                    i4 += iylVar.b;
                }
                iyl iylVar2 = dkwaVar.d;
                if (iylVar2 != null) {
                    iyk.A(iykVar, iylVar2, 0, 0);
                }
                return fctx.a;
            }
        });
    }

    public static final dkwa b(dkxl dkxlVar, dkxo dkxoVar) {
        List listB;
        iyl iylVarB = B(dkxlVar.e(), dkxlVar, dkxoVar.a);
        int i = dkxoVar.b;
        iyl iylVarB2 = B(dkxlVar.f(), dkxlVar, i);
        int i2 = dkxoVar.c;
        iyl iylVarB3 = B(dkxlVar.c(), dkxlVar, i2);
        if (dkxlVar instanceof dkxn) {
            if (dkxoVar.d > 0) {
                dkxn dkxnVar = (dkxn) dkxlVar;
                List listAm = fcva.am(dkxnVar.b, (r2 + r2) - 1);
                listB = new ArrayList(fcva.p(listAm, 10));
                Iterator it = listAm.iterator();
                while (it.hasNext()) {
                    listB.add(((ixk) it.next()).e(dkxnVar.a));
                }
            } else {
                listB = fcvo.a;
            }
        } else {
            if (!(dkxlVar instanceof dkxm)) {
                throw new fctg();
            }
            int i3 = dkxoVar.d;
            if (i3 > 0) {
                dkxm dkxmVar = (dkxm) dkxlVar;
                ixk ixkVar = dkxmVar.b;
                listB = fcva.b(B(ixkVar, dkxlVar, (ixkVar.c(kil.b(dkxmVar.a)) / dkxmVar.e) * i3));
            } else {
                listB = fcvo.a;
            }
        }
        iyl iylVarB4 = null;
        if (dkxoVar.f && (i != 0 || i2 != 0)) {
            iylVarB4 = i2 == 0 ? B(dkxlVar.g(), dkxlVar, iylVarB.b + iylVarB2.b) : B(dkxlVar.d(), dkxlVar, iylVarB.b + iylVarB2.b + iylVarB3.b);
        }
        return new dkwa(iylVarB, iylVarB2, iylVarB3, iylVarB4, listB, B(dkxlVar.b(), dkxlVar, dkxoVar.e));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.dkwb c(final defpackage.dkxl r11) {
        /*
            boolean r0 = r11 instanceof defpackage.dkxn
            if (r0 == 0) goto L79
            r0 = r11
            dkxn r0 = (defpackage.dkxn) r0
            java.util.List r0 = r0.b
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = defpackage.fcva.p(r0, r2)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r0.next()
            ixk r3 = (defpackage.ixk) r3
            int r3 = z(r3, r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
            goto L18
        L30:
            dkwi r0 = new dkwi
            r0.<init>()
            r3 = 2
            r4 = 1
            java.util.List r0 = defpackage.fcva.aH(r1, r3, r4, r0)
            java.util.Iterator r1 = r0.iterator()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L48
            fcvo r0 = defpackage.fcvo.a
            goto La2
        L48:
            java.lang.Object r3 = r1.next()
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = defpackage.fcva.p(r0, r2)
            r4.<init>(r0)
            r4.add(r3)
        L58:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r3.intValue()
            int r2 = r2 + r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4.add(r3)
            goto L58
        L77:
            r8 = r4
            goto La3
        L79:
            boolean r0 = r11 instanceof defpackage.dkxm
            if (r0 == 0) goto Lf0
            r0 = r11
            dkxm r0 = (defpackage.dkxm) r0
            float r1 = r0.c
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            dkwj r2 = new dkwj
            r2.<init>()
            fdev r1 = defpackage.fdey.e(r1, r2)
            int r0 = r0.e
            fdev r0 = defpackage.fdey.l(r1, r0)
            dkwk r1 = new dkwk
            r1.<init>()
            fdev r0 = defpackage.fdey.j(r0, r1)
            java.util.List r0 = defpackage.fdey.g(r0)
        La2:
            r8 = r0
        La3:
            dkwb r1 = new dkwb
            long r2 = r11.a()
            int r2 = defpackage.kil.a(r2)
            ixk r0 = r11.e()
            int r3 = z(r0, r11)
            ixk r0 = r11.f()
            int r4 = A(r0)
            ixk r0 = r11.f()
            int r5 = z(r0, r11)
            ixk r0 = r11.c()
            int r6 = A(r0)
            ixk r0 = r11.c()
            int r7 = z(r0, r11)
            java.lang.Object r0 = defpackage.fcva.T(r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Le2
            int r0 = r0.intValue()
            goto Le3
        Le2:
            r0 = 0
        Le3:
            r9 = r0
            ixk r0 = r11.b()
            int r10 = z(r0, r11)
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        Lf0:
            fctg r11 = new fctg
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkxj.c(dkxl):dkwb");
    }

    public static final void d(final dkuh dkuhVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1361549155);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkuhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            p(dkuhVar.b, dkuhVar.a, dkuhVar.c, joj.a(egq.d(efy.i(ics.e, 16.0f, 0.0f, 2), 1.0f), "rich_card_action"), hmlVarC, 3072);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkwf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkxj.d(dkuhVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final dkuh dkuhVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-196291237);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkuhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            gvk.e(dkuhVar.c, joj.a(egq.d(ics.e, 1.0f), "rich_card_action"), false, glz.c(hmlVarC).b, 0L, 0L, 0.0f, null, null, hxe.d(-2001260890, new dkxe(dkuhVar), hmlVarC), hmlVar2, 1012);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkwh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkxj.e(dkuhVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final List list, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1805979586);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            Iterator it = list.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                int i5 = i4 + 1;
                dkuh dkuhVar = (dkuh) it.next();
                int iE = fcva.e(list);
                d(dkuhVar, hmlVarC, 0);
                hmlVarC.v(-379587937);
                if (i4 != iE) {
                    q(efy.i(ics.e, 16.0f, 0.0f, 2), hmlVarC, 6);
                }
                ((hmw) hmlVarC).ab();
                i4 = i5;
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkwq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    dkxj.f(list, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final List list, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-482547338);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarA = iex.a(efy.j(efy.i(ics.e, 16.0f, 0.0f, 2), 0.0f, 8.0f, 0.0f, 4.0f, 5), glz.c(hmlVarC).f);
            ixm ixmVarA = edl.a(ecr.g(2.0f), ibw.j, hmlVarC, 0);
            int iA = dkwc.a(hmg.b(hmlVarC));
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
            hmlVarC.v(1535045324);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e((dkuh) it.next(), hmlVarC, 0);
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkwr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkxj.g(list, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1217662866);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.v(1942911807);
            if (str == null) {
                egt.a(egq.k(ics.e, 0.0f), hmlVarC);
                ((hmw) hmlVarC).ab();
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dkwm
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dkxj.h(null, (hml) obj, hpy.a(i | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            ((hmw) hmlVarC).ab();
            hmlVar2 = hmlVarC;
            dthx.b(str, efy.j(efy.i(ics.e, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 4.0f, 7), 0L, 0L, null, null, 0L, null, 0L, 2, false, 0, 0, null, C(hmlVarC), hmlVar2, (i2 & 14) | 48, 48, 63484);
        }
        hpx hpxVarL2 = hmlVar2.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dkwo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkxj.h(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(final dkxv dkxvVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2087294295);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkxvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = i2 & 14;
            if (z) {
                hmlVarC.v(47957587);
                j(dkxvVar, hmlVarC, i4);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(48019029);
                m(dkxvVar, hmlVarC, i4);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkwv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkxv dkxvVar2 = dkxvVar;
                    int i5 = i;
                    dkxj.i(dkxvVar2, z, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void j(final dkxv dkxvVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2019862259);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkxvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            l(dkxvVar.g().size(), hxe.d(-735125107, new dkxf(dkxvVar, E(dkvo.n(hmlVarC), dkxvVar.d(), hmlVarC)), hmlVarC), hmlVarC, 48);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkws
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkxj.j(dkxvVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void k(final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1837500186);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdatVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = dkxg.a;
                hmwVar.af(objS);
            }
            ixm ixmVar = (ixm) objS;
            hmwVar.ab();
            ico icoVar = ics.e;
            int iA = dkwc.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            int i4 = ((((i2 & 14) | 384) << 6) & 896) | 6;
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVar, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar2 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar2);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdatVar.a(hmlVarC, Integer.valueOf((i4 >> 6) & 14));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkwu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    dkxj.k(fdatVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void l(final int i, final fdat fdatVar, hml hmlVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-1813829691);
        if (i4 == 0) {
            i3 = (true != hmlVarC.B(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(5004770);
            int i5 = i3 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i5 == 4 || objS == hmk.a) {
                objS = new dkxh(i);
                hmwVar.af(objS);
            }
            ixm ixmVar = (ixm) objS;
            hmwVar.ab();
            ico icoVar = ics.e;
            int iA = dkwc.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            int i6 = ((((i3 >> 3) & 14) << 6) & 896) | 6;
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVar, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar2 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar2);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdatVar.a(hmlVarC, Integer.valueOf((i6 >> 6) & 14));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkwp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i7 = i;
                    int i8 = i2;
                    dkxj.l(i7, fdatVar, (hml) obj, hpy.a(i8 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void m(final dkxv dkxvVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(853227114);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkxvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            k(hxe.d(1219201803, new dkxi(dkxvVar, E(dkvo.o(hmlVarC), dkxvVar.d(), hmlVarC)), hmlVarC), hmlVarC, 6);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkwl
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkxj.m(dkxvVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void n(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1911384266);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.v(1405724963);
            if (str == null) {
                egt.a(egq.k(ics.e, 0.0f), hmlVarC);
                ((hmw) hmlVarC).ab();
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dkwy
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dkxj.n(null, (hml) obj, hpy.a(i | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            ((hmw) hmlVarC).ab();
            hmlVar2 = hmlVarC;
            dthx.b(str, efy.j(efy.i(ics.e, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 4.0f, 7), 0L, 0L, null, null, 0L, null, 0L, 2, false, 0, 0, null, D(hmlVarC), hmlVar2, (i2 & 14) | 48, 48, 63484);
        }
        hpx hpxVarL2 = hmlVar2.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dkwz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkxj.n(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void o(final long j, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-431252027);
        if (i3 == 0) {
            i2 = (true != hmlVarC.C(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(null) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            s(C(hmlVarC), j, hmlVarC, (i2 << 3) & 1008);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkww
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkxj.o(j, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void p(final dkul dkulVar, final String str, final fdae fdaeVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(410548694);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkulVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            icsVar2 = icsVar;
            i2 |= true != hmlVarC.D(icsVar2) ? 1024 : 2048;
        } else {
            icsVar2 = icsVar;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = i2 >> 6;
            dtdi.e(fdaeVar, icsVar2, false, null, null, null, hxe.d(1826607507, new dkxb(dkulVar, str), hmlVarC), hmlVarC, (i4 & 14) | 805306368 | (i4 & 112), 508);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkwt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkul dkulVar2 = dkulVar;
                    String str2 = str;
                    fdae fdaeVar2 = fdaeVar;
                    dkxj.p(dkulVar2, str2, fdaeVar2, icsVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void q(ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-349143119);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            icsVar2 = icsVar;
            dtev.a(icsVar2, 0.0f, 0L, hmlVarC, i2 & 14, 6);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkwx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkxj.q(icsVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void r(final dkul dkulVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2 = icsVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1752570556);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(dkulVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar2) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (dkulVar instanceof dkui) {
            int i4 = (i2 << 3) & 896;
            hmlVarC.v(-1206798176);
            inz inzVarA = jqq.a(((dkui) dkulVar).a, hmlVarC, 0);
            hmlVarC.v(-593113661);
            long j = ((ije) hmlVarC.e(gea.a)).i;
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            dtfn.a(inzVarA, null, icsVar2, j, hmlVarC, i4, 0);
            hmwVar.ab();
            icsVar2 = icsVar;
        } else if (dkulVar instanceof dkuk) {
            hmlVarC.v(-1206524694);
            icsVar2 = icsVar;
            djrv.a(((dkuk) dkulVar).a, null, icsVar2, null, null, null, null, null, 0.0f, null, null, null, null, null, null, null, hmlVarC, (i2 << 3) & 896, 0, 524280);
            hmlVarC = hmlVarC;
            ((hmw) hmlVarC).ab();
        } else {
            if (!(dkulVar instanceof dkuj)) {
                hmlVarC.v(-593120247);
                ((hmw) hmlVarC).ab();
                throw new fctg();
            }
            int i5 = (i2 << 3) & 896;
            hmlVarC.v(-1206377134);
            inz inzVarB = djrs.b(((dkuj) dkulVar).a, hmlVarC);
            hmlVarC.v(-593100637);
            long j2 = ((ije) hmlVarC.e(gea.a)).i;
            hmw hmwVar2 = (hmw) hmlVarC;
            hmwVar2.ab();
            icsVar2 = icsVar;
            dtfn.a(inzVarB, null, icsVar2, j2, hmlVarC, i5, 0);
            hmwVar2.ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkwn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkul dkulVar2 = dkulVar;
                    int i6 = i;
                    dkxj.r(dkulVar2, icsVar2, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void s(final jyq jyqVar, final long j, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-366219110);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(jyqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(null) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            hpx hpxVarL = hmlVarC.L();
            if (hpxVarL != null) {
                hpxVarL.d = new fdat() { // from class: dkwe
                    @Override // defpackage.fdat
                    public final Object a(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        jyq jyqVar2 = jyqVar;
                        int i4 = i;
                        dkxj.s(jyqVar2, j, (hml) obj, hpy.a(i4 | 1));
                        return fctx.a;
                    }
                };
                return;
            }
            return;
        }
        hmlVarC.v(250756746);
        egt.a(egq.k(ics.e, 0.0f), hmlVarC);
        ((hmw) hmlVarC).ab();
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dkwd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    jyq jyqVar2 = jyqVar;
                    int i4 = i;
                    dkxj.s(jyqVar2, j, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void t(final long j, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(989385121);
        if (i3 == 0) {
            i2 = (true != hmlVarC.C(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(null) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            s(D(hmlVarC), j, hmlVarC, (i2 << 3) & 1008);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkxa
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkxj.t(j, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final int z(ixk ixkVar, dkxl dkxlVar) {
        return ixkVar.c(kil.b(dkxlVar.a()));
    }
}
