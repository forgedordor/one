package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class edq implements izx {
    private final fdap a;
    private ehc b;

    public edq(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.ics
    public final /* synthetic */ ics a(ics icsVar) {
        return icn.a(this, icsVar);
    }

    @Override // defpackage.ics
    public final /* synthetic */ Object b(Object obj, fdat fdatVar) {
        return icp.a(this, obj, fdatVar);
    }

    @Override // defpackage.ics
    public final /* synthetic */ boolean c(fdap fdapVar) {
        return icp.b(this, fdapVar);
    }

    @Override // defpackage.izx
    public final void d(jaf jafVar) {
        ehc ehcVar = (ehc) jafVar.q(ehm.a);
        if (fdbq.f(ehcVar, this.b)) {
            return;
        }
        this.b = ehcVar;
        this.a.invoke(ehcVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof edq) && ((edq) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
