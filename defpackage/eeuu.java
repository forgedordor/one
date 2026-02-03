package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeuu extends eeuw {
    @Override // defpackage.eeuw
    public final void a(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        if (f >= 0.5f) {
            view = view2;
        }
        RectF rectFB = b(tabLayout, view);
        float fA = f < 0.5f ? eecd.a(1.0f, 0.0f, 0.0f, 0.5f, f) : eecd.a(0.0f, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) rectFB.left, drawable.getBounds().top, (int) rectFB.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fA * 255.0f));
    }
}
