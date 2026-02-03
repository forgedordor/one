package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzao extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzao(bzap bzapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bzapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzao) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                bzap bzapVar = this.b;
                this.a = 1;
                if (bzapVar.d(this) == fcylVar) {
                    return fcylVar;
                }
            }
        } catch (Exception e) {
            ekrw ekrwVarJ = bzap.a.j();
            ekrwVarJ.X(eksq.a, "BugleCms");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsZeroKeyRecoveryHelper$updateZeroKeyMessagesInCmsAsync$1", "invokeSuspend", 77, "CmsZeroKeyRecoveryHelper.kt")).q("Failed to re-encrypt and update messages.");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzao(this.b, fcxyVar);
    }
}
