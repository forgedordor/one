package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izs extends iyw {
    public izs() {
        super(null);
    }

    @Override // defpackage.iyw
    public final float a(float f, ivy ivyVar, ivy ivyVar2) {
        long jG = ivyVar.g() & 4294967295L;
        return Float.intBitsToFloat((int) (ivyVar2.h(ivyVar, (Float.floatToRawIntBits(((int) jG) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
    }

    public izs(fdat fdatVar) {
        super(fdatVar);
    }
}
