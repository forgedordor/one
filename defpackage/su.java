package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class su implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ te b;

    public su(te teVar, ArrayList arrayList) {
        this.b = teVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            td tdVar = (td) arrayList.get(i);
            te teVar = this.b;
            wv wvVar = tdVar.a;
            int i2 = tdVar.b;
            int i3 = tdVar.c;
            int i4 = tdVar.d;
            int i5 = tdVar.e;
            View view = wvVar.a;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (i6 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i7 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            teVar.e.add(wvVar);
            viewPropertyAnimatorAnimate.setDuration(250L).setListener(new sz(teVar, wvVar, i6, view, i7, viewPropertyAnimatorAnimate)).start();
        }
        arrayList.clear();
        this.b.b.remove(arrayList);
    }
}
