package defpackage;

import android.os.Process;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpa implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        Thread thread = new Thread(new Runnable() { // from class: boz
            @Override // java.lang.Runnable
            public final void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(-16);
                runnable.run();
            }
        });
        thread.setName(String.format(Locale.US, "CameraX-camerax_audio_%d", Integer.valueOf(this.a.getAndIncrement())));
        return thread;
    }
}
