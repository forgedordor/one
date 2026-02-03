package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fftj {
    private final int a;
    public final int d;
    public final long e;
    public final int f;

    protected fftj(ffti fftiVar) {
        this.d = fftiVar.e;
        this.e = fftiVar.f;
        this.a = fftiVar.d;
        this.f = fftiVar.g;
    }

    protected byte[] a() {
        byte[] bArr = new byte[32];
        ffwp.e(this.d, bArr, 0);
        ffwp.g(this.e, bArr, 4);
        ffwp.e(this.a, bArr, 12);
        ffwp.e(this.f, bArr, 28);
        return bArr;
    }
}
