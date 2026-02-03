package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeco extends lcl {
    final /* synthetic */ AppBarLayout a;
    final /* synthetic */ CoordinatorLayout b;
    final /* synthetic */ AppBarLayout.BaseBehavior c;

    public eeco(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
        this.a = appBarLayout;
        this.b = coordinatorLayout;
        this.c = baseBehavior;
    }

    @Override // defpackage.lcl
    public final void c(View view, lhg lhgVar) {
        super.c(view, lhgVar);
        lhgVar.s(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.a;
        if (appBarLayout.h() == 0) {
            return;
        }
        AppBarLayout.BaseBehavior baseBehavior = this.c;
        View viewF = AppBarLayout.BaseBehavior.F(this.b);
        if (viewF != null) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((eecu) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                    if (baseBehavior.z() != (-appBarLayout.h())) {
                        lhgVar.i(lhd.d);
                        lhgVar.O(true);
                    }
                    if (baseBehavior.z() != 0) {
                        if (!viewF.canScrollVertically(-1)) {
                            lhgVar.i(lhd.e);
                            lhgVar.O(true);
                            return;
                        } else {
                            if ((-appBarLayout.d()) != 0) {
                                lhgVar.i(lhd.e);
                                lhgVar.O(true);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // defpackage.lcl
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 4096) {
            this.a.m(false);
            return true;
        }
        if (i != 8192) {
            return super.i(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.c;
        if (baseBehavior.z() != 0) {
            CoordinatorLayout coordinatorLayout = this.b;
            View viewF = AppBarLayout.BaseBehavior.F(coordinatorLayout);
            if (!viewF.canScrollVertically(-1)) {
                this.a.m(true);
                return true;
            }
            AppBarLayout appBarLayout = this.a;
            int i2 = -appBarLayout.d();
            if (i2 != 0) {
                baseBehavior.c(coordinatorLayout, appBarLayout, viewF, 0, i2, new int[]{0, 0}, 1);
                return true;
            }
        }
        return false;
    }
}
