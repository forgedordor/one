package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eend extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public eend(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
