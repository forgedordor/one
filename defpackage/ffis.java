package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffis extends ffiq {
    public ffis() {
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
        i();
        return 48;
    }

    @Override // defpackage.ffil
    public final int b() {
        return 48;
    }

    @Override // defpackage.ffil
    public final String c() {
        return "SHA-384";
    }

    @Override // defpackage.ffiq
    public final void i() {
        super.i();
        this.b = -3766243637369397544L;
        this.c = 7105036623409894663L;
        this.d = -7973340178411365097L;
        this.e = 1526699215303891257L;
        this.f = 7436329637833083697L;
        this.g = -8163818279084223215L;
        this.h = -2662702644619276377L;
        this.i = 5167115440072839076L;
    }
}
