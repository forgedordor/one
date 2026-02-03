package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvmo extends fcyz implements fdat {
    int a;
    final /* synthetic */ egbv b;
    final /* synthetic */ bvmp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvmo(egbv egbvVar, bvmp bvmpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = egbvVar;
        this.c = bvmpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvmo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarH = bvmp.a.h();
            ekrwVarH.X(eksq.a, "BugleGDitto");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaAccountCleanupInterceptor$cleanUpAccount$1", "invokeSuspend", 33, "GaiaAccountCleanupInterceptor.kt");
            egbv egbvVar = this.b;
            ekrdVar.t("Gaia cleanup account: accountId=%s", ((egdc) egbvVar).a);
            eiju eijuVarC = ((bvos) this.c.b.b()).c(egbvVar);
            this.a = 1;
            obj = fdxs.c(eijuVarC, this);
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        eiju eijuVarD = ((cdku) this.c.c.b()).d(cdjs.GSOS_UNINTENTIONALLY_SIGNED_OUT);
        this.a = 2;
        Object objC = fdxs.c(eijuVarD, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvmo(this.b, this.c, fcxyVar);
    }
}
