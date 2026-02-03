package defpackage;

import com.google.android.libraries.smartmessaging.expressivetext.impl.opengl.GLTextureView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ebtm extends ebtl {
    protected final int c;
    protected final int d;
    private final int[] e;

    public ebtm(GLTextureView gLTextureView, int i, int i2) {
        super(gLTextureView, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, i, 12325, i2, 12326, 0, 12344});
        this.e = new int[1];
        this.c = i;
        this.d = i2;
    }

    private final int c(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr = this.e;
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr)) {
            return iArr[0];
        }
        return 0;
    }

    @Override // defpackage.ebtl
    public final EGLConfig b(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        for (EGLConfig eGLConfig : eGLConfigArr) {
            int iC = c(egl10, eGLDisplay, eGLConfig, 12325);
            int iC2 = c(egl10, eGLDisplay, eGLConfig, 12326);
            if (iC >= this.d && iC2 >= 0) {
                int iC3 = c(egl10, eGLDisplay, eGLConfig, 12324);
                int iC4 = c(egl10, eGLDisplay, eGLConfig, 12323);
                int iC5 = c(egl10, eGLDisplay, eGLConfig, 12322);
                int iC6 = c(egl10, eGLDisplay, eGLConfig, 12321);
                if (iC3 == 8 && iC4 == 8 && iC5 == 8 && iC6 == this.c) {
                    return eGLConfig;
                }
            }
        }
        return null;
    }
}
