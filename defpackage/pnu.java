package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pnu extends AnimatorListenerAdapter implements pmq {
    final /* synthetic */ pnw a;
    private final ViewGroup b;
    private final View c;
    private final View d;
    private boolean e = true;

    public pnu(pnw pnwVar, ViewGroup viewGroup, View view, View view2) {
        this.a = pnwVar;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
    }

    private final void h() {
        this.d.setTag(R.id.save_overlay_view, null);
        this.b.getOverlay().remove(this.c);
        this.e = false;
    }

    @Override // defpackage.pmq
    public final void a(pmx pmxVar) {
        if (this.e) {
            h();
        }
    }

    @Override // defpackage.pmq
    public final void b(pmx pmxVar) {
        pmxVar.I(this);
    }

    @Override // defpackage.pmq
    public final /* synthetic */ void f(pmx pmxVar) {
        pmp.a(this, pmxVar);
    }

    @Override // defpackage.pmq
    public final /* synthetic */ void g(pmx pmxVar) {
        pmp.b(this, pmxVar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.b.getOverlay().remove(this.c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.c;
        if (view.getParent() == null) {
            ley.k(this.b, view);
        } else {
            this.a.n();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.d;
            View view2 = this.c;
            view.setTag(R.id.save_overlay_view, view2);
            ley.k(this.b, view2);
            this.e = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // defpackage.pmq
    public final void c() {
    }

    @Override // defpackage.pmq
    public final void d() {
    }

    @Override // defpackage.pmq
    public final void e(pmx pmxVar) {
    }
}
