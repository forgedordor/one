package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddh implements dez {
    private final dav a;

    public ddh(kio kioVar) {
        this.a = new dav(ddi.a, kioVar);
    }

    @Override // defpackage.dez
    public final float a() {
        return 0.0f;
    }

    @Override // defpackage.dez
    public final float b(float f, float f2) {
        double dA = this.a.a(f2);
        double d = daw.a;
        return f + (((float) (r0.a * r0.b * Math.exp((d / ((-1.0d) + d)) * dA))) * Math.signum(f2));
    }

    @Override // defpackage.dez
    public final float c(long j, float f, float f2) {
        dau dauVarB = this.a.b(f2);
        long j2 = dauVarB.c;
        float f3 = j2 > 0 ? (j / 1000000) / j2 : 1.0f;
        float fSignum = dauVarB.b * Math.signum(dauVarB.a);
        int i = cwj.a;
        return f + (fSignum * cwj.a(f3).a);
    }

    @Override // defpackage.dez
    public final long d(float f) {
        return ((long) (Math.exp(this.a.a(f) / (daw.a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.dez
    public final float e(long j, float f) {
        dau dauVarB = this.a.b(f);
        long j2 = dauVarB.c;
        float f2 = j2;
        float f3 = j2 > 0 ? (j / 1000000) / f2 : 1.0f;
        int i = cwj.a;
        return (((cwj.a(f3).b * Math.signum(dauVarB.a)) * dauVarB.b) / f2) * 1000.0f;
    }
}
