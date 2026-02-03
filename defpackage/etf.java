package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etf {
    public final etv a;
    public boolean b;
    public Object c;
    public final eoz d;
    public final hri e;
    private final hrg f;

    public etf(int i, float f, etv etvVar) {
        this.a = etvVar;
        this.e = new hph(i);
        this.f = new hpf(f);
        this.d = new eoz(i, 30, 100);
    }

    public final float a() {
        return this.f.c();
    }

    public final void b(int i) {
        this.e.i(i);
    }

    public final void c(float f) {
        this.f.h(f);
    }

    public final void d(int i, float f) {
        b(i);
        this.d.c(i);
        c(f);
    }
}
