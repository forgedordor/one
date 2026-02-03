package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class criy extends fcyz implements fdat {
    final /* synthetic */ criz a;
    final /* synthetic */ ekgb b;
    final /* synthetic */ ezai c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public criy(criz crizVar, ekgb ekgbVar, ezai ezaiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = crizVar;
        this.b = ekgbVar;
        this.c = ezaiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((criy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekgb ekgbVar = this.b;
        ekgbVar.getClass();
        this.a.p(ekgbVar, this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new criy(this.a, this.b, this.c, fcxyVar);
    }
}
