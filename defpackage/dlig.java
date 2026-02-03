package defpackage;

import androidx.compose.ui.SensitiveNodeElement;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlig {
    public static final void a(final ede edeVar, final evxt evxtVar, final ikp ikpVar, hml hmlVar, final int i) {
        final ddp ddpVar;
        Object iktVar;
        Object hplVar;
        ikpVar.getClass();
        int i2 = i & 6;
        hml hmlVarC = hmlVar.c(421340811);
        int i3 = i2 == 0 ? (true != hmlVarC.D(edeVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(evxtVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.D(ikpVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (evxtVar.b.size() == 0) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dlid
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            ede edeVar2 = edeVar;
                            evxt evxtVar2 = evxtVar;
                            int i4 = i;
                            dlig.a(edeVar2, evxtVar2, ikpVar, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = ddq.a(0.0f);
                hmwVar.af(objS);
            }
            ddp ddpVar2 = (ddp) objS;
            hmwVar.ab();
            hmlVarC.v(-1633490746);
            int i4 = 0;
            boolean z = (i3 & 112) == 32;
            boolean z2 = (i3 & 896) == 256;
            Object objS2 = hmwVar.S();
            if ((z || z2) || objS2 == obj) {
                if (evxtVar.b.size() > 1) {
                    int i5 = evxtVar.e;
                    if (i5 == 0) {
                        i4 = 2;
                    } else if (i5 == 1) {
                        i4 = 3;
                    } else if (i5 == 2) {
                        i4 = 4;
                    } else if (i5 == 3) {
                        i4 = 5;
                    } else if (i5 == 4) {
                        i4 = 6;
                    } else if (i5 == 5) {
                        i4 = 7;
                    }
                    if (i4 == 0) {
                        i4 = 1;
                    }
                    evta<Long> evtaVar = evxtVar.b;
                    evtaVar.getClass();
                    ArrayList arrayList = new ArrayList(fcva.p(evtaVar, 10));
                    for (Long l : evtaVar) {
                        l.getClass();
                        arrayList.add(new ije(ijg.d(l.longValue())));
                        ddpVar2 = ddpVar2;
                    }
                    ddpVar = ddpVar2;
                    int i6 = i4 - 2;
                    iktVar = i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? i6 != 5 ? iix.a(arrayList, 0.0f, 0.0f, 14) : iix.d(arrayList, 0.0f, 0.0f, 14) : new ikw(arrayList) : iix.c(arrayList, 0L, 0.0f, 14) : iix.b(arrayList, 0L, 0L, 14) : iix.a(arrayList, 0.0f, 0.0f, 14);
                } else {
                    ddpVar = ddpVar2;
                    evta evtaVar2 = evxtVar.b;
                    evtaVar2.getClass();
                    Object objN = fcva.N(evtaVar2);
                    objN.getClass();
                    iktVar = new ikt(ijg.d(((Number) objN).longValue()));
                }
                hplVar = new hpl(iktVar, hsi.a);
                hmwVar.af(hplVar);
            } else {
                hplVar = objS2;
                ddpVar = ddpVar2;
            }
            hox hoxVar = (hox) hplVar;
            hmwVar.ab();
            ics icsVarB = edeVar.b(ics.e);
            hmlVarC.v(5004770);
            boolean zF = hmlVarC.F(ddpVar);
            Object objS3 = hmwVar.S();
            if (zF || objS3 == obj) {
                objS3 = new fdap() { // from class: dlie
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ikl iklVar = (ikl) obj2;
                        iklVar.getClass();
                        iklVar.a(((Number) ddpVar.d()).floatValue());
                        return fctx.a;
                    }
                };
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            egt.a(dkl.b(ijn.a(icsVarB, (fdap) objS3), (iiy) hoxVar.a(), ikpVar, 0.0f, 4), hmlVarC);
            djod.a(evxtVar, ddpVar, hmlVarC, ((i3 >> 3) & 14) | 64);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dlif
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ede edeVar2 = edeVar;
                    evxt evxtVar2 = evxtVar;
                    int i7 = i;
                    dlig.a(edeVar2, evxtVar2, ikpVar, (hml) obj2, hpy.a(i7 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final ede edeVar, final dlhy dlhyVar, final ikp ikpVar, hml hmlVar, final int i) {
        int i2;
        ikpVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-900980643);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dlhyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(ikpVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(-2051880346);
            ije ijeVar = null;
            if (dlhyVar.g() && dlhyVar.d()) {
                long j = glz.a(hmlVarC).a;
                ijeVar = new ije(ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.5f, ije.f(j)));
            }
            ((hmw) hmlVarC).ab();
            if (ijeVar == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dlhz
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            ede edeVar2 = edeVar;
                            dlhy dlhyVar2 = dlhyVar;
                            int i4 = i;
                            dlig.b(edeVar2, dlhyVar2, ikpVar, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            ecz.b(dkl.a(idb.a(edeVar.b(ics.e), 1.0f), ijeVar.i, ikpVar), hmlVarC, 0);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dlia
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ede edeVar2 = edeVar;
                    dlhy dlhyVar2 = dlhyVar;
                    int i4 = i;
                    dlig.b(edeVar2, dlhyVar2, ikpVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dlhy dlhyVar, final long j, hml hmlVar, final int i) {
        int i2;
        jyq jyqVarG;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(765414349);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(dlhyVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.C(j) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ics icsVarE = efy.e(ics.e, 16.0f, 8.0f);
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdap() { // from class: dlib
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        jtoVar.getClass();
                        String strA = dlhyVar.a();
                        if (strA != null) {
                            jtk.k(jtoVar, strA);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarA = joj.a(jsh.c(icsVarE, false, (fdap) objS), "message_text");
            if (dlhyVar.k()) {
                icsVarA = icsVarA.a(new SensitiveNodeElement());
            }
            int i5 = i2;
            String strE = dlhyVar.e();
            if (dlhyVar.g()) {
                hmlVarC.v(478079397);
                long jC = kjm.c(48);
                hmlVarC.v(-987042609);
                jyq jyqVar = glz.d(hmlVarC).d;
                long jI = jyqVar.i();
                float fA = kjl.a(jC);
                kjm.e(jI);
                long jD = kjm.d(kjl.b(jI), kjl.a(jI) * fA);
                float fA2 = kjl.a(jyqVar.g());
                kjm.e(jD);
                jyqVarG = jyq.y(jyqVar, 0L, jC, null, null, null, null, 0L, null, 0, 0, kjm.d(kjl.b(jD), kjl.a(jD) / fA2), null, null, 0, 16646141);
                hmwVar.ab();
                hmwVar.ab();
            } else {
                hmlVarC.v(478163376);
                jyqVarG = g(dlhyVar, hmlVarC);
                hmwVar.ab();
            }
            jyq jyqVar2 = jyqVarG;
            hmlVarC.v(1095246285);
            int iC = (dlhyVar.g() && dlhyVar.h()) ? 6 : ((jyq) hmlVarC.e(gyj.a)).c();
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            dthx.b(strE, icsVarA, j, 0L, null, null, 0L, new khk(iC), 0L, 0, false, 0, 0, null, jyqVar2, hmlVar2, (i5 << 3) & 896, 0, 65016);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlic
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlhy dlhyVar2 = dlhyVar;
                    int i6 = i;
                    dlig.c(dlhyVar2, j, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final List d(dlhv dlhvVar, boolean z, hml hmlVar) {
        hmlVar.v(-943650502);
        List list = z ? dlhvVar.d : dlhvVar.a;
        ((hmw) hmlVar).ab();
        return list;
    }

    public static final iby e(dlhy dlhyVar, boolean z, hml hmlVar) {
        hmlVar.v(-2003307792);
        iby ibyVar = (!dlhyVar.h() || dlhyVar.i() || z) ? ibw.d : ibw.f;
        ((hmw) hmlVar).ab();
        return ibyVar;
    }

    public static final long f(dlhv dlhvVar, boolean z, hml hmlVar) {
        hmlVar.v(-1869566015);
        long j = z ? dlhvVar.e : dlhvVar.b;
        ((hmw) hmlVar).ab();
        return j;
    }

    public static final jyq g(dlhy dlhyVar, hml hmlVar) {
        jyq jyqVar;
        hmlVar.v(-895050133);
        if (dlhyVar.s()) {
            hmlVar.v(-1281459397);
            jyqVar = glz.d(hmlVar).d;
            ((hmw) hmlVar).ab();
        } else {
            hmlVar.v(-1281394049);
            jyqVar = glz.d(hmlVar).j;
            ((hmw) hmlVar).ab();
        }
        jyq jyqVarB = dlkn.b(jyqVar, hmlVar);
        ((hmw) hmlVar).ab();
        return jyqVarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float h(defpackage.dkzl r19, defpackage.dlhu r20, boolean r21, boolean r22, boolean r23, defpackage.hml r24, int r25) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlig.h(dkzl, dlhu, boolean, boolean, boolean, hml, int):float");
    }

    public static final dlhv i(dlhy dlhyVar, hml hmlVar) {
        long j;
        dlhv dlhvVar;
        long j2;
        long jA;
        dlhv dlhvVar2;
        long j3;
        long jA2;
        long j4;
        hmlVar.v(223921369);
        hmlVar.v(757684816);
        if (dlhyVar.h() && dlhyVar.j()) {
            hmlVar.v(440084726);
            hmlVar.v(-1637642256);
            if (((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue()) {
                hmlVar.v(-466772123);
                if (dljt.g(hmlVar)) {
                    hmlVar.v(-466676178);
                    j4 = glz.a(hmlVar).c;
                    ((hmw) hmlVar).ab();
                } else {
                    hmlVar.v(-466603049);
                    j4 = glz.a(hmlVar).a;
                    ((hmw) hmlVar).ab();
                }
                List listB = fcva.b(new ije(j4));
                long j5 = ije.d;
                dlhvVar = new dlhv(listB, j5, j5, fcva.b(new ije(glz.a(hmlVar).f)), glz.a(hmlVar).g, glz.a(hmlVar).g);
                ((hmw) hmlVar).ab();
            } else {
                hmlVar.v(-466212232);
                dlhvVar = new dlhv(fcva.g(new ije(dljt.a(hmlVar).b.g), new ije(dljt.a(hmlVar).b.h)), dljt.a(hmlVar).b.i, dljt.a(hmlVar).b.i, fcva.b(new ije(dljt.a(hmlVar).b.j)), dljt.a(hmlVar).b.k, dljt.a(hmlVar).b.k);
                ((hmw) hmlVar).ab();
            }
            hmw hmwVar = (hmw) hmlVar;
            hmwVar.ab();
            hmwVar.ab();
        } else if (dlhyVar.h()) {
            hmlVar.v(440086328);
            hmlVar.v(1737379357);
            if (((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue()) {
                hmlVar.v(-382289734);
                if (dljt.g(hmlVar)) {
                    hmlVar.v(-382249806);
                    j3 = glz.a(hmlVar).p;
                    ((hmw) hmlVar).ab();
                } else {
                    hmlVar.v(-382193200);
                    j3 = glz.a(hmlVar).q;
                    ((hmw) hmlVar).ab();
                }
                long j6 = j3;
                if (dljt.g(hmlVar)) {
                    hmlVar.v(-382029210);
                    jA2 = djpy.a(glz.a(hmlVar).d);
                    ((hmw) hmlVar).ab();
                } else {
                    hmlVar.v(-381929855);
                    jA2 = glz.a(hmlVar).c;
                    ((hmw) hmlVar).ab();
                }
                dlhvVar2 = new dlhv(fcva.b(new ije(jA2)), j6, j6, fcva.b(new ije(glz.a(hmlVar).f)), glz.a(hmlVar).g, glz.a(hmlVar).g);
                ((hmw) hmlVar).ab();
            } else {
                hmlVar.v(-381514052);
                if (dljt.h(hmlVar)) {
                    hmlVar.v(-381456206);
                    jA = djqc.a(dljt.f(hmlVar));
                    ((hmw) hmlVar).ab();
                } else {
                    hmlVar.v(-381399290);
                    jA = dljt.a(hmlVar).b.c;
                    ((hmw) hmlVar).ab();
                }
                dlhvVar2 = new dlhv(fcva.b(new ije(jA)), dljt.a(hmlVar).b.d, dljt.a(hmlVar).b.d, fcva.b(new ije(dljt.a(hmlVar).b.j)), dljt.a(hmlVar).b.k, dljt.a(hmlVar).b.k);
                ((hmw) hmlVar).ab();
            }
            dlhvVar = dlhvVar2;
            hmw hmwVar2 = (hmw) hmlVar;
            hmwVar2.ab();
            hmwVar2.ab();
        } else if (dlhyVar.h() || !dlhyVar.j()) {
            hmlVar.v(440089880);
            hmlVar.v(-1869514793);
            if (((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue()) {
                hmlVar.v(-1874111007);
                dlhvVar = new dlhv(fcva.b(new ije(glz.a(hmlVar).F)), glz.a(hmlVar).q, glz.a(hmlVar).a, fcva.b(new ije(glz.a(hmlVar).f)), glz.a(hmlVar).g, glz.a(hmlVar).g);
                ((hmw) hmlVar).ab();
            } else {
                hmlVar.v(-1873644302);
                if (dljt.h(hmlVar)) {
                    hmlVar.v(-1873586022);
                    j = dljt.f(hmlVar).Q;
                    ((hmw) hmlVar).ab();
                } else {
                    hmlVar.v(-1873531028);
                    j = dljt.a(hmlVar).b.a;
                    ((hmw) hmlVar).ab();
                }
                dlhv dlhvVar3 = new dlhv(fcva.b(new ije(j)), dljt.a(hmlVar).b.b, glz.a(hmlVar).a, fcva.b(new ije(dljt.a(hmlVar).b.j)), dljt.a(hmlVar).b.k, dljt.a(hmlVar).b.k);
                ((hmw) hmlVar).ab();
                dlhvVar = dlhvVar3;
            }
            hmw hmwVar3 = (hmw) hmlVar;
            hmwVar3.ab();
            hmwVar3.ab();
        } else {
            hmlVar.v(440088470);
            hmlVar.v(-1011228630);
            if (((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue()) {
                hmlVar.v(-611344146);
                dlhvVar = new dlhv(fcva.b(new ije(glz.a(hmlVar).F)), glz.a(hmlVar).q, glz.a(hmlVar).a, fcva.b(new ije(glz.a(hmlVar).f)), glz.a(hmlVar).g, glz.a(hmlVar).g);
                ((hmw) hmlVar).ab();
            } else {
                hmlVar.v(-610877441);
                if (dljt.h(hmlVar)) {
                    hmlVar.v(-610819161);
                    j2 = dljt.f(hmlVar).Q;
                    ((hmw) hmlVar).ab();
                } else {
                    hmlVar.v(-610764167);
                    j2 = dljt.a(hmlVar).b.e;
                    ((hmw) hmlVar).ab();
                }
                dlhv dlhvVar4 = new dlhv(fcva.b(new ije(j2)), dljt.a(hmlVar).b.f, glz.a(hmlVar).a, fcva.b(new ije(dljt.a(hmlVar).b.j)), dljt.a(hmlVar).b.k, dljt.a(hmlVar).b.k);
                ((hmw) hmlVar).ab();
                dlhvVar = dlhvVar4;
            }
            hmw hmwVar4 = (hmw) hmlVar;
            hmwVar4.ab();
            hmwVar4.ab();
        }
        hmw hmwVar5 = (hmw) hmlVar;
        hmwVar5.ab();
        hmwVar5.ab();
        return dlhvVar;
    }
}
