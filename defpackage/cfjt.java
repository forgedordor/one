package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfjt extends fcyz implements fdat {
    int a;
    final /* synthetic */ cfjs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfjt(cfjs cfjsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cfjsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfjt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = ((bvll) this.b.e.b()).b();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            ((ains) this.b.f.b()).e("Bugle.Gaia.Pairing.Can.Device.Register.Failure.Count", 4);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfjt(this.b, fcxyVar);
    }
}
