package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eedu extends eeeb {
    @Override // defpackage.eeeb
    public final int a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    }

    @Override // defpackage.eeeb
    public final int b() {
        return 1;
    }

    @Override // defpackage.eeeb
    public final ViewPropertyAnimator c(View view, int i) {
        return view.animate().translationY(i);
    }

    @Override // defpackage.eeeb
    public final void d() {
    }
}
