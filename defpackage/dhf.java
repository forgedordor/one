package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dhf implements dhe {
    private final Object a;
    private final Object b;

    public dhf(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.dhe
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.dhe
    public final Object b() {
        return this.b;
    }

    @Override // defpackage.dhe
    public final /* synthetic */ boolean d(Object obj, Object obj2) {
        return dhd.a(this, obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhe)) {
            return false;
        }
        dhe dheVar = (dhe) obj;
        return fdbq.f(this.a, dheVar.a()) && fdbq.f(this.b, dheVar.b());
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }
}
