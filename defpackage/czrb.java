package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czrb extends AnimatorListenerAdapter {
    final /* synthetic */ czrc a;

    public czrb(czrc czrcVar) {
        this.a = czrcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        czrc czrcVar = this.a;
        czrcVar.l = 3;
        ViewGroup viewGroup = czrcVar.d;
        FrameLayout frameLayout = czrcVar.a;
        viewGroup.removeView(frameLayout);
        frameLayout.setVisibility(8);
    }
}
