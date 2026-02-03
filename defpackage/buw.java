package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buw {
    public static final float[] h;
    public static final FloatBuffer i;
    public static final float[] j;
    public static final FloatBuffer k;
    public static final int[] a = {12344};
    public static final int[] b = {12445, 13632, 12344};
    public static final String c = String.format(Locale.US, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
    public static final String d = String.format(Locale.US, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
    public static final btj e = new bup();
    public static final btj f = new buq();
    public static final btj g = new bur();
    public static final buz l = new buo(EGL14.EGL_NO_SURFACE, 0, 0);

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        h = fArr;
        i = d(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        j = fArr2;
        k = d(fArr2);
    }

    public static int a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        f("glGenTextures");
        int i2 = iArr[0];
        GLES20.glBindTexture(36197, i2);
        f("glBindTexture " + i2);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        f("glTexParameter");
        return i2;
    }

    public static int b(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        f(a.g(i2, "glCreateShader type="));
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        bbs.f("GLUtils", "Could not compile shader: ".concat(String.valueOf(str)));
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i2 + ":" + strGlGetShaderInfoLog);
    }

    public static int c(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i2) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i2, iArr, 0);
        return iArr[0];
    }

    public static FloatBuffer d(float[] fArr) {
        int length = fArr.length;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static void e(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    public static void f(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(iGlGetError));
    }

    public static void g(Thread thread) {
        lcg.d(thread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    public static void h(AtomicBoolean atomicBoolean, boolean z) {
        lcg.d(z == atomicBoolean.get(), true != z ? "OpenGlRenderer is already initialized" : "OpenGlRenderer is not initialized");
    }

    public static void i(int i2, String str) {
        if (i2 < 0) {
            throw new IllegalStateException(a.a(str, "Unable to locate '", "' in program"));
        }
    }

    public static float[] j() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }
}
