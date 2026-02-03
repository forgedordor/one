package defpackage;

import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dphw {
    public static final Point a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static final fdpl b(View view) {
        return new fdpb(new dphp(view, null));
    }

    public static final fdpl c(View view) {
        view.getClass();
        return fdqq.a(new dphs(b(view)));
    }

    public static final fdpl d(View view) {
        view.getClass();
        return fdqq.a(new dphv(b(view)));
    }

    public static final void e(final View view, View view2) {
        view.getClass();
        ldn ldnVar = new ldn() { // from class: dphi
            @Override // defpackage.ldn
            public final lgt ez(View view3, lgt lgtVar) {
                view3.getClass();
                int i = lgtVar.f(2).e;
                View view4 = view;
                view4.setPadding(view4.getPaddingLeft(), view4.getPaddingTop(), view4.getPaddingRight(), i);
                return lgtVar;
            }
        };
        int[] iArr = ley.a;
        len.k(view2, ldnVar);
    }

    public static final void f(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        viewGroup.setAccessibilityTraversalAfter(i);
    }

    public static final boolean g(View view) {
        return view.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
