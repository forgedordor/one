package defpackage;

import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class euxt extends Thread {
    private boolean a;
    private boolean b;
    private final Object c;
    public volatile euxq o;
    public EGLSurface p;
    public Handler q;
    protected Looper r;
    protected int s;

    public euxt(Object obj) {
        this(obj, null);
    }

    public void c() {
        this.p = i();
        euxq euxqVar = this.o;
        EGLSurface eGLSurface = this.p;
        euxqVar.b(eGLSurface, eGLSurface);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.s = iArr[0];
    }

    public void d() {
        int i = this.s;
        if (i != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.s = 0;
        }
        this.o.c();
        if (this.p != null) {
            this.o.e(this.p);
            this.p = null;
        }
    }

    protected EGLSurface i() {
        return this.o.f();
    }

    public final void j(int i, int i2, int i3) {
        GLES20.glBindFramebuffer(36160, this.s);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus != 36053) {
            throw new euxu(a.g(iGlCheckFramebufferStatus, "Framebuffer not complete, status="));
        }
        GLES20.glViewport(0, 0, i2, i3);
        euxv.c("glViewport");
    }

    public final boolean k() {
        Object obj = this.c;
        synchronized (obj) {
            while (!this.a) {
                obj.wait();
            }
        }
        return this.b;
    }

    public final void l() {
        Looper looper = this.r;
        if (looper == null) {
            return;
        }
        looper.quitSafely();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            try {
                Looper.prepare();
                this.q = new Handler();
                this.r = Looper.myLooper();
                Log.d("GlThread", String.format("Starting GL thread %s", getName()));
                c();
                this.b = true;
                Object obj = this.c;
                synchronized (obj) {
                    this.a = true;
                    obj.notify();
                }
                try {
                    Looper.loop();
                    this.r = null;
                    d();
                    this.o.d();
                    Log.d("GlThread", String.format("Stopping GL thread %s", getName()));
                } catch (Throwable th) {
                    this.r = null;
                    d();
                    this.o.d();
                    Log.d("GlThread", String.format("Stopping GL thread %s", getName()));
                    throw th;
                }
            } catch (RuntimeException e) {
                d();
                this.o.d();
                throw e;
            }
        } catch (Throwable th2) {
            Object obj2 = this.c;
            synchronized (obj2) {
                this.a = true;
                obj2.notify();
                throw th2;
            }
        }
    }

    public euxt(Object obj, int[] iArr) {
        this.c = new Object();
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = 0;
        this.o = new euxq(obj, iArr);
        setName("drishti.glutil.GlThread");
    }
}
