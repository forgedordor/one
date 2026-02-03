package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pkx implements Animation.AnimationListener {
    final /* synthetic */ SwipeRefreshLayout a;

    public pkx(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ple pleVar;
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        if (!swipeRefreshLayout.b) {
            swipeRefreshLayout.b();
            return;
        }
        swipeRefreshLayout.h.setAlpha(255);
        swipeRefreshLayout.h.start();
        if (swipeRefreshLayout.i && (pleVar = swipeRefreshLayout.a) != null) {
            ((dtye) pleVar).c.b();
        }
        swipeRefreshLayout.c = swipeRefreshLayout.d.getTop();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
