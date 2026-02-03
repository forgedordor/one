package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erw implements ept {
    final /* synthetic */ etv a;
    final /* synthetic */ boolean b;

    public erw(etv etvVar, boolean z) {
        this.a = etvVar;
        this.b = z;
    }

    @Override // defpackage.ept
    public final float a() {
        etv etvVar = this.a;
        return eua.a(etvVar.x(), etvVar.b());
    }

    @Override // defpackage.ept
    public final float b() {
        return etg.a(this.a);
    }

    @Override // defpackage.ept
    public final int c() {
        etv etvVar = this.a;
        return etvVar.x().a() + etvVar.x().d;
    }

    @Override // defpackage.ept
    public final int d() {
        etv etvVar = this.a;
        return (int) (etvVar.x().e == dwm.a ? etvVar.x().b() & 4294967295L : etvVar.x().b() >> 32);
    }

    @Override // defpackage.ept
    public final jro e() {
        return this.b ? new jro(this.a.b(), 1) : new jro(1, this.a.b());
    }

    @Override // defpackage.ept
    public final Object f(int i, fcxy fcxyVar) {
        etv etvVar = this.a;
        Object objE = etvVar.e(dod.a, new etu(etvVar, i, null), fcxyVar);
        fcyl fcylVar = fcyl.a;
        if (objE != fcylVar) {
            objE = fctx.a;
        }
        return objE == fcylVar ? objE : fctx.a;
    }
}
