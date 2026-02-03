package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class driq implements View.OnClickListener {
    final /* synthetic */ View[] a;
    final /* synthetic */ List b;
    final /* synthetic */ int c;
    final /* synthetic */ drir d;

    public driq(drir drirVar, View[] viewArr, List list, int i) {
        this.a = viewArr;
        this.b = list;
        this.c = i;
        this.d = drirVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 0;
        while (true) {
            View[] viewArr = this.a;
            if (i >= viewArr.length) {
                drhw.c().b().b = true;
                view.postOnAnimationDelayed(new drip(this, this.b, this.c), 200L);
                return;
            } else {
                View view2 = viewArr[i];
                view2.setOnClickListener(null);
                view2.setClickable(false);
                i++;
            }
        }
    }
}
