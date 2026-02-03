package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hit extends fcyz implements fdat {
    int a;
    final /* synthetic */ hiz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hit(hiz hizVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = hizVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hit) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        final hiz hizVar;
        ddp ddpVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0 && (ddpVar = (hizVar = this.b).n) != null) {
            Float f = new Float(((Number) ddpVar.d()).floatValue() + 1080.0f);
            dff dffVarA = gqs.a();
            fdap fdapVar = new fdap() { // from class: his
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    jbq.a(hizVar.r);
                    return fctx.a;
                }
            };
            this.a = 1;
            if (ddp.k(ddpVar, f, dffVarA, fdapVar, this, 4) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new hit(this.b, fcxyVar);
    }
}
