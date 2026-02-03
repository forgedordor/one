package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekvm extends ekvr {
    final /* synthetic */ ekvo a;

    public ekvm(ekvo ekvoVar) {
        this.a = ekvoVar;
    }

    @Override // defpackage.ekvr
    public final ekvt a() {
        ekvo ekvoVar = this.a;
        if (ekvoVar.a.compareAndSet(false, true)) {
            ekqy ekqyVar = (ekqy) ekvn.a.j();
            ekqyVar.Z(eksk.SMALL);
            ((ekqy) ekqyVar.h("com/google/common/flogger/context/NoOpContextDataProvider$NoOpScopedLoggingContext", "logWarningOnceOnly", 55, "NoOpContextDataProvider.java")).q("Scoped logging contexts are disabled; no context data provider was installed.\nTo enable scoped logging contexts in your application, see the site-specific Platform class used to configure logging behaviour.\nDefault Platform: com.google.common.flogger.backend.system.DefaultPlatform");
        }
        return ekvoVar;
    }
}
