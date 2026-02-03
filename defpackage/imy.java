package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class imy {
    public static long a(imz imzVar) {
        return iia.b(((imu) imzVar).b.a());
    }

    public static long b(imz imzVar) {
        return ((imu) imzVar).b.a();
    }

    public static long c(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static /* synthetic */ void d(imz imzVar, long j, float f, float f2, long j2, long j3, ina inaVar, int i) {
        long j4 = (i & 16) != 0 ? 0L : j2;
        imzVar.B(j, f, f2, j4, (i & 32) != 0 ? c(imzVar.b(), j4) : j3, inaVar);
    }

    public static /* synthetic */ void e(imz imzVar, long j, float f, long j2, ina inaVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            f = ihz.b(imzVar.b()) / 2.0f;
        }
        float f2 = f;
        if ((i2 & 4) != 0) {
            j2 = imzVar.a();
        }
        imzVar.w(j, f2, j2, (i2 & 8) != 0 ? 1.0f : 0.0f, (i2 & 16) != 0 ? inc.a : inaVar, (i2 & 64) != 0 ? 3 : i);
    }

    public static /* synthetic */ void g(imz imzVar, iiy iiyVar, long j, long j2, float f, float f2, int i) {
        float f3 = (i & 64) != 0 ? 1.0f : f2;
        if ((i & 8) != 0) {
            f = 0.0f;
        }
        imzVar.F(iiyVar, j, j2, f, f3);
    }

    public static /* synthetic */ void h(imz imzVar, ikd ikdVar, long j, ina inaVar, int i) {
        if ((i & 8) != 0) {
            inaVar = inc.a;
        }
        imzVar.H(ikdVar, j, (i & 4) != 0 ? 1.0f : 0.0f, inaVar);
    }

    public static /* synthetic */ void i(imz imzVar, iiy iiyVar, long j, long j2, float f, ina inaVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        imzVar.y(iiyVar, j3, (i2 & 4) != 0 ? c(imzVar.b(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? inc.a : inaVar, (i2 & 64) != 0 ? 3 : i);
    }

    public static /* synthetic */ void j(imz imzVar, iiy iiyVar, long j, long j2, long j3, ina inaVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            j2 = c(imzVar.b(), j);
        }
        if ((i & 8) != 0) {
            j3 = 0;
        }
        float f = (i & 16) != 0 ? 1.0f : 0.0f;
        if ((i & 32) != 0) {
            inaVar = inc.a;
        }
        imzVar.I(iiyVar, j, j2, j3, f, inaVar);
    }

    public static /* synthetic */ void k(imz imzVar, ijp ijpVar, long j, long j2, float f, ijf ijfVar, int i, int i2) {
        long jB = (i2 & 4) != 0 ? (ijpVar.b() & 4294967295L) | (ijpVar.c() << 32) : j;
        imzVar.D(ijpVar, jB, (i2 & 16) != 0 ? jB : j2, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? inc.a : null, (i2 & 128) != 0 ? null : ijfVar, (i2 & 256) != 0 ? 3 : 0, (((i2 & 512) == 0 ? 1 : 0) ^ 1) | i);
    }

    public static /* synthetic */ void l(imz imzVar, long j, long j2, long j3, float f, int i, int i2) {
        float f2;
        imz imzVar2;
        long j4;
        long j5;
        long j6;
        int i3 = (i2 & 256) != 0 ? 3 : i;
        float f3 = (i2 & 64) != 0 ? 1.0f : 0.0f;
        if ((i2 & 8) != 0) {
            f2 = 0.0f;
            j4 = j;
            j5 = j2;
            j6 = j3;
            imzVar2 = imzVar;
        } else {
            f2 = f;
            imzVar2 = imzVar;
            j4 = j;
            j5 = j2;
            j6 = j3;
        }
        imzVar2.G(j4, j5, j6, f2, f3, i3);
    }

    public static /* synthetic */ void m(imz imzVar, ikd ikdVar, iiy iiyVar, float f, ina inaVar, int i) {
        if ((i & 8) != 0) {
            inaVar = inc.a;
        }
        ina inaVar2 = inaVar;
        int i2 = (i & 32) != 0 ? 3 : 0;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        imzVar.x(ikdVar, iiyVar, f, inaVar2, i2);
    }

    public static /* synthetic */ void o(imz imzVar, long j, long j2, long j3, long j4, ina inaVar, float f, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        if ((i & 4) != 0) {
            j3 = c(imzVar.b(), j2);
        }
        if ((i & 8) != 0) {
            j4 = 0;
        }
        if ((i & 16) != 0) {
            inaVar = inc.a;
        }
        if ((i & 32) != 0) {
            f = 1.0f;
        }
        imzVar.z(j, j2, j3, j4, inaVar, f, (i & 128) != 0 ? 3 : 0);
    }
}
