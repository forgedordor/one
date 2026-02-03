package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffok extends ffoh {
    final byte[] c;
    final byte[] d;

    public ffok(ffoi ffoiVar, byte[] bArr) {
        super(false, ffoiVar);
        this.c = ffwk.g(bArr, 0, 32);
        this.d = ffwk.g(bArr, 32, bArr.length);
    }

    public final byte[] a() {
        return ffwk.e(this.c, this.d);
    }

    public final byte[] b() {
        return ffwk.c(this.d);
    }

    public ffok(ffoi ffoiVar, byte[] bArr, byte[] bArr2) {
        super(false, ffoiVar);
        this.c = ffwk.c(bArr);
        this.d = ffwk.c(bArr2);
    }
}
