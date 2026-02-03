package defpackage;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mnj implements may {
    private final may a = new mjy();
    private EGLContext b;

    @Override // defpackage.may
    public final EGLContext a(EGLDisplay eGLDisplay, int i, int[] iArr) {
        if (this.b == null) {
            this.b = this.a.a(eGLDisplay, i, iArr);
        }
        return this.b;
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
        return this.a.d(i, i2, i3);
    }

    @Override // defpackage.may
    public final void e(EGLDisplay eGLDisplay) throws meu {
        EGLContext eGLContext = this.b;
        if (eGLContext != null) {
            mev.r(eGLDisplay, eGLContext);
        }
    }
}
