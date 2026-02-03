package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eepb extends AnimatorListenerAdapter {
    final /* synthetic */ eepe a;

    public eepb(eepe eepeVar) {
        this.a = eepeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        eepe eepeVar = this.a;
        List list = eepeVar.l;
        if (list == null || eepeVar.m) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((pnz) it.next()).c(eepeVar);
        }
    }
}
