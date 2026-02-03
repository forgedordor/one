package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzbv extends AnimatorListenerAdapter {
    final /* synthetic */ ExpandableDialogView a;

    public dzbv(ExpandableDialogView expandableDialogView) {
        this.a = expandableDialogView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ExpandableDialogView expandableDialogView = this.a;
        expandableDialogView.requestLayout();
        expandableDialogView.p(0.0f);
    }
}
