package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pnt extends AnimatorListenerAdapter implements pmq {
    private final View b;
    private final int c;
    private final ViewGroup d;
    private boolean f;
    boolean a = false;
    private final boolean e = true;

    public pnt(View view, int i) {
        this.b = view;
        this.c = i;
        this.d = (ViewGroup) view.getParent();
        i(true);
    }

    private final void h() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (!this.a) {
            pnn.d(this.b, this.c);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        i(false);
    }

    private final void i(boolean z) {
        ViewGroup viewGroup;
        if (!this.e || this.f == z || (viewGroup = this.d) == null) {
            return;
        }
        this.f = z;
        pnk.a(viewGroup, z);
    }

    @Override // defpackage.pmq
    public final void b(pmx pmxVar) {
        pmxVar.I(this);
    }

    @Override // defpackage.pmq
    public final void c() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        i(false);
        if (this.a) {
            return;
        }
        pnn.d(this.b, this.c);
    }

    @Override // defpackage.pmq
    public final void d() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        i(true);
        if (this.a) {
            return;
        }
        pnn.d(this.b, 0);
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
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (z) {
            return;
        }
        h();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (z) {
            pnn.d(this.b, 0);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // defpackage.pmq
    public final void a(pmx pmxVar) {
    }

    @Override // defpackage.pmq
    public final void e(pmx pmxVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
