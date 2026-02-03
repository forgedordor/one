package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchBox;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czys extends AnimatorListenerAdapter {
    final /* synthetic */ ZeroStateSearchBox a;

    public czys(ZeroStateSearchBox zeroStateSearchBox) {
        this.a = zeroStateSearchBox;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ZeroStateSearchBox zeroStateSearchBox = this.a;
        View view = zeroStateSearchBox.g;
        if (view != null) {
            view.setVisibility(8);
        }
        zeroStateSearchBox.h = null;
    }
}
