package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffro extends ffrj {
    final ffrh c;
    public final ffrg d;

    public ffro(ffrn ffrnVar, byte[] bArr) {
        super(true, ffrnVar);
        int iA = ffrnVar.a();
        int i = iA * 4;
        if (bArr.length != i) {
            throw new IllegalArgumentException("private key encoding does not match parameters");
        }
        int i2 = iA + iA;
        this.c = new ffrh(ffwk.g(bArr, 0, iA), ffwk.g(bArr, iA, i2));
        int i3 = iA * 3;
        this.d = new ffrg(ffwk.g(bArr, i2, i3), ffwk.g(bArr, i3, i));
    }

    public final byte[] a() {
        ffrh ffrhVar = this.c;
        byte[] bArr = ffrhVar.a;
        byte[] bArr2 = ffrhVar.b;
        ffrg ffrgVar = this.d;
        return ffwk.d(new byte[][]{bArr, bArr2, ffrgVar.a, ffrgVar.b});
    }

    public ffro(ffrn ffrnVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, ffrnVar);
        this.c = new ffrh(bArr, bArr2);
        this.d = new ffrg(bArr3, bArr4);
    }
}
