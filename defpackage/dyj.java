package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyj extends fcyz implements fdat {
    int a;
    final /* synthetic */ dyk b;
    final /* synthetic */ fdat c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyj(dyk dykVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dykVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dyj) c((dwy) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dwy dwyVar = (dwy) this.d;
            dyk dykVar = this.b;
            dykVar.j = dwyVar;
            fdat fdatVar = this.c;
            this.a = 1;
            if (fdatVar.a(dykVar.k, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dyj dyjVar = new dyj(this.b, this.c, fcxyVar);
        dyjVar.d = obj;
        return dyjVar;
    }
}
