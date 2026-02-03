package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class plx extends AnimatorListenerAdapter implements pmq {
    private final View a;
    private boolean b = false;

    public plx(View view) {
        this.a = view;
    }

    @Override // defpackage.pmq
    public final void c() {
        View view = this.a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? pnn.a(view) : 0.0f));
    }

    @Override // defpackage.pmq
    public final void d() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // defpackage.pmq
    public final /* synthetic */ void f(pmx pmxVar) {
        pmp.a(this, pmxVar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        pnn.c(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.b) {
            this.a.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        pnn.c(this.a, 1.0f);
    }

    @Override // defpackage.pmq
    public final void a(pmx pmxVar) {
    }

    @Override // defpackage.pmq
    public final void b(pmx pmxVar) {
    }

    @Override // defpackage.pmq
    public final void e(pmx pmxVar) {
    }

    @Override // defpackage.pmq
    public final void g(pmx pmxVar) {
    }
}
