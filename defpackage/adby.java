package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adby extends fcyz implements fdat {
    /* synthetic */ boolean a;

    public adby(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((adby) c(bool, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (this.a) {
            ekrw ekrwVarH = adcg.a.h();
            ekrwVarH.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/home/satellite/SatelliteManualConnectionBanner$isEligibleFlow$2", "invokeSuspend", 57, "SatelliteManualConnectionBanner.kt")).q("SatelliteManualConnectionBanner is eligible");
        } else {
            ekrw ekrwVarE = adcg.a.e();
            ekrwVarE.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/home/satellite/SatelliteManualConnectionBanner$isEligibleFlow$2", "invokeSuspend", 59, "SatelliteManualConnectionBanner.kt")).q("SatelliteManualConnectionBanner is ineligible");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        adby adbyVar = new adby(fcxyVar);
        adbyVar.a = ((Boolean) obj).booleanValue();
        return adbyVar;
    }
}
