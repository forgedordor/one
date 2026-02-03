package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class caix extends fcyz implements fdat {
    int a;
    final /* synthetic */ caiy b;
    final /* synthetic */ eiju c;
    final /* synthetic */ fdap d;
    final /* synthetic */ Class e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caix(caiy caiyVar, eiju eijuVar, fdap fdapVar, Class cls, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = caiyVar;
        this.c = eijuVar;
        this.d = fdapVar;
        this.e = cls;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caix) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        caiy caiyVar = this.b;
        eiju eijuVar = this.c;
        fdap fdapVar = this.d;
        Class cls = this.e;
        this.a = 1;
        Object objC = caiyVar.c(eijuVar, fdapVar, cls, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new caix(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
