package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoz implements hsf {
    private final int a;
    private final int b;
    private final hox c;
    private int d;

    public eoz(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        this.c = new hpl(eoy.a(i, i2, i3), hsi.a);
        this.d = i;
    }

    @Override // defpackage.hsf
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fddq a() {
        return (fddq) this.c.a();
    }

    public final void c(int i) {
        if (i != this.d) {
            this.d = i;
            this.c.b(eoy.a(i, this.a, this.b));
        }
    }
}
