package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crwe extends fcyz implements fdat {
    final /* synthetic */ crwg a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crwe(crwg crwgVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = crwgVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crwe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ains) this.a.b.b()).c(this.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crwe(this.a, this.b, fcxyVar);
    }
}
