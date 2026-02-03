package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eekh extends eejv {
    final /* synthetic */ ExtendedFloatingActionButton c;
    private final eekk d;
    private final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eekh(ExtendedFloatingActionButton extendedFloatingActionButton, eejt eejtVar, eekk eekkVar, boolean z) {
        super(extendedFloatingActionButton, eejtVar);
        this.c = extendedFloatingActionButton;
        this.d = eekkVar;
        this.e = z;
    }

    @Override // defpackage.eejv, defpackage.eekt
    public final AnimatorSet a() {
        eeci eeciVarC = c();
        if (eeciVarC.f("width")) {
            PropertyValuesHolder[] propertyValuesHolderArrG = eeciVarC.g("width");
            propertyValuesHolderArrG[0].setFloatValues(this.c.getWidth(), this.d.d());
            eeciVarC.e("width", propertyValuesHolderArrG);
        }
        if (eeciVarC.f("height")) {
            PropertyValuesHolder[] propertyValuesHolderArrG2 = eeciVarC.g("height");
            propertyValuesHolderArrG2[0].setFloatValues(this.c.getHeight(), this.d.a());
            eeciVarC.e("height", propertyValuesHolderArrG2);
        }
        if (eeciVarC.f("paddingStart")) {
            PropertyValuesHolder[] propertyValuesHolderArrG3 = eeciVarC.g("paddingStart");
            propertyValuesHolderArrG3[0].setFloatValues(this.c.getPaddingStart(), this.d.c());
            eeciVarC.e("paddingStart", propertyValuesHolderArrG3);
        }
        if (eeciVarC.f("paddingEnd")) {
            PropertyValuesHolder[] propertyValuesHolderArrG4 = eeciVarC.g("paddingEnd");
            propertyValuesHolderArrG4[0].setFloatValues(this.c.getPaddingEnd(), this.d.b());
            eeciVarC.e("paddingEnd", propertyValuesHolderArrG4);
        }
        if (eeciVarC.f("labelOpacity")) {
            PropertyValuesHolder[] propertyValuesHolderArrG5 = eeciVarC.g("labelOpacity");
            boolean z = this.e;
            propertyValuesHolderArrG5[0].setFloatValues(true != z ? 1.0f : 0.0f, true != z ? 0.0f : 1.0f);
            eeciVarC.e("labelOpacity", propertyValuesHolderArrG5);
        }
        return super.b(eeciVarC);
    }

    @Override // defpackage.eejv, defpackage.eekt
    public final void f() {
        super.f();
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        extendedFloatingActionButton.s = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        eekk eekkVar = this.d;
        layoutParams.width = eekkVar.e().width;
        layoutParams.height = eekkVar.e().height;
    }

    @Override // defpackage.eejv, defpackage.eekt
    public final void g(Animator animator) {
        super.g(animator);
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        extendedFloatingActionButton.r = this.e;
        extendedFloatingActionButton.s = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
    }

    @Override // defpackage.eekt
    public final int h() {
        return this.e ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // defpackage.eekt
    public final void i() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        boolean z = this.e;
        extendedFloatingActionButton.r = z;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!z) {
            extendedFloatingActionButton.u = layoutParams.width;
            extendedFloatingActionButton.v = layoutParams.height;
        }
        eekk eekkVar = this.d;
        layoutParams.width = eekkVar.e().width;
        layoutParams.height = eekkVar.e().height;
        if (z) {
            extendedFloatingActionButton.t(extendedFloatingActionButton.t);
        } else if (extendedFloatingActionButton.getText() != null && extendedFloatingActionButton.getText() != "") {
            extendedFloatingActionButton.t(ColorStateList.valueOf(0));
        }
        extendedFloatingActionButton.setPaddingRelative(eekkVar.c(), extendedFloatingActionButton.getPaddingTop(), eekkVar.b(), extendedFloatingActionButton.getPaddingBottom());
        extendedFloatingActionButton.requestLayout();
    }

    @Override // defpackage.eekt
    public final boolean j() {
        boolean z = this.e;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        return z == extendedFloatingActionButton.r || ((MaterialButton) extendedFloatingActionButton).d == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }

    @Override // defpackage.eekt
    public final void k() {
    }
}
