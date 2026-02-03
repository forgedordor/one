package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class co implements Animation.AnimationListener {
    public static final /* synthetic */ int e = 0;
    final /* synthetic */ hi a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ View c;
    final /* synthetic */ cp d;

    public co(hi hiVar, ViewGroup viewGroup, View view, cp cpVar) {
        this.a = hiVar;
        this.b = viewGroup;
        this.c = view;
        this.d = cpVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        final ViewGroup viewGroup = this.b;
        final View view = this.c;
        final cp cpVar = this.d;
        viewGroup.post(new Runnable() { // from class: cn
            @Override // java.lang.Runnable
            public final void run() {
                int i = co.e;
                viewGroup.endViewTransition(view);
                cp cpVar2 = cpVar;
                cpVar2.a.a.f(cpVar2);
            }
        });
        if (fr.ad(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (fr.ad(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
        }
    }
}
