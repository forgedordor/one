package defpackage;

import com.android.vcard.VCardConfig;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djow {
    public static final void a(final ics icsVar, final String str, final long j, final float f, final List list, fdae fdaeVar, final boolean z, final djpa djpaVar, hml hmlVar, final int i) {
        int i2;
        long j2;
        hml hmlVar2;
        hmw hmwVar;
        ico icoVar;
        fdce fdceVar;
        hml hmlVar3;
        final fdae fdaeVar2 = fdaeVar;
        int i3 = i & 48;
        hml hmlVarC = hmlVar.c(1551476054);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i2 |= true != hmlVarC.C(j2) ? 128 : 256;
        } else {
            j2 = j;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.A(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(list) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.E(z) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.D(djpaVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((4793489 & i2) == 4793488 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            fdce fdceVar2 = new fdce();
            ico icoVar2 = ics.e;
            fdce fdceVar3 = fdceVar2;
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVarC, 0);
            int iA = djol.a(hmg.b(hmlVarC));
            hmw hmwVar2 = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar2.ak();
            int i4 = i2;
            ics icsVarB = icj.b(hmlVarC, icoVar2);
            fdae fdaeVar3 = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar3);
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
            egp egpVar = egp.a;
            hmlVarC.v(-6647084);
            Iterator it = list.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                int i6 = i4 & 112;
                Object next = it.next();
                int i7 = i5 + 1;
                if (i5 < 0) {
                    fcva.m();
                }
                djok djokVar = (djok) next;
                String str2 = djokVar.b;
                Iterator it2 = it;
                if (str2 == null) {
                    hmlVarC.v(-1700593816);
                    ics icsVarE = e(icoVar2, i5, ((fcww) list).c);
                    if (z) {
                        icsVarE = icsVarE.a(efy.i(icoVar2, 0.0f, 8.0f, 1));
                    }
                    hmlVarC.v(5004770);
                    Object objS = hmwVar2.S();
                    if (i6 == 32 || objS == hmk.a) {
                        objS = new fdap() { // from class: djop
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) {
                                jto jtoVar = (jto) obj;
                                jtoVar.getClass();
                                String str3 = str;
                                if (str3 != null) {
                                    jtk.k(jtoVar, str3);
                                }
                                return fctx.a;
                            }
                        };
                        hmwVar2.af(objS);
                    }
                    hmwVar2.ab();
                    ics icsVarC = jsh.c(icsVarE, false, (fdap) objS);
                    String str3 = djokVar.a;
                    kjm.e(j2);
                    icoVar = icoVar2;
                    fdceVar = fdceVar3;
                    hml hmlVar4 = hmlVarC;
                    hmwVar = hmwVar2;
                    dthx.b(str3, icsVarC, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new jyq(0L, kjm.d(kjl.b(j2), kjl.a(j2) * 0.85f), null, null, 0L, 0, 0L, 16777213), hmlVar4, 0, 0, 65532);
                    hmlVar3 = hmlVar4;
                    hmwVar.ab();
                } else {
                    hml hmlVar5 = hmlVarC;
                    hmwVar = hmwVar2;
                    icoVar = icoVar2;
                    fdceVar = fdceVar3;
                    hmlVar5.v(-1700029740);
                    fdceVar.a = true;
                    boolean zBooleanValue = ((Boolean) hmlVar5.e(dkfh.a)).booleanValue();
                    djsq djsqVar = new djsq(str2, "animated_emoji");
                    ics icsVarE2 = e(icoVar, i5, ((fcww) list).c);
                    if (z) {
                        icsVarE2 = icsVarE2.a(efy.i(icoVar, 0.0f, 8.0f, 1));
                    }
                    ics icsVarB2 = egpVar.b(egq.k(icsVarE2, f), ibw.n);
                    hmlVar5.v(5004770);
                    Object objS2 = hmwVar.S();
                    if (i6 == 32 || objS2 == hmk.a) {
                        objS2 = new fdap() { // from class: djoq
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) {
                                jto jtoVar = (jto) obj;
                                jtoVar.getClass();
                                String str4 = str;
                                if (str4 != null) {
                                    jtk.k(jtoVar, str4);
                                }
                                return fctx.a;
                            }
                        };
                        hmwVar.af(objS2);
                    }
                    hmwVar.ab();
                    djsd.b(djsqVar, jsh.c(icsVarB2, false, (fdap) objS2), zBooleanValue ? new qrl() : null, hxe.d(-979277173, new djos(f), hmlVar5), !zBooleanValue, 0, hmlVar5, 3072, 96);
                    hmlVar3 = hmlVar5;
                    if (i5 != r14.c - 1) {
                        egt.a(egq.k(icoVar, 2.0f), hmlVar3);
                    }
                    hmwVar.ab();
                }
                hmwVar2 = hmwVar;
                icoVar2 = icoVar;
                fdceVar3 = fdceVar;
                hmlVarC = hmlVar3;
                i5 = i7;
                it = it2;
                j2 = j;
            }
            hmlVar2 = hmlVarC;
            hmw hmwVar3 = hmwVar2;
            ico icoVar3 = icoVar2;
            fdce fdceVar4 = fdceVar3;
            hmwVar3.ab();
            dkpc dkpcVar = djpaVar.k;
            hmlVar2.v(-6592186);
            if (dkpcVar != null) {
                hmlVar2.v(-6589007);
                boolean z2 = djpaVar.h;
                if (z2) {
                    egt.a(egpVar.a(egq.e(icoVar3, 1.0f), 1.0f, true), hmlVar2);
                }
                hmwVar3.ab();
                ics icsVarH = egq.h(egpVar.b(icoVar3, ibw.o), 16.0f);
                if (z2) {
                    icsVarH = icsVarH.a(efs.b(icoVar3, -8.0f, -8.0f));
                }
                if (!z2) {
                    icsVarH = icsVarH.a(efs.c(icoVar3, -8.0f, 0.0f, 2));
                }
                if (diho.a(djpaVar.m.d, hmlVar2)) {
                    icsVarH = icsVarH.a(dihi.c(icoVar3));
                }
                dkpa.e(dkpcVar, icsVarH, hmlVar2, 0);
            }
            hmwVar3.ab();
            hmlVar2.n();
            fdaeVar2 = fdaeVar;
            hob.g(Boolean.valueOf(fdceVar4.a), new djot(fdceVar4, fdaeVar2, null), hmlVar2);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djor
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    String str4 = str;
                    long j3 = j;
                    float f2 = f;
                    List list2 = list;
                    fdae fdaeVar4 = fdaeVar2;
                    boolean z3 = z;
                    djow.a(icsVar2, str4, j3, f2, list2, fdaeVar4, z3, djpaVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.djpa r23, defpackage.ics r24, final defpackage.ikp r25, defpackage.hml r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djow.b(djpa, ics, ikp, hml, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.djpa r19, final defpackage.dlhv r20, defpackage.kjl r21, defpackage.hml r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djow.c(djpa, dlhv, kjl, hml, int, int):void");
    }

    public static final void d(final ede edeVar, final djpa djpaVar, final kjl kjlVar, final dkpc dkpcVar, hml hmlVar, final int i) {
        int i2;
        jyq jyqVarG;
        int i3;
        jyi jyiVarB;
        jyk jykVar;
        icc iccVar;
        jyi jyiVar;
        boolean z;
        jyq jyqVarG2;
        juo juoVar;
        long jK;
        Object objB;
        int i4 = i & 6;
        hml hmlVarC = hmlVar.c(2106708056);
        if (i4 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(djpaVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(kjlVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(dkpcVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean zBooleanValue = ((Boolean) dljt.b(hmlVarC).i.invoke()).booleanValue();
            jyk jykVarA = jyl.a(hmlVarC);
            if (kjlVar != null) {
                hmlVarC.v(-1417098179);
                jyq jyqVarG3 = dlig.g(djpaVar, hmlVarC);
                long j = kjlVar.b;
                jyqVarG = jyq.y(jyqVarG3, 0L, j, null, null, null, null, 0L, null, 0, 0, kjm.b(kjl.a(j) + 16.0f), null, null, 0, 16646141);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-1416955703);
                jyqVarG = dlig.g(djpaVar, hmlVarC);
                ((hmw) hmlVarC).ab();
            }
            jyq jyqVar = jyqVarG;
            dlhx dlhxVar = djpaVar.m;
            float fC = dkkg.c(0.0f, dlhxVar.a, false, hmlVarC, 5) - 16.0f;
            hpt hptVar = jmh.e;
            kio kioVar = (kio) hmlVarC.e(hptVar);
            boolean z2 = dlhxVar.c;
            float f = fC - 8.0f;
            if (z2) {
                hmlVarC.v(-1416559678);
                jyq jyqVarG4 = dlig.g(djpaVar, hmlVarC);
                String str = djpaVar.d;
                hmlVarC.v(-1224400529);
                boolean zD = hmlVarC.D(jyqVarG4) | hmlVarC.D(str) | hmlVarC.D(kioVar) | hmlVarC.A(f);
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                if (zD || objS == hmk.a) {
                    juo juoVar2 = new juo(fdgn.E(str, '\n', str));
                    if (zBooleanValue) {
                        juoVar = juoVar2;
                        i3 = 0;
                        jK = kim.k(0, fdcu.b(kioVar.en(f)), 0, 13);
                    } else {
                        juoVar = juoVar2;
                        i3 = 0;
                        jK = kim.k(0, (int) kioVar.en(f), 0, 13);
                    }
                    objB = jyk.b(jykVarA, juoVar, jyqVar, 0, false, 0, jK, null, null, null, 1980);
                    hmwVar.af(objB);
                } else {
                    objB = objS;
                    i3 = 0;
                }
                jyiVarB = (jyi) objB;
                hmwVar.ab();
                hmwVar.ab();
                jykVar = jykVarA;
            } else {
                i3 = 0;
                hmlVarC.v(-1416046845);
                jyiVarB = jyk.b(jykVarA, new juo(djpaVar.d), jyqVar, 0, false, 0, kim.k(0, (int) ((kio) hmlVarC.e(hptVar)).en(f), 0, 13), null, null, null, 1980);
                jykVar = jykVarA;
                ((hmw) hmlVarC).ab();
            }
            hmlVarC.v(1616897778);
            jvc jvcVar = jyiVarB.b;
            if (jvcVar.f != 1 || Float.compare(jvcVar.d(i3) + 16.0f + 6.0f + 6.0f, f) >= 0) {
                hmlVarC.v(1616906993);
                int iCompare = Float.compare(kioVar.eg(dlig.g(djpaVar, hmlVarC).i()), 32.0f);
                ((hmw) hmlVarC).ab();
                iccVar = iCompare > 0 ? ibw.o : ibw.n;
            } else {
                iccVar = ibw.n;
            }
            icc iccVar2 = iccVar;
            hmw hmwVar2 = (hmw) hmlVarC;
            hmwVar2.ab();
            String str2 = djpaVar.d;
            int i5 = dkpcVar.c;
            boolean z3 = dlhxVar.d;
            ics icsVarC = ics.e;
            if (diho.a(z3, hmlVarC)) {
                icsVarC = dihi.c(icsVarC);
            }
            String str3 = djpaVar.g;
            ics icsVarA = joj.a(icsVarC, "message_text");
            long jF = dlig.f(dlig.i(djpaVar, hmlVarC), djpaVar.e, hmlVarC);
            if (kjlVar != null) {
                hmlVarC.v(-1414829227);
                jyq jyqVarG5 = dlig.g(djpaVar, hmlVarC);
                jyiVar = jyiVarB;
                z = z2;
                long j2 = kjlVar.b;
                jyqVarG2 = jyq.y(jyqVarG5, 0L, j2, null, null, null, null, 0L, null, 0, 0, kjm.b(kjl.a(j2) + 16.0f), null, null, 0, 16646141);
                hmwVar2.ab();
            } else {
                jyiVar = jyiVarB;
                z = z2;
                hmlVarC.v(-1414678939);
                jyqVarG2 = dlig.g(djpaVar, hmlVarC);
                hmwVar2.ab();
            }
            dlgq.e(str2, str3, dkom.a(i5), f, icsVarA, jF, jyqVarG2, jykVar, jyiVar, (dlig.h(djpaVar.j, null, r9, dlhxVar.b, false, hmlVarC, 18) - 16.0f) - 8.0f, 0.0f, iccVar2, null, z, false, hxe.d(1742772853, new djov(dkpcVar, edeVar, djpaVar), hmlVarC), hmlVarC, 1073741824, 12582912, 88064);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djom
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ede edeVar2 = edeVar;
                    djpa djpaVar2 = djpaVar;
                    kjl kjlVar2 = kjlVar;
                    djow.d(edeVar2, djpaVar2, kjlVar2, dkpcVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final ics e(ics icsVar, int i, int i2) {
        return i2 == 1 ? efy.j(icsVar, 16.0f, 0.0f, 16.0f, 0.0f, 10) : i == 0 ? efy.j(icsVar, 16.0f, 0.0f, 0.0f, 0.0f, 14) : i == i2 + (-1) ? efy.j(icsVar, 0.0f, 0.0f, 16.0f, 0.0f, 11) : icsVar;
    }
}
