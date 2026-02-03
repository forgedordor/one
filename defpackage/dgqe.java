package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgqe implements dhho {
    public final Optional a;
    private final dggv b;

    public dgqe(dggv dggvVar, Optional optional) {
        this.b = dggvVar;
        this.a = optional;
    }

    @Override // defpackage.dhho
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        dgqf dgqfVar = (dgqf) obj;
        if (dgqfVar != null) {
            dggv dggvVar = this.b;
            dggvVar.gf(dgqfVar.b(), dgqfVar.a());
            ekrw ekrwVarH = dgqp.a.h();
            ekrwVarH.X(eksq.a, "RcsProvisioningManager");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager$AvailabilityObserver", "onUpdate", 1332, "RcsProvisioningManager.java")).I("AvailabilityObserver.onUpdate : Notify RcsAvailabilityListener %s onRcsAvailabilityUpdate, SIM = %s, availability = %s", dggvVar, dhiz.SIM_ID.c(dgqfVar.b()), dgqfVar.a().a);
        }
    }
}
