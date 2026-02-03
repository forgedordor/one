package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbaj extends fcyz implements fdat {
    int a;
    final /* synthetic */ cban b;
    final /* synthetic */ pzj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbaj(fcxy fcxyVar, cban cbanVar, pzj pzjVar) {
        super(2, fcxyVar);
        this.b = cbanVar;
        this.c = pzjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbaj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objB;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cban cbanVar = this.b;
        pzj pzjVar = this.c;
        this.a = 1;
        int i2 = pzjVar.j;
        if (i2 == 1) {
            objB = true;
        } else {
            int i3 = i2 - 1;
            objB = i3 != 1 ? i3 != 2 ? i3 != 3 ? false : cbanVar.b.b(this) : cbanVar.b.c(this) : cbanVar.b.a(this);
        }
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbaj cbajVar = new cbaj(fcxyVar, this.b, this.c);
        cbajVar.d = obj;
        return cbajVar;
    }
}
