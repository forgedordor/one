package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class own extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdoa b;
    final /* synthetic */ fdat c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public own(fdoa fdoaVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdoaVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((own) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                owm owmVar = new owm(this.b, this.c, null);
                this.a = 1;
                if (fdjy.a(owmVar, this) == fcylVar) {
                    return fcylVar;
                }
            }
            this.b.e(null);
        } catch (Throwable th) {
            this.b.e(th);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new own(this.b, this.c, fcxyVar);
    }
}
