package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aids implements eecx {
    final /* synthetic */ View a;
    final /* synthetic */ View b;

    public aids(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // defpackage.eecr
    public final void gR(AppBarLayout appBarLayout, int i) {
        float fAbs;
        int iH = appBarLayout.h();
        if (iH > 0) {
            float f = iH;
            fAbs = (f - Math.abs(i)) / f;
        } else {
            fAbs = 0.0f;
        }
        float f2 = fAbs + fAbs;
        this.a.setAlpha(Math.max(1.0f - f2, 0.0f));
        this.b.setAlpha(Math.max(f2 - 1.0f, 0.0f));
    }
}
