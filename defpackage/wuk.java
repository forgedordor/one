package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wuk extends fcyz implements fdat {
    int a;
    final /* synthetic */ wul b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wuk(wul wulVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wulVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wuk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            wul wulVar = this.b;
            fdpl fdplVarA = fdqq.a(new wuj(wulVar.c.a));
            wug wugVar = new wug(wulVar);
            this.a = 1;
            if (fdplVarA.a(wugVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wuk(this.b, fcxyVar);
    }
}
