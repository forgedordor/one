package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeka implements eekk {
    final /* synthetic */ eekk a;
    final /* synthetic */ ExtendedFloatingActionButton b;

    public eeka(ExtendedFloatingActionButton extendedFloatingActionButton, eekk eekkVar) {
        this.a = eekkVar;
        this.b = extendedFloatingActionButton;
    }

    @Override // defpackage.eekk
    public final int a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        int i = extendedFloatingActionButton.v;
        if (i != -1) {
            return (i == 0 || i == -2) ? this.a.a() : i;
        }
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return this.a.a();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.height == -2) {
            return this.a.a();
        }
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        int i2 = 0;
        if ((extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) != null) {
            i2 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return (view.getHeight() - i2) - paddingTop;
    }

    @Override // defpackage.eekk
    public final int b() {
        return this.b.q;
    }

    @Override // defpackage.eekk
    public final int c() {
        return this.b.p;
    }

    @Override // defpackage.eekk
    public final int d() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return this.a.d();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width == -2) {
            return this.a.d();
        }
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        int i = 0;
        if ((extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) != null) {
            i = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return (view.getWidth() - i) - paddingLeft;
    }

    @Override // defpackage.eekk
    public final ViewGroup.LayoutParams e() {
        int i = this.b.v;
        if (i == 0) {
            i = -2;
        }
        return new ViewGroup.LayoutParams(-1, i);
    }
}
