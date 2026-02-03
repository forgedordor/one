package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hiv extends fcyz implements fdat {
    int a;
    final /* synthetic */ hiz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hiv(hiz hizVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = hizVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hiv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        final hiz hizVar;
        ddp ddpVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0 && (ddpVar = (hizVar = this.b).o) != null) {
            Float f = new Float(((Number) ddpVar.d()).floatValue() + 360.0f);
            dff dffVarC = gqs.c();
            fdap fdapVar = new fdap() { // from class: hiu
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    jbq.a(hizVar.r);
                    return fctx.a;
                }
            };
            this.a = 1;
            if (ddp.k(ddpVar, f, dffVarC, fdapVar, this, 4) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new hiv(this.b, fcxyVar);
    }
}
