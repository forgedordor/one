package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kip implements kio {
    private final float a;
    private final float b = 1.0f;

    public kip(float f) {
        this.a = f;
    }

    @Override // defpackage.kio
    public final float ed() {
        return this.a;
    }

    @Override // defpackage.kiy
    public final float ee() {
        return 1.0f;
    }

    @Override // defpackage.kiy
    public final /* synthetic */ float eg(long j) {
        return kix.a(this, j);
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
        if (!(obj instanceof kip)) {
            return false;
        }
        kip kipVar = (kip) obj;
        if (Float.compare(this.a, kipVar.a) != 0) {
            return false;
        }
        float f = kipVar.b;
        return Float.compare(1.0f, 1.0f) == 0;
    }

    @Override // defpackage.kio
    public final /* synthetic */ long er(long j) {
        return kin.h(this, j);
    }

    @Override // defpackage.kiy
    public final /* synthetic */ long es(float f) {
        return kix.b(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ long et(float f) {
        return kin.i(this, f);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(1.0f);
    }

    public final String toString() {
        return "DensityImpl(density=" + this.a + ", fontScale=1.0)";
    }
}
