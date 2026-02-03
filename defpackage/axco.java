package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axco extends fcyz implements fdat {
    int a;
    final /* synthetic */ axcv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axco(axcv axcvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = axcvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axco) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        this.a = 1;
        basj basjVar = basj.EXECUTE_UPGRADE;
        return basjVar == fcylVar ? fcylVar : basjVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new axco(this.b, fcxyVar);
    }
}
