package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agip extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ ahat c;
    final /* synthetic */ agiu d;
    final /* synthetic */ fduf e;
    final /* synthetic */ fduf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agip(fdpl fdplVar, ahat ahatVar, agiu agiuVar, fduf fdufVar, fduf fdufVar2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = ahatVar;
        this.d = agiuVar;
        this.e = fdufVar;
        this.f = fdufVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agip) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpl fdplVar = this.b;
            agio agioVar = new agio(this.c, this.d, this.e, this.f);
            this.a = 1;
            if (fdplVar.a(agioVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agip(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
