package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class wej implements wqe, fdbl {
    private final /* synthetic */ fdae a;

    public wej(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    @Override // defpackage.wqe
    public final /* synthetic */ void a() {
        this.a.invoke();
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof wqe) && (obj instanceof fdbl)) {
            return fdbq.f(this.a, ((fdbl) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
