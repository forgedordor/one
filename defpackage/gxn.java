package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class gxn implements ijh, fdbl {
    private final /* synthetic */ fdae a;

    public gxn(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    @Override // defpackage.ijh
    public final /* synthetic */ long a() {
        return ((ije) this.a.invoke()).i;
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ijh) && (obj instanceof fdbl)) {
            return fdbq.f(this.a, ((fdbl) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
