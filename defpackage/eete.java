package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eete extends eetg {
    final SideSheetBehavior a;

    public eete(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // defpackage.eetg
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // defpackage.eetg
    public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // defpackage.eetg
    public final int c() {
        int iD = d();
        SideSheetBehavior sideSheetBehavior = this.a;
        return Math.max(0, (iD - sideSheetBehavior.f) - sideSheetBehavior.i);
    }

    @Override // defpackage.eetg
    public final int d() {
        return this.a.g;
    }

    @Override // defpackage.eetg
    public final int e() {
        return this.a.g;
    }

    @Override // defpackage.eetg
    public final int f() {
        return c();
    }

    @Override // defpackage.eetg
    public final int g(View view) {
        return view.getLeft() - this.a.i;
    }

    @Override // defpackage.eetg
    public final int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // defpackage.eetg
    public final int i() {
        return 0;
    }

    @Override // defpackage.eetg
    public final void j(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.rightMargin = i;
    }

    @Override // defpackage.eetg
    public final void k(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.a.g;
        if (i <= i3) {
            marginLayoutParams.rightMargin = i3 - i;
        }
    }

    @Override // defpackage.eetg
    public final boolean l(float f) {
        return f < 0.0f;
    }

    @Override // defpackage.eetg
    public final boolean m(View view) {
        return view.getLeft() > (d() + c()) / 2;
    }

    @Override // defpackage.eetg
    public final boolean n(float f, float f2) {
        return eeth.a(f, f2) && Math.abs(f) > 500.0f;
    }

    @Override // defpackage.eetg
    public final boolean o(View view, float f) {
        return Math.abs(((float) view.getRight()) + (f * this.a.e)) > 0.5f;
    }

    @Override // defpackage.eetg
    public final void p() {
        c();
    }
}
