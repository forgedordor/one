package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diwi extends fcyz implements fdat {
    int a;
    final /* synthetic */ diwl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public diwi(diwl diwlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = diwlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((diwi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dfu dfuVarA = dea.a(new fdap() { // from class: diwh
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    dft dftVar = (dft) obj2;
                    dftVar.a = 1700;
                    Float fValueOf = Float.valueOf(0.0f);
                    dftVar.a(fValueOf, 0);
                    Float fValueOf2 = Float.valueOf(0.95f);
                    dftVar.a(fValueOf2, BasePaymentResult.ERROR_REQUEST_FAILED);
                    dftVar.a(fValueOf2, 500);
                    dftVar.a(fValueOf, 700);
                    return fctx.a;
                }
            });
            diwl diwlVar = this.b;
            Float f = new Float(0.0f);
            dgf dgfVar = new dgf(2, dfuVarA, dgm.b(diwlVar.f));
            this.a = 1;
            if (ddp.k(diwlVar.e, f, dgfVar, null, this, 12) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new diwi(this.b, fcxyVar);
    }
}
