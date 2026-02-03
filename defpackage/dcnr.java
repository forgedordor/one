package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcnr implements Runnable {
    private final Runnable a;

    public dcnr(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(0);
        this.a.run();
    }
}
