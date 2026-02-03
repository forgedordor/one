package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebwh extends AnimatorListenerAdapter {
    final /* synthetic */ ebwj a;

    public ebwh(ebwj ebwjVar) {
        this.a = ebwjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ebwj ebwjVar = this.a;
        RecyclerView recyclerView = ebwjVar.e;
        recyclerView.clearAnimation();
        ebwjVar.g.setVisibility(8);
        recyclerView.setTranslationY(0.0f);
    }
}
