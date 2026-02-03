package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class ore implements opo, fdbl {
    final /* synthetic */ orh a;

    public ore(orh orhVar) {
        this.a = orhVar;
    }

    @Override // defpackage.opo
    public final void a() {
        this.a.e();
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return new fdbo(0, this.a, orh.class, "invalidate", "invalidate()V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof opo) && (obj instanceof fdbl)) {
            return fdbq.f(b(), ((fdbl) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
