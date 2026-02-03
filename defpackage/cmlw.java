package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmlw extends fcyz implements fdat {
    int a;
    final /* synthetic */ cmlx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmlw(cmlx cmlxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cmlxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmlw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cmlx cmlxVar = this.b;
        this.a = 1;
        Object objA = cmlxVar.a(this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmlw(this.b, fcxyVar);
    }
}
