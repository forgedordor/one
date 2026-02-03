package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yhs extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ ahat c;
    final /* synthetic */ yhw d;
    final /* synthetic */ fdci e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhs(fdpl fdplVar, ahat ahatVar, yhw yhwVar, fdci fdciVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = ahatVar;
        this.d = yhwVar;
        this.e = fdciVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yhs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpl fdplVar = this.b;
            yhr yhrVar = new yhr(this.c, this.d, this.e);
            this.a = 1;
            if (fdplVar.a(yhrVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yhs(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
