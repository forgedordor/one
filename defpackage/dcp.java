package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcp extends fdbr implements fdau {
    final /* synthetic */ fdav a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcp(fdav fdavVar) {
        super(3);
        this.a = fdavVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ixd ixdVar = (ixd) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        Object objF = hmlVar.f();
        Object obj4 = hmk.a;
        if (objF == obj4) {
            objF = hob.a(fcyi.a, hmlVar);
            hmlVar.y(objF);
        }
        fdjx fdjxVar = (fdjx) objF;
        Object objF2 = hmlVar.f();
        if (objF2 == obj4) {
            objF2 = new dcf(ixdVar, fdjxVar);
            hmlVar.y(objF2);
        }
        fdav fdavVar = this.a;
        dcf dcfVar = (dcf) objF2;
        ico icoVar = ics.e;
        Object objF3 = hmlVar.f();
        if (objF3 == obj4) {
            objF3 = new dcl(dcfVar);
            hmlVar.y(objF3);
        }
        ics icsVarA = iwl.a(icoVar, (fdau) objF3);
        Object objF4 = hmlVar.f();
        if (objF4 == obj4) {
            objF4 = new dcm(dcfVar);
            hmlVar.y(objF4);
        }
        fdavVar.a(dcfVar, ifb.c(icsVarA, (fdap) objF4), hmlVar, 6);
        fctx fctxVar = fctx.a;
        Object objF5 = hmlVar.f();
        if (objF5 == obj4) {
            objF5 = new dco(dcfVar);
            hmlVar.y(objF5);
        }
        hob.c(fctxVar, (fdap) objF5, hmlVar);
        return fctxVar;
    }
}
