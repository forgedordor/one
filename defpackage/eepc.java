package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eepc extends AnimatorListenerAdapter {
    final /* synthetic */ eepe a;

    public eepc(eepe eepeVar) {
        this.a = eepeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        eepe eepeVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        List list = eepeVar.l;
        if (list == null || eepeVar.m) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((pnz) it.next()).b(eepeVar);
        }
    }
}
