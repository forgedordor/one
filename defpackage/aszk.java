package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aszk implements eora {
    private final aubq a;

    public aszk(aubq aubqVar) {
        this.a = aubqVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String strB = cqcv.b(this.a.d);
        ekrw ekrwVarH = aszl.a.h();
        ekrwVarH.X(eksq.a, "BugleRcsCapabilities");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/onlinestatus/OnlineStatusLoggingInterceptor$LoggingCallback", "onSuccess", 58, "OnlineStatusLoggingInterceptor.java")).D("OnlineStatus %s returned for endpoint %s", ((aszo) obj).name(), strB);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
    }
}
