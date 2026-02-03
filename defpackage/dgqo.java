package defpackage;

import j$.util.Optional;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgqo implements dhho {
    private final Function a;
    private final Function b;
    private final cmlb c;
    private final cjpk d;
    private final awtw e;

    public dgqo(awtw awtwVar, Function function, Function function2, cmlb cmlbVar, cjpk cjpkVar) {
        this.e = awtwVar;
        this.a = function;
        this.b = function2;
        this.c = cmlbVar;
        this.d = cjpkVar;
    }

    @Override // defpackage.dhho
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        dgqf dgqfVar = (dgqf) obj;
        if (dgqfVar == null) {
            return;
        }
        dgid dgidVarA = dgqfVar.a();
        if (!dgidVarA.c()) {
            ekrw ekrwVarH = dgqp.a.h();
            ekrwVarH.X(eksq.a, "RcsProvisioningManager");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager$RcsVerifiedPhoneNumberListenerAvailabilityObserver", "onUpdate", 1412, "RcsProvisioningManager.java")).t("Cannot notify RcsVerifiedPhoneNumberListener because current availability is %s instead of AVAILABLE.", dgidVarA.a.name());
            return;
        }
        dggp dggpVar = new dggp(dgqfVar.b());
        cmmh cmmhVar = (cmmh) this.c.j(dggpVar).orElse(null);
        if (cmmhVar == null) {
            ekrw ekrwVarJ = dgqp.a.j();
            ekrwVarJ.X(eksq.a, "RcsProvisioningManager");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager$RcsVerifiedPhoneNumberListenerAvailabilityObserver", "onUpdate", 1424, "RcsProvisioningManager.java")).t("No SimSubscriptionInfo for sim with id: %s", dhiz.SIM_ID.c(dgqfVar.b()));
            this.d.b(dggpVar);
            return;
        }
        Optional optionalFlatMap = ((Optional) this.b.apply(dgqfVar.b())).flatMap(this.a);
        if (optionalFlatMap.isEmpty()) {
            ekrw ekrwVarJ2 = dgqp.a.j();
            ekrwVarJ2.X(eksq.a, "RcsProvisioningManager");
            ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager$RcsVerifiedPhoneNumberListenerAvailabilityObserver", "onUpdate", 1436, "RcsProvisioningManager.java")).t("No verified phone number for sim with id: %s", dhiz.SIM_ID.c(dgqfVar.b()));
            this.d.a(dggpVar);
            return;
        }
        awtw awtwVar = this.e;
        dggk dggkVar = (dggk) optionalFlatMap.get();
        awuo awuoVar = (awuo) awtwVar.a.b();
        auvw.k(awuoVar.e, null, null, new awun(awuoVar, cmmhVar, dggkVar, null), 3);
    }
}
