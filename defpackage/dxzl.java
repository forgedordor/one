package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxzl extends AnimatorListenerAdapter {
    final /* synthetic */ DrawableBadgeViewHolder a;

    public dxzl(DrawableBadgeViewHolder drawableBadgeViewHolder) {
        this.a = drawableBadgeViewHolder;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        DrawableBadgeViewHolder drawableBadgeViewHolder = this.a;
        drawableBadgeViewHolder.a.setVisibility(8);
        drawableBadgeViewHolder.b.f(null);
    }
}
