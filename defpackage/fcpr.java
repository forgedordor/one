package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcpr implements fcmv {
    public final ffez a;
    private int b;
    private int c;

    public fcpr(ffez ffezVar, int i) {
        this.a = ffezVar;
        this.b = i;
    }

    @Override // defpackage.fcmv
    public final int a() {
        return this.c;
    }

    @Override // defpackage.fcmv
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fcmv
    public final void c(byte b) {
        this.a.P(b);
        this.b--;
        this.c++;
    }

    @Override // defpackage.fcmv
    public final void d(byte[] bArr, int i, int i2) {
        this.a.N(bArr, i, i2);
        this.b -= i2;
        this.c += i2;
    }
}
