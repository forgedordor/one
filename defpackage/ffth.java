package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffth {
    public final byte[][] a;

    protected ffth(fftg fftgVar, byte[][] bArr) {
        if (ffua.e(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        }
        if (bArr.length != fftgVar.b) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != fftgVar.a) {
                throw new IllegalArgumentException("wrong publicKey format");
            }
        }
        this.a = ffua.k(bArr);
    }
}
