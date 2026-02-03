package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aswh implements eora {
    private final aubq a;

    public aswh(aubq aubqVar) {
        this.a = aubqVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        asts astsVar = (asts) obj;
        ekrw ekrwVarH = aswi.a.h();
        ekrwVarH.X(eksq.a, "BugleRcsCapabilities");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CapabilitiesLoggingInterceptor$LoggingCallback", "onSuccess", 73, "CapabilitiesLoggingInterceptor.java")).I("Returned %d capabilities for endpoint %s with timestamp %d", Integer.valueOf(astsVar.a().b.size()), cqcv.b(this.a.d), Long.valueOf(astsVar.b().toEpochMilli()));
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
    }
}
