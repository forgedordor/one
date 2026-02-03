package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dghg extends fcyz implements fdat {
    final /* synthetic */ dghi a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dghg(fcxy fcxyVar, dghi dghiVar, String str) {
        super(2, fcxyVar);
        this.a = dghiVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dghg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return fdct.b(((dgrs) this.a.c.b()).j(this.b));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dghg dghgVar = new dghg(fcxyVar, this.a, this.b);
        dghgVar.c = obj;
        return dghgVar;
    }
}
