package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceao {
    private final fcsu a;
    private final eigp b;

    public ceao(fcsu fcsuVar, eigp eigpVar) {
        this.a = fcsuVar;
        this.b = eigpVar;
    }

    public final void a(ewzw ewzwVar) {
        if (((Boolean) dfpi.t().a.U.a()).booleanValue()) {
            eieh eiehVarC = this.b.c("BugleMobileConfigurationLogger#logMobileConfigurationEvent", "com/google/android/apps/messaging/shared/mobileconfiguration/BugleMobileConfigurationLogger", "logMobileConfigurationEvent", 39);
            try {
                aill aillVar = (aill) this.a.b();
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.BUGLE_MOBILE_CONFIGURATION_CLIENT_EVENT;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                ellhVar.b |= 1;
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                ewzwVar.getClass();
                ellhVar2.bt = ewzwVar;
                ellhVar2.g |= 4;
                aillVar.j(ellgVar);
                eiehVarC.close();
            } catch (Throwable th) {
                try {
                    eiehVarC.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
