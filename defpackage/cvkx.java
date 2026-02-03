package defpackage;

import android.animation.Animator;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvkx implements Animator.AnimatorListener {
    final /* synthetic */ cvkz a;

    public cvkx(cvkz cvkzVar) {
        this.a = cvkzVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ImageView imageView = this.a.e;
        imageView.setColorFilter(eehg.b(imageView, R.attr.colorInactiveComposeIcon));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
