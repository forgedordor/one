package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class capw extends fcyz implements fdat {
    int a;
    final /* synthetic */ capx b;
    final /* synthetic */ eqng c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public capw(capx capxVar, eqng eqngVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = capxVar;
        this.c = eqngVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((capw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        capx capxVar = this.b;
        eqng eqngVar = this.c;
        this.a = 1;
        int iA = capxVar.a.a();
        capy capyVar = (capy) capz.a.createBuilder();
        capyVar.getClass();
        caqa.b(iA, capyVar);
        String str = eqngVar.c;
        str.getClass();
        caqa.c(str, capyVar);
        caqa.d(eqngVar.d, capyVar);
        caqa.f(capyVar);
        evtg evtgVar = eqngVar.f;
        evtgVar.getClass();
        caqa.e(evtgVar, capyVar);
        capz capzVarA = caqa.a(capyVar);
        caxr caxrVar = new caxr();
        caxrVar.a = eqngVar.c;
        Object objC = fdxs.c(((cazj) capxVar.b.a.b()).b(cbcu.g("remove_to_be_delivered_label", capzVarA, caxrVar.a())), this);
        if (objC != obj2) {
            objC = fctx.a;
        }
        if (objC == obj2) {
            return obj2;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new capw(this.b, this.c, fcxyVar);
    }
}
