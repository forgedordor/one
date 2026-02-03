package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmro {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/sms/TelephonyRetryWrapperInterfaceImpl");

    public static final Optional b(fdae fdaeVar, fdap fdapVar) {
        try {
            return Optional.ofNullable(fdaeVar.invoke());
        } catch (Exception e) {
            return (Optional) fdapVar.invoke(e);
        }
    }

    public final Optional a(final fdae fdaeVar) {
        return b(fdaeVar, new fdap() { // from class: cmrn
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Exception exc = (Exception) obj;
                exc.getClass();
                ((ekrd) ((ekrd) cmro.a.j()).g(exc).h("com/google/android/apps/messaging/shared/sms/TelephonyRetryWrapperInterfaceImpl", "telephonyCallWithRetry$lambda$1", 25, "TelephonyRetryWrapperInterfaceImpl.kt")).q("Initial Telephony call failed. Attempting retry");
                return cmro.b(fdaeVar, new fdap() { // from class: cmrm
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        Exception exc2 = (Exception) obj2;
                        exc2.getClass();
                        ((ekrd) ((ekrd) cmro.a.j()).g(exc2).h("com/google/android/apps/messaging/shared/sms/TelephonyRetryWrapperInterfaceImpl", "telephonyCallWithRetry$lambda$1$lambda$0", 28, "TelephonyRetryWrapperInterfaceImpl.kt")).q("Retry failed. Returning empty optional");
                        return Optional.empty();
                    }
                });
            }
        });
    }
}
