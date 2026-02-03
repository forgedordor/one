package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbzy extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbzz b;
    final /* synthetic */ atrj c;
    final /* synthetic */ aufo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbzy(cbzz cbzzVar, atrj atrjVar, aufo aufoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cbzzVar;
        this.c = atrjVar;
        this.d = aufoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbzy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cbzz cbzzVar = this.b;
        this.a = 1;
        Object objB = cbzzVar.b(this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cbzy(this.b, this.c, this.d, fcxyVar);
    }
}
