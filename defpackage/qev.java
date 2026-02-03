package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qev extends fcyz implements fdat {
    int a;
    final /* synthetic */ qfa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qev(qfa qfaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = qfaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qev) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        qfa qfaVar = this.b;
        this.a = 1;
        Object objB = qfaVar.b(this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new qev(this.b, fcxyVar);
    }
}
