package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbo implements hbl {
    public boolean a;
    private final hox b;
    private final hri c;
    private final hri d;

    public hbo(int i, int i2, boolean z) {
        if (i < 0 || i >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range");
        }
        if (i2 < 0 || i2 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range");
        }
        this.a = z;
        this.b = new hpl(new hbk(0), hsi.a);
        this.c = new hph(i);
        this.d = new hph(i2);
    }

    @Override // defpackage.hbl
    public final int d() {
        return this.c.c();
    }

    @Override // defpackage.hbl
    public final int e() {
        return this.d.c();
    }

    @Override // defpackage.hbl
    public final int f() {
        return ((hbk) this.b.a()).a;
    }

    @Override // defpackage.hbl
    public final void h(int i) {
        this.c.i(i);
    }

    @Override // defpackage.hbl
    public final void i(int i) {
        this.d.i(i);
    }

    @Override // defpackage.hbl
    public final void j(int i) {
        this.b.b(new hbk(i));
    }

    @Override // defpackage.hbl
    public final boolean k() {
        return this.a;
    }
}
