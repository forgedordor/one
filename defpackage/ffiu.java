package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffiu extends ffiq {
    public ffiu() {
        ffix.a(this);
        ffij.b();
        i();
    }

    @Override // defpackage.ffil
    public final int a(byte[] bArr, int i) {
        f();
        ffwp.g(this.b, bArr, i);
        ffwp.g(this.c, bArr, i + 8);
        ffwp.g(this.d, bArr, i + 16);
        ffwp.g(this.e, bArr, i + 24);
        ffwp.g(this.f, bArr, i + 32);
        ffwp.g(this.g, bArr, i + 40);
        ffwp.g(this.h, bArr, i + 48);
        ffwp.g(this.i, bArr, i + 56);
        i();
        return 64;
    }

    @Override // defpackage.ffil
    public final int b() {
        return 64;
    }

    @Override // defpackage.ffil
    public final String c() {
        return "SHA-512";
    }

    @Override // defpackage.ffiq
    public final void i() {
        super.i();
        this.b = 7640891576956012808L;
        this.c = -4942790177534073029L;
        this.d = 4354685564936845355L;
        this.e = -6534734903238641935L;
        this.f = 5840696475078001361L;
        this.g = -7276294671716946913L;
        this.h = 2270897969802886507L;
        this.i = 6620516959819538809L;
    }
}
