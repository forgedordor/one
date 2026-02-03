package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbkn extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbkq b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbkn(fcxy fcxyVar, cbkq cbkqVar) {
        super(2, fcxyVar);
        this.b = cbkqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbkn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cbkq cbkqVar = this.b;
        this.a = 1;
        Object objB = cbkqVar.b(this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbkn cbknVar = new cbkn(fcxyVar, this.b);
        cbknVar.c = obj;
        return cbknVar;
    }
}
