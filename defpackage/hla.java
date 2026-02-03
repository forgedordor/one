package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class hla implements hil, fdbl {
    private final /* synthetic */ fdae a;

    public hla(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    @Override // defpackage.hil
    public final /* synthetic */ float a() {
        return ((Number) this.a.invoke()).floatValue();
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof hil) && (obj instanceof fdbl)) {
            return fdbq.f(this.a, ((fdbl) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
