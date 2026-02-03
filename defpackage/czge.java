package defpackage;

import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czge implements Transition.TransitionListener {
    public boolean a;
    final /* synthetic */ czgf b;

    public czge(czgf czgfVar) {
        this.b = czgfVar;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        this.a = false;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.a = false;
        czgf czgfVar = this.b;
        czgfVar.h(czgfVar.N);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        this.a = false;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        this.a = true;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.a = true;
    }
}
