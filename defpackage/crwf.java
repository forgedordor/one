package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crwf extends fcyz implements fdat {
    final /* synthetic */ crwg a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crwf(crwg crwgVar, String str, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = crwgVar;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crwf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ains) this.a.b.b()).e(this.b, this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crwf(this.a, this.b, this.c, fcxyVar);
    }
}
