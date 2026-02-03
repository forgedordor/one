package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class divy {
    public static final void a(final djrr djrrVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1745554874);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtfn.a(djrs.b(djrrVar, hmlVarC), null, egq.k(efy.j(ics.e, 16.0f, 0.0f, 0.0f, 0.0f, 14), 24.0f), 0L, hmlVarC, 384, 8);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: divp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    divy.a(djrrVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final String str, final boolean z, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1536941380);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(str, efy.j(ics.e, z ? 8.0f : 24.0f, 0.0f, 24.0f, 0.0f, 10), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).m, hmlVar2, i2 & 14, 0, 65532);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: divu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    divy.b(str2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final ddp ddpVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-618680254);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(ddpVar) : hmlVarC.F(ddpVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            der derVar = dljt.d(hmlVarC).n;
            fctx fctxVar = fctx.a;
            hmlVarC.v(-1633490746);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !hmlVarC.F(ddpVar))) {
                z = false;
            }
            boolean zF = hmlVarC.F(derVar) | z;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new divx(ddpVar, derVar, null);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.g(fctxVar, (fdat) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: divv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    divy.c(ddpVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(diwa diwaVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final diwa diwaVar2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1654640025);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(diwaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            diwaVar2 = diwaVar;
            icsVar2 = icsVar;
        } else {
            diwaVar2 = diwaVar;
            icsVar2 = icsVar;
            e(diwaVar2, icsVar2, diwaVar.e, hxe.d(41789123, new divw(diwaVar), hmlVarC), hmlVarC, (i2 & 14) | 24576 | (i2 & 112));
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: divt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    diwa diwaVar3 = diwaVar2;
                    int i4 = i;
                    divy.d(diwaVar3, icsVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final diwa diwaVar, final ics icsVar, final fdae fdaeVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        fdat fdatVar2;
        hml hmlVar2;
        hml hmlVarC = hmlVar.c(-614757749);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(diwaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(true) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            fdatVar2 = fdatVar;
            i2 |= true != hmlVarC.F(fdatVar2) ? 8192 : 16384;
        } else {
            fdatVar2 = fdatVar;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            eve eveVar = glz.c(hmlVarC).e;
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new hph(0);
                hmwVar.af(objS);
            }
            final hri hriVar = (hri) objS;
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new hph(0);
                hmwVar.af(objS2);
            }
            final hri hriVar2 = (hri) objS2;
            hmwVar.ab();
            hmlVarC.v(-1633490746);
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                objS3 = new fdap() { // from class: divq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        long j = ((kjg) obj2).a;
                        hriVar.i((int) (j >> 32));
                        hriVar2.i((int) (j & 4294967295L));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            ics icsVarA = iye.a(icsVar, (fdap) objS3);
            int iC = hriVar.c();
            int iC2 = hriVar2.c();
            hmlVarC.v(267150010);
            hmlVarC.v(91693752);
            hmlVarC.v(1849434622);
            Object objS4 = hmwVar.S();
            if (objS4 == obj) {
                hpl hplVar = new hpl(ddq.a(3.1415927f), hsi.a);
                hmwVar.af(hplVar);
                objS4 = hplVar;
            }
            hox hoxVar = (hox) objS4;
            hmwVar.ab();
            hmlVarC.v(-966871429);
            if (diwaVar.d) {
                c(g(hoxVar), hmlVarC, 8);
            }
            hmwVar.ab();
            iiy iiyVarB = iix.b(fcva.g(new ije(djpy.b(dljt.a(hmlVarC).t, hmlVarC)), new ije(djpy.b(dljt.a(hmlVarC).u, hmlVarC))), f(((Number) g(hoxVar).d()).floatValue(), iC, iC2), f(((Number) g(hoxVar).d()).floatValue() + 3.1415927f, iC, iC2), 8);
            hmwVar.ab();
            hmwVar.ab();
            ics icsVarE = egq.e(dkl.b(icsVarA, iiyVarB, eveVar, 0.0f, 4), 40.0f);
            hmlVarC.v(1849434622);
            Object objS5 = hmwVar.S();
            if (objS5 == obj) {
                objS5 = new fdap() { // from class: divr
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        jto jtoVar = (jto) obj2;
                        jtoVar.getClass();
                        jtk.q(jtoVar, 0);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS5);
            }
            hmwVar.ab();
            ics icsVarC = jsh.c(icsVarE, false, (fdap) objS5);
            long j = ije.g;
            hmlVarC.v(-834675555);
            hmlVarC.v(1035679278);
            long j2 = dljt.a(hmlVarC).A;
            hmwVar.ab();
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            gvk.e(fdaeVar, icsVarC, false, eveVar, j, j2, 0.0f, null, null, fdatVar2, hmlVar2, 964);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: divs
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    diwa diwaVar2 = diwaVar;
                    ics icsVar2 = icsVar;
                    fdae fdaeVar2 = fdaeVar;
                    divy.e(diwaVar2, icsVar2, fdaeVar2, fdatVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final long f(float f, int i, int i2) {
        double d = f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f2 = i;
        return (Float.floatToRawIntBits((r6 * fSin) + (i2 / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits((fCos * (i / 4)) + (f2 / 2.0f)) << 32);
    }

    private static final ddp g(hox hoxVar) {
        return (ddp) hoxVar.a();
    }
}
