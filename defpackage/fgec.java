package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgec implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ fged b;

    public fgec(fged fgedVar, Runnable runnable) {
        this.a = runnable;
        this.b = fgedVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Thread.currentThread().setName("JavaCronetEngine");
        Process.setThreadPriority(this.b.a);
        this.a.run();
    }
}
