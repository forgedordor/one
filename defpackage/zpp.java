package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zpp extends fcyz implements fdat {
    int a;
    final /* synthetic */ zpw b;
    final /* synthetic */ fdpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpp(zpw zpwVar, fdpl fdplVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zpwVar;
        this.c = fdplVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zpp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            zpw zpwVar = this.b;
            fdpl fdplVar = this.c;
            zpj zpjVar = new zpj(zpwVar, null);
            fdpl fdplVarA = fdqq.a(new zpo(fdud.a(zpwVar.j, fdplVar, zpwVar.i.a, zpjVar)));
            zpl zplVar = new zpl(zpwVar);
            this.a = 1;
            if (fdplVarA.a(zplVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zpp(this.b, this.c, fcxyVar);
    }
}
