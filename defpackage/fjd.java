package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjd extends fcyz implements fdat {
    int a;
    final /* synthetic */ juo b;
    final /* synthetic */ jgu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjd(jgu jguVar, juo juoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = jguVar;
        this.b = juoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fjd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            jgu jguVar = this.c;
            jlf jlfVarA = ebp.a(this.b);
            this.a = 1;
            if (jguVar.b(jlfVarA) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fjd(this.c, this.b, fcxyVar);
    }
}
