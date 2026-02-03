package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dxr extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdat b;
    final /* synthetic */ dyk c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxr(fdat fdatVar, dyk dykVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdatVar;
        this.c = dykVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxr) c((dyh) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final dyh dyhVar = (dyh) this.d;
            fdat fdatVar = this.b;
            final dyk dykVar = this.c;
            fdap fdapVar = new fdap() { // from class: dxq
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    dyhVar.a(dykVar.f(((dtf) obj2).a), 1);
                    return fctx.a;
                }
            };
            this.a = 1;
            if (fdatVar.a(fdapVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dxr dxrVar = new dxr(this.b, this.c, fcxyVar);
        dxrVar.d = obj;
        return dxrVar;
    }
}
