package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeek extends AnimatorListenerAdapter {
    final /* synthetic */ BottomSheetBehavior a;

    public eeek(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        bottomSheetBehavior.F(5);
        WeakReference weakReference = bottomSheetBehavior.B;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((View) bottomSheetBehavior.B.get()).requestLayout();
    }
}
