package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aojs implements fdpm {
    final /* synthetic */ aojv a;

    public aojs(aojv aojvVar) {
        this.a = aojvVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        cljh cljhVar = (cljh) obj;
        ekrw ekrwVarH = aojv.a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/satellite/eligibility/SatelliteConnectionEligibilityObservableSupplier$getTrackerCallback$1$onFirstRegister$1$2", "emit", 99, "SatelliteConnectionEligibilityObservableSupplier.kt")).t("Received satellite connection state: %s", cljhVar);
        aojv aojvVar = this.a;
        aojvVar.f().set(aojv.g(cljhVar));
        aojvVar.e().c(new Supplier() { // from class: aojo
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "SatelliteConnectionEligibilityObservableSupplier::Notify");
        return fctx.a;
    }
}
