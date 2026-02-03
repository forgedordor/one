package defpackage;

import internal.J.N;
import org.chromium.base.JavaHandlerThread;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffxz implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ JavaHandlerThread b;

    public ffxz(JavaHandlerThread javaHandlerThread, long j) {
        this.a = j;
        this.b = javaHandlerThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.quit();
        N.MYwg$x8E(this.a);
    }
}
