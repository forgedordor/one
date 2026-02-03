package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class inz {
    private ijf a;
    private float b = 1.0f;
    private kji c = kji.a;

    public abstract long a();

    protected abstract void b(imz imzVar);

    protected void c(float f) {
        throw null;
    }

    protected void d(ijf ijfVar) {
        throw null;
    }

    public final void e(imz imzVar, long j, float f, ijf ijfVar) {
        if (this.b != f) {
            c(f);
            this.b = f;
        }
        if (!fdbq.f(this.a, ijfVar)) {
            d(ijfVar);
            this.a = ijfVar;
        }
        kji kjiVarQ = imzVar.q();
        if (this.c != kjiVarQ) {
            f(kjiVarQ);
            this.c = kjiVarQ;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (imzVar.b() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (imzVar.b() & 4294967295L)) - Float.intBitsToFloat(i2);
        imzVar.t().c.f(fIntBitsToFloat, fIntBitsToFloat2);
        float f2 = -fIntBitsToFloat;
        float f3 = -fIntBitsToFloat2;
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    b(imzVar);
                }
            } finally {
                imzVar.t().c.f(f2, f3);
            }
        }
    }

    protected void f(kji kjiVar) {
    }
}
