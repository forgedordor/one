package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cobf extends fcyz implements fdat {
    int a;
    final /* synthetic */ cobl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cobf(cobl coblVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = coblVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cobf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cobl coblVar = this.b;
            this.a = 1;
            if (coblVar.f(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cobf(this.b, fcxyVar);
    }
}
