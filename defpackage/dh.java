package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dh extends hj {
    public dh(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private final void k(Map map, View view) {
        int[] iArr = ley.a;
        String strF = len.f(view);
        if (strF != null) {
            map.put(strF, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    childAt.getClass();
                    k(map, childAt);
                }
            }
        }
    }

    private static final void l(csq csqVar, final Collection collection) {
        fcvh.w(csqVar.entrySet(), new fdap() { // from class: cm
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                View view = (View) entry.getValue();
                int[] iArr = ley.a;
                return Boolean.valueOf(fcva.az(collection, len.f(view)));
            }
        }, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03c9 A[LOOP:17: B:132:0x03c3->B:134:0x03c9, LOOP_END] */
    /* JADX WARN: Type inference failed for: r29v0, types: [dh, hj] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object] */
    @Override // defpackage.hj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.List r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh.a(java.util.List, boolean):void");
    }
}
