package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffoj extends ffoh {
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;

    public ffoj(ffoi ffoiVar, byte[] bArr, ffok ffokVar) {
        super(true, ffoiVar);
        ffog ffogVar = new ffog(ffoiVar.d);
        this.c = ffwk.g(bArr, 0, 32);
        this.d = ffwk.g(bArr, 32, 64);
        this.e = ffwk.g(bArr, 64, 128);
        int i = (ffogVar.c * ffogVar.a) + 128;
        this.f = ffwk.g(bArr, 128, i);
        int i2 = (ffogVar.b * ffogVar.a) + i;
        this.g = ffwk.g(bArr, i, i2);
        this.h = ffwk.g(bArr, i2, (ffogVar.b * 416) + i2);
        if (ffokVar != null) {
            this.i = ffokVar.b();
        } else {
            this.i = null;
        }
    }

    public ffoj(ffoi ffoiVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super(true, ffoiVar);
        this.c = ffwk.c(bArr);
        this.d = ffwk.c(bArr2);
        this.e = ffwk.c(bArr3);
        this.f = ffwk.c(bArr4);
        this.g = ffwk.c(bArr5);
        this.h = ffwk.c(bArr6);
        this.i = ffwk.c(bArr7);
    }
}
