package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cihq extends fcyz implements fdat {
    int a;
    final /* synthetic */ cihr b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cihq(cihr cihrVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cihrVar;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cihq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cihr cihrVar = this.b;
        cihp cihpVar = new cihp(this.c, null);
        this.a = 1;
        Object objA = cihrVar.a.a(cihpVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cihq(this.b, this.c, fcxyVar);
    }
}
