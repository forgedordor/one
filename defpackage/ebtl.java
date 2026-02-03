package defpackage;

import com.google.android.libraries.smartmessaging.expressivetext.impl.opengl.GLTextureView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ebtl implements ebtk {
    protected final int[] a;
    final /* synthetic */ GLTextureView b;

    public ebtl(GLTextureView gLTextureView, int[] iArr) {
        this.b = gLTextureView;
        if (gLTextureView.f == 2) {
            int[] iArr2 = new int[15];
            System.arraycopy(iArr, 0, iArr2, 0, 12);
            iArr2[12] = 12352;
            iArr2[13] = 4;
            iArr2[14] = 12344;
            iArr = iArr2;
        }
        this.a = iArr;
    }

    @Override // defpackage.ebtk
    public final EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] iArr = new int[1];
        int[] iArr2 = this.a;
        if (!egl10.eglChooseConfig(eGLDisplay, iArr2, null, 0, iArr)) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        int i = iArr[0];
        if (i <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        if (!egl10.eglChooseConfig(eGLDisplay, iArr2, eGLConfigArr, i, iArr)) {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        EGLConfig eGLConfigB = b(egl10, eGLDisplay, eGLConfigArr);
        if (eGLConfigB != null) {
            return eGLConfigB;
        }
        throw new IllegalArgumentException("No config chosen");
    }

    public abstract EGLConfig b(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);
}
