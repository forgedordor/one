package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnwd extends fcyz implements fdap {
    int a;
    final /* synthetic */ dnwk b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnwd(dnwk dnwkVar, String str, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dnwkVar;
        this.c = str;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dnwk dnwkVar = this.b;
        String str = this.c;
        fcyh fcyhVarHE = dnwkVar.b.hE();
        dnwc dnwcVar = new dnwc(dnwkVar, str, null);
        this.a = 1;
        Object objA = fdin.a(fcyhVarHE, dnwcVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dnwd(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
