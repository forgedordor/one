package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqju extends fcyz implements fdat {
    int a;
    final /* synthetic */ cqjy b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqju(fcxy fcxyVar, cqjy cqjyVar, int i) {
        super(2, fcxyVar);
        this.b = cqjyVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqju) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cqkx cqkxVar = (cqkx) this.b.f.b();
            int i2 = this.c;
            this.a = 1;
            if (cqkxVar.c(i2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cqju(fcxyVar, this.b, this.c);
    }
}
