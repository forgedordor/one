package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.eecu;
import defpackage.eecw;
import defpackage.eedj;
import defpackage.eehg;
import defpackage.eemh;
import defpackage.eemj;
import defpackage.eepy;
import defpackage.eeqg;
import defpackage.eeqh;
import defpackage.eeqj;
import defpackage.eeqk;
import defpackage.eesc;
import defpackage.eesd;
import defpackage.eesj;
import defpackage.eexh;
import defpackage.ku;
import defpackage.xc;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SearchBar extends Toolbar {
    public final TextView D;
    public final TextView E;
    public final int F;
    public final ColorStateList G;
    public final eeqk H;
    public View I;
    public int J;
    public eesc K;
    private final FrameLayout L;
    private boolean M;
    private final boolean N;
    private final boolean O;
    private final Drawable P;
    private final boolean Q;
    private final boolean R;
    private Integer S;
    private Drawable T;
    private boolean U;
    private boolean V;
    private int W;
    private ActionMenuView aa;
    private ImageButton ab;
    private final eecw ac;

    /* compiled from: PG */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        private boolean e;

        public ScrollingViewBehavior() {
            this.e = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.eedh, defpackage.kty
        public /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.g(coordinatorLayout, view, i);
            return true;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.kty
        public final void l(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
            super.l(coordinatorLayout, view, view2);
            if (this.e || !(view2 instanceof AppBarLayout)) {
                return;
            }
            this.e = true;
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            appBarLayout.setBackgroundColor(0);
            eedj.a(appBarLayout, 0.0f);
        }

        @Override // defpackage.eedf
        public final boolean z() {
            return true;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = false;
        }
    }

    public SearchBar(Context context) {
        this(context, null);
    }

    private final AppBarLayout M() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    private final void N() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z = getLayoutDirection() == 1;
        ImageButton imageButtonB = eemj.b(this);
        int width = (imageButtonB == null || !imageButtonB.isClickable()) ? 0 : z ? getWidth() - imageButtonB.getLeft() : imageButtonB.getRight();
        ActionMenuView actionMenuViewA = eemj.a(this);
        int right = actionMenuViewA != null ? z ? actionMenuViewA.getRight() : getWidth() - actionMenuViewA.getLeft() : 0;
        int i = true != z ? width : right;
        if (true != z) {
            width = right;
        }
        setHandwritingBoundsOffsets(-i, 0.0f, -width, 0.0f);
    }

    private final void O(boolean z) {
        ImageButton imageButtonB = eemj.b(this);
        if (imageButtonB == null) {
            return;
        }
        boolean z2 = !z;
        imageButtonB.setClickable(z2);
        imageButtonB.setFocusable(z2);
        Drawable background = imageButtonB.getBackground();
        if (background != null) {
            this.T = background;
        }
        imageButtonB.setBackgroundDrawable(z ? null : this.T);
        N();
    }

    private static final int P(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    protected int F() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    protected int G() {
        return R.drawable.ic_search_black_24;
    }

    public final float H() {
        return this.K.x();
    }

    public final CharSequence I() {
        return this.D.getHint();
    }

    public final CharSequence J() {
        return this.D.getText();
    }

    final void K(String str) {
        this.E.setText(str);
    }

    public final void L(CharSequence charSequence) {
        this.D.setText(charSequence);
        this.E.setText(charSequence);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.N && this.I == null && !(view instanceof ActionMenuView)) {
            this.I = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.support.v7.widget.Toolbar
    public final void o(int i) {
        super.o(i);
        this.J = i;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() throws Resources.NotFoundException {
        AppBarLayout appBarLayoutM;
        super.onAttachedToWindow();
        eesd.d(this, this.K);
        if (this.O && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(F());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = P(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = P(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = P(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = P(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
        if (getLayoutParams() instanceof eecu) {
            eecu eecuVar = (eecu) getLayoutParams();
            if (this.U) {
                if (eecuVar.a == 0) {
                    eecuVar.a = 53;
                }
            } else if (eecuVar.a == 53) {
                eecuVar.a = 0;
            }
        }
        if (!this.M || (appBarLayoutM = M()) == null || this.G == null) {
            return;
        }
        appBarLayoutM.g.add(this.ac);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AppBarLayout appBarLayoutM = M();
        if (appBarLayoutM != null) {
            appBarLayoutM.g.remove(this.ac);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence charSequenceJ = J();
        boolean zIsEmpty = TextUtils.isEmpty(charSequenceJ);
        accessibilityNodeInfo.setHintText(I());
        accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        if (zIsEmpty) {
            charSequenceJ = I();
        }
        accessibilityNodeInfo.setText(charSequenceJ);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.I;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i5 = measuredWidth + measuredWidth2;
            int measuredHeight = view.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i6 = measuredHeight + measuredHeight2;
            if (getLayoutDirection() == 1) {
                view.layout(getMeasuredWidth() - i5, measuredHeight2, getMeasuredWidth() - measuredWidth2, i6);
            } else {
                view.layout(measuredWidth2, measuredHeight2, i5, i6);
            }
        }
        N();
        TextView textView = this.D;
        if (textView == null || !this.V) {
            return;
        }
        int measuredWidth3 = getMeasuredWidth() / 2;
        FrameLayout frameLayout = this.L;
        int measuredWidth4 = measuredWidth3 - (frameLayout.getMeasuredWidth() / 2);
        int measuredWidth5 = frameLayout.getMeasuredWidth() + measuredWidth4;
        int measuredHeight3 = (getMeasuredHeight() / 2) - (frameLayout.getMeasuredHeight() / 2);
        int measuredHeight4 = frameLayout.getMeasuredHeight() + measuredHeight3;
        int layoutDirection = getLayoutDirection();
        if (this.aa == null) {
            this.aa = eemj.a(this);
        }
        View view2 = this.aa;
        if (this.ab == null) {
            this.ab = eemj.b(this);
        }
        View view3 = this.ab;
        int measuredWidth6 = (frameLayout.getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2);
        int measuredWidth7 = textView.getMeasuredWidth() + measuredWidth6;
        int i7 = measuredWidth6 + measuredWidth4;
        int i8 = measuredWidth7 + measuredWidth4;
        View view4 = layoutDirection == 1 ? view2 : view3;
        if (layoutDirection == 1) {
            view2 = view3;
        }
        int iMax = view4 != null ? Math.max(view4.getRight() - i7, 0) : 0;
        int i9 = i7 + iMax;
        int i10 = i8 + iMax;
        int iMax2 = view2 != null ? Math.max(i10 - view2.getLeft(), 0) : 0;
        int i11 = i9 - iMax2;
        int i12 = i10 - iMax2;
        int paddingLeft = getPaddingLeft() - i11;
        xc xcVar = this.r;
        int iMax3 = Math.max(paddingLeft, (xcVar != null ? xcVar.a : 0) - i11);
        int measuredWidth8 = i12 - (getMeasuredWidth() - getPaddingRight());
        int measuredWidth9 = getMeasuredWidth();
        xc xcVar2 = this.r;
        int iMax4 = ((iMax - iMax2) + Math.max(iMax3, 0)) - Math.max(Math.max(measuredWidth8, i12 - (measuredWidth9 - (xcVar2 != null ? xcVar2.b : 0))), 0);
        frameLayout.layout(measuredWidth4 + iMax4, measuredHeight3, measuredWidth5 + iMax4, measuredHeight4);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3 = this.W;
        if (i3 >= 0 && i3 < View.MeasureSpec.getSize(i)) {
            i = View.MeasureSpec.makeMeasureSpec(this.W, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
        View view = this.I;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof eeqj)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        eeqj eeqjVar = (eeqj) parcelable;
        super.onRestoreInstanceState(eeqjVar.d);
        L(eeqjVar.a);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final Parcelable onSaveInstanceState() {
        eeqj eeqjVar = new eeqj(super.onSaveInstanceState());
        CharSequence charSequenceJ = J();
        eeqjVar.a = charSequenceJ == null ? null : charSequenceJ.toString();
        return eeqjVar;
    }

    @Override // android.support.v7.widget.Toolbar
    public final void s(Drawable drawable) {
        int iB;
        if (this.Q && drawable != null) {
            Integer num = this.S;
            if (num != null) {
                iB = num.intValue();
            } else {
                iB = eehg.b(this, drawable == this.P ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface);
            }
            drawable = drawable.mutate();
            drawable.setTint(iB);
        }
        super.s(drawable);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        eesc eescVar = this.K;
        if (eescVar != null) {
            eescVar.O(f);
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final void t(View.OnClickListener onClickListener) {
        if (this.R) {
            return;
        }
        super.t(onClickListener);
        O(false);
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        super(eexh.a(context, attributeSet, i, R.style.Widget_Material3_SearchBar), attributeSet, i);
        this.J = -1;
        this.ac = new eeqh(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE) == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                    throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
                }
            } else {
                throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
        }
        Drawable drawableA = ku.a(context2, G());
        this.P = drawableA;
        this.H = new eeqk();
        TypedArray typedArrayA = eemh.a(context2, attributeSet, eeqg.a, i, R.style.Widget_Material3_SearchBar, new int[0]);
        eesj eesjVar = new eesj(eesj.h(context2, attributeSet, i, R.style.Widget_Material3_SearchBar));
        int color = typedArrayA.getColor(4, 0);
        this.F = color;
        this.G = eepy.c(context2, typedArrayA, 11);
        float dimension = typedArrayA.getDimension(7, 0.0f);
        this.O = typedArrayA.getBoolean(5, true);
        this.U = typedArrayA.getBoolean(6, true);
        boolean z = typedArrayA.getBoolean(9, false);
        this.R = typedArrayA.getBoolean(8, false);
        this.Q = typedArrayA.getBoolean(16, true);
        if (typedArrayA.hasValue(12)) {
            this.S = Integer.valueOf(typedArrayA.getColor(12, -1));
        }
        int resourceId = typedArrayA.getResourceId(0, -1);
        String string = typedArrayA.getString(2);
        String string2 = typedArrayA.getString(3);
        float dimension2 = typedArrayA.getDimension(14, -1.0f);
        int color2 = typedArrayA.getColor(13, 0);
        this.V = typedArrayA.getBoolean(15, false);
        this.M = typedArrayA.getBoolean(10, false);
        this.W = typedArrayA.getDimensionPixelSize(1, -1);
        typedArrayA.recycle();
        if (!z) {
            s(e() != null ? e() : drawableA);
            O(true);
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.N = true;
        TextView textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        this.D = textView;
        TextView textView2 = (TextView) findViewById(R.id.open_search_bar_placeholder_text_view);
        this.E = textView2;
        this.L = (FrameLayout) findViewById(R.id.open_search_bar_text_view_container);
        setElevation(dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
        }
        L(string);
        textView.setHint(string2);
        boolean z2 = this.V;
        if (textView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (z2) {
                layoutParams.gravity = 1;
                textView.setGravity(1);
            } else {
                layoutParams.gravity = 0;
                textView.setGravity(0);
            }
            textView.setLayoutParams(layoutParams);
            textView2.setLayoutParams(layoutParams);
        }
        eesc eescVar = new eesc(eesjVar);
        this.K = eescVar;
        eescVar.L(getContext());
        this.K.O(dimension);
        if (dimension2 >= 0.0f) {
            this.K.U(dimension2, color2);
        }
        int iB = eehg.b(this, R.attr.colorControlHighlight);
        this.K.P(ColorStateList.valueOf(color));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iB);
        eesc eescVar2 = this.K;
        setBackground(new RippleDrawable(colorStateListValueOf, eescVar2, eescVar2));
    }

    @Override // android.support.v7.widget.Toolbar
    public final void v(CharSequence charSequence) {
    }

    @Override // android.support.v7.widget.Toolbar
    public final void x(CharSequence charSequence) {
    }
}
