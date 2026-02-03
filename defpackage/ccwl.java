package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccwl extends fcyz implements fdat {
    final /* synthetic */ ccwo a;
    final /* synthetic */ String b;
    final /* synthetic */ amrb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccwl(ccwo ccwoVar, String str, amrb amrbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ccwoVar;
        this.b = str;
        this.c = amrbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccwl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.a(this.b, this.c);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccwl(this.a, this.b, this.c, fcxyVar);
    }
}
