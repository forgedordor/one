package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class drk extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdat b;
    final /* synthetic */ Object c;
    final /* synthetic */ fdjx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drk(fdat fdatVar, Object obj, fdjx fdjxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdatVar;
        this.c = obj;
        this.d = fdjxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdat fdatVar = this.b;
            Object obj2 = this.c;
            this.a = 1;
            if (fdatVar.a(obj2, this) == fcylVar) {
                return fcylVar;
            }
        }
        fdjy.e(this.d, new dra());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new drk(this.b, this.c, this.d, fcxyVar);
    }
}
