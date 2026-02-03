package defpackage;

import j$.util.Optional;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgqi implements dhho {
    public final dggy a;
    public final Optional b;
    private final Function c;

    public dgqi(dggy dggyVar, Optional optional, Function function) {
        this.a = dggyVar;
        this.b = optional;
        this.c = function;
    }

    @Override // defpackage.dhho
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        dgqj dgqjVar = (dgqj) obj;
        if (dgqjVar != null) {
            Optional optional = this.b;
            if (optional.isEmpty() || ((String) optional.get()).equals(dgqjVar.b())) {
                if (dgqjVar.a().isPresent() && ((dgiq) dgqjVar.a().get()).ab()) {
                    dgqjVar = (dgqj) this.c.apply(dgqjVar);
                }
                dggy dggyVar = this.a;
                dggyVar.gg(dgqjVar.b(), dgqjVar.a());
                ekrw ekrwVarH = dgqp.a.h();
                ekrwVarH.X(eksq.a, "RcsProvisioningManager");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager$ConfigurationObserver", "onUpdate", 1287, "RcsProvisioningManager.java")).I("Notify RcsConfigurationListener %s onRcsConfigurationUpdate, SIM = %s, hasConfiguration = %s", dggyVar, dhiz.SIM_ID.c(dgqjVar.b()), Boolean.valueOf(dgqjVar.a().isPresent()));
            }
        }
    }
}
