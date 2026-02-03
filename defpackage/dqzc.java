package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import com.google.common.util.concurrent.SettableFuture;
import com.google.mediapipe.framework.TextureFrame;
import java.util.ArrayDeque;
import java.util.Deque;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqzc implements TextureView.SurfaceTextureListener, euwj {
    public static final String a = "dqzc";
    public final EGLContext b;
    public final Deque c = new ArrayDeque(10);
    public final SettableFuture d = SettableFuture.create();
    public SurfaceTexture e;
    public Surface f;
    public int g;
    public int h;
    public euwj i;
    public EGLSurface j;
    public euxq k;
    public euxw l;
    private final float[] m;
    private HandlerThread n;
    private Handler o;

    public dqzc(EGLContext eGLContext, TextureView textureView) {
        float[] fArr = new float[16];
        this.m = fArr;
        this.b = eGLContext;
        Matrix.setIdentityM(fArr, 0);
        this.e = textureView.getSurfaceTexture();
        c();
        textureView.setSurfaceTextureListener(this);
    }

    private final void c() {
        HandlerThread handlerThread = new HandlerThread("dqzc");
        this.n = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.n.getLooper());
        this.o = handler;
        handler.post(new dqyz(this));
    }

    public final synchronized void b() {
        Handler handler;
        if (!this.n.isAlive() || (handler = this.o) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: dqza
            @Override // java.lang.Runnable
            public final void run() {
                dqzc dqzcVar = this.a;
                Deque deque = dqzcVar.c;
                synchronized (deque) {
                    while (!deque.isEmpty()) {
                        ((TextureFrame) deque.pollFirst()).release();
                    }
                }
                euxw euxwVar = dqzcVar.l;
                if (euxwVar != null) {
                    euxwVar.a();
                    dqzcVar.l = null;
                }
                euxq euxqVar = dqzcVar.k;
                if (euxqVar != null) {
                    euxqVar.c();
                    EGLSurface eGLSurface = dqzcVar.j;
                    if (eGLSurface != null) {
                        dqzcVar.k.e(eGLSurface);
                        dqzcVar.j = null;
                    }
                    Surface surface = dqzcVar.f;
                    if (surface != null) {
                        surface.release();
                    }
                    dqzcVar.k.d();
                    dqzcVar.k = null;
                }
                SurfaceTexture surfaceTexture = dqzcVar.e;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    dqzcVar.e = null;
                }
            }
        });
        this.n.quitSafely();
    }

    @Override // defpackage.euwj
    public final void ht(TextureFrame textureFrame) {
        if (!this.n.isAlive() || this.o == null) {
            textureFrame.release();
            return;
        }
        Deque deque = this.c;
        synchronized (deque) {
            if (!deque.offerLast(textureFrame)) {
                textureFrame.release();
            }
        }
        this.o.post(new Runnable() { // from class: dqzb
            @Override // java.lang.Runnable
            public final void run() {
                TextureFrame textureFrame2;
                dqzc dqzcVar = this.a;
                Deque deque2 = dqzcVar.c;
                synchronized (deque2) {
                    textureFrame2 = null;
                    while (!deque2.isEmpty()) {
                        if (textureFrame2 != null) {
                            Log.d(dqzc.a, String.format("Dropped frame (tex=%d, ts=%,d) ", Integer.valueOf(textureFrame2.getTextureName()), Long.valueOf(textureFrame2.getTimestamp())));
                            textureFrame2.release();
                        }
                        textureFrame2 = (TextureFrame) deque2.pollFirst();
                    }
                }
                if (textureFrame2 != null) {
                    if (dqzcVar.e != null) {
                        GLES20.glViewport(0, 0, dqzcVar.g, dqzcVar.h);
                        GLES20.glClear(16384);
                        dqzcVar.l.b(textureFrame2.getTextureName());
                        EGL14.eglSwapBuffers(EGL14.eglGetCurrentDisplay(), EGL14.eglGetCurrentSurface(12377));
                    }
                    euwj euwjVar = dqzcVar.i;
                    if (euwjVar != null) {
                        euwjVar.ht(textureFrame2);
                    } else {
                        textureFrame2.release();
                    }
                }
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.e = surfaceTexture;
        this.g = i;
        this.h = i2;
        if (!this.n.isAlive()) {
            c();
        }
        this.o.post(new dqyz(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.g = i;
        this.h = i2;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
