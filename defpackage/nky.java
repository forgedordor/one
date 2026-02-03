package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nky extends GLSurfaceView {
    private final nkx a;

    public nky(Context context) {
        super(context, null);
        nkx nkxVar = new nkx(this);
        this.a = nkxVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(nkxVar);
        setRenderMode(0);
    }
}
