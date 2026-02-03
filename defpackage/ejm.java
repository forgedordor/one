package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejm {
    public boolean a;
    public Object b;
    public final eoz c;
    private final hri d;
    private final hri e;

    public ejm() {
        this(0, 0);
    }

    public final int a() {
        return this.d.c();
    }

    public final int b() {
        return this.e.c();
    }

    public final void c(int i) {
        this.d.i(i);
    }

    public final void d(int i) {
        this.e.i(i);
    }

    public final void e(int i, int i2) {
        if (i < 0.0f) {
            ebs.c("Index should be non-negative (" + i + ')');
        }
        c(i);
        this.c.c(i);
        d(i2);
    }

    public ejm(int i, int i2) {
        this.d = new hph(i);
        this.e = new hph(i2);
        this.c = new eoz(i, 30, 100);
    }
}
