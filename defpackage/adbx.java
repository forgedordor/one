package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adbx extends fcyz implements fdat {
    int a;
    final /* synthetic */ adcg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adbx(adcg adcgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = adcgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adbx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        adcg adcgVar = this.b;
        this.a = 1;
        Object objA = fdtc.a(adcgVar.i, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new adbx(this.b, fcxyVar);
    }
}
