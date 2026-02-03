package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.messaging.R;
import defpackage.eegy;
import defpackage.eegz;
import defpackage.eeha;
import defpackage.eehb;
import defpackage.eekw;
import defpackage.eelj;
import defpackage.eelm;
import defpackage.eemh;
import defpackage.eexh;
import defpackage.lhe;
import defpackage.lhg;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ChipGroup extends eelj {
    public final eekw a;
    private int f;
    private int g;
    private final int h;
    private final eeha i;

    public ChipGroup(Context context) {
        this(context, null);
    }

    public final boolean a(int i) {
        return getChildAt(i).getVisibility() == 0;
    }

    public final boolean b() {
        return this.a.c;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof eegz);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new eegz();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new eegz(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.h;
        if (i != -1) {
            eekw eekwVar = this.a;
            eelm eelmVar = (eelm) eekwVar.a.get(Integer.valueOf(i));
            if (eelmVar != null && eekwVar.b(eelmVar)) {
                eekwVar.a();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        lhg lhgVar = new lhg(accessibilityNodeInfo);
        if (this.d) {
            i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if ((getChildAt(i2) instanceof Chip) && a(i2)) {
                    i++;
                }
            }
        } else {
            i = -1;
        }
        lhgVar.u(lhe.a(this.e, i, true != b() ? 2 : 1));
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.i.a = onHierarchyChangeListener;
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new eegz(layoutParams);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(eexh.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ChipGroup), attributeSet, i);
        eekw eekwVar = new eekw();
        this.a = eekwVar;
        this.i = new eeha(this);
        TypedArray typedArrayA = eemh.a(getContext(), attributeSet, eehb.b, i, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayA.getDimensionPixelOffset(1, 0);
        int dimensionPixelOffset2 = typedArrayA.getDimensionPixelOffset(2, dimensionPixelOffset);
        if (this.f != dimensionPixelOffset2) {
            this.f = dimensionPixelOffset2;
            this.c = dimensionPixelOffset2;
            requestLayout();
        }
        int dimensionPixelOffset3 = typedArrayA.getDimensionPixelOffset(3, dimensionPixelOffset);
        if (this.g != dimensionPixelOffset3) {
            this.g = dimensionPixelOffset3;
            this.b = dimensionPixelOffset3;
            requestLayout();
        }
        this.d = typedArrayA.getBoolean(5, false);
        boolean z = typedArrayA.getBoolean(6, false);
        if (eekwVar.c != z) {
            eekwVar.c = z;
            boolean zIsEmpty = eekwVar.b.isEmpty();
            Iterator it = eekwVar.a.values().iterator();
            while (it.hasNext()) {
                eekwVar.c((eelm) it.next(), false);
            }
            if (!zIsEmpty) {
                eekwVar.a();
            }
        }
        this.a.d = typedArrayA.getBoolean(4, false);
        this.h = typedArrayA.getResourceId(0, -1);
        typedArrayA.recycle();
        this.a.e = new eegy();
        super.setOnHierarchyChangeListener(this.i);
        setImportantForAccessibility(1);
    }
}
