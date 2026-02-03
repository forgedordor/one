package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpri {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/cloudstore/CmsFeedbackLogger");

    public static final void a(String str) {
        ekrd ekrdVar = (ekrd) a.i();
        ekrdVar.Z(eksk.FULL);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsFeedbackLogger", "logCmsError", 32, "CmsFeedbackLogger.kt")).q(str);
    }

    public static final void b(String str, Throwable th) {
        th.getClass();
        ((ekrd) ((ekrd) a.i()).g(th).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsFeedbackLogger", "logCmsErrorWithThrowable", 22, "CmsFeedbackLogger.kt")).q(str);
    }

    public static final void c(String str, Throwable th) {
        th.getClass();
        ((ekrd) ((ekrd) a.j()).g(th).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsFeedbackLogger", "logCmsWarningWithThrowable", 43, "CmsFeedbackLogger.kt")).q(str);
    }
}
