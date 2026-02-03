package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctdb extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctdg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctdb(ctdg ctdgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctdgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctdb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ctdg ctdgVar = this.b;
            fdap fdapVar = new fdap() { // from class: ctda
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    ctck ctckVar = (ctck) ((ctcl) obj2).toBuilder();
                    ctckVar.clear();
                    evsn evsnVarBuild = ctckVar.build();
                    evsnVarBuild.getClass();
                    return (ctcl) evsnVarBuild;
                }
            };
            this.a = 1;
            if (ctdgVar.a.d(fdapVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctdb(this.b, fcxyVar);
    }
}
