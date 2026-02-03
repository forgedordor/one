package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivj extends iyw {
    public ivj() {
        super(null);
    }

    @Override // defpackage.iyw
    public final float a(float f, ivy ivyVar, ivy ivyVar2) {
        return Float.intBitsToFloat((int) (ivyVar2.h(ivyVar, (Float.floatToRawIntBits(((int) (ivyVar.g() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)) & 4294967295L));
    }

    public ivj(fdat fdatVar) {
        super(fdatVar);
    }
}
