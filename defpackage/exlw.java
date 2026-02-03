package defpackage;

import android.util.Log;
import android.view.Surface;
import com.google.mediapipe.framework.TextureFrame;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exlw extends euxt implements euwj {
    public final euwg a;
    private final Surface b;
    private final int c;
    private final int d;

    public exlw(Object obj, Surface surface, euwg euwgVar, int i, int i2) {
        super(obj);
        this.b = surface;
        this.a = euwgVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.euxt
    public final void c() {
        super.c();
        euwg euwgVar = this.a;
        euwgVar.onSurfaceCreated(null, null);
        euwgVar.onSurfaceChanged(null, this.c, this.d);
    }

    @Override // defpackage.euwj
    public final void ht(final TextureFrame textureFrame) {
        this.q.post(new Runnable() { // from class: exlv
            @Override // java.lang.Runnable
            public final void run() {
                exlw exlwVar = this.a;
                euwg euwgVar = exlwVar.a;
                TextureFrame textureFrame2 = textureFrame;
                int width = textureFrame2.getWidth();
                int height = textureFrame2.getHeight();
                euwgVar.a = width;
                euwgVar.b = height;
                TextureFrame textureFrame3 = (TextureFrame) euwgVar.e.getAndSet(textureFrame2);
                if (textureFrame3 != null && textureFrame3 != textureFrame2) {
                    textureFrame3.release();
                }
                euwgVar.onDrawFrame(null);
                if (exlwVar.o.a.eglSwapBuffers(exlwVar.o.b, exlwVar.p)) {
                    return;
                }
                Log.e(exlx.a, "Egl error for eglSwapBuffers(): " + exlwVar.o.a.eglGetError());
            }
        });
    }

    @Override // defpackage.euxt
    protected final EGLSurface i() {
        return this.o.a(this.b);
    }
}
