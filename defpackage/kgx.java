package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgx implements khs {
    public final ikm a;
    public final float b;

    public kgx(ikm ikmVar, float f) {
        this.a = ikmVar;
        this.b = f;
    }

    @Override // defpackage.khs
    public final float a() {
        return this.b;
    }

    @Override // defpackage.khs
    public final long b() {
        return ije.h;
    }

    @Override // defpackage.khs
    public final iiy c() {
        return this.a;
    }

    @Override // defpackage.khs
    public final /* synthetic */ khs d(khs khsVar) {
        return khp.a(this, khsVar);
    }

    @Override // defpackage.khs
    public final /* synthetic */ khs e(fdae fdaeVar) {
        return khp.b(this, fdaeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgx)) {
            return false;
        }
        kgx kgxVar = (kgx) obj;
        return fdbq.f(this.a, kgxVar.a) && Float.compare(this.b, kgxVar.b) == 0;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "BrushStyle(value=" + this.a + ", alpha=" + this.b + ')';
    }
}
