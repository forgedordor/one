package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acxx extends AnimatorListenerAdapter {
    final /* synthetic */ acxy a;

    public acxx(acxy acxyVar) {
        this.a = acxyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        acxy acxyVar = this.a;
        acxyVar.s.setVisibility(8);
        LottieAnimationView lottieAnimationView = acxyVar.t;
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.l(-1);
        lottieAnimationView.d();
    }
}
