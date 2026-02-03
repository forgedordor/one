package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmfj extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmfj(ddp ddpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmfj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ddp ddpVar = this.b;
            Float f = new Float(0.0f);
            dia diaVarC = dea.c(BasePaymentResult.ERROR_REQUEST_FAILED, 0, new den(0.3f, 0.0f, 0.8f, 0.15f), 2);
            this.a = 1;
            if (ddp.k(ddpVar, f, diaVarC, null, this, 12) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmfj(this.b, fcxyVar);
    }
}
