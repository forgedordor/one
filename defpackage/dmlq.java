package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dmlq implements lvz, fdbl {
    private final /* synthetic */ fdap a;

    public dmlq(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.lvz
    public final /* synthetic */ void a(Object obj) {
        this.a.invoke(obj);
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof lvz) && (obj instanceof fdbl)) {
            return fdbq.f(this.a, ((fdbl) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
