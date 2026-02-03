package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjza extends fcyz implements fdat {
    int a;
    final /* synthetic */ dggn b;
    final /* synthetic */ cjzf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjza(dggn dggnVar, cjzf cjzfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dggnVar;
        this.c = cjzfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjza) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        ekrd ekrdVar = (ekrd) cjzf.a.e().h("com/google/android/apps/messaging/shared/rcsdata/carriertos/CarrierTosDataServiceImpl$resetCarrierTosConsentForRcsProvisioningIdFuture$1", "invokeSuspend", 327, "CarrierTosDataServiceImpl.kt");
        dggn dggnVar = this.b;
        ekrdVar.t("Resetting explicit carrier tos consent for simId: %s", cjyp.a(dggnVar));
        cjzf cjzfVar = this.c;
        this.a = 1;
        if (cjzfVar.o(dggnVar, this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cjza(this.b, this.c, fcxyVar);
    }
}
