package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sv implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ te b;

    public sv(te teVar, ArrayList arrayList) {
        this.b = teVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tc tcVar = (tc) arrayList.get(i);
            te teVar = this.b;
            wv wvVar = tcVar.a;
            View view = wvVar == null ? null : wvVar.a;
            wv wvVar2 = tcVar.b;
            View view2 = wvVar2 != null ? wvVar2.a : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(250L);
                teVar.g.add(tcVar.a);
                duration.translationX(tcVar.e - tcVar.c);
                duration.translationY(tcVar.f - tcVar.d);
                duration.alpha(0.0f).setListener(new ta(teVar, tcVar, duration, view)).start();
            }
            if (view2 != null) {
                ArrayList arrayList2 = teVar.g;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                arrayList2.add(tcVar.b);
                viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new tb(teVar, tcVar, viewPropertyAnimatorAnimate, view2)).start();
            }
        }
        arrayList.clear();
        this.b.c.remove(arrayList);
    }
}
