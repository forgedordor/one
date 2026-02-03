package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmx {
    public static final View a(View view, View view2, int i) {
        int nextFocusForwardId;
        if (i == 1) {
            if (view.getId() != -1) {
                return d(view2, view, new jmv(view2, view));
            }
            return null;
        }
        if (i == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
            return b(view2, view, nextFocusForwardId);
        }
        return null;
    }

    public static final View b(View view, View view2, int i) {
        return d(view, view2, new jmw(i));
    }

    public static final void c(View view, ArrayList arrayList, int i) {
        view.addFocusables(arrayList, i, view.isInTouchMode() ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.View d(android.view.View r4, android.view.View r5, defpackage.fdap r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            android.view.View r1 = e(r5, r6, r1)
            if (r1 != 0) goto L1d
            if (r5 != r4) goto Lb
            goto L1d
        Lb:
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L1c
            boolean r2 = r1 instanceof android.view.View
            if (r2 != 0) goto L16
            goto L1c
        L16:
            android.view.View r1 = (android.view.View) r1
            r3 = r1
            r1 = r5
            r5 = r3
            goto L2
        L1c:
            return r0
        L1d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmx.d(android.view.View, android.view.View, fdap):android.view.View");
    }

    private static final View e(View view, fdap fdapVar, View view2) {
        View viewE;
        if (((Boolean) fdapVar.invoke(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != view2 && (viewE = e(childAt, fdapVar, view2)) != null) {
                return viewE;
            }
        }
        return null;
    }
}
