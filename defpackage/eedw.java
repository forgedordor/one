package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eedw extends eeeb {
    @Override // defpackage.eeeb
    public final int a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredWidth() + marginLayoutParams.rightMargin;
    }

    @Override // defpackage.eeeb
    public final int b() {
        return 0;
    }

    @Override // defpackage.eeeb
    public final ViewPropertyAnimator c(View view, int i) {
        return view.animate().translationX(i);
    }

    @Override // defpackage.eeeb
    public final void d() {
    }
}
