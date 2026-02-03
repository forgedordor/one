package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imv {
    public final /* synthetic */ imt a;

    public imv(imt imtVar) {
        this.a = imtVar;
    }

    public final long a() {
        return this.a.a();
    }

    public final void b(float f, float f2, float f3, float f4, int i) {
        this.a.b().a(f, f2, f3, f4, i);
    }

    public final void c(float f, long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        ijb ijbVarB = this.a.b();
        ijbVarB.o(Float.intBitsToFloat(i2), Float.intBitsToFloat(i));
        ijbVarB.k(f);
        ijbVarB.o(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i));
    }

    public final void d(float f, float f2, long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        ijb ijbVarB = this.a.b();
        ijbVarB.o(Float.intBitsToFloat(i2), Float.intBitsToFloat(i));
        ijbVarB.n(f, f2);
        ijbVarB.o(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i));
    }

    public final void e(float f, float f2) {
        this.a.b().o(f, f2);
    }

    public final void f(float f, float f2) {
        imt imtVar = this.a;
        ijb ijbVarB = imtVar.b();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (a() >> 32)) - (f + 0.0f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (a() & 4294967295L)) - (f2 + 0.0f);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            ijs.a("Width and height must be greater than or equal to zero");
        }
        imtVar.h(jFloatToRawIntBits);
        ijbVarB.o(0.0f, 0.0f);
    }

    public final void g(ikd ikdVar) {
        this.a.b().r(ikdVar);
    }
}
