package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aghd extends fcyz implements fdat {
    int a;
    final /* synthetic */ aghe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghd(aghe agheVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = agheVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aghd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aghe agheVar = this.b;
            this.a = 1;
            if (agheVar.b(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aghd(this.b, fcxyVar);
    }
}
