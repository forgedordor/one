package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kpf extends jnk implements iyh {
    private final kow a;
    private final fdap b;

    public kpf(kow kowVar, fdap fdapVar) {
        this.a = kowVar;
        this.b = fdapVar;
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

    @Override // defpackage.iyh
    public final /* bridge */ /* synthetic */ Object d() {
        return new kpe(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        kpf kpfVar = obj instanceof kpf ? (kpf) obj : null;
        return this.b == (kpfVar != null ? kpfVar.b : null);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
