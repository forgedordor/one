package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmig {
    public static final void a(final fdae fdaeVar, final ics icsVar, final long j, final long j2, hml hmlVar, final int i) {
        int i2;
        fdaeVar.getClass();
        hml hmlVarC = hmlVar.c(-1595864315);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.C(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.C(j2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.A(14.0f) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.B(1) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmlVarC.v(5004770);
            int i3 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i3 == 4 || objS == hmk.a) {
                objS = new fdae() { // from class: dmic
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return Float.valueOf(fddu.e(((Number) fdaeVar.invoke()).floatValue(), 0.0f, 1.0f));
                    }
                };
                hmwVar.af(objS);
            }
            final fdae fdaeVar2 = (fdae) objS;
            hmwVar.ab();
            final ind indVar = new ind(((kio) hmlVarC.e(jmh.e)).en(14.0f), 0.0f, 1, 0, 26);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(fdaeVar2);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == hmk.a) {
                objS2 = new fdap() { // from class: dmid
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        jtoVar.getClass();
                        jtk.p(jtoVar, new jrv(((Number) fdaeVar2.invoke()).floatValue(), new fddm(0.0f, 1.0f)));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            ics icsVarK = egq.k(jsh.c(icsVar, true, (fdap) objS2), 40.0f);
            hmlVarC.v(-1224400529);
            boolean zD2 = ((((i2 & 896) ^ 384) > 256 && hmlVarC.C(j)) || (i2 & 384) == 256) | hmlVarC.D(fdaeVar2) | ((((i2 & 7168) ^ 3072) > 2048 && hmlVarC.C(j2)) || (i2 & 3072) == 2048) | hmlVarC.F(indVar);
            Object objS3 = hmwVar.S();
            if (zD2 || objS3 == hmk.a) {
                fdap fdapVar = new fdap() { // from class: dmie
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        imz imzVar = (imz) obj;
                        imzVar.getClass();
                        float fFloatValue = 360.0f * ((Number) fdaeVar2.invoke()).floatValue();
                        long jB = imzVar.b() >> 32;
                        ind indVar2 = indVar;
                        float f = indVar2.a / 2.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) jB) - (f + f);
                        imzVar.A(iix.b(fcva.g(new ije(j), new ije(j2)), 0L, 0L, 14), fFloatValue, (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), indVar2);
                        return fctx.a;
                    }
                };
                hmwVar.af(fdapVar);
                objS3 = fdapVar;
            }
            hmwVar.ab();
            dlb.a(icsVarK, (fdap) objS3, hmlVarC, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmif
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar3 = fdaeVar;
                    ics icsVar2 = icsVar;
                    long j3 = j;
                    dmig.a(fdaeVar3, icsVar2, j3, j2, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
