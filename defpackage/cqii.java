package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqii extends fcyz implements fdat {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ cqik c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqii(boolean z, cqik cqikVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = z;
        this.c = cqikVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqii) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarH = cqik.a.h();
            ekrwVarH.X(eksq.a, "BugleConnectivity");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/connectivity/satellite/ManualSatelliteEligibilityTrackerImpl$notifyEligibilityChange$1", "invokeSuspend", 274, "ManualSatelliteEligibilityTrackerImpl.kt");
            boolean z = this.b;
            ekrdVar.t("Notifying listeners of manual satellite eligibility change: %b", Boolean.valueOf(z));
            cqik cqikVar = this.c;
            cqia cqiaVar = z ? cqia.a : cqia.b;
            fduf fdufVar = cqikVar.f;
            this.a = 1;
            if (fdufVar.fO(cqiaVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cqii(this.b, this.c, fcxyVar);
    }
}
