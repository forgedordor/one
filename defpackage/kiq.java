package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kiq implements kio {
    private final float a;
    private final float b;
    private final kjq c;

    public kiq(float f, float f2, kjq kjqVar) {
        this.a = f;
        this.b = f2;
        this.c = kjqVar;
    }

    @Override // defpackage.kio
    public final float ed() {
        return this.a;
    }

    @Override // defpackage.kiy
    public final float ee() {
        return this.b;
    }

    @Override // defpackage.kiy
    public final float eg(long j) {
        if (kjn.b(kjl.c(j), 4294967296L)) {
            return this.c.b(kjl.a(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // defpackage.kio
    public final /* synthetic */ float eh(float f) {
        return kin.a(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float el(int i) {
        return kin.b(this, i);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float em(long j) {
        return kin.c(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float en(float f) {
        return kin.d(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ int eo(long j) {
        return kin.e(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ int ep(float f) {
        return kin.f(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ long eq(long j) {
        return kin.g(this, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kiq)) {
            return false;
        }
        kiq kiqVar = (kiq) obj;
        return Float.compare(this.a, kiqVar.a) == 0 && Float.compare(this.b, kiqVar.b) == 0 && fdbq.f(this.c, kiqVar.c);
    }

    @Override // defpackage.kio
    public final /* synthetic */ long er(long j) {
        return kin.h(this, j);
    }

    @Override // defpackage.kiy
    public final long es(float f) {
        return kjm.b(this.c.a(f));
    }

    @Override // defpackage.kio
    public final /* synthetic */ long et(float f) {
        return kin.i(this, f);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.a + ", fontScale=" + this.b + ", converter=" + this.c + ')';
    }
}
