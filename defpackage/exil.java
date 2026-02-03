package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.research.ink.libs.buttons.ColorSelectionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exil extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ ColorSelectionButton b;

    public exil(ColorSelectionButton colorSelectionButton, boolean z) {
        this.a = z;
        this.b = colorSelectionButton;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ColorSelectionButton colorSelectionButton = this.b;
        boolean z = this.a;
        colorSelectionButton.setScaleX(z ? colorSelectionButton.a : 1.0f);
        colorSelectionButton.setScaleY(z ? colorSelectionButton.a : 1.0f);
        colorSelectionButton.d = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
