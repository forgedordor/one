package org.chromium.base;

import android.os.Handler;
import android.os.HandlerThread;
import defpackage.ffxy;
import defpackage.ffxz;
import defpackage.ffya;
import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class JavaHandlerThread {
    public final HandlerThread a;
    public Throwable b;

    public JavaHandlerThread(String str, int i) {
        this.a = new HandlerThread(str, i);
    }

    private static JavaHandlerThread create(String str, int i) {
        return new JavaHandlerThread(str, i);
    }

    private final Throwable getUncaughtExceptionIfAny() {
        return this.b;
    }

    private final boolean isAlive() {
        return this.a.isAlive();
    }

    private final void joinThread() {
        boolean z = false;
        while (!z) {
            try {
                this.a.join();
                z = true;
            } catch (InterruptedException unused) {
            }
        }
    }

    private final void listenForUncaughtExceptionsForTesting() {
        this.a.setUncaughtExceptionHandler(new ffya(this));
    }

    private final void quitThreadSafely(long j) {
        HandlerThread handlerThread = this.a;
        new Handler(handlerThread.getLooper()).post(new ffxz(this, j));
        handlerThread.getLooper().quitSafely();
    }

    private final void startAndInitialize(long j, long j2) {
        HandlerThread handlerThread = this.a;
        if (handlerThread.getState() == Thread.State.NEW) {
            handlerThread.start();
        }
        new Handler(handlerThread.getLooper()).post(new ffxy(j, j2));
    }
}
