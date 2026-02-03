package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pob extends AnimatorListenerAdapter {
    final /* synthetic */ poe a;

    public pob(poe poeVar) {
        this.a = poeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        poe poeVar = this.a;
        ArrayList arrayList = new ArrayList(poeVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pnz) arrayList.get(i)).b(poeVar);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        poe poeVar = this.a;
        ArrayList arrayList = new ArrayList(poeVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pnz) arrayList.get(i)).c(poeVar);
        }
    }
}
