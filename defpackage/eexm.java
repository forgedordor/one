package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eexm extends pnw {
    private final eexq w;
    private final eexq x;
    private final List y = new ArrayList();

    protected eexm(eexq eexqVar, eexq eexqVar2) {
        this.w = eexqVar;
        this.x = eexqVar2;
    }

    private final Animator P(ViewGroup viewGroup, View view, boolean z) {
        int iA;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Q(arrayList, this.w, viewGroup, view, z);
        Q(arrayList, this.x, viewGroup, view, z);
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            Q(arrayList, (eexq) it.next(), viewGroup, view, z);
        }
        Context context = viewGroup.getContext();
        int i = eexp.a;
        if (this.b == -1 && (iA = eepx.a(context, R.attr.motionDurationLong1, -1)) != -1) {
            K(iA);
        }
        TimeInterpolator timeInterpolator = eecd.b;
        if (this.c == null) {
            L(eenh.a(context, R.attr.motionEasingEmphasizedInterpolator, timeInterpolator));
        }
        eece.a(animatorSet, arrayList);
        return animatorSet;
    }

    private static void Q(List list, eexq eexqVar, ViewGroup viewGroup, View view, boolean z) {
        if (eexqVar == null) {
            return;
        }
        Animator animatorA = z ? eexqVar.a(viewGroup, view) : eexqVar.b(viewGroup, view);
        if (animatorA != null) {
            list.add(animatorA);
        }
    }

    @Override // defpackage.pnw
    public final Animator f(ViewGroup viewGroup, View view, pnh pnhVar, pnh pnhVar2) {
        return P(viewGroup, view, false);
    }

    @Override // defpackage.pnw
    public final Animator g(ViewGroup viewGroup, View view, pnh pnhVar) {
        return P(viewGroup, view, true);
    }
}
