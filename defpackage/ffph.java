package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffph implements ffil {
    private final ffil a;
    private final int b;

    public ffph(ffil ffilVar, int i) {
        this.a = ffilVar;
        this.b = i;
    }

    @Override // defpackage.ffil
    public final int a(byte[] bArr, int i) {
        ffil ffilVar = this.a;
        byte[] bArr2 = new byte[ffilVar.b()];
        ffilVar.a(bArr2, 0);
        int i2 = this.b;
        System.arraycopy(bArr2, 0, bArr, i, i2);
        return i2;
    }

    @Override // defpackage.ffil
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ffil
    public final String c() {
        return this.a.c() + "/" + (this.b * 8);
    }

    @Override // defpackage.ffil
    public final void d(byte b) {
        this.a.d(b);
    }

    @Override // defpackage.ffil
    public final void e(byte[] bArr, int i, int i2) {
        this.a.e(bArr, i, i2);
    }
}
