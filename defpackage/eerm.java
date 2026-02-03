package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.search.SearchView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eerm extends AnimatorListenerAdapter {
    final /* synthetic */ eerp a;

    public eerm(eerp eerpVar) {
        this.a = eerpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        SearchView searchView = this.a.a;
        if (!searchView.m()) {
            searchView.g();
        }
        searchView.n(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        eerp eerpVar = this.a;
        eerpVar.b.setVisibility(0);
        eerpVar.a.n(3);
    }
}
