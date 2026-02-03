package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class joq implements View.OnAttachStateChangeListener {
    final /* synthetic */ jgl a;
    final /* synthetic */ fdci b;

    public joq(jgl jglVar, fdci fdciVar) {
        this.a = jglVar;
        this.b = fdciVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        jgl jglVar = this.a;
        lvj lvjVarA = lxr.a(jglVar);
        if (lvjVarA == null) {
            itw.b(a.h(jglVar, "View tree for ", " has no ViewTreeLifecycleOwner"));
            throw new fcta();
        }
        this.b.a = jot.a(jglVar, lvjVarA.P());
        jglVar.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
