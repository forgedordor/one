package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.EditText;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.search.SearchBar;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eero extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ eerp b;

    public eero(eerp eerpVar, boolean z) {
        this.a = z;
        this.b = eerpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z = this.a;
        float f = true != z ? 0.0f : 1.0f;
        eerp eerpVar = this.b;
        eerpVar.f(f);
        EditText editText = eerpVar.d;
        editText.setAlpha(1.0f);
        SearchBar searchBar = eerpVar.g;
        if (searchBar != null) {
            searchBar.D.setAlpha(1.0f);
        }
        editText.setClipBounds(null);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = eerpVar.b;
        clippableRoundedCornerLayout.a = null;
        clippableRoundedCornerLayout.b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        clippableRoundedCornerLayout.invalidate();
        if (z) {
            return;
        }
        eerpVar.e.i = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.f(true != this.a ? 1.0f : 0.0f);
    }
}
