package defpackage;

import android.util.Log;
import com.google.android.libraries.smartmessaging.expressivetext.impl.opengl.GLTextureView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebtq extends Thread {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean i;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private ebtp r;
    private final WeakReference s;
    public final ArrayList j = new ArrayList();
    private boolean q = true;
    private int o = 0;
    private int p = 0;
    public boolean h = true;
    public int g = 1;

    public ebtq(WeakReference weakReference) {
        this.s = weakReference;
    }

    private final void e() {
        GLTextureView gLTextureView;
        if (!this.m || (gLTextureView = (GLTextureView) this.s.get()) == null) {
            return;
        }
        gLTextureView.d.c();
    }

    private final void f() {
        if (this.m) {
            ebtp ebtpVar = this.r;
            if (ebtpVar.f != null) {
                if (((GLTextureView) ebtpVar.a.get()) != null) {
                    EGL10 egl10 = ebtpVar.b;
                    EGLDisplay eGLDisplay = ebtpVar.c;
                    EGLContext eGLContext = ebtpVar.f;
                    if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                        Log.e("DefaultContextFactory", a.H(eGLContext, eGLDisplay, "display:", " context: "));
                        ebtp.d("eglDestroyContex", egl10.eglGetError());
                    }
                }
                ebtpVar.f = null;
            }
            EGLDisplay eGLDisplay2 = ebtpVar.c;
            if (eGLDisplay2 != null) {
                ebtpVar.b.eglTerminate(eGLDisplay2);
                ebtpVar.c = null;
            }
            this.m = false;
            GLTextureView.a.a(this);
        }
    }

    private final void g() {
        if (this.n) {
            this.n = false;
            this.r.b();
        }
    }

    private final boolean h() {
        if (this.c || !this.d || this.l || this.o <= 0 || this.p <= 0) {
            return false;
        }
        return this.h || this.g == 1;
    }

    public final void a(int i, int i2) {
        ebtr ebtrVar = GLTextureView.a;
        synchronized (ebtrVar) {
            this.o = i;
            this.p = i2;
            this.q = true;
            this.h = true;
            this.i = false;
            ebtrVar.notifyAll();
            while (!this.a && !this.c && !this.i && this.m && this.n && h()) {
                try {
                    ebtrVar.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final void b() {
        ebtr ebtrVar = GLTextureView.a;
        synchronized (ebtrVar) {
            this.k = true;
            ebtrVar.notifyAll();
            while (!this.a) {
                try {
                    ebtrVar.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final void c(int i) {
        ebtr ebtrVar = GLTextureView.a;
        synchronized (ebtrVar) {
            this.g = i;
            ebtrVar.notifyAll();
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (GLTextureView.a) {
            z = this.a;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r2 = com.google.android.libraries.smartmessaging.expressivetext.impl.opengl.GLTextureView.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        e();
        g();
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebtq.run():void");
    }
}
