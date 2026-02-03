package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lts extends ltb {
    public lts() {
        super((byte[]) null);
    }

    public final void m(ltu ltuVar, int i) {
        float[] fArr = this.a;
        int i2 = i + 1;
        long jA = ltuVar.a(fArr[i], fArr[i2]);
        fArr[i] = Float.intBitsToFloat((int) (jA >> 32));
        fArr[i2] = Float.intBitsToFloat((int) (4294967295L & jA));
    }
}
