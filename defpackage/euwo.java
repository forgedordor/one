package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import com.google.mediapipe.framework.TextureFrame;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euwo implements euwj {
    public static final String a = "euwo";
    public int b;
    public int c;
    public int d;
    public boolean e;
    public euxt f;
    public euxy g;
    public Surface h;
    public EGLSurface i;
    public euxq j;
    public final euxw k;
    public boolean l;
    public final Object m;
    public final ExecutorService n;
    public int o;
    private final Object p;

    public euwo(Object obj) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(3);
        this.m = new Object();
        this.o = 0;
        this.p = obj;
        this.k = new euxw();
        this.n = executorServiceNewFixedThreadPool;
    }

    private final synchronized void d() {
        if (this.f != null) {
            return;
        }
        euxt euxtVar = new euxt(this.p, new int[]{12610, 1, 12344});
        this.f = euxtVar;
        euxtVar.setName("TextureFrameRecorder");
        this.f.start();
        try {
            this.f.k();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.e(a, "Recording thread was interrupted: ".concat(String.valueOf(Log.getStackTraceString(e))));
            throw new RuntimeException(e);
        }
    }

    private final synchronized void e() {
        euxt euxtVar = this.f;
        if (euxtVar == null) {
            return;
        }
        euxtVar.l();
        try {
            this.f.join();
            this.f = null;
        } catch (InterruptedException e) {
            Log.d(a, "Recording thread was interrupted: ".concat(String.valueOf(Log.getStackTraceString(e))));
        }
    }

    public final synchronized void b() {
        euxt euxtVar;
        if (this.e && (euxtVar = this.f) != null) {
            euxtVar.q.post(new Runnable() { // from class: euwl
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.k.a();
                }
            });
            this.e = false;
            this.i = null;
            this.h = null;
            this.j = null;
            e();
        }
    }

    public final synchronized void c() {
        this.g.getClass();
        if (this.e) {
            return;
        }
        this.d = 0;
        d();
        this.l = false;
        this.f.q.post(new Runnable() { // from class: euwm
            @Override // java.lang.Runnable
            public final void run() {
                euwo euwoVar = this.a;
                euwoVar.j = euwoVar.f.o;
                euwoVar.k.c();
                Surface surface = euwoVar.h;
                if (surface != null) {
                    euwoVar.i = euwoVar.j.a(surface);
                    euwoVar.e = true;
                    Log.d(euwo.a, "Created encoder surface.");
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                Object obj = euwoVar.m;
                synchronized (obj) {
                    euwoVar.l = true;
                    obj.notifyAll();
                }
            }
        });
        Object obj = this.m;
        synchronized (obj) {
            while (!this.l) {
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    Log.d(a, "Notifier thread was interrupted: " + Log.getStackTraceString(e));
                }
            }
        }
    }

    @Override // defpackage.euwj
    public final void ht(final TextureFrame textureFrame) {
        if (!this.e || this.f == null) {
            textureFrame.release();
        } else {
            Log.d(a, String.format("Recording frame with ts: %d", Long.valueOf(textureFrame.getTimestamp())));
            this.f.q.post(new Runnable() { // from class: euwn
                @Override // java.lang.Runnable
                public final void run() {
                    final euwo euwoVar = this.a;
                    boolean z = euwoVar.e;
                    TextureFrame textureFrame2 = textureFrame;
                    if (!z) {
                        textureFrame2.release();
                        return;
                    }
                    euxq euxqVar = euwoVar.j;
                    EGLSurface eGLSurface = euwoVar.i;
                    euxqVar.b(eGLSurface, eGLSurface);
                    EGLDisplay eGLDisplayEglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
                    android.opengl.EGLSurface eGLSurfaceEglGetCurrentSurface = EGL14.eglGetCurrentSurface(12377);
                    EGLExt.eglPresentationTimeANDROID(eGLDisplayEglGetCurrentDisplay, eGLSurfaceEglGetCurrentSurface, TimeUnit.MICROSECONDS.toNanos(textureFrame2.getTimestamp()));
                    GLES20.glClear(16384);
                    GLES20.glViewport(0, 0, euwoVar.b, euwoVar.c);
                    euwoVar.k.b(textureFrame2.getTextureName());
                    EGL14.eglSwapBuffers(eGLDisplayEglGetCurrentDisplay, eGLSurfaceEglGetCurrentSurface);
                    euwoVar.d++;
                    textureFrame2.release();
                    euwoVar.n.execute(new Runnable() { // from class: euwk
                        @Override // java.lang.Runnable
                        public final void run() {
                            euwoVar.g.d();
                        }
                    });
                }
            });
        }
    }
}
