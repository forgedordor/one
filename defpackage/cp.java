package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cp extends hd {
    public final cq a;

    public cp(cq cqVar) {
        cqVar.getClass();
        this.a = cqVar;
    }

    @Override // defpackage.hd
    public final void a(ViewGroup viewGroup) {
        hi hiVar = this.a.a;
        View view = hiVar.a.Q;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        hiVar.f(this);
        if (fr.ad(2)) {
            Log.v("FragmentManager", a.h(hiVar, "Animation from operation ", " has been cancelled."));
        }
    }

    @Override // defpackage.hd
    public final void b(ViewGroup viewGroup) {
        Animation animation;
        cq cqVar = this.a;
        if (cqVar.b()) {
            cqVar.a.f(this);
            return;
        }
        Context context = viewGroup.getContext();
        hi hiVar = cqVar.a;
        View view = hiVar.a.Q;
        context.getClass();
        eh ehVarA = cqVar.a(context);
        if (ehVarA == null || (animation = ehVarA.a) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (hiVar.h != 1) {
            view.startAnimation(animation);
            hiVar.f(this);
            return;
        }
        viewGroup.startViewTransition(view);
        ei eiVar = new ei(animation, viewGroup, view);
        eiVar.setAnimationListener(new co(hiVar, viewGroup, view, this));
        view.startAnimation(eiVar);
        if (fr.ad(2)) {
            Log.v("FragmentManager", a.h(hiVar, "Animation from operation ", " has started."));
        }
    }
}
