package defpackage;

import android.animation.Animator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cypp extends cypq {
    final /* synthetic */ View a;

    public cypp(View view) {
        this.a = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(4);
    }
}
