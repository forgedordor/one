package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class owp extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdat b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owp(fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((owp) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            owo owoVar = new owo((fdpm) this.c, this.b, null);
            this.a = 1;
            if (fdjy.a(owoVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        owp owpVar = new owp(this.b, fcxyVar);
        owpVar.c = obj;
        return owpVar;
    }
}
