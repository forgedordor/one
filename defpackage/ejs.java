package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ejs extends fcyz implements fdat {
    int a;
    final /* synthetic */ ejy b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejs(ejy ejyVar, int i, int i2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ejyVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejs) c((dwy) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dwy dwyVar = (dwy) this.e;
            ejy ejyVar = this.b;
            ejn ejnVar = new ejn(dwyVar, ejyVar);
            int i2 = this.c;
            int i3 = this.d;
            kio kioVarF = ejyVar.f();
            this.a = 1;
            if (eps.a(ejnVar, i2, i3, 100, kioVarF, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ejs ejsVar = new ejs(this.b, this.c, this.d, fcxyVar);
        ejsVar.e = obj;
        return ejsVar;
    }
}
