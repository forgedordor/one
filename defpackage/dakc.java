package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dakc extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dakc(fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dakc) c((fctx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fdap fdapVar = this.b;
        this.a = 1;
        Object objInvoke = fdapVar.invoke(this);
        return objInvoke == fcylVar ? fcylVar : objInvoke;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dakc(this.b, fcxyVar);
    }
}
