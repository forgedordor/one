package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import defpackage.eelk;
import defpackage.eelt;
import defpackage.lcl;
import defpackage.ley;
import defpackage.of;
import defpackage.oq;
import defpackage.ud;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class NavigationMenuItemView extends eelk implements oq {
    private static final int[] e = {R.attr.state_checked};
    public boolean c;
    boolean d;
    private int f;
    private final CheckedTextView g;
    private FrameLayout h;
    private of i;
    private final lcl j;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    @Override // defpackage.oq
    public final of a() {
        return this.i;
    }

    @Override // defpackage.oq
    public final boolean e() {
        return false;
    }

    @Override // defpackage.oq
    public final void f(of ofVar) {
        StateListDrawable stateListDrawable;
        this.i = ofVar;
        int i = ofVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(true != ofVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.google.android.apps.messaging.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(e, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        boolean zIsCheckable = ofVar.isCheckable();
        refreshDrawableState();
        if (this.c != zIsCheckable) {
            this.c = zIsCheckable;
            this.j.e(this.g, 2048);
        }
        boolean zIsChecked = ofVar.isChecked();
        refreshDrawableState();
        CheckedTextView checkedTextView = this.g;
        checkedTextView.setChecked(zIsChecked);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (zIsChecked && this.d) ? 1 : 0);
        setEnabled(ofVar.isEnabled());
        checkedTextView.setText(ofVar.e);
        Drawable icon = ofVar.getIcon();
        if (icon != null) {
            int i2 = this.f;
            icon.setBounds(0, 0, i2, i2);
        }
        checkedTextView.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = ofVar.getActionView();
        if (actionView != null) {
            if (this.h == null) {
                this.h = (FrameLayout) ((ViewStub) findViewById(com.google.android.apps.messaging.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (actionView.getParent() != null) {
                ((ViewGroup) actionView.getParent()).removeView(actionView);
            }
            this.h.removeAllViews();
            this.h.addView(actionView);
        }
        setContentDescription(ofVar.m);
        setTooltipText(ofVar.n);
        of ofVar2 = this.i;
        if (ofVar2.e == null && ofVar2.getIcon() == null && this.i.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.h;
            if (frameLayout != null) {
                ud udVar = (ud) frameLayout.getLayoutParams();
                udVar.width = -1;
                this.h.setLayoutParams(udVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            ud udVar2 = (ud) frameLayout2.getLayoutParams();
            udVar2.width = -2;
            this.h.setLayoutParams(udVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        of ofVar = this.i;
        if (ofVar != null && ofVar.isCheckable() && ofVar.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, e);
        }
        return iArrOnCreateDrawableState;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        eelt eeltVar = new eelt(this);
        this.j = eeltVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.google.android.apps.messaging.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.f = context.getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.apps.messaging.R.id.design_menu_item_text);
        this.g = checkedTextView;
        ley.p(checkedTextView, eeltVar);
    }
}
