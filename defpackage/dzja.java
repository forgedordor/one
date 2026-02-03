package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzja implements dzix {
    final /* synthetic */ ejxr a;
    final /* synthetic */ ejxr b;
    final /* synthetic */ dzjh c;
    final /* synthetic */ dzjd d;

    public dzja(dzjd dzjdVar, ejxr ejxrVar, ejxr ejxrVar2, dzjh dzjhVar) {
        this.a = ejxrVar;
        this.b = ejxrVar2;
        this.c = dzjhVar;
        this.d = dzjdVar;
    }

    private final void a() {
        dzjd dzjdVar = this.d;
        dzje dzjeVar = dzjdVar.a;
        if (dzjeVar != null) {
            this.c.b(dzjeVar);
            dzjdVar.a = null;
        }
    }

    @Override // defpackage.dzix
    public final void i(dzfh dzfhVar) {
        if (((Boolean) this.a.get()).booleanValue()) {
            this.d.c.k(dzfhVar);
        } else if (((Boolean) this.b.get()).booleanValue()) {
            a();
        } else {
            this.d.c.k(dzfhVar);
        }
    }

    @Override // defpackage.dzix
    public final void j(dzfh dzfhVar) {
        if (((Boolean) this.a.get()).booleanValue()) {
            this.d.c.l(dzfhVar);
        } else if (((Boolean) this.b.get()).booleanValue()) {
            a();
        } else {
            this.d.c.l(dzfhVar);
        }
    }
}
