package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.search.SearchView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eern extends AnimatorListenerAdapter {
    final /* synthetic */ eerp a;

    public eern(eerp eerpVar) {
        this.a = eerpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        eerp eerpVar = this.a;
        eerpVar.b.setVisibility(8);
        SearchView searchView = eerpVar.a;
        if (!searchView.m()) {
            searchView.d();
        }
        searchView.n(2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a.n(1);
    }
}
