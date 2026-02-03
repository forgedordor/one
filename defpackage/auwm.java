package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auwm {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/concurrent/SafeCancellableContinuation");
    private final fdis b;

    public auwm(fdis fdisVar) {
        this.b = fdisVar;
    }

    public final void a(fdap fdapVar) {
        this.b.d(fdapVar);
    }

    public final void b(Object obj) {
        fdis fdisVar = this.b;
        if (!fdisVar.i()) {
            ekrd ekrdVar = (ekrd) a.f();
            ekrdVar.Z(eksk.SMALL);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/concurrent/SafeCancellableContinuation", "safeResume", 58, "SafeCancellableContinuation.kt")).t("Skipped resuming continuation because continuation is not active; isCancelled %b", Boolean.valueOf(this.b.j()));
        } else {
            try {
                fdisVar.w(obj);
            } catch (IllegalStateException e) {
                ekrd ekrdVar2 = (ekrd) a.j();
                ekrdVar2.Z(eksk.SMALL);
                ((ekrd) ekrdVar2.g(e).h("com/google/android/apps/messaging/shared/concurrent/SafeCancellableContinuation", "safeResume", 52, "SafeCancellableContinuation.kt")).q("Failed to resume continuation");
            }
        }
    }
}
