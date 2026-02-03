package defpackage;

import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpck implements Animation.AnimationListener {
    public static final /* synthetic */ int a = 0;
    private final fdap b;
    private final fdap c;
    private final fdap d;

    /* JADX WARN: Illegal instructions before constructor call */
    public dpck() {
        fdap fdapVar = null;
        this(fdapVar, fdapVar, 7);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        this.c.invoke(animation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
        this.d.invoke(animation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        this.b.invoke(animation);
    }

    public /* synthetic */ dpck(fdap fdapVar, fdap fdapVar2, int i) {
        fdapVar = (i & 1) != 0 ? new fdap() { // from class: dpch
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                int i2 = dpck.a;
                ((Animation) obj).getClass();
                return fctx.a;
            }
        } : fdapVar;
        fdapVar2 = (i & 2) != 0 ? new fdap() { // from class: dpci
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                int i2 = dpck.a;
                ((Animation) obj).getClass();
                return fctx.a;
            }
        } : fdapVar2;
        fdap fdapVar3 = new fdap() { // from class: dpcj
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                int i2 = dpck.a;
                ((Animation) obj).getClass();
                return fctx.a;
            }
        };
        fdapVar.getClass();
        fdapVar2.getClass();
        this.b = fdapVar;
        this.c = fdapVar2;
        this.d = fdapVar3;
    }
}
