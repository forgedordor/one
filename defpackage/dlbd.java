package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlbd extends fcyz implements fdat {
    int a;
    final /* synthetic */ ejy b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlbd(ejy ejyVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ejyVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlbd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ejy ejyVar = this.b;
            int i2 = this.c;
            this.a = 1;
            if (ejy.n(ejyVar, i2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlbd(this.b, this.c, fcxyVar);
    }
}
