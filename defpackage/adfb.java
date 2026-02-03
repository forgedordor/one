package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adfb extends fcyz implements fdat {
    int a;
    final /* synthetic */ adfc b;
    final /* synthetic */ adel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adfb(adfc adfcVar, adel adelVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = adfcVar;
        this.c = adelVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adfb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            adfc adfcVar = this.b;
            this.a = 1;
            obj = ((adfk) adfcVar.b).b.a(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        adel adelVar = this.c;
        adfc adfcVar2 = this.b;
        egbs egbsVar = (egbs) obj;
        adej adejVar = (adej) adelVar;
        ((adem) adejVar.c()).c.setText(egbsVar.g);
        ((adem) adejVar.c()).b.setText(egbsVar.d);
        ((adfk) adfcVar2.b).c.e(new egjt(egbsVar)).v(((adem) adejVar.c()).d);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new adfb(this.b, this.c, fcxyVar);
    }
}
