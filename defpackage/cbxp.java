package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbxp extends fcyz implements fdat {
    final /* synthetic */ cbyh a;
    final /* synthetic */ cbwd b;
    final /* synthetic */ List c;
    final /* synthetic */ evqs d;
    final /* synthetic */ enba e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbxp(fcxy fcxyVar, cbyh cbyhVar, cbwd cbwdVar, List list, evqs evqsVar, enba enbaVar) {
        super(2, fcxyVar);
        this.a = cbyhVar;
        this.b = cbwdVar;
        this.c = list;
        this.d = evqsVar;
        this.e = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbxp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.c.l(this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbxp cbxpVar = new cbxp(fcxyVar, this.a, this.b, this.c, this.d, this.e);
        cbxpVar.f = obj;
        return cbxpVar;
    }
}
