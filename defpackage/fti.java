package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fti extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ddz d;
    final /* synthetic */ fdae e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fti(ddp ddpVar, boolean z, ddz ddzVar, fdae fdaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = z;
        this.d = ddzVar;
        this.e = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fti) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fti ftiVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            ftiVar = this;
        } else {
            ddp ddpVar = this.b;
            Float f = new Float(true != this.c ? 0.0f : 1.0f);
            ddz ddzVar = this.d;
            this.a = 1;
            ftiVar = this;
            if (ddp.k(ddpVar, f, ddzVar, null, ftiVar, 12) == fcylVar) {
                return fcylVar;
            }
        }
        ftiVar.e.invoke();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fti(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
