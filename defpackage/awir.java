package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awir extends fcyz implements fdat {
    int a;
    final /* synthetic */ awiz b;
    final /* synthetic */ awjl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awir(awiz awizVar, awjl awjlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awizVar;
        this.c = awjlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awir) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        awiz awizVar = this.b;
        awjl awjlVar = this.c;
        this.a = 1;
        Object objE = awizVar.e(awjlVar, this);
        return objE == fcylVar ? fcylVar : objE;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awir(this.b, this.c, fcxyVar);
    }
}
