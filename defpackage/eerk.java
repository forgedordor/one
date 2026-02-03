package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eerk extends AnimatorListenerAdapter {
    final /* synthetic */ eerp a;

    public eerk(eerp eerpVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        eerp eerpVar = this.a;
        eerpVar.b.setVisibility(0);
        SearchBar searchBar = eerpVar.g;
        eeqk eeqkVar = searchBar.H;
        View view = searchBar.I;
        if (view instanceof eecc) {
            ((eecc) view).a();
        }
        if (view != 0) {
            view.setAlpha(0.0f);
        }
    }
}
