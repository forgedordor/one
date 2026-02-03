package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eetm extends AnimatorListenerAdapter {
    final /* synthetic */ SideSheetBehavior a;

    public eetm(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        SideSheetBehavior sideSheetBehavior = this.a;
        sideSheetBehavior.w(5);
        WeakReference weakReference = sideSheetBehavior.j;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((View) sideSheetBehavior.j.get()).requestLayout();
    }
}
