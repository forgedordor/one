package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fws {
    public final hsf a;
    public final hox b;
    public final dok c;
    public final hrg d;
    public final hrg e;
    public final hrg f;
    private final fdjx g;
    private final hsf h;
    private final hrg i;

    public fws(fdjx fdjxVar, hsf hsfVar, float f, float f2) {
        this.g = fdjxVar;
        this.a = hsfVar;
        fdae fdaeVar = new fdae() { // from class: fwo
            @Override // defpackage.fdae
            public final Object invoke() {
                return Float.valueOf(this.a.b() * 0.5f);
            }
        };
        hxn hxnVar = hrp.a;
        this.h = new hnt(fdaeVar, null);
        this.b = new hpl(false, hsi.a);
        this.d = new hpf(0.0f);
        this.i = new hpf(0.0f);
        this.e = new hpf(f2);
        this.f = new hpf(f);
        this.c = new dok();
    }

    public final float a() {
        return ((Number) this.h.a()).floatValue();
    }

    public final float b() {
        return this.i.c();
    }

    public final float c() {
        return this.e.c();
    }

    public final void d(float f) {
        this.i.h(f);
    }

    public final void e(float f) {
        this.d.h(f);
    }

    public final boolean f() {
        return ((Boolean) this.b.a()).booleanValue();
    }

    public final void g(float f) {
        fdil.d(this.g, null, null, new fwr(this, f, null), 3);
    }
}
