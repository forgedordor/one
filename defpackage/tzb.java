package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tzb extends fcyz implements fdat {
    int a;
    final /* synthetic */ tzc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzb(tzc tzcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = tzcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tzb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        tzc tzcVar = this.b;
        this.a = 1;
        if (tzcVar.a(this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tzb(this.b, fcxyVar);
    }
}
