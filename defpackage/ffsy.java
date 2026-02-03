package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffsy extends fftj {
    public final int a;
    public final int b;

    public ffsy(ffsx ffsxVar) {
        super(ffsxVar);
        this.a = ffsxVar.a;
        this.b = ffsxVar.b;
    }

    @Override // defpackage.fftj
    protected final byte[] a() {
        byte[] bArrA = super.a();
        ffwp.e(0, bArrA, 16);
        ffwp.e(this.a, bArrA, 20);
        ffwp.e(this.b, bArrA, 24);
        return bArrA;
    }
}
