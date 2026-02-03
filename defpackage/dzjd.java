package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzjd {
    public dzje a;
    public dziw b;
    final dzjc c = new dzjc();

    public dzjd(dzjh dzjhVar, dzjn dzjnVar, final fcsu fcsuVar, final fcsu fcsuVar2) {
        fcsuVar.getClass();
        ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: dziz
            @Override // defpackage.ejxr
            public final Object get() {
                return (Boolean) fcsuVar.b();
            }
        });
        fcsuVar2.getClass();
        ejxr ejxrVarA2 = ejxx.a(new ejxr() { // from class: dziz
            @Override // defpackage.ejxr
            public final Object get() {
                return (Boolean) fcsuVar2.b();
            }
        });
        if (!((Boolean) ejxrVarA2.get()).booleanValue()) {
            d(dzjhVar, ejxrVarA, ejxrVarA2);
            c(dzjnVar, ejxrVarA, ejxrVarA2);
        } else if (((Boolean) ejxrVarA.get()).booleanValue()) {
            c(dzjnVar, ejxrVarA, ejxrVarA2);
        } else {
            d(dzjhVar, ejxrVarA, ejxrVarA2);
        }
    }

    private final void c(dzjn dzjnVar, ejxr ejxrVar, ejxr ejxrVar2) {
        this.b = new dziw(new dzjb(this, ejxrVar2, ejxrVar, dzjnVar));
        dzjnVar.g.add(this.b);
    }

    private final void d(dzjh dzjhVar, ejxr ejxrVar, ejxr ejxrVar2) {
        dzje dzjeVar = new dzje(new dzja(this, ejxrVar2, ejxrVar, dzjhVar));
        this.a = dzjeVar;
        dzjhVar.a(dzjeVar);
    }

    public final void a(dzix dzixVar) {
        this.c.b.add(dzixVar);
    }

    public final void b(dzix dzixVar) {
        this.c.b.remove(dzixVar);
    }
}
