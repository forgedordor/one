package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eekn extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ eeks b;
    private boolean c;

    public eekn(eeks eeksVar, boolean z) {
        this.a = z;
        this.b = eeksVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        eeks eeksVar = this.b;
        eeksVar.A = 0;
        eeksVar.v = null;
        if (this.c) {
            return;
        }
        FloatingActionButton floatingActionButton = eeksVar.B;
        boolean z = this.a;
        floatingActionButton.f(true != z ? 4 : 8, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        eeks eeksVar = this.b;
        eeksVar.B.f(0, this.a);
        eeksVar.A = 1;
        eeksVar.v = animator;
        this.c = false;
    }
}
