package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mjy implements may {
    private final EGLContext a = EGL14.EGL_NO_CONTEXT;
    private final List b = new ArrayList();

    @Override // defpackage.may
    public final EGLContext a(EGLDisplay eGLDisplay, int i, int[] iArr) throws meu {
        List list = this.b;
        EGLContext eGLContextG = mev.g(this.a, eGLDisplay, i, iArr);
        list.add(eGLContextG);
        return eGLContextG;
    }

    @Override // defpackage.may
    public final EGLSurface b(EGLDisplay eGLDisplay, Object obj, int i, boolean z) {
        return mev.i(eGLDisplay, obj, i, z);
    }

    @Override // defpackage.may
    public final EGLSurface c(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        return mev.j(eGLContext, eGLDisplay);
    }

    @Override // defpackage.may
    public final maz d(int i, int i2, int i3) {
        int[] iArr = mev.a;
        int[] iArr2 = new int[1];
        GLES20.glGenFramebuffers(1, iArr2, 0);
        mev.m();
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        mev.m();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        mev.m();
        return new maz(i, iArr2[0], i2, i3);
    }

    @Override // defpackage.may
    public final void e(EGLDisplay eGLDisplay) throws meu {
        int i = 0;
        while (true) {
            List list = this.b;
            if (i >= list.size()) {
                return;
            }
            mev.r(eGLDisplay, (EGLContext) list.get(i));
            i++;
        }
    }
}
