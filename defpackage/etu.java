package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etu extends fcyz implements fdat {
    int a;
    final /* synthetic */ etv b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etu(etv etvVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = etvVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((etu) c((dwy) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            etv etvVar = this.b;
            this.a = 1;
            if (etvVar.q(this) == fcylVar) {
                return fcylVar;
            }
        }
        etv etvVar2 = this.b;
        etvVar2.u(etvVar2.f(this.c), 0.0f, true);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new etu(this.b, this.c, fcxyVar);
    }
}
