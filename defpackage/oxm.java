package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxm {
    public final oxl a;
    public final hox b;
    public final hox c;
    private final fdpl d;
    private final fcyh e;

    public oxm(fdpl fdplVar) {
        this.d = fdplVar;
        fctc fctcVar = jkj.a;
        fcyh fcyhVarA = jkh.a();
        this.e = fcyhVarA;
        oxl oxlVar = new oxl(this, fcyhVarA, fdplVar instanceof fduj ? (oux) fcva.P(((fduj) fdplVar).d()) : null);
        this.a = oxlVar;
        oqx oqxVarB = oxlVar.b();
        hsi hsiVar = hsi.a;
        this.b = new hpl(oqxVarB, hsiVar);
        opc opcVar = (opc) oxlVar.j.c();
        if (opcVar == null) {
            orq orqVar = oxr.a;
            opcVar = new opc(orqVar.b, orqVar.c, orqVar.d, orqVar);
        }
        this.c = new hpl(opcVar, hsiVar);
    }

    public final int a() {
        return c().a();
    }

    public final opc b() {
        return (opc) this.c.a();
    }

    public final oqx c() {
        return (oqx) this.b.a();
    }

    public final Object d(fcxy fcxyVar) {
        Object objA = new fdtj(this.a.j).a(new oxj(this), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final Object e(fcxy fcxyVar) {
        Object objB = fdpy.b(this.d, new oxk(this, null), fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    public final Object f(int i) {
        this.a.d(i);
        return c().get(i);
    }

    public final Object g(int i) {
        return c().get(i);
    }
}
