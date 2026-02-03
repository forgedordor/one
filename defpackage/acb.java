package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acb implements aap {
    final /* synthetic */ ace a;
    private final abs b;

    public acb(ace aceVar, abs absVar) {
        this.a = aceVar;
        this.b = absVar;
    }

    @Override // defpackage.aap
    public final void b() {
        ace aceVar = this.a;
        fcuq fcuqVar = aceVar.a;
        abs absVar = this.b;
        fcuqVar.remove(absVar);
        if (fdbq.f(aceVar.b, absVar)) {
            absVar.a();
            aceVar.b = null;
        }
        absVar.g(this);
        fdae fdaeVar = absVar.c;
        if (fdaeVar != null) {
            fdaeVar.invoke();
        }
        absVar.c = null;
    }
}
