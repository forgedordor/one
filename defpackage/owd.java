package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class owd {
    private final oqp a = new oqp(new fdap() { // from class: ovt
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            fdae fdaeVar = (fdae) obj;
            fdaeVar.getClass();
            fdaeVar.invoke();
            return fctx.a;
        }
    }, null);

    public abstract Object b(owe oweVar);

    public abstract Object c(ovx ovxVar, fcxy fcxyVar);

    public boolean d() {
        return false;
    }

    public final void e() {
        if (this.a.c() && ovs.a(3)) {
            toString();
            ovs.b(3, "Invalidated PagingSource ".concat(toString()));
        }
    }

    public final void f(fdae fdaeVar) {
        fdaeVar.getClass();
        this.a.a(fdaeVar);
    }

    public final void g(fdae fdaeVar) {
        fdaeVar.getClass();
        this.a.b(fdaeVar);
    }

    public final boolean h() {
        return this.a.a;
    }
}
