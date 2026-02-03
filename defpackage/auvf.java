package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auvf implements eora {
    private final String c;
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/concurrent/CrashOnUnexpectedExceptionFutureCallback$EmptyLoggingCallbackNoParent");
    public static final auvf a = new auvf("Unexpected error in fire&forget future");

    public auvf(String str) {
        this.c = str;
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((ekrd) ((ekrd) ((ekrd) b.j()).g(th)).h("com/google/android/apps/messaging/shared/concurrent/CrashOnUnexpectedExceptionFutureCallback$EmptyLoggingCallbackNoParent", "onFailure", 210, "CrashOnUnexpectedExceptionFutureCallback.java")).q(this.c);
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
    }
}
