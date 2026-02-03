package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cprq extends fcyz implements fdat {
    int a;
    final /* synthetic */ cprr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cprq(cprr cprrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cprrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cprq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        cprr cprrVar = this.b;
        this.a = 1;
        if (cprrVar.c(this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cprq(this.b, fcxyVar);
    }
}
