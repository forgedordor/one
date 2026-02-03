package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nke extends Surface {
    public static int a;
    private static boolean c;
    public final boolean b;
    private final nkd d;
    private boolean e;

    public nke(nkd nkdVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.d = nkdVar;
        this.b = z;
    }

    public static synchronized boolean a() {
        if (!c) {
            a = mev.z("EGL_EXT_protected_content") ? mev.A() ? 1 : 2 : 0;
            c = true;
        }
        return a != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        nkd nkdVar = this.d;
        synchronized (nkdVar) {
            if (!this.e) {
                mee.f(nkdVar.b);
                nkdVar.b.sendEmptyMessage(2);
                this.e = true;
            }
        }
    }
}
