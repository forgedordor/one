package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eeuw {
    static RectF b(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.z || !(view instanceof eevh)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        eevh eevhVar = (eevh) view;
        View[] viewArr = {eevhVar.a, eevhVar.b, eevhVar.c};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view2 = viewArr[i];
            if (view2 != null && view2.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view2.getLeft()) : view2.getLeft();
                iMax = z ? Math.max(iMax, view2.getRight()) : view2.getRight();
                z = true;
            }
        }
        int i2 = iMax - iMin;
        View[] viewArr2 = {eevhVar.a, eevhVar.b, eevhVar.c};
        int iMax2 = 0;
        int iMin2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view3 = viewArr2[i3];
            if (view3 != null && view3.getVisibility() == 0) {
                iMin2 = z2 ? Math.min(iMin2, view3.getTop()) : view3.getTop();
                iMax2 = z2 ? Math.max(iMax2, view3.getBottom()) : view3.getBottom();
                z2 = true;
            }
        }
        int i4 = iMax2 - iMin2;
        int iA = (int) eemo.a(eevhVar.getContext(), 24);
        if (i2 < iA) {
            i2 = iA;
        }
        int left = (eevhVar.getLeft() + eevhVar.getRight()) / 2;
        int top = (eevhVar.getTop() + eevhVar.getBottom()) / 2;
        int i5 = i2 / 2;
        return new RectF(left - i5, top - (i4 / 2), left + i5, (left / 2) + top);
    }

    public void a(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFB = b(tabLayout, view);
        RectF rectFB2 = b(tabLayout, view2);
        drawable.setBounds(eecd.b((int) rectFB.left, (int) rectFB2.left, f), drawable.getBounds().top, eecd.b((int) rectFB.right, (int) rectFB2.right, f), drawable.getBounds().bottom);
    }
}
