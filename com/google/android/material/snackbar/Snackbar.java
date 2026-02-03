package com.google.android.material.snackbar;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.eeul;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class Snackbar extends BaseTransientBottomBar {
    private static final int[] u = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    private final AccessibilityManager v;
    private boolean w;

    /* compiled from: PG */
    public static final class SnackbarLayout extends eeul {
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // defpackage.eeul, android.widget.FrameLayout, android.view.View
        protected final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        super(context, viewGroup, view, snackbarContentLayout);
        this.v = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static Snackbar p(View view, int i, int i2) {
        return q(view, view.getResources().getText(i), i2);
    }

    public static Snackbar q(View view, CharSequence charSequence, int i) {
        return r(null, view, charSequence, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[LOOP:0: B:3:0x0002->B:36:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.material.snackbar.Snackbar r(android.content.Context r6, android.view.View r7, java.lang.CharSequence r8, int r9) {
        /*
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r2 == 0) goto L9
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L9:
            boolean r2 = r7 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L1c
            int r1 = r7.getId()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 != r2) goto L19
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L19:
            r1 = r7
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L1c:
            if (r7 == 0) goto L2a
            android.view.ViewParent r7 = r7.getParent()
            boolean r2 = r7 instanceof android.view.View
            if (r2 == 0) goto L29
            android.view.View r7 = (android.view.View) r7
            goto L2a
        L29:
            r7 = r0
        L2a:
            if (r7 != 0) goto L2
            r7 = r1
        L2d:
            if (r7 == 0) goto L68
            if (r6 != 0) goto L35
            android.content.Context r6 = r7.getContext()
        L35:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r6)
            int[] r1 = com.google.android.material.snackbar.Snackbar.u
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r1)
            r2 = 0
            r3 = -1
            int r4 = r1.getResourceId(r2, r3)
            r5 = 1
            int r5 = r1.getResourceId(r5, r3)
            r1.recycle()
            r1 = 2131624210(0x7f0e0112, float:1.8875593E38)
            if (r4 == r3) goto L57
            if (r5 == r3) goto L57
            r1 = 2131624529(0x7f0e0251, float:1.887624E38)
        L57:
            android.view.View r0 = r0.inflate(r1, r7, r2)
            com.google.android.material.snackbar.SnackbarContentLayout r0 = (com.google.android.material.snackbar.SnackbarContentLayout) r0
            com.google.android.material.snackbar.Snackbar r1 = new com.google.android.material.snackbar.Snackbar
            r1.<init>(r6, r7, r0, r0)
            r1.t(r8)
            r1.k = r9
            return r1
        L68:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "No suitable parent found from the given view. Please provide a valid view."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.Snackbar.r(android.content.Context, android.view.View, java.lang.CharSequence, int):com.google.android.material.snackbar.Snackbar");
    }

    private final TextView w() {
        return x().a;
    }

    private final SnackbarContentLayout x() {
        return (SnackbarContentLayout) this.j.getChildAt(0);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final int a() {
        int i = this.k;
        if (i == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.v.getRecommendedTimeoutMillis(i, (true != this.w ? 0 : 4) | 3);
        }
        if (this.w && this.v.isTouchExplorationEnabled()) {
            return -2;
        }
        return i;
    }

    public final void s(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button button = x().b;
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            button.setVisibility(8);
            button.setOnClickListener(null);
            this.w = false;
        } else {
            this.w = true;
            button.setVisibility(0);
            button.setText(charSequence);
            button.setOnClickListener(new View.OnClickListener() { // from class: eeun
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    onClickListener.onClick(view);
                    this.a.f(1);
                }
            });
        }
    }

    public final void t(CharSequence charSequence) {
        w().setText(charSequence);
    }

    public final void u(int i) {
        w().setMaxLines(i);
    }

    public final void v(int i, View.OnClickListener onClickListener) {
        s(this.i.getText(i), onClickListener);
    }
}
