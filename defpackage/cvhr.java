package defpackage;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvhr implements Animator.AnimatorListener {
    final /* synthetic */ int a;
    final /* synthetic */ cvhs b;

    public cvhr(cvhs cvhsVar, int i) {
        this.a = i;
        this.b = cvhsVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        cvhs cvhsVar = this.b;
        cvhsVar.l = cvhsVar.a.getHeight() == 0 ? 5 : 3;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        cvhs cvhsVar = this.b;
        if (i == 0) {
            cvhsVar.l = 5;
            cvhsVar.i.setVisibility(8);
        } else {
            cvhsVar.l = 3;
            cvhsVar.a.setLayoutTransition(cvhsVar.b);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        cvhs cvhsVar = this.b;
        if (i > 0) {
            cvhsVar.i.setVisibility(0);
        }
        LinearLayout linearLayout = cvhsVar.a;
        LayoutTransition layoutTransition = linearLayout.getLayoutTransition();
        if (layoutTransition != null) {
            Animator animator2 = layoutTransition.getAnimator(0);
            if (animator2 != null) {
                animator2.cancel();
            }
            Animator animator3 = layoutTransition.getAnimator(1);
            if (animator3 != null) {
                animator3.cancel();
            }
            linearLayout.setLayoutTransition(null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
