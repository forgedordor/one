package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fwl extends fdbb implements fdat {
    public fwl(Object obj) {
        super(2, obj, fws.class, "onRelease", "onRelease$material_release(F)F", 4);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        float fFloatValue = ((Number) obj).floatValue();
        fws fwsVar = (fws) this.b;
        float f = 0.0f;
        if (!fwsVar.f()) {
            if (fwsVar.a() > fwsVar.c()) {
                ((fdae) fwsVar.a.a()).invoke();
            }
            fwsVar.g(0.0f);
            if (fwsVar.b() == 0.0f || fFloatValue < 0.0f) {
                fFloatValue = 0.0f;
            }
            fwsVar.d(0.0f);
            f = fFloatValue;
        }
        return new Float(f);
    }
}
