package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fftb extends fftj {
    public final int a;
    public final int b;
    public final int c;

    public fftb(ffta fftaVar) {
        super(fftaVar);
        this.a = fftaVar.a;
        this.b = fftaVar.b;
        this.c = fftaVar.c;
    }

    @Override // defpackage.fftj
    protected final byte[] a() {
        int i = this.a;
        byte[] bArrA = super.a();
        ffwp.e(i, bArrA, 16);
        ffwp.e(this.b, bArrA, 20);
        ffwp.e(this.c, bArrA, 24);
        return bArrA;
    }
}
