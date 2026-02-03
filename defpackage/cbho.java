package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbho extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbhp b;
    final /* synthetic */ fdap c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbho(fcxy fcxyVar, cbhp cbhpVar, fdap fdapVar) {
        super(2, fcxyVar);
        this.b = cbhpVar;
        this.c = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbho) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cbhp cbhpVar = this.b;
        fdap fdapVar = this.c;
        this.a = 1;
        Object objA = cbhpVar.a(fdapVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbho cbhoVar = new cbho(fcxyVar, this.b, this.c);
        cbhoVar.d = obj;
        return cbhoVar;
    }
}
