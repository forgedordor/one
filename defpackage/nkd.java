package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nkd extends HandlerThread implements Handler.Callback {
    public meq a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public nke e;

    public nkd() {
        super("ExoPlayer:PlaceholderSurface");
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        try {
                            int i2 = message.arg1;
                            mee.f(this.a);
                            meq meqVar = this.a;
                            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                            mev.n(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
                            int[] iArr = new int[2];
                            mev.n(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                            meqVar.d = eGLDisplayEglGetDisplay;
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            int[] iArr2 = new int[1];
                            boolean zEglChooseConfig = EGL14.eglChooseConfig(meqVar.d, meq.a, 0, eGLConfigArr, 0, 1, iArr2, 0);
                            mev.n(zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null, mgb.I("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(meqVar.d, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                            mev.n(eGLContextEglCreateContext != null, "eglCreateContext failed");
                            meqVar.e = eGLContextEglCreateContext;
                            EGLDisplay eGLDisplay = meqVar.d;
                            EGLContext eGLContext = meqVar.e;
                            if (i2 == 1) {
                                eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                            } else {
                                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                                mev.n(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                            }
                            mev.n(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
                            meqVar.f = eGLSurfaceEglCreatePbufferSurface;
                            int[] iArr3 = meqVar.c;
                            GLES20.glGenTextures(1, iArr3, 0);
                            mev.m();
                            meqVar.g = new SurfaceTexture(iArr3[0]);
                            meqVar.g.setOnFrameAvailableListener(meqVar);
                            SurfaceTexture surfaceTexture = this.a.g;
                            mee.f(surfaceTexture);
                            this.e = new nke(this, surfaceTexture, i2 != 0);
                            synchronized (this) {
                                notify();
                            }
                        } catch (RuntimeException e) {
                            mff.d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                            this.d = e;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } catch (Error e2) {
                        mff.d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                        this.c = e2;
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (meu e3) {
                    mff.d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.d = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    mee.f(this.a);
                    meq meqVar2 = this.a;
                    meqVar2.b.removeCallbacks(meqVar2);
                    try {
                        SurfaceTexture surfaceTexture2 = meqVar2.g;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.release();
                            GLES20.glDeleteTextures(1, meqVar2.c, 0);
                        }
                        EGLDisplay eGLDisplay2 = meqVar2.d;
                        if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglMakeCurrent(meqVar2.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                        }
                        EGLSurface eGLSurface = meqVar2.f;
                        if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                            EGL14.eglDestroySurface(meqVar2.d, meqVar2.f);
                        }
                        EGLContext eGLContext2 = meqVar2.e;
                        if (eGLContext2 != null) {
                            EGL14.eglDestroyContext(meqVar2.d, eGLContext2);
                        }
                        EGL14.eglReleaseThread();
                        EGLDisplay eGLDisplay3 = meqVar2.d;
                        if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglTerminate(meqVar2.d);
                        }
                        meqVar2.d = null;
                        meqVar2.e = null;
                        meqVar2.f = null;
                        meqVar2.g = null;
                    } catch (Throwable th) {
                        EGLDisplay eGLDisplay4 = meqVar2.d;
                        if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglMakeCurrent(meqVar2.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                        }
                        EGLSurface eGLSurface2 = meqVar2.f;
                        if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                            EGL14.eglDestroySurface(meqVar2.d, meqVar2.f);
                        }
                        EGLContext eGLContext3 = meqVar2.e;
                        if (eGLContext3 != null) {
                            EGL14.eglDestroyContext(meqVar2.d, eGLContext3);
                        }
                        EGL14.eglReleaseThread();
                        EGLDisplay eGLDisplay5 = meqVar2.d;
                        if (eGLDisplay5 != null && !eGLDisplay5.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglTerminate(meqVar2.d);
                        }
                        meqVar2.d = null;
                        meqVar2.e = null;
                        meqVar2.f = null;
                        meqVar2.g = null;
                        throw th;
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
                return true;
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
