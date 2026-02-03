package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dnrn implements fdbl {
    final /* synthetic */ dnro a;

    public dnrn(dnro dnroVar) {
        this.a = dnroVar;
    }

    public final void a(String str, boolean z) {
        dnro dnroVar = this.a;
        fdil.d(dnroVar.bH(), null, null, new dnrm(dnroVar, str, z, null), 3);
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return new fdbo(2, this.a, dnro.class, "onEmojiSelected", "onEmojiSelected(Ljava/lang/String;Z)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dnrn) && (obj instanceof fdbl)) {
            return fdbq.f(b(), ((fdbl) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
