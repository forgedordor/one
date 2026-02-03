package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjm {
    public static final void a(final ics icsVar, final fil filVar, final fdap fdapVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-917932944);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(filVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 1024 : 2048;
        }
        if (hmlVarC.J((i2 & 1171) != 1170, i2 & 1)) {
            Object[] objArr = new Object[0];
            hyr hyrVar = flw.a;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new fdae() { // from class: fix
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return new flw(1L);
                    }
                };
                hmwVar.af(objS);
            }
            flw flwVar = (flw) hxy.b(objArr, hyrVar, (fdae) objS, hmlVarC, 384);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new flg(flwVar);
                hmwVar.af(objS2);
            }
            final flg flgVar = (flg) objS2;
            final jgu jguVar = (jgu) hmlVarC.e(jmh.c);
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                objS3 = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS3);
            }
            final fdjx fdjxVar = (fdjx) objS3;
            flgVar.c = (iqa) hmlVarC.e(jmh.h);
            boolean zD = hmlVarC.D(fdjxVar) | hmlVarC.D(jguVar);
            Object objS4 = hmwVar.S();
            if (zD || objS4 == obj) {
                objS4 = new fdap() { // from class: fiy
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        fdil.d(fdjxVar, null, fdjz.d, new fjd(jguVar, (juo) obj2, null), 1);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS4);
            }
            flgVar.d = (fdap) objS4;
            flgVar.k = (jkd) hmlVarC.e(jmh.l);
            flgVar.b = new fdap() { // from class: fkr
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    fil filVar2 = (fil) obj2;
                    flgVar.u(filVar2);
                    fdapVar.invoke(filVar2);
                    return fctx.a;
                }
            };
            flgVar.u(filVar);
            ics icsVarG = ics.e;
            ics icsVarA = iqk.a(fjw.b(dme.a(ifo.a(igt.a(ixy.a(itf.a(icsVarG, fctx.a, new fld(flgVar, new fdae() { // from class: fkm
                @Override // defpackage.fdae
                public final Object invoke() {
                    flgVar.l();
                    return fctx.a;
                }
            })), new fdap() { // from class: fks
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    flg flgVar2 = flgVar;
                    ivy ivyVar = (ivy) obj2;
                    flgVar2.g = ivyVar;
                    if (flgVar2.z() && flgVar2.f() != null) {
                        ihs ihsVar = ivyVar != null ? new ihs(ivz.b(ivyVar)) : null;
                        if (!fdbq.f(flgVar2.f, ihsVar)) {
                            flgVar2.f = ihsVar;
                            flgVar2.x();
                            flgVar2.y();
                        }
                    }
                    return fctx.a;
                }
            }), flgVar.e), new fdap() { // from class: fkt
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    igx igxVar = (igx) obj2;
                    boolean zA = igxVar.a();
                    flg flgVar2 = flgVar;
                    if (!zA && flgVar2.z()) {
                        flgVar2.l();
                    }
                    flgVar2.s(igxVar.a());
                    return fctx.a;
                }
            }), true, null), new fdap() { // from class: fku
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    flgVar.t(((Boolean) obj2).booleanValue());
                    return fctx.a;
                }
            }), new flb(flgVar));
            if (flgVar.A() && flgVar.C() && !flgVar.E() && dnr.a()) {
                icsVarG = icj.g(icsVarG, new flp(flgVar));
            }
            fmc.a(icsVarA.a(icsVarG), hxe.d(-1799563674, new fjj(flgVar, flwVar, fdatVar), hmlVarC), hmlVarC, 48);
            boolean zF = hmlVarC.F(flgVar);
            Object objS5 = hmwVar.S();
            if (zF || objS5 == obj) {
                objS5 = new fdap() { // from class: fiz
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        return new fjk(flgVar);
                    }
                };
                hmwVar.af(objS5);
            }
            hob.c(flgVar, (fdap) objS5, hmlVarC);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fja
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ics icsVar2 = icsVar;
                    fil filVar2 = filVar;
                    fdap fdapVar2 = fdapVar;
                    fjm.a(icsVar2, filVar2, fdapVar2, fdatVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final ics icsVar, fdat fdatVar, hml hmlVar, final int i) {
        final fdat fdatVar2;
        hml hmlVarC = hmlVar.c(1949207773);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if (hmlVarC.J((i2 & 19) != 18, i2 & 1)) {
            ico icoVar = ics.e;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(null, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            fil filVar = (fil) hoxVar.a();
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new fdap() { // from class: fjb
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        hoxVar.b((fil) obj2);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            fdap fdapVar = (fdap) objS2;
            fdatVar2 = fdatVar;
            a(icoVar, filVar, fdapVar, fdatVar2, hmlVarC, (i2 & 14) | 384 | ((i2 << 6) & 7168));
            icsVar = icoVar;
        } else {
            fdatVar2 = fdatVar;
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fjc
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ics icsVar2 = icsVar;
                    int i3 = i;
                    fjm.b(icsVar2, fdatVar2, (hml) obj2, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
