package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxli extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxlj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxli(dxlj dxljVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxljVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxli) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dxlj dxljVar = this.b;
        this.a = 1;
        Object objB = dxljVar.d.b(dxljVar.f, "weblogin:continue=".concat(dxljVar.g), this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxli(this.b, fcxyVar);
    }
}
