package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dgpe implements Function {
    public final /* synthetic */ dgqp a;

    public /* synthetic */ dgpe(dgqp dgqpVar) {
        this.a = dgqpVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        dgqj dgqjVar = (dgqj) obj;
        Optional optionalOfNullable = Optional.ofNullable(dgqjVar.b());
        Optional optionalA = dgqjVar.a();
        dgqp dgqpVar = this.a;
        String str = (String) optionalOfNullable.orElse(((dhes) dgqpVar.c.b()).l());
        ekrg ekrgVar = dgqp.a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "RcsProvisioningManager");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "combineConfigurationWithAvailability", 651, "RcsProvisioningManager.java")).E("combineConfigurationWithAvailability, simId = %s, hasConfig = %s", dhiz.SIM_ID.c(str), optionalA.isPresent());
        Optional optionalM = dgqpVar.m(str);
        if (optionalM.isEmpty()) {
            return new dgou(str, optionalA);
        }
        dgid dgidVarA = ((ckgw) optionalM.get()).a(str);
        if (dgidVarA.c()) {
            if (optionalA.isEmpty()) {
                ekrw ekrwVarH2 = ekrgVar.h();
                ekrwVarH2.X(ekrzVar, "RcsProvisioningManager");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "combineConfigurationWithAvailability", 664, "RcsProvisioningManager.java")).q("combineConfigurationWithAvailability, optionalConfiguration is not present, get config from ProvisioningEngineAdapter");
                optionalA = ((ckgw) optionalM.get()).b(str);
            }
            if (optionalA.isPresent() && ((dgiq) optionalA.get()).ab()) {
                return new dgou(str, optionalA);
            }
            ekrw ekrwVarJ = ekrgVar.j();
            ekrwVarJ.X(ekrzVar, "RcsProvisioningManager");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "combineConfigurationWithAvailability", 674, "RcsProvisioningManager.java")).q("combineConfigurationWithAvailability, RCS is available but configuration is not valid, return empty configuration");
        } else {
            ekrw ekrwVarJ2 = ekrgVar.j();
            ekrwVarJ2.X(ekrzVar, "RcsProvisioningManager");
            ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager", "combineConfigurationWithAvailability", 678, "RcsProvisioningManager.java")).t("combineConfigurationWithAvailability, RCS is not available (%s), return empty configuration", dgidVarA);
        }
        return new dgou(str, Optional.empty());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
