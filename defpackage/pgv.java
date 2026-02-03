package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pgv extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdjc b;
    final /* synthetic */ fdat c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgv(fdjc fdjcVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdjcVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pgv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdjc fdjcVar;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fdjcVar = (fdjc) this.d;
            try {
                fctl.b(obj);
            } catch (Throwable th) {
                th = th;
                obj = fctl.a(th);
                fdje.b(fdjcVar, obj);
                return fctx.a;
            }
        } else {
            fctl.b(obj);
            fdjx fdjxVar = (fdjx) this.d;
            fdjc fdjcVar2 = this.b;
            fdat fdatVar = this.c;
            try {
                this.d = fdjcVar2;
                this.a = 1;
                obj = fdatVar.a(fdjxVar, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                fdjcVar = fdjcVar2;
            } catch (Throwable th2) {
                th = th2;
                fdjcVar = fdjcVar2;
                obj = fctl.a(th);
                fdje.b(fdjcVar, obj);
                return fctx.a;
            }
        }
        fdje.b(fdjcVar, obj);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        pgv pgvVar = new pgv(this.b, this.c, fcxyVar);
        pgvVar.d = obj;
        return pgvVar;
    }
}
