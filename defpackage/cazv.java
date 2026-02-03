package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cazv extends fcyz implements fdat {
    final /* synthetic */ cazw a;
    final /* synthetic */ cbcu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cazv(cazw cazwVar, cbcu cbcuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cazwVar;
        this.b = cbcuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cazv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cbcu cbcuVar = this.b;
        ekgb ekgbVarR = ekgb.r(cbcuVar);
        ekgbVarR.getClass();
        Object obj2 = this.a.d(ekgbVarR).get(cbcuVar);
        obj2.getClass();
        return obj2;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cazv(this.a, this.b, fcxyVar);
    }
}
