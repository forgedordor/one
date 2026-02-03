package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkl extends fdbr implements fdap {
    final /* synthetic */ jkj a;
    final /* synthetic */ Choreographer.FrameCallback b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkl(jkj jkjVar, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.a = jkjVar;
        this.b = frameCallback;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jkj jkjVar = this.a;
        Object obj2 = jkjVar.e;
        Choreographer.FrameCallback frameCallback = this.b;
        synchronized (obj2) {
            jkjVar.f.remove(frameCallback);
        }
        return fctx.a;
    }
}
