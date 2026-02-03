package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnsc extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnsd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnsc(dnsd dnsdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnsdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnsc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dnsd dnsdVar = this.b;
        this.a = 1;
        Object objB = dnsdVar.a.b(18, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnsc(this.b, fcxyVar);
    }
}
