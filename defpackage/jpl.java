package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jpl extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdvc b;
    final /* synthetic */ jnp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpl(fdvc fdvcVar, jnp jnpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdvcVar;
        this.c = jnpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jpl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdvc fdvcVar = this.b;
            jpk jpkVar = new jpk(this.c);
            this.a = 1;
            if (fdvcVar.a(jpkVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new jpl(this.b, this.c, fcxyVar);
    }
}
