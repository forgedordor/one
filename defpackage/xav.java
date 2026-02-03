package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xav extends fcyz implements fdat {
    final /* synthetic */ xax a;
    final /* synthetic */ fhaz b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xav(fcxy fcxyVar, xax xaxVar, fhaz fhazVar) {
        super(2, fcxyVar);
        this.a = xaxVar;
        this.b = fhazVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xav) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fhaz fhazVar = this.b;
        fhazVar.getClass();
        fhazVar.getClass();
        ecem.c();
        zue zueVar = this.a.h;
        zueVar.a.g(cmxm.SEND_BUTTON_ACCURATE, fhazVar.b);
        zueVar.c.a(194898, null);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        xav xavVar = new xav(fcxyVar, this.a, this.b);
        xavVar.c = obj;
        return xavVar;
    }
}
