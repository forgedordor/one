package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwt extends fdbr implements fdau {
    final /* synthetic */ iac a;
    final /* synthetic */ Object b;
    final /* synthetic */ cxg c;
    final /* synthetic */ fdav d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwt(iac iacVar, Object obj, cxg cxgVar, fdav fdavVar) {
        super(3);
        this.a = iacVar;
        this.b = obj;
        this.c = cxgVar;
        this.d = fdavVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cyg cygVar = (cyg) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != ((iIntValue & 8) == 0 ? hmlVar.D(cygVar) : hmlVar.F(cygVar)) ? 2 : 4;
        }
        if (hmlVar.J((iIntValue & 19) != 18, iIntValue & 1)) {
            iac iacVar = this.a;
            boolean zD = hmlVar.D(iacVar);
            Object obj4 = this.b;
            boolean zF = zD | hmlVar.F(obj4);
            cxg cxgVar = this.c;
            boolean zF2 = zF | hmlVar.F(cxgVar);
            Object objF = hmlVar.f();
            if (zF2 || objF == hmk.a) {
                objF = new cws(iacVar, obj4, cxgVar);
                hmlVar.y(objF);
            }
            hob.c(cygVar, (fdap) objF, hmlVar);
            cuz cuzVar = cxgVar.d;
            cygVar.getClass();
            cuzVar.e(obj4, ((cyh) cygVar).b);
            Object objF2 = hmlVar.f();
            if (objF2 == hmk.a) {
                objF2 = new cxa(cygVar);
                hmlVar.y(objF2);
            }
            this.d.a((cxa) objF2, obj4, hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
