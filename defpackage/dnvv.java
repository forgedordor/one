package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnvv extends fcyz implements fdap {
    int a;
    final /* synthetic */ dnwk b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ dnvg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnvv(dnwk dnwkVar, String str, String str2, dnvg dnvgVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dnwkVar;
        this.c = str;
        this.d = str2;
        this.e = dnvgVar;
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
        String str2 = this.d;
        dnvg dnvgVar = this.e;
        fcyh fcyhVarHE = dnwkVar.b.hE();
        dnvu dnvuVar = new dnvu(dnwkVar, str, str2, dnvgVar, null);
        this.a = 1;
        Object objA = fdin.a(fcyhVarHE, dnvuVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dnvv(this.b, this.c, this.d, this.e, (fcxy) obj).b(fctx.a);
    }
}
