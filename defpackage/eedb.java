package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eedb implements eecx {
    final /* synthetic */ eedc a;

    public eedb(eedc eedcVar) {
        this.a = eedcVar;
    }

    @Override // defpackage.eecr
    public final void gR(AppBarLayout appBarLayout, int i) {
        eedc eedcVar = this.a;
        eedcVar.e = i;
        lgt lgtVar = eedcVar.f;
        int iD = lgtVar != null ? lgtVar.d() : 0;
        int childCount = eedcVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = eedcVar.getChildAt(i2);
            eeda eedaVar = (eeda) childAt.getLayoutParams();
            eedi eediVarF = eedc.f(childAt);
            int i3 = eedaVar.a;
            if (i3 == 1) {
                eediVarF.c(kzz.b(-i, 0, eedcVar.d(childAt)));
            } else if (i3 == 2) {
                eediVarF.c(Math.round((-i) * eedaVar.b));
            }
        }
        eedcVar.j();
        if (eedcVar.d != null && iD > 0) {
            eedcVar.postInvalidateOnAnimation();
        }
        int height = eedcVar.getHeight();
        int minimumHeight = height - eedcVar.getMinimumHeight();
        int iE = height - eedcVar.e();
        int i4 = minimumHeight - iD;
        int i5 = eedcVar.e + i4;
        float fAbs = Math.abs(i);
        eelc eelcVar = eedcVar.a;
        float f = i4;
        float f2 = iE / f;
        eelcVar.C(Math.min(1.0f, f2));
        eelcVar.d = i5;
        float f3 = fAbs / f;
        eelcVar.B(f3);
        eelc eelcVar2 = eedcVar.b;
        eelcVar2.C(Math.min(1.0f, f2));
        eelcVar2.d = i5;
        eelcVar2.B(f3);
    }
}
