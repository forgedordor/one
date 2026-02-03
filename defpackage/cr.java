package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cr extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ hi d;
    final /* synthetic */ cs e;

    public cr(ViewGroup viewGroup, View view, boolean z, hi hiVar, cs csVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = hiVar;
        this.e = csVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        View view = this.b;
        ViewGroup viewGroup = this.a;
        viewGroup.endViewTransition(view);
        if (this.c) {
            int i = this.d.h;
            view.getClass();
            hh.b(i, view, viewGroup);
        }
        cs csVar = this.e;
        csVar.a.a.f(csVar);
        if (fr.ad(2)) {
            Log.v("FragmentManager", "Animator from operation " + this.d + " has ended.");
        }
    }
}
