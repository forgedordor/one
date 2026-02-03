package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czio extends dtbu {
    final /* synthetic */ czip a;

    public czio(czip czipVar) {
        this.a = czipVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        czip czipVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(czipVar.b, false);
        czipVar.a();
    }
}
