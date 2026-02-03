package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhv {
    public static final ijp a(iew iewVar, float f) {
        float fCeil = (float) Math.ceil(f);
        ijp ijpVarA = fia.a;
        ijb ijbVarB = fia.b;
        imu imuVar = fia.c;
        int i = (int) fCeil;
        int i2 = i + i;
        if (ijpVarA == null || ijbVarB == null || i2 > ijpVarA.c() || i2 > ijpVarA.b()) {
            ijpVarA = ijr.a(i2, i2, 1);
            fia.a = ijpVarA;
            ijbVarB = iid.b(ijpVarA);
            fia.b = ijbVarB;
        }
        ijp ijpVar = ijpVarA;
        ijb ijbVar = ijbVarB;
        if (imuVar == null) {
            imuVar = new imu();
            fia.c = imuVar;
        }
        imu imuVar2 = imuVar;
        kji kjiVarQ = iewVar.q();
        float fC = ijpVar.c();
        float fB = ijpVar.b();
        long jFloatToRawIntBits = Float.floatToRawIntBits(fC);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fB);
        ims imsVar = imuVar2.a;
        kio kioVar = imsVar.a;
        kji kjiVar = imsVar.b;
        ijb ijbVar2 = imsVar.c;
        long j = imsVar.d;
        imsVar.a = iewVar;
        imsVar.b = kjiVarQ;
        imsVar.c = ijbVar;
        imsVar.d = (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
        ijbVar.l();
        imuVar2.r(ije.a, 0L, (126 & 4) != 0 ? imy.c(imuVar2.b(), 0L) : imy.b(imuVar2), (126 & 8) != 0 ? 1.0f : 0.0f, (126 & 16) != 0 ? inc.a : null, (126 & 32) != 0 ? null : null, (126 & 64) != 0 ? 3 : 0);
        imuVar2.r(ijg.d(4278190080L), 0L, (126 & 4) != 0 ? imy.c(imuVar2.b(), 0L) : (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), (126 & 8) != 0 ? 1.0f : 0.0f, (126 & 16) != 0 ? inc.a : null, (126 & 32) != 0 ? null : null, (126 & 64) != 0 ? 3 : 0);
        imy.e(imuVar2, ijg.d(4278190080L), f, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), null, 0, 120);
        ijbVar.j();
        imsVar.a = kioVar;
        imsVar.b = kjiVar;
        imsVar.c = ijbVar2;
        imsVar.d = j;
        return ijpVar;
    }

    public static final void b(final fih fihVar, final iby ibyVar, fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        final fdat fdatVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1090171650);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(fihVar) : hmlVarC.F(fihVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(ibyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if (hmlVarC.J((i2 & 147) != 146, i2 & 1)) {
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && hmlVarC.D(fihVar))) | ((i2 & 112) == 32);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (z || objS == hmk.a) {
                objS = new fib(ibyVar, fihVar);
                hmwVar.af(objS);
            }
            fdatVar2 = fdatVar;
            kna.b((fib) objS, null, new koc(false, true, true, false), fdatVar2, hmlVarC, ((i2 << 3) & 7168) | 384, 2);
        } else {
            fdatVar2 = fdatVar;
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fhk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fih fihVar2 = fihVar;
                    iby ibyVar2 = ibyVar;
                    int i4 = i;
                    fhv.b(fihVar2, ibyVar2, fdatVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final ics icsVar, final fdae fdaeVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2111672474);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if (hmlVarC.J((i2 & 147) != 146, i2 & 1)) {
            egt.a(icj.g(egq.m(icsVar, 25.0f, 25.0f), new fhu(fdaeVar, z)), hmlVarC);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fhn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    fdae fdaeVar2 = fdaeVar;
                    int i4 = i;
                    fhv.c(icsVar2, fdaeVar2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final fih fihVar, final boolean z, final int i, final boolean z2, long j, final float f, final ics icsVar, hml hmlVar, final int i2) {
        int i3;
        long j2;
        long j3;
        hml hmlVarC = hmlVar.c(-466280168);
        if ((i2 & 6) == 0) {
            i3 = (true != ((i2 & 8) == 0 ? hmlVarC.D(fihVar) : hmlVarC.F(fihVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.E(z2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 524288 : 1048576;
        }
        if (hmlVarC.J((533651 & i3) != 533650, i3 & 1)) {
            hmlVarC.t();
            if ((i2 & 1) == 0 || hmlVarC.G()) {
                j3 = 9205357640488583168L;
            } else {
                hmlVarC.s();
                j3 = j;
            }
            hmlVarC.l();
            final boolean zB = z ? fjy.b(i, z2) : !fjy.b(i, z2);
            iby ibyVar = zB ? ibs.b : ibs.a;
            int i4 = i3 & 14;
            boolean zE = hmlVarC.E(zB) | (i4 == 4 || ((i3 & 8) != 0 && hmlVarC.F(fihVar))) | ((i3 & 112) == 32);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zE || objS == hmk.a) {
                objS = new fdap() { // from class: fhl
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        boolean z3 = z;
                        jto jtoVar = (jto) obj;
                        long jA = fihVar.a();
                        jtoVar.e(fjy.a, new fjx(z3 ? ezl.b : ezl.c, jA, true != zB ? 3 : 1, (9223372034707292159L & jA) != 9205357640488583168L));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            ics icsVarC = jsh.c(icsVar, false, (fdap) objS);
            j2 = j3;
            b(fihVar, ibyVar, hxe.d(1365123137, new fhr((jou) hmlVarC.e(jmh.n), j2, zB, icsVarC, fihVar), hmlVarC), hmlVarC, i4 | 384);
        } else {
            hmlVarC.s();
            j2 = j;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final long j4 = j2;
            hpxVarL.d = new fdat() { // from class: fhm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fih fihVar2 = fihVar;
                    boolean z3 = z;
                    int i5 = i;
                    boolean z4 = z2;
                    long j5 = j4;
                    float f2 = f;
                    fhv.d(fihVar2, z3, i5, z4, j5, f2, icsVar, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
