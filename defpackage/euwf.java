package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Log;
import java.lang.Thread;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euwf {
    public euwe a;
    public Throwable b = null;

    public euwf(EGLContext eGLContext) {
        euwe euweVar = new euwe(eGLContext);
        this.a = euweVar;
        euweVar.setName("ExternalTextureConverter");
        final Object obj = new Object();
        this.a.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: euvz
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                euwf euwfVar = this.a;
                Object obj2 = obj;
                synchronized (obj2) {
                    euwfVar.b = th;
                    obj2.notify();
                }
            }
        });
        this.a.start();
        try {
            if (!this.a.k()) {
                synchronized (obj) {
                    while (this.b == null) {
                        obj.wait();
                    }
                }
            }
            this.a.setUncaughtExceptionHandler(null);
            if (this.b == null) {
                return;
            }
            this.a.l();
            throw new RuntimeException(this.b);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.e("ExternalTextureConv", "thread was unexpectedly interrupted: ".concat(String.valueOf(e.getMessage())));
            throw new RuntimeException(e);
        }
    }

    public final void a(euwj euwjVar) {
        List list = this.a.c;
        synchronized (list) {
            list.clear();
            list.add(euwjVar);
        }
    }

    public final void b(final SurfaceTexture surfaceTexture, final int i, final int i2) {
        if (surfaceTexture != null && (i == 0 || i2 == 0)) {
            throw new RuntimeException("ExternalTextureConverter: setSurfaceTexture dimensions cannot be zero");
        }
        this.a.q.post(new Runnable() { // from class: euvy
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.f(surfaceTexture, i, i2);
            }
        });
    }
}
