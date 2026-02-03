package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsnw extends fcyz implements fdat {
    int a;
    final /* synthetic */ dsoa b;
    final /* synthetic */ evje c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsnw(dsoa dsoaVar, evje evjeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dsoaVar;
        this.c = evjeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsnw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dsoa dsoaVar = this.b;
        evje evjeVar = this.c;
        this.a = 1;
        Object objD = dsoaVar.d(evjeVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsnw(this.b, this.c, fcxyVar);
    }
}
