package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqwq implements SurfaceTexture.OnFrameAvailableListener {
    public static final int a = (int) TimeUnit.SECONDS.toMillis(5);
    public SurfaceTexture b;
    public Surface c;
    public final Object d = new Object();
    public final cqwr e;
    public volatile boolean f;

    private cqwq(float f, float f2, boolean z) {
        int iA;
        int iGlCreateProgram;
        cqwr cqwrVar = new cqwr(f, f2, z);
        this.e = cqwrVar;
        String str = cqwrVar.o;
        int iA2 = cqwr.a(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
        if (iA2 == 0 || (iA = cqwr.a(35632, str)) == 0) {
            iGlCreateProgram = 0;
        } else {
            iGlCreateProgram = GLES20.glCreateProgram();
            if (iGlCreateProgram == 0) {
                ((eksl) ((eksl) cqxo.a.i()).h("com/google/android/apps/messaging/shared/util/media/video/TextureRender", "createProgram", 251, "TextureRender.java")).q("Could not create program");
                iGlCreateProgram = 0;
            }
            GLES20.glAttachShader(iGlCreateProgram, iA2);
            GLES20.glAttachShader(iGlCreateProgram, iA);
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                ((eksl) ((eksl) cqxo.a.i()).h("com/google/android/apps/messaging/shared/util/media/video/TextureRender", "createProgram", 259, "TextureRender.java")).t("Could not link program: %s", GLES20.glGetProgramInfoLog(iGlCreateProgram));
                GLES20.glDeleteProgram(iGlCreateProgram);
                iGlCreateProgram = 0;
            }
        }
        cqwrVar.d = iGlCreateProgram;
        if (iGlCreateProgram == 0) {
            throw new RuntimeException("failed creating program");
        }
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(iGlCreateProgram, "aPosition");
        cqwrVar.h = iGlGetAttribLocation;
        if (iGlGetAttribLocation == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(cqwrVar.d, "aTextureCoord");
        cqwrVar.i = iGlGetAttribLocation2;
        if (iGlGetAttribLocation2 == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(cqwrVar.d, "uMVPMatrix");
        cqwrVar.f = iGlGetUniformLocation;
        if (iGlGetUniformLocation == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(cqwrVar.d, "uSTMatrix");
        cqwrVar.g = iGlGetUniformLocation2;
        if (iGlGetUniformLocation2 == -1) {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }
        if (!cqwrVar.n) {
            int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(cqwrVar.d, "uInputTextureWidth");
            cqwrVar.j = iGlGetUniformLocation3;
            if (iGlGetUniformLocation3 == -1) {
                throw new RuntimeException("Could not get attrib location for uInputTextureWidth");
            }
            int iGlGetUniformLocation4 = GLES20.glGetUniformLocation(cqwrVar.d, "uInputTextureHeight");
            cqwrVar.k = iGlGetUniformLocation4;
            if (iGlGetUniformLocation4 == -1) {
                throw new RuntimeException("Could not get attrib location for uInputTextureHeight");
            }
        }
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        int i = iArr2[0];
        cqwrVar.e = i;
        GLES20.glBindTexture(36197, i);
        GLES20.glTexParameterf(36197, 10241, cqwrVar.p);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
    }

    public static cqwq a(float f, float f2, boolean z) {
        cqwq cqwqVar = new cqwq(f, f2, z);
        SurfaceTexture surfaceTexture = new SurfaceTexture(cqwqVar.e.e);
        cqwqVar.b = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(cqwqVar);
        cqwqVar.c = new Surface(cqwqVar.b);
        return cqwqVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Object obj = this.d;
        synchronized (obj) {
            if (this.f) {
                throw new RuntimeException("frameAvailable already set, frame could be dropped");
            }
            this.f = true;
            obj.notifyAll();
        }
    }
}
