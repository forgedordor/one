package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sw implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ te b;

    public sw(te teVar, ArrayList arrayList) {
        this.b = teVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wv wvVar = (wv) arrayList.get(i);
            te teVar = this.b;
            View view = wvVar.a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            teVar.d.add(wvVar);
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(teVar.h).setListener(new sy(teVar, wvVar, view, viewPropertyAnimatorAnimate)).start();
        }
        arrayList.clear();
        this.b.a.remove(arrayList);
    }
}
