package defpackage;

import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import android.view.Surface;
import java.nio.Buffer;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nmn implements GLSurfaceView.Renderer, nmp, nmb {
    final /* synthetic */ nmo a;
    private final nmk b;
    private final float[] e;
    private final float[] f;
    private final float[] g;
    private float h;
    private float i;
    private final float[] c = new float[16];
    private final float[] d = new float[16];
    private final float[] j = new float[16];
    private final float[] k = new float[16];

    public nmn(nmo nmoVar, nmk nmkVar) {
        this.a = nmoVar;
        float[] fArr = new float[16];
        this.e = fArr;
        float[] fArr2 = new float[16];
        this.f = fArr2;
        float[] fArr3 = new float[16];
        this.g = fArr3;
        this.b = nmkVar;
        mev.w(fArr);
        mev.w(fArr2);
        mev.w(fArr3);
        this.i = 3.1415927f;
    }

    private final void c() {
        Matrix.setRotateM(this.f, 0, -this.h, (float) Math.cos(this.i), (float) Math.sin(this.i), 0.0f);
    }

    @Override // defpackage.nmb
    public final synchronized void a(float[] fArr, float f) {
        System.arraycopy(fArr, 0, this.e, 0, 16);
        this.i = -f;
        c();
    }

    @Override // defpackage.nmp
    public final synchronized void b(PointF pointF) {
        this.h = pointF.y;
        c();
        Matrix.setRotateM(this.g, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            float[] fArr = this.k;
            Matrix.multiplyMM(fArr, 0, this.e, 0, this.g, 0);
            Matrix.multiplyMM(this.j, 0, this.f, 0, fArr, 0);
        }
        float[] fArr2 = this.d;
        Matrix.multiplyMM(fArr2, 0, this.c, 0, this.j, 0);
        nmk nmkVar = this.b;
        GLES20.glClear(16384);
        try {
            mev.m();
        } catch (meu e) {
            mff.d("SceneRenderer", "Failed to draw a frame", e);
        }
        if (nmkVar.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = nmkVar.j;
            mee.f(surfaceTexture);
            surfaceTexture.updateTexImage();
            try {
                mev.m();
            } catch (meu e2) {
                mff.d("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (nmkVar.b.compareAndSet(true, false)) {
                mev.w(nmkVar.g);
            }
            long timestamp = nmkVar.j.getTimestamp();
            Long l = (Long) nmkVar.e.b(timestamp);
            if (l != null) {
                nma nmaVar = nmkVar.d;
                float[] fArr3 = nmkVar.g;
                float[] fArr4 = (float[]) nmaVar.c.d(l.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = nmaVar.b;
                    float f = fArr4[0];
                    float f2 = -fArr4[1];
                    float f3 = -fArr4[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                        fArr5 = fArr5;
                    } else {
                        mev.w(fArr5);
                    }
                    if (!nmaVar.d) {
                        nma.a(nmaVar.a, fArr5);
                        nmaVar.d = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, nmaVar.a, 0, fArr5, 0);
                }
            }
            nmf nmfVar = (nmf) nmkVar.f.d(timestamp);
            if (nmfVar != null) {
                nmi nmiVar = nmkVar.c;
                if (nmi.a(nmfVar)) {
                    nmiVar.d = nmfVar.c;
                    nmiVar.e = new nmh(nmfVar.a.b());
                    if (!nmfVar.d) {
                        new nmh(nmfVar.b.b());
                    }
                }
            }
        }
        float[] fArr6 = nmkVar.h;
        Matrix.multiplyMM(fArr6, 0, fArr2, 0, nmkVar.g, 0);
        nmi nmiVar2 = nmkVar.c;
        int i = nmkVar.i;
        nmh nmhVar = nmiVar2.e;
        if (nmhVar == null) {
            return;
        }
        int i2 = nmiVar2.d;
        GLES20.glUniformMatrix3fv(nmiVar2.h, 1, false, i2 == 1 ? nmi.b : i2 == 2 ? nmi.c : nmi.a, 0);
        GLES20.glUniformMatrix4fv(nmiVar2.g, 1, false, fArr6, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(nmiVar2.k, 0);
        try {
            mev.m();
        } catch (meu e3) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e3);
        }
        GLES20.glVertexAttribPointer(nmiVar2.i, 3, 5126, false, 12, (Buffer) nmhVar.b);
        try {
            mev.m();
        } catch (meu e4) {
            Log.e("ProjectionRenderer", "Failed to load position data", e4);
        }
        GLES20.glVertexAttribPointer(nmiVar2.j, 2, 5126, false, 8, (Buffer) nmhVar.c);
        try {
            mev.m();
        } catch (meu e5) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e5);
        }
        GLES20.glDrawArrays(nmhVar.d, 0, nmhVar.a);
        try {
            mev.m();
        } catch (meu e6) {
            Log.e("ProjectionRenderer", "Failed to render", e6);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        float f;
        GLES20.glViewport(0, 0, i, i2);
        float f2 = i / i2;
        if (f2 > 1.0f) {
            double degrees = Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f2));
            f = (float) (degrees + degrees);
        } else {
            f = 90.0f;
        }
        Matrix.perspectiveM(this.c, 0, f, f2, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        final nmk nmkVar = this.b;
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            mev.m();
            nmi nmiVar = nmkVar.c;
            try {
                nmiVar.f = new met("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
                nmiVar.g = nmiVar.f.c("uMvpMatrix");
                nmiVar.h = nmiVar.f.c("uTexMatrix");
                nmiVar.i = nmiVar.f.a("aPosition");
                nmiVar.j = nmiVar.f.a("aTexCoords");
                nmiVar.k = nmiVar.f.c("uTexture");
            } catch (meu e) {
                Log.e("ProjectionRenderer", "Failed to initialize the program", e);
            }
            mev.m();
            nmkVar.i = mev.a();
        } catch (meu e2) {
            mff.d("SceneRenderer", "Failed to initialize the renderer", e2);
        }
        final nmo nmoVar = this.a;
        nmkVar.j = new SurfaceTexture(nmkVar.i);
        nmkVar.j.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: nmj
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                nmkVar.a.set(true);
            }
        });
        final SurfaceTexture surfaceTexture = nmkVar.j;
        nmoVar.b.post(new Runnable() { // from class: nmm
            @Override // java.lang.Runnable
            public final void run() throws CloneNotSupportedException {
                nmo nmoVar2 = nmoVar;
                SurfaceTexture surfaceTexture2 = nmoVar2.d;
                Surface surface = nmoVar2.e;
                SurfaceTexture surfaceTexture3 = surfaceTexture;
                Surface surface2 = new Surface(surfaceTexture3);
                nmoVar2.d = surfaceTexture3;
                nmoVar2.e = surface2;
                Iterator it = nmoVar2.a.iterator();
                while (it.hasNext()) {
                    ((mrk) it.next()).a(surface2);
                }
                nmo.a(surfaceTexture2, surface);
            }
        });
    }
}
