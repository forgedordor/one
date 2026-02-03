package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aojt extends fcyz implements fdat {
    int a;
    final /* synthetic */ aojv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aojt(aojv aojvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aojvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aojt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        if (i != 0) {
            fctl.b(obj);
            if (i == 1) {
                throw new fcta();
            }
        } else {
            fctl.b(obj);
            ekrw ekrwVarH = aojv.a.h();
            ekrwVarH.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/satellite/eligibility/SatelliteConnectionEligibilityObservableSupplier$getTrackerCallback$1$onFirstRegister$1", "invokeSuspend", 93, "SatelliteConnectionEligibilityObservableSupplier.kt")).q("Starting conversation satellite connection change listener");
            aojv aojvVar = this.b;
            cliy cliyVar = aojvVar.c;
            cliyVar.i();
            fdvc fdvcVarH = cliyVar.h();
            aojs aojsVar = new aojs(aojvVar);
            this.a = 2;
            if (fdvcVarH.a(aojsVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aojt(this.b, fcxyVar);
    }
}
