package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cyq extends fdbr implements fdap {
    final /* synthetic */ ilg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyq(ilg ilgVar) {
        super(1);
        this.a = ilgVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        deg degVar = (deg) obj;
        float f = degVar.b;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = degVar.c;
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        float f3 = degVar.d;
        float f4 = f3 >= -0.5f ? f3 : -0.5f;
        float f5 = degVar.a;
        float f6 = f5 >= 0.0f ? f5 : 0.0f;
        float[] fArr = ilo.a;
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f4 > 0.5f) {
            f4 = 0.5f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        return new ije(ije.e(ijg.f(f, f2, f4, f6, ilo.x), this.a));
    }
}
