package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyf implements hbl {
    public final hbl a;
    public float c;
    public float d;
    public ddp e;
    private final jfw g;
    public final hox b = new hpl(new kir(0.0f), hsi.a);
    public final dok f = new dok();

    public fyf(hbl hblVar, jfw jfwVar) {
        this.a = hblVar;
        this.g = jfwVar;
        this.c = ((hblVar.d() % 12) * 0.5235988f) - 1.5707964f;
        this.d = (hblVar.e() * 0.10471976f) - 1.5707964f;
        this.e = ddq.a(this.c);
    }

    public static final float l(float f) {
        double d = f % 6.283185307179586d;
        if (d < 0.0d) {
            d += 6.283185307179586d;
        }
        return (float) d;
    }

    public static final float m(float f) {
        float f2 = f + 1.5707964f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    public static final int n(float f) {
        return ((int) ((f + 1.8325957218792777d) / 0.5235987901687622d)) % 12;
    }

    public static final int o(float f) {
        return ((int) ((f + 1.6231562058117728d) / 0.10471975803375244d)) % 60;
    }

    public final float a(float f) {
        float fFloatValue = ((Number) this.e.d()).floatValue() - f;
        while (fFloatValue > 3.1415927f) {
            fFloatValue -= 6.2831855f;
        }
        while (fFloatValue <= -3.1415927f) {
            fFloatValue += 6.2831855f;
        }
        return ((Number) this.e.d()).floatValue() - fFloatValue;
    }

    public final float b() {
        return ((Number) this.e.d()).floatValue();
    }

    public final float c() {
        return ((kir) this.b.a()).a;
    }

    @Override // defpackage.hbl
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.hbl
    public final int e() {
        return this.a.e();
    }

    @Override // defpackage.hbl
    public final int f() {
        return this.a.f();
    }

    public final Object g(float f, ddz ddzVar, boolean z, fcxy fcxyVar) {
        this.g.a = false;
        Object objA = this.f.a(dod.b, new fye(this, f, z, ddzVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.hbl
    public final void h(int i) {
        this.c = ((i % 12) * 0.5235988f) - 1.5707964f;
        this.a.h(i);
        if (hbk.b(f(), 0)) {
            this.e = ddq.a(this.c);
        }
    }

    @Override // defpackage.hbl
    public final void i(int i) {
        throw null;
    }

    @Override // defpackage.hbl
    public final void j(int i) {
        this.a.j(i);
    }

    @Override // defpackage.hbl
    public final boolean k() {
        return ((hbo) this.a).a;
    }
}
