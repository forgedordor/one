package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fead extends feac {
    public final Runnable a;

    public fead(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        Runnable runnable = this.a;
        String strA = fdkc.a(runnable);
        String strB = fdkc.b(runnable);
        long j = this.g;
        boolean z = this.h;
        String str = feae.a;
        return "Task[" + strA + "@" + strB + ", " + j + ", " + (true != z ? "Non-blocking" : "Blocking") + "]";
    }
}
