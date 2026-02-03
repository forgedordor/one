package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeut extends eeuw {
    private static float c(float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    private static float d(float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    @Override // defpackage.eeuw
    public final void a(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fD;
        float fC;
        RectF rectFB = b(tabLayout, view);
        RectF rectFB2 = b(tabLayout, view2);
        if (rectFB.left < rectFB2.left) {
            fD = c(f);
            fC = d(f);
        } else {
            fD = d(f);
            fC = c(f);
        }
        drawable.setBounds(eecd.b((int) rectFB.left, (int) rectFB2.left, fD), drawable.getBounds().top, eecd.b((int) rectFB.right, (int) rectFB2.right, fC), drawable.getBounds().bottom);
    }
}
