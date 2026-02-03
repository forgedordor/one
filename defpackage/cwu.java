package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwu extends fdbr implements fdat {
    final /* synthetic */ dhk a;
    final /* synthetic */ Object b;
    final /* synthetic */ fdap c;
    final /* synthetic */ cxg d;
    final /* synthetic */ iac e;
    final /* synthetic */ fdav f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwu(dhk dhkVar, Object obj, fdap fdapVar, cxg cxgVar, iac iacVar, fdav fdavVar) {
        super(2);
        this.a = dhkVar;
        this.b = obj;
        this.c = fdapVar;
        this.d = cxgVar;
        this.e = iacVar;
        this.f = fdavVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (hmlVar.J((iIntValue & 3) != 2, iIntValue & 1)) {
            fdap fdapVar = this.c;
            cxg cxgVar = this.d;
            Object objF = hmlVar.f();
            Object obj3 = hmk.a;
            if (objF == obj3) {
                objF = (cyt) fdapVar.invoke(cxgVar);
                hmlVar.y(objF);
            }
            dhk dhkVar = this.a;
            cyt cytVar = (cyt) objF;
            Object objB = dhkVar.d().b();
            Object obj4 = this.b;
            boolean zE = hmlVar.E(fdbq.f(objB, obj4));
            Object objF2 = hmlVar.f();
            if (zE || objF2 == obj3) {
                objF2 = fdbq.f(dhkVar.d().b(), obj4) ? dar.a : ((cyt) fdapVar.invoke(cxgVar)).b;
                hmlVar.y(objF2);
            }
            dar darVar = (dar) objF2;
            Object objF3 = hmlVar.f();
            if (objF3 == obj3) {
                objF3 = new cxb(fdbq.f(obj4, dhkVar.f()));
                hmlVar.y(objF3);
            }
            dap dapVar = cytVar.a;
            cxb cxbVar = (cxb) objF3;
            ico icoVar = ics.e;
            boolean zF = hmlVar.F(cytVar);
            Object objF4 = hmlVar.f();
            if (zF || objF4 == obj3) {
                objF4 = new cwo(cytVar);
                hmlVar.y(objF4);
            }
            ics icsVarA = iwl.a(icoVar, (fdau) objF4);
            cxbVar.a.b(Boolean.valueOf(fdbq.f(obj4, dhkVar.f())));
            ics icsVarA2 = icsVarA.a(cxbVar);
            boolean zF2 = hmlVar.F(obj4);
            Object objF5 = hmlVar.f();
            if (zF2 || objF5 == obj3) {
                objF5 = new cwp(obj4);
                hmlVar.y(objF5);
            }
            fdap fdapVar2 = (fdap) objF5;
            boolean zD = hmlVar.D(darVar);
            Object objF6 = hmlVar.f();
            if (zD || objF6 == obj3) {
                objF6 = new cwq(darVar);
                hmlVar.y(objF6);
            }
            cye.g(dhkVar, fdapVar2, icsVarA2, dapVar, darVar, (fdat) objF6, hxe.d(-143346359, new cwt(this.e, obj4, cxgVar, this.f), hmlVar), hmlVar, 12582912);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
