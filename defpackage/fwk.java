package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fwk extends fdbo implements fdap {
    public fwk(Object obj) {
        super(1, obj, fws.class, "onPull", "onPull$material_release(F)F", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float fC;
        float fFloatValue = ((Number) obj).floatValue();
        fws fwsVar = (fws) this.g;
        if (!fwsVar.f()) {
            float fC2 = fddu.c(fwsVar.b() + fFloatValue, 0.0f);
            float fB = fC2 - fwsVar.b();
            fwsVar.d(fC2);
            if (fwsVar.a() <= fwsVar.c()) {
                fC = fwsVar.a();
            } else {
                float fAbs = Math.abs(fwsVar.a() / fwsVar.c()) - 1.0f;
                f = fAbs >= 0.0f ? fAbs : 0.0f;
                if (f > 2.0f) {
                    f = 2.0f;
                }
                fC = fwsVar.c() + (fwsVar.c() * (f - (((float) Math.pow(f, 2.0d)) / 4.0f)));
            }
            fwsVar.e(fC);
            f = fB;
        }
        return Float.valueOf(f);
    }
}
