package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffoq extends ffoo {
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;

    public ffoq(ffop ffopVar, byte[] bArr) {
        super(true, ffopVar);
        ffon ffonVar = new ffon(ffopVar.e);
        this.c = ffwk.g(bArr, 0, ffonVar.b);
        int i = ffonVar.b;
        this.f = ffwk.g(bArr, i, (ffonVar.a + i) - 32);
        int i2 = i + (ffonVar.a - 32);
        int i3 = i2 + 32;
        this.g = ffwk.g(bArr, i2, i3);
        int i4 = i2 + 64;
        this.d = ffwk.g(bArr, i3, i4);
        this.e = ffwk.g(bArr, i4, i2 + 96);
    }
}
