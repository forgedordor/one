package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btg {
    public Thread c;
    protected EGLConfig g;
    public Surface i;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final Map b = new HashMap();
    public EGLDisplay d = EGL14.EGL_NO_DISPLAY;
    protected EGLContext e = EGL14.EGL_NO_CONTEXT;
    protected int[] f = buw.a;
    protected EGLSurface h = EGL14.EGL_NO_SURFACE;
    protected Map j = Collections.EMPTY_MAP;
    protected buu k = null;
    protected but l = but.UNKNOWN;
    public int m = -1;

    public static final void i(int i) {
        GLES20.glActiveTexture(33984);
        buw.f("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        buw.f("glBindTexture");
    }

    private final void k(azv azvVar, bux buxVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.d = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.d, iArr, 0, iArr, 1)) {
            this.d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (buxVar != null) {
            ((bum) buxVar).b = iArr[0] + "." + iArr[1];
        }
        int i = true != azvVar.a() ? 8 : 10;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.d, new int[]{12324, i, 12323, i, 12322, i, 12321, true != azvVar.a() ? 8 : 2, 12325, 0, 12326, 0, 12352, true != azvVar.a() ? 4 : 64, 12610, true != azvVar.a() ? 1 : -1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, true == azvVar.a() ? 3 : 2, 12344}, 0);
        buw.e("eglCreateContext");
        this.g = eGLConfig;
        this.e = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.d, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    private final void l() {
        EGLDisplay eGLDisplay = this.d;
        EGLConfig eGLConfig = this.g;
        eGLConfig.getClass();
        int[] iArr = buw.a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        buw.e("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface == null) {
            throw new IllegalStateException("surface was null");
        }
        this.h = eGLSurfaceEglCreatePbufferSurface;
    }

    private final void m() {
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((buu) it.next()).a);
        }
        this.j = Collections.EMPTY_MAP;
        this.k = null;
        if (!Objects.equals(this.d, EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglMakeCurrent(this.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            for (buz buzVar : this.b.values()) {
                if (!Objects.equals(buzVar.c(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.d, buzVar.c())) {
                    int[] iArr = buw.a;
                    try {
                        buw.e("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        bbs.d("GLUtils", e.toString(), e);
                    }
                }
            }
            this.b.clear();
            if (!Objects.equals(this.h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.d, this.h);
                this.h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.d, this.e);
                this.e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.d);
            this.d = EGL14.EGL_NO_DISPLAY;
        }
        this.g = null;
        this.m = -1;
        this.l = but.UNKNOWN;
        this.i = null;
        this.c = null;
    }

    public final buz a(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.d;
            EGLConfig eGLConfig = this.g;
            eGLConfig.getClass();
            int[] iArr = this.f;
            int[] iArr2 = buw.a;
            EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
            buw.e("eglCreateWindowSurface");
            if (eGLSurfaceEglCreateWindowSurface == null) {
                throw new IllegalStateException("surface was null");
            }
            EGLDisplay eGLDisplay2 = this.d;
            Size size = new Size(buw.c(eGLDisplay2, eGLSurfaceEglCreateWindowSurface, 12375), buw.c(eGLDisplay2, eGLSurfaceEglCreateWindowSurface, 12374));
            return new buo(eGLSurfaceEglCreateWindowSurface, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            bbs.g("OpenGlRenderer", "Failed to create EGL surface: ".concat(String.valueOf(e.getMessage())), e);
            return null;
        }
    }

    public final buz b(Surface surface) {
        Map map = this.b;
        lcg.d(map.containsKey(surface), "The surface is not registered.");
        buz buzVar = (buz) map.get(surface);
        buzVar.getClass();
        return buzVar;
    }

    public final void c(EGLSurface eGLSurface) {
        lcg.i(this.d);
        lcg.i(this.e);
        if (!EGL14.eglMakeCurrent(this.d, eGLSurface, eGLSurface, this.e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public final void d(Surface surface) {
        buw.h(this.a, true);
        buw.g(this.c);
        Map map = this.b;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, buw.l);
    }

    public final void e() {
        if (this.a.getAndSet(false)) {
            buw.g(this.c);
            m();
        }
    }

    public final void f(Surface surface, boolean z) {
        if (this.i == surface) {
            this.i = null;
            c(this.h);
        }
        buz buzVar = z ? (buz) this.b.remove(surface) : (buz) this.b.put(surface, buw.l);
        if (buzVar == null || buzVar == buw.l) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.d, buzVar.c());
        } catch (RuntimeException e) {
            bbs.g("OpenGlRenderer", "Failed to destroy EGL surface: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    public final void g(Surface surface) {
        buw.h(this.a, true);
        buw.g(this.c);
        f(surface, true);
    }

    protected final void h(int i) {
        buu buuVar = (buu) this.j.get(this.l);
        if (buuVar == null) {
            but butVar = this.l;
            java.util.Objects.toString(butVar);
            throw new IllegalStateException("Unable to configure program for input format: ".concat(String.valueOf(butVar)));
        }
        if (this.k != buuVar) {
            this.k = buuVar;
            buuVar.c();
            Log.d("OpenGlRenderer", "Using program for input format " + this.l + ": " + this.k);
        }
        i(i);
    }

    public final void j(azv azvVar, Map map) {
        lcb lcbVar;
        azv azvVar2;
        Object buvVar;
        but butVar;
        AtomicBoolean atomicBoolean = this.a;
        boolean z = false;
        buw.h(atomicBoolean, false);
        bum bumVar = new bum();
        String strQ = "0.0";
        bumVar.a = "0.0";
        bumVar.b = "0.0";
        bumVar.c = "";
        bumVar.d = "";
        try {
            if (azvVar.a()) {
                buw.h(atomicBoolean, false);
                try {
                    try {
                        k(azvVar, null);
                        l();
                        c(this.h);
                        String strGlGetString = GLES20.glGetString(7939);
                        String strEglQueryString = EGL14.eglQueryString(this.d, 12373);
                        if (strGlGetString == null) {
                            strGlGetString = "";
                        }
                        if (strEglQueryString == null) {
                            strEglQueryString = "";
                        }
                        lcbVar = new lcb(strGlGetString, strEglQueryString);
                    } catch (IllegalStateException e) {
                        bbs.g("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e.getMessage(), e);
                        lcbVar = new lcb("", "");
                    }
                    String str = (String) lcbVar.a;
                    lcg.i(str);
                    String str2 = (String) lcbVar.b;
                    lcg.i(str2);
                    if (str.contains("GL_EXT_YUV_target")) {
                        azvVar2 = azvVar;
                    } else {
                        bbs.f("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                        azvVar2 = azv.b;
                    }
                    int[] iArr = buw.a;
                    if (azvVar2.h == 3) {
                        if (str2.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                            iArr = buw.b;
                        } else {
                            bbs.f("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
                        }
                    }
                    this.f = iArr;
                    bumVar.c = str;
                    bumVar.d = str2;
                } finally {
                    m();
                }
            } else {
                azvVar2 = azvVar;
            }
            k(azvVar2, bumVar);
            l();
            c(this.h);
            Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                lcg.i(strGroup);
                String strGroup2 = matcher.group(2);
                lcg.i(strGroup2);
                strQ = a.q(strGroup2, strGroup, ".");
            }
            bumVar.a = strQ;
            HashMap map2 = new HashMap();
            but[] butVarArrValues = but.values();
            int length = butVarArrValues.length;
            int i = 0;
            while (i < length) {
                but butVar2 = butVarArrValues[i];
                btj btjVar = (btj) map.get(butVar2);
                if (btjVar != null) {
                    buvVar = new buv(azvVar2, btjVar);
                } else if (butVar2 == but.YUV || butVar2 == (butVar = but.DEFAULT)) {
                    buvVar = new buv(azvVar2, butVar2);
                } else {
                    boolean z2 = butVar2 == but.UNKNOWN ? true : z;
                    java.util.Objects.toString(butVar2);
                    lcg.d(z2, "Unhandled input format: ".concat(String.valueOf(butVar2)));
                    if (azvVar2.a()) {
                        buvVar = new bus();
                    } else {
                        btj btjVar2 = (btj) map.get(butVar);
                        buvVar = btjVar2 != null ? new buv(azvVar2, btjVar2) : new buv(azvVar2, butVar);
                    }
                }
                Log.d("GLUtils", a.i(buvVar, butVar2, "Shader program for input format ", " created: "));
                map2.put(butVar2, buvVar);
                i++;
                z = false;
            }
            this.j = map2;
            int iA = buw.a();
            this.m = iA;
            h(iA);
            this.c = Thread.currentThread();
            this.a.set(true);
            String str3 = bumVar.a;
            String str4 = bumVar.b;
            String strConcat = str3 == null ? " glVersion" : "";
            if (str4 == null) {
                strConcat = strConcat.concat(" eglVersion");
            }
            if (bumVar.c == null) {
                strConcat = strConcat.concat(" glExtensions");
            }
            if (bumVar.d == null) {
                strConcat = strConcat.concat(" eglExtensions");
            }
            if (!strConcat.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(strConcat));
            }
        } catch (IllegalArgumentException | IllegalStateException e2) {
            throw e2;
        }
    }
}
