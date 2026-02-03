package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsh implements iqp {
    final /* synthetic */ gsp a;
    final /* synthetic */ fdap b;
    final /* synthetic */ dwm c;

    public gsh(gsp gspVar, fdap fdapVar, dwm dwmVar) {
        this.a = gspVar;
        this.b = fdapVar;
        this.c = dwmVar;
    }

    private final float e(long j) {
        return Float.intBitsToFloat((int) (this.c == dwm.b ? j >> 32 : j & 4294967295L));
    }

    private final float f(long j) {
        return this.c == dwm.b ? kjo.a(j) : kjo.b(j);
    }

    private final long g(float f) {
        dwm dwmVar = this.c;
        float f2 = dwmVar == dwm.b ? f : 0.0f;
        dwm dwmVar2 = dwm.a;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        if (dwmVar != dwmVar2) {
            f = 0.0f;
        }
        return (Float.floatToRawIntBits(f) & 4294967295L) | (jFloatToRawIntBits << 32);
    }

    @Override // defpackage.iqp
    public final long a(long j, long j2, int i) {
        if (ira.a(i, 1)) {
            return g(this.a.d.a(e(j2)));
        }
        return 0L;
    }

    @Override // defpackage.iqp
    public final long b(long j, int i) {
        float fE = e(j);
        if (fE >= 0.0f || !ira.a(i, 1)) {
            return 0L;
        }
        return g(this.a.d.a(fE));
    }

    @Override // defpackage.iqp
    public final Object c(long j, long j2, fcxy fcxyVar) {
        this.b.invoke(new Float(f(j2)));
        return new kjo(j2);
    }

    @Override // defpackage.iqp
    public final Object d(long j, fcxy fcxyVar) {
        float f = f(j);
        gsp gspVar = this.a;
        float fB = gspVar.b();
        float fA = gspVar.d.p().a();
        if (f >= 0.0f || fB <= fA) {
            j = 0;
        } else {
            this.b.invoke(new Float(f));
        }
        return new kjo(j);
    }
}
