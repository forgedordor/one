package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eetc extends eetg {
    final SideSheetBehavior a;

    public eetc(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // defpackage.eetg
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // defpackage.eetg
    public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // defpackage.eetg
    public final int c() {
        SideSheetBehavior sideSheetBehavior = this.a;
        return Math.max(0, sideSheetBehavior.h + sideSheetBehavior.i);
    }

    @Override // defpackage.eetg
    public final int d() {
        SideSheetBehavior sideSheetBehavior = this.a;
        return (-sideSheetBehavior.f) - sideSheetBehavior.i;
    }

    @Override // defpackage.eetg
    public final int e() {
        return this.a.i;
    }

    @Override // defpackage.eetg
    public final int f() {
        return -this.a.f;
    }

    @Override // defpackage.eetg
    public final int g(View view) {
        return view.getRight() + this.a.i;
    }

    @Override // defpackage.eetg
    public final int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // defpackage.eetg
    public final int i() {
        return 1;
    }

    @Override // defpackage.eetg
    public final void j(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.leftMargin = i;
    }

    @Override // defpackage.eetg
    public final void k(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        if (i <= this.a.g) {
            marginLayoutParams.leftMargin = i2;
        }
    }

    @Override // defpackage.eetg
    public final boolean l(float f) {
        return f > 0.0f;
    }

    @Override // defpackage.eetg
    public final boolean m(View view) {
        return view.getRight() < (c() - d()) / 2;
    }

    @Override // defpackage.eetg
    public final boolean n(float f, float f2) {
        return eeth.a(f, f2) && Math.abs(f) > 500.0f;
    }

    @Override // defpackage.eetg
    public final boolean o(View view, float f) {
        return Math.abs(((float) view.getLeft()) + (f * this.a.e)) > 0.5f;
    }

    @Override // defpackage.eetg
    public final void p() {
        c();
    }
}
