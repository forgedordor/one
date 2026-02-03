package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkn implements Choreographer.FrameCallback {
    final /* synthetic */ fdis a;
    final /* synthetic */ fdap b;

    public jkn(fdis fdisVar, fdap fdapVar) {
        this.a = fdisVar;
        this.b = fdapVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object objA;
        try {
            objA = this.b.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            objA = fctl.a(th);
        }
        this.a.w(objA);
    }
}
