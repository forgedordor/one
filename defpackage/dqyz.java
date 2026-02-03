package defpackage;

import android.view.Surface;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dqyz implements Runnable {
    public final /* synthetic */ dqzc a;

    @Override // java.lang.Runnable
    public final void run() {
        dqzc dqzcVar = this.a;
        if (dqzcVar.e == null || dqzcVar.j != null) {
            return;
        }
        dqzcVar.k = new euxq(dqzcVar.b);
        dqzcVar.f = new Surface(dqzcVar.e);
        dqzcVar.j = dqzcVar.k.a(dqzcVar.f);
        euxq euxqVar = dqzcVar.k;
        EGLSurface eGLSurface = dqzcVar.j;
        euxqVar.b(eGLSurface, eGLSurface);
        dqzcVar.l = new euxw();
        dqzcVar.l.c();
        dqzcVar.d.set(true);
    }
}
