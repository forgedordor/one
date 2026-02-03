package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class fjl implements fih, fdbl {
    private final /* synthetic */ fdae a;

    public fjl(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    @Override // defpackage.fih
    public final /* synthetic */ long a() {
        return ((ihs) this.a.invoke()).a;
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fih) && (obj instanceof fdbl)) {
            return fdbq.f(this.a, ((fdbl) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
