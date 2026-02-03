package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class divx extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ der c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public divx(ddp ddpVar, der derVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = derVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((divx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ddp ddpVar = this.b;
            Float f = new Float(9.424778f);
            dgf dgfVar = new dgf(3, this.c, dgm.b(BasePaymentResult.ERROR_REQUEST_FAILED));
            this.a = 1;
            if (ddp.k(ddpVar, f, dgfVar, null, this, 12) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new divx(this.b, this.c, fcxyVar);
    }
}
