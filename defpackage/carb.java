package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class carb extends fcyz implements fdat {
    int a;
    final /* synthetic */ carc b;
    final /* synthetic */ carg c;
    final /* synthetic */ Exception d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public carb(carc carcVar, carg cargVar, Exception exc, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = carcVar;
        this.c = cargVar;
        this.d = exc;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((carb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            carc carcVar = this.b;
            carg cargVar = this.c;
            Exception exc = this.d;
            this.a = 1;
            if (carcVar.b(cargVar, exc, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new carb(this.b, this.c, this.d, fcxyVar);
    }
}
