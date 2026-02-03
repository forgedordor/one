package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnwj extends fcyz implements fdap {
    int a;
    final /* synthetic */ dnwk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnwj(dnwk dnwkVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dnwkVar;
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
        fcyh fcyhVarHE = dnwkVar.b.hE();
        dnwi dnwiVar = new dnwi(dnwkVar, null);
        this.a = 1;
        Object objA = fdin.a(fcyhVarHE, dnwiVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dnwj(this.b, (fcxy) obj).b(fctx.a);
    }
}
