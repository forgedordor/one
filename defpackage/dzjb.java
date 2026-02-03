package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzjb implements dzix {
    final /* synthetic */ ejxr a;
    final /* synthetic */ ejxr b;
    final /* synthetic */ dzjn c;
    final /* synthetic */ dzjd d;

    public dzjb(dzjd dzjdVar, ejxr ejxrVar, ejxr ejxrVar2, dzjn dzjnVar) {
        this.a = ejxrVar;
        this.b = ejxrVar2;
        this.c = dzjnVar;
        this.d = dzjdVar;
    }

    private final void a() {
        dzjd dzjdVar = this.d;
        dziw dziwVar = dzjdVar.b;
        if (dziwVar != null) {
            this.c.g.remove(dziwVar);
            dzjdVar.b = null;
        }
    }

    @Override // defpackage.dzix
    public final void i(dzfh dzfhVar) {
        if (((Boolean) this.a.get()).booleanValue()) {
            this.d.c.k(dzfhVar);
        } else if (((Boolean) this.b.get()).booleanValue()) {
            this.d.c.k(dzfhVar);
        } else {
            a();
        }
    }

    @Override // defpackage.dzix
    public final void j(dzfh dzfhVar) {
        if (((Boolean) this.a.get()).booleanValue()) {
            this.d.c.l(dzfhVar);
        } else if (((Boolean) this.b.get()).booleanValue()) {
            this.d.c.l(dzfhVar);
        } else {
            a();
        }
    }
}
