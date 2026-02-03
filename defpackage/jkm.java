package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkm extends fdbr implements fdap {
    final /* synthetic */ jko a;
    final /* synthetic */ Choreographer.FrameCallback b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkm(jko jkoVar, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.a = jkoVar;
        this.b = frameCallback;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.a.removeFrameCallback(this.b);
        return fctx.a;
    }
}
