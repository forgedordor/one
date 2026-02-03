package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eepl extends AnimatorListenerAdapter {
    final /* synthetic */ eepn a;

    public eepl(eepn eepnVar) {
        this.a = eepnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        eepn eepnVar = this.a;
        eepnVar.c = (eepnVar.c + 1) % eepnVar.b.e.length;
        eepnVar.d = true;
    }
}
