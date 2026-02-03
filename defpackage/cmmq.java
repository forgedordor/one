package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmmq {
    private static final eksp a = eksp.c("BugleBCM");

    public final void a(cmmp cmmpVar) {
        if (!((Boolean) avos.a.e()).booleanValue() || cmmpVar.a()) {
            return;
        }
        if (((Boolean) avos.f.e()).booleanValue()) {
            eksl ekslVar = (eksl) a.i();
            ekslVar.Z(eksk.FULL);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/sms/CallerApiAccessChecker", "checkApiAccess", 30, "CallerApiAccessChecker.java")).q("BCM is used, but legacy access to telephony was performed.");
            throw new cmmr();
        }
        eksl ekslVar2 = (eksl) a.i();
        ekslVar2.Z(eksk.FULL);
        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/sms/CallerApiAccessChecker", "checkApiAccess", 36, "CallerApiAccessChecker.java")).q("BCM is used, but legacy access to telephony was performed. Calling getOrCreateThreadId when BCM is used is not allowed");
    }
}
