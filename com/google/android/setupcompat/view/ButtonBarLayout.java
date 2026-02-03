package com.google.android.setupcompat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.setupcompat.template.FooterActionButton;
import defpackage.efsj;
import defpackage.efte;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ButtonBarLayout extends LinearLayout {
    private static final efte a = new efte(ButtonBarLayout.class);
    private boolean b;
    private int c;
    private int d;
    private boolean e;

    public ButtonBarLayout(Context context) {
        super(context);
        this.b = false;
    }

    private final void b(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        int childCount = getChildCount();
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (z) {
                childAt.setTag(R.id.suc_customization_original_weight, Float.valueOf(layoutParams.weight));
                layoutParams.weight = 0.0f;
                layoutParams.leftMargin = 0;
            } else {
                Float f = (Float) childAt.getTag(R.id.suc_customization_original_weight);
                if (f != null) {
                    layoutParams.weight = f.floatValue();
                    z2 = z2;
                } else {
                    z2 = true;
                }
                if (c(childAt)) {
                    i2++;
                }
            }
            childAt.setLayoutParams(layoutParams);
            i++;
            z2 = z2;
        }
        setOrientation(z ? 1 : 0);
        if (!z2) {
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                } else {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        } else {
            a.f("Reorder the FooterActionButtons in the container");
            ArrayList arrayList = new ArrayList();
            if (i2 <= 1) {
                arrayList.addAll(Collections.nCopies(3, null));
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (i2 <= 1) {
                    if (c(childAt2)) {
                        arrayList.set(2, childAt2);
                    } else if (childAt2 instanceof FooterActionButton) {
                        arrayList.set(0, childAt2);
                    } else {
                        arrayList.set(1, childAt2);
                    }
                } else if (childAt2 instanceof FooterActionButton) {
                    arrayList.add(getChildAt(i3));
                } else {
                    arrayList.add(1, childAt2);
                }
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View view = (View) arrayList.get(i4);
                if (view != null) {
                    bringChildToFront(view);
                }
            }
        }
        if (!z) {
            setPadding(this.c, getPaddingTop(), this.d, getPaddingBottom());
            return;
        }
        if (getContext().getResources().getBoolean(R.bool.sucTwoPaneLayoutStyle) && efsj.r(getContext())) {
            setHorizontalGravity(8388613);
        } else {
            setHorizontalGravity(17);
        }
        this.c = getPaddingLeft();
        int paddingRight = getPaddingRight();
        this.d = paddingRight;
        int iMax = Math.max(this.c, paddingRight);
        setPadding(iMax, getPaddingTop(), iMax, getPaddingBottom());
    }

    private static final boolean c(View view) {
        return (view instanceof FooterActionButton) && ((FooterActionButton) view).b;
    }

    public final void a(boolean z) {
        this.e = z & efsj.r(getContext());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        b(false);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            z = true;
        } else {
            iMakeMeasureSpec = i;
            z = false;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        boolean z2 = (size > 0 && getMeasuredWidth() > size) || this.e;
        Context context = getContext();
        int childCount = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if ((childAt instanceof FooterActionButton) && ((FooterActionButton) childAt).b) {
                i3++;
            }
        }
        if (!(i3 == 2 && context.getResources().getConfiguration().smallestScreenWidthDp >= 600 && efsj.w(context)) && z2) {
            b(true);
        } else if (!z) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
    }
}
