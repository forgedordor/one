package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import defpackage.efsh;
import defpackage.efsj;
import defpackage.eftb;
import defpackage.efte;
import defpackage.eftq;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class IntrinsicSizeFrameLayout extends FrameLayout {
    private static final efte a = new efte(IntrinsicSizeFrameLayout.class);
    private int b;
    private int c;
    private Object d;
    private final Rect e;

    public IntrinsicSizeFrameLayout(Context context) {
        super(context);
        this.b = 0;
        this.c = 0;
        this.e = new Rect();
        b(context, null, 0);
    }

    private final int a(int i, int i2) {
        if (i2 <= 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return mode == 0 ? View.MeasureSpec.makeMeasureSpec(this.b, 1073741824) : mode == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.b), 1073741824) : i;
    }

    private final void b(Context context, AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eftq.n, i, 0);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        efte efteVar = a;
        efteVar.b("CardViewIntrinsicAttribute(" + this.c + ", " + this.b + ")");
        if (eftb.a()) {
            efsj efsjVarH = efsj.h(context);
            efsh efshVar = efsh.CONFIG_CARD_VIEW_INTRINSIC_HEIGHT;
            if (efsjVarH.t(efshVar)) {
                this.b = (int) efsj.h(context).a(context, efshVar);
            } else {
                efteVar.b("PartnerConfig.CONFIG_CARD_VIEW_INTRINSIC_HEIGHT not found");
            }
            efsj efsjVarH2 = efsj.h(context);
            efsh efshVar2 = efsh.CONFIG_CARD_VIEW_INTRINSIC_WIDTH;
            if (efsjVarH2.t(efshVar2)) {
                this.c = (int) efsj.h(context).a(context, efshVar2);
            } else {
                efteVar.b("PartnerConfig.CONFIG_CARD_VIEW_INTRINSIC_WIDTH not found");
            }
            efteVar.b("CardViewIntrinsicPartnerConfig(" + this.c + ", " + this.b + ")");
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.d = windowInsets;
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d == null) {
            requestApplyInsets();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L49
            android.content.Context r0 = r3.getContext()
            java.lang.Class<android.view.WindowManager> r1 = android.view.WindowManager.class
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.WindowMetrics r0 = defpackage.aee$$ExternalSyntheticApiModelOutline0.m(r0)
            android.graphics.Rect r1 = r3.e
            android.graphics.Rect r0 = defpackage.aee$$ExternalSyntheticApiModelOutline0.m(r0)
            r1.set(r0)
            android.view.Display r0 = r3.getDisplay()
            if (r0 == 0) goto L49
            android.util.DisplayMetrics r2 = new android.util.DisplayMetrics
            r2.<init>()
            r0.getRealMetrics(r2)
            int r0 = r1.width()
            if (r0 <= 0) goto L49
            int r0 = r1.width()
            int r2 = r2.widthPixels
            if (r0 >= r2) goto L49
            r3.getWindowVisibleDisplayFrame(r1)
            int r4 = r1.width()
            r0 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            goto L4f
        L49:
            int r0 = r3.c
            int r4 = r3.a(r4, r0)
        L4f:
            int r0 = r3.b
            int r5 = r3.a(r5, r0)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupdesign.view.IntrinsicSizeFrameLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (eftb.a() && this.b == 0 && this.c == 0) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            setElevation(0.0f);
        }
        super.setLayoutParams(layoutParams);
    }

    public IntrinsicSizeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 0;
        this.e = new Rect();
        b(context, attributeSet, 0);
    }

    public IntrinsicSizeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 0;
        this.c = 0;
        this.e = new Rect();
        b(context, attributeSet, i);
    }
}
