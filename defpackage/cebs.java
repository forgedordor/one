package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cebs implements cebp {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/RcsOnboardingFlagsConfigurationListener");
    private final fcsu b;

    public cebs(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cebp
    public final eiju a(ekgb ekgbVar) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        int size = ekgbVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            cebg cebgVar = (cebg) ekgbVar.get(i2);
            ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/RcsOnboardingFlagsConfigurationListener", "onNewConfig", 33, "RcsOnboardingFlagsConfigurationListener.java")).t("Rcs flags configuration id updated: %s", cebgVar.d());
            ekfwVar.h(((chtr) this.b.b()).f(cebgVar.b()));
        }
        return eijx.l(ekfwVar.g()).a(new Callable() { // from class: cebr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, eoqg.a);
    }
}
