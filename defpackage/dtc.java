package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtc implements dwy {
    final /* synthetic */ dtd a;

    public dtc(dtd dtdVar) {
        this.a = dtdVar;
    }

    @Override // defpackage.dwy
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        dtd dtdVar = this.a;
        float fFloatValue = ((Number) dtdVar.a.invoke(Float.valueOf(f))).floatValue();
        dtdVar.e.b(Boolean.valueOf(fFloatValue > 0.0f));
        dtdVar.f.b(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
