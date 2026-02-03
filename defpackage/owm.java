package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class owm extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdoa b;
    final /* synthetic */ fdat c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owm(fdoa fdoaVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdoaVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((owm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ows owsVar = new ows((fdjx) this.d, this.b);
            fdat fdatVar = this.c;
            this.a = 1;
            if (fdatVar.a(owsVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        owm owmVar = new owm(this.b, this.c, fcxyVar);
        owmVar.d = obj;
        return owmVar;
    }
}
