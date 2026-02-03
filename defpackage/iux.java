package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iux implements iva {
    @Override // defpackage.iva
    public final long a(long j, long j2) {
        float fA = ivb.a(j, j2);
        long jFloatToRawIntBits = Float.floatToRawIntBits(fA);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fA);
        int i = iza.a;
        return (jFloatToRawIntBits << 32) | (4294967295L & jFloatToRawIntBits2);
    }
}
