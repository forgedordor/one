package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatTextView;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.a;
import defpackage.eecd;
import defpackage.eehg;
import defpackage.eelc;
import defpackage.eeld;
import defpackage.eelz;
import defpackage.eema;
import defpackage.eemo;
import defpackage.eenh;
import defpackage.eepx;
import defpackage.eepy;
import defpackage.eeru;
import defpackage.eerv;
import defpackage.eesa;
import defpackage.eesc;
import defpackage.eesh;
import defpackage.eesj;
import defpackage.eevs;
import defpackage.eevt;
import defpackage.eevu;
import defpackage.eewe;
import defpackage.eewg;
import defpackage.eewj;
import defpackage.eewl;
import defpackage.eewn;
import defpackage.eewo;
import defpackage.eewr;
import defpackage.eeww;
import defpackage.eewy;
import defpackage.eewz;
import defpackage.eexa;
import defpackage.eexb;
import defpackage.eexc;
import defpackage.eexf;
import defpackage.kzb;
import defpackage.lbo;
import defpackage.ley;
import defpackage.ply;
import defpackage.pnb;
import defpackage.qu;
import defpackage.th;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final /* synthetic */ int s = 0;
    private static final int[][] t = {new int[]{R.attr.state_pressed}, new int[0]};
    private int A;
    private int B;
    private int C;
    private ColorStateList D;
    private int E;
    private ply F;
    private ply G;
    private ColorStateList H;
    private ColorStateList I;
    private ColorStateList J;
    private ColorStateList K;
    private boolean L;
    private CharSequence M;
    private eesc N;
    private eesc O;
    private StateListDrawable P;
    private boolean Q;
    private eesc R;
    private eesc S;
    private eesj T;
    private boolean U;
    private final int V;
    private int W;
    public final eeww a;
    private ValueAnimator aA;
    private boolean aB;
    private boolean aC;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private final Rect af;
    private final Rect ag;
    private final RectF ah;
    private Drawable ai;
    private int aj;
    private Drawable ak;
    private int al;
    private Drawable am;
    private ColorStateList an;
    private ColorStateList ao;
    private int ap;
    private int aq;
    private int ar;
    private ColorStateList as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private boolean ay;
    private boolean az;
    public final eewj b;
    public EditText c;
    public final eewo d;
    public boolean e;
    public int f;
    public boolean g;
    public TextView h;
    public CharSequence i;
    public boolean j;
    public TextView k;
    public boolean l;
    public int m;
    public final LinkedHashSet n;
    public int o;
    public boolean p;
    public final eelc q;
    public boolean r;
    private final FrameLayout u;
    private final int v;
    private CharSequence w;
    private int x;
    private int y;
    private int z;

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private final int E() {
        if (this.L) {
            int i = this.m;
            if (i == 0) {
                return (int) this.q.c();
            }
            if (i == 2) {
                if (ac()) {
                    return (int) (this.q.c() / 2.0f);
                }
                eelc eelcVar = this.q;
                return Math.max(0, (int) (eelcVar.c() - (eelcVar.b() / 2.0f)));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int F(int r1, boolean r2) {
        /*
            r0 = this;
            if (r2 != 0) goto L10
            java.lang.CharSequence r2 = r0.e()
            if (r2 == 0) goto L1d
            eeww r2 = r0.a
            int r2 = r2.a()
        Le:
            int r1 = r1 + r2
            return r1
        L10:
            java.lang.CharSequence r2 = r0.f()
            if (r2 == 0) goto L1d
            eewj r2 = r0.b
            int r2 = r2.a()
            goto Le
        L1d:
            android.widget.EditText r2 = r0.c
            int r2 = r2.getCompoundPaddingLeft()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.F(int, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int G(int r1, boolean r2) {
        /*
            r0 = this;
            if (r2 != 0) goto L10
            java.lang.CharSequence r2 = r0.f()
            if (r2 == 0) goto L1d
            eewj r2 = r0.b
            int r2 = r2.a()
        Le:
            int r1 = r1 - r2
            return r1
        L10:
            java.lang.CharSequence r2 = r0.e()
            if (r2 == 0) goto L1d
            eeww r2 = r0.a
            int r2 = r2.a()
            goto Le
        L1d:
            android.widget.EditText r2 = r0.c
            int r2 = r2.getCompoundPaddingRight()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.G(int, boolean):int");
    }

    private final Rect H(Rect rect) {
        if (this.c == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.ag;
        boolean zK = eemo.k(this);
        rect2.bottom = rect.bottom;
        int i = this.m;
        if (i == 1) {
            rect2.left = F(rect.left, zK);
            rect2.top = rect.top + this.W;
            rect2.right = G(rect.right, zK);
            return rect2;
        }
        if (i != 2) {
            rect2.left = F(rect.left, zK);
            rect2.top = getPaddingTop();
            rect2.right = G(rect.right, zK);
            return rect2;
        }
        rect2.left = rect.left + this.c.getPaddingLeft();
        rect2.top = rect.top - E();
        rect2.right = rect.right - this.c.getPaddingRight();
        return rect2;
    }

    private final Drawable I() {
        if (this.O == null) {
            this.O = K(true);
        }
        return this.O;
    }

    private final ply J() {
        ply plyVar = new ply();
        plyVar.b = eepx.a(getContext(), com.google.android.apps.messaging.R.attr.motionDurationShort2, 87);
        plyVar.c = eenh.a(getContext(), com.google.android.apps.messaging.R.attr.motionEasingLinearInterpolator, eecd.a);
        return plyVar;
    }

    private final eesc K(boolean z) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.mtrl_shape_corner_size_small_component);
        EditText editText = this.c;
        float dimensionPixelOffset2 = editText instanceof eewr ? ((eewr) editText).b : getResources().getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        float f = true != z ? 0.0f : dimensionPixelOffset;
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        eesh eeshVar = new eesh();
        eeshVar.f(f);
        eeshVar.h(f);
        eeshVar.b(dimensionPixelOffset);
        eeshVar.d(dimensionPixelOffset);
        eesj eesjVar = new eesj(eeshVar);
        EditText editText2 = this.c;
        eesc eescVarG = eesc.G(getContext(), dimensionPixelOffset2, editText2 instanceof eewr ? ((eewr) editText2).c : null);
        eescVarG.fx(eesjVar);
        eesa eesaVar = eescVarG.q;
        if (eesaVar.j == null) {
            eesaVar.j = new Rect();
        }
        eescVarG.q.j.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        eescVarG.invalidateSelf();
        return eescVarG;
    }

    private final void L() {
        if (this.c == null || this.m != 1) {
            return;
        }
        if (!ac()) {
            EditText editText = this.c;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.q.c() + this.v), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            return;
        }
        if (eepy.g(getContext())) {
            EditText editText2 = this.c;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_filled_edittext_font_2_0_padding_top), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (eepy.f(getContext())) {
            EditText editText3 = this.c;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_filled_edittext_font_1_3_padding_top), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    private final void M() {
        eesc eescVar = this.N;
        if (eescVar == null) {
            return;
        }
        eesj eesjVarH = eescVar.H();
        eesj eesjVar = this.T;
        if (eesjVarH != eesjVar) {
            this.N.fx(eesjVar);
        }
        if (this.m == 2 && aa()) {
            this.N.U(this.aa, this.ad);
        }
        int iG = this.ae;
        if (this.m == 1) {
            iG = kzb.g(this.ae, eehg.c(getContext(), com.google.android.apps.messaging.R.attr.colorSurface, 0));
        }
        this.ae = iG;
        this.N.P(ColorStateList.valueOf(iG));
        eesc eescVar2 = this.R;
        if (eescVar2 != null && this.S != null) {
            if (aa()) {
                eescVar2.P(this.c.isFocused() ? ColorStateList.valueOf(this.ap) : ColorStateList.valueOf(this.ad));
                this.S.P(ColorStateList.valueOf(this.ad));
            }
            invalidate();
        }
        x();
    }

    private final void N() {
        if (ab()) {
            ((eevu) this.N).a(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private final void O() {
        TextView textView = this.k;
        if (textView == null || !this.j) {
            return;
        }
        textView.setText((CharSequence) null);
        pnb.b(this.u, this.G);
        this.k.setVisibility(4);
    }

    private final void P() {
        int i = this.m;
        if (i == 0) {
            this.N = null;
            this.R = null;
            this.S = null;
        } else if (i == 1) {
            this.N = new eesc(this.T);
            this.R = new eesc();
            this.S = new eesc();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(a.D(i, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.L || (this.N instanceof eevu)) {
                this.N = new eesc(this.T);
            } else {
                eesj eesjVar = this.T;
                int i2 = eevu.b;
                if (eesjVar == null) {
                    eesjVar = new eesj();
                }
                this.N = new eevt(new eevs(eesjVar, new RectF()));
            }
            this.R = null;
            this.S = null;
        }
        x();
        A();
        if (this.m == 1) {
            if (eepy.g(getContext())) {
                this.W = getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (eepy.f(getContext())) {
                this.W = getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        L();
        if (this.m != 0) {
            W();
        }
        EditText editText = this.c;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.m;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(I());
                    return;
                }
                if (i3 == 1) {
                    if (this.P == null) {
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        this.P = stateListDrawable;
                        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, I());
                        this.P.addState(new int[0], K(false));
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.P);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Q() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.Q():void");
    }

    private static void R(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                R((ViewGroup) childAt, z);
            }
        }
    }

    private final void S(boolean z) {
        if (this.j == z) {
            return;
        }
        if (z) {
            TextView textView = this.k;
            if (textView != null) {
                this.u.addView(textView);
                this.k.setVisibility(0);
            }
        } else {
            TextView textView2 = this.k;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.k = null;
        }
        this.j = z;
    }

    private final void T() {
        if (this.h != null) {
            EditText editText = this.c;
            v(editText == null ? null : editText.getText());
        }
    }

    private final void U() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.h;
        if (textView != null) {
            t(textView, this.g ? this.B : this.C);
            if (!this.g && (colorStateList2 = this.H) != null) {
                this.h.setTextColor(colorStateList2);
            }
            if (!this.g || (colorStateList = this.I) == null) {
                return;
            }
            this.h.setTextColor(colorStateList);
        }
    }

    private final void V() {
        ColorStateList colorStateList;
        ColorStateList colorStateListG = this.J;
        if (colorStateListG == null) {
            colorStateListG = eehg.g(getContext(), com.google.android.apps.messaging.R.attr.colorControlActivated);
        }
        EditText editText = this.c;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.c.getTextCursorDrawable().mutate();
        if ((C() || (this.h != null && this.g)) && (colorStateList = this.K) != null) {
            colorStateListG = colorStateList;
        }
        drawableMutate.setTintList(colorStateListG);
    }

    private final void W() {
        if (this.m != 1) {
            FrameLayout frameLayout = this.u;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = E();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    private final void X(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.c;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.c;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.an;
        if (colorStateList2 != null) {
            this.q.n(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.an;
            this.q.n(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.ax) : this.ax));
        } else if (C()) {
            eelc eelcVar = this.q;
            TextView textView2 = this.d.h;
            eelcVar.n(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.g && (textView = this.h) != null) {
            this.q.n(textView.getTextColors());
        } else if (z4 && (colorStateList = this.ao) != null) {
            this.q.s(colorStateList);
        }
        if (z3 || !this.ay || (isEnabled() && z4)) {
            if (z2 || this.p) {
                ValueAnimator valueAnimator = this.aA;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.aA.cancel();
                }
                if (z && this.az) {
                    g(1.0f);
                } else {
                    this.q.B(1.0f);
                }
                this.p = false;
                if (ab()) {
                    Q();
                }
                Y();
                this.a.b(false);
                this.b.e(false);
                return;
            }
            return;
        }
        if (z2 || !this.p) {
            ValueAnimator valueAnimator2 = this.aA;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.aA.cancel();
            }
            if (z && this.az) {
                g(0.0f);
            } else {
                this.q.B(0.0f);
            }
            if (ab() && !((eevu) this.N).a.x.isEmpty()) {
                N();
            }
            this.p = true;
            O();
            this.a.b(true);
            this.b.e(true);
        }
    }

    private final void Y() {
        EditText editText = this.c;
        z(editText == null ? null : editText.getText());
    }

    private final void Z(boolean z, boolean z2) {
        int defaultColor = this.as.getDefaultColor();
        int colorForState = this.as.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.as.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            defaultColor = colorForState2;
        } else if (z2) {
            defaultColor = colorForState;
        }
        this.ad = defaultColor;
    }

    private final boolean aa() {
        return this.aa >= 0 && this.ad != 0;
    }

    private final boolean ab() {
        return this.L && !TextUtils.isEmpty(this.M) && (this.N instanceof eevu);
    }

    private final boolean ac() {
        return this.q.q == 1;
    }

    private final boolean ad() {
        return this.m == 1 && this.c.getMinLines() <= 1;
    }

    static /* synthetic */ int b(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    public final void A() {
        int currentTextColor;
        TextView textView;
        int i;
        EditText editText;
        EditText editText2;
        if (this.N == null || this.m == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.c) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.c) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.ad = this.ax;
        } else if (!C()) {
            if (!this.g || (textView = this.h) == null) {
                currentTextColor = z2 ? this.ar : z ? this.aq : this.ap;
            } else if (this.as != null) {
                Z(z2, z);
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            this.ad = currentTextColor;
        } else if (this.as != null) {
            Z(z2, z);
        } else {
            this.ad = a();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            V();
        }
        eewj eewjVar = this.b;
        eewjVar.o();
        TextInputLayout textInputLayout = eewjVar.a;
        eewl.c(textInputLayout, eewjVar.b, eewjVar.c);
        eewjVar.f();
        if (eewjVar.c().u()) {
            if (!textInputLayout.C() || eewjVar.b() == null) {
                eewl.b(textInputLayout, eewjVar.d, eewjVar.f, eewjVar.g);
            } else {
                Drawable drawableMutate = eewjVar.b().mutate();
                drawableMutate.setTint(textInputLayout.a());
                eewjVar.d.setImageDrawable(drawableMutate);
            }
        }
        this.a.c();
        if (this.m == 2) {
            int i2 = this.aa;
            if (z2 && isEnabled()) {
                i = this.ac;
                this.aa = i;
            } else {
                i = this.ab;
                this.aa = i;
            }
            if (i != i2 && ab() && !this.p) {
                N();
                Q();
            }
        }
        if (this.m == 1) {
            if (isEnabled()) {
                this.ae = (!z || z2) ? z2 ? this.av : this.at : this.aw;
            } else {
                this.ae = this.au;
            }
        }
        M();
    }

    public final boolean B() {
        return this.d.n;
    }

    public final boolean C() {
        eewo eewoVar = this.d;
        return (eewoVar.e != 1 || eewoVar.h == null || TextUtils.isEmpty(eewoVar.f)) ? false : true;
    }

    public final boolean D() {
        boolean z;
        if (this.c == null) {
            return false;
        }
        eeww eewwVar = this.a;
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if ((eewwVar.c.getDrawable() != null || (e() != null && eewwVar.a.getVisibility() == 0)) && eewwVar.getMeasuredWidth() > 0) {
            int measuredWidth = eewwVar.getMeasuredWidth() - this.c.getPaddingLeft();
            if (this.ai == null || this.aj != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.ai = colorDrawable;
                this.aj = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.c.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.ai;
            if (drawable != drawable2) {
                this.c.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.ai != null) {
                Drawable[] compoundDrawablesRelative2 = this.c.getCompoundDrawablesRelative();
                this.c.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.ai = null;
                z = true;
            }
            z = false;
        }
        eewj eewjVar = this.b;
        if ((eewjVar.s() || ((eewjVar.q() && eewjVar.r()) || eewjVar.h != null)) && eewjVar.getMeasuredWidth() > 0) {
            int measuredWidth2 = eewjVar.i.getMeasuredWidth() - this.c.getPaddingRight();
            if (eewjVar.s()) {
                checkableImageButton = eewjVar.b;
            } else if (eewjVar.q() && eewjVar.r()) {
                checkableImageButton = eewjVar.d;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButton.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.c.getCompoundDrawablesRelative();
            Drawable drawable3 = this.ak;
            if (drawable3 != null && this.al != measuredWidth2) {
                this.al = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.ak, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.ak = colorDrawable2;
                this.al = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.ak;
            if (drawable4 != drawable5) {
                this.am = drawable4;
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.ak != null) {
            Drawable[] compoundDrawablesRelative4 = this.c.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.ak) {
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.am, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.ak = null;
            return z2;
        }
        return z;
    }

    public final int a() {
        TextView textView = this.d.h;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 16;
        FrameLayout frameLayout = this.u;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        W();
        EditText editText = (EditText) view;
        if (this.c != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        eewj eewjVar = this.b;
        if (eewjVar.e != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.c = editText;
        int i2 = this.x;
        if (i2 != -1) {
            p(i2);
        } else {
            q(this.z);
        }
        int i3 = this.y;
        if (i3 != -1) {
            n(i3);
        } else {
            o(this.A);
        }
        this.Q = false;
        P();
        u(new eexc(this));
        eelc eelcVar = this.q;
        Typeface typeface = this.c.getTypeface();
        boolean zH = eelcVar.H(typeface);
        boolean zI = eelcVar.I(typeface);
        if (zH || zI) {
            eelcVar.l();
        }
        eelcVar.A(this.c.getTextSize());
        float letterSpacing = this.c.getLetterSpacing();
        if (eelcVar.n != letterSpacing) {
            eelcVar.n = letterSpacing;
            eelcVar.l();
        }
        int gravity = this.c.getGravity();
        eelcVar.t((gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 48);
        eelcVar.z(gravity);
        this.o = editText.getMinimumHeight();
        this.c.addTextChangedListener(new eewz(this, editText));
        if (this.an == null) {
            this.an = this.c.getHintTextColors();
        }
        if (this.L) {
            if (TextUtils.isEmpty(this.M)) {
                CharSequence hint = this.c.getHint();
                this.w = hint;
                m(hint);
                this.c.setHint((CharSequence) null);
            }
            this.l = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            V();
        }
        if (this.h != null) {
            v(this.c.getText());
        }
        w();
        this.d.b();
        this.a.bringToFront();
        eewjVar.bringToFront();
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((eewg) it.next()).a(this);
        }
        eewjVar.p();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        X(false, true);
    }

    public final CharSequence c() {
        eewo eewoVar = this.d;
        if (eewoVar.g) {
            return eewoVar.f;
        }
        return null;
    }

    public final CharSequence d() {
        if (this.L) {
            return this.M;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.c;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.w != null) {
            boolean z = this.l;
            this.l = false;
            CharSequence hint = editText.getHint();
            this.c.setHint(this.w);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.c.setHint(hint);
                this.l = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.u;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.c) {
                viewStructureNewChild.setHint(d());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.r = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.r = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        eesc eescVar;
        super.draw(canvas);
        if (this.L) {
            this.q.h(canvas);
        }
        if (this.S == null || (eescVar = this.R) == null) {
            return;
        }
        eescVar.draw(canvas);
        if (this.c.isFocused()) {
            Rect bounds = this.S.getBounds();
            Rect bounds2 = this.R.getBounds();
            float f = this.q.a;
            int iCenterX = bounds2.centerX();
            bounds.left = eecd.b(iCenterX, bounds2.left, f);
            bounds.right = eecd.b(iCenterX, bounds2.right, f);
            this.S.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        if (this.aB) {
            return;
        }
        this.aB = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        eelc eelcVar = this.q;
        boolean zJ = eelcVar != null ? eelcVar.J(drawableState) : false;
        if (this.c != null) {
            y(isLaidOut() && isEnabled());
        }
        w();
        A();
        if (zJ) {
            invalidate();
        }
        this.aB = false;
    }

    public final CharSequence e() {
        return this.a.b;
    }

    public final CharSequence f() {
        return this.b.h;
    }

    final void g(float f) {
        eelc eelcVar = this.q;
        if (eelcVar.a == f) {
            return;
        }
        if (this.aA == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.aA = valueAnimator;
            valueAnimator.setInterpolator(eenh.a(getContext(), com.google.android.apps.messaging.R.attr.motionEasingEmphasizedInterpolator, eecd.b));
            this.aA.setDuration(eepx.a(getContext(), com.google.android.apps.messaging.R.attr.motionDurationMedium4, 167));
            this.aA.addUpdateListener(new eexb(this));
        }
        this.aA.setFloatValues(eelcVar.a, f);
        this.aA.start();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        EditText editText = this.c;
        return editText != null ? editText.getBaseline() + getPaddingTop() + E() : super.getBaseline();
    }

    public final void h(int i) {
        if (this.ae != i) {
            this.ae = i;
            this.at = i;
            this.av = i;
            this.aw = i;
            M();
        }
    }

    public final void i(boolean z) {
        this.b.l(z);
    }

    public final void j(CharSequence charSequence) {
        eewo eewoVar = this.d;
        if (!eewoVar.g) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                k(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            eewoVar.d();
            return;
        }
        eewoVar.c();
        eewoVar.f = charSequence;
        eewoVar.h.setText(charSequence);
        int i = eewoVar.d;
        if (i != 1) {
            eewoVar.e = 1;
        }
        eewoVar.l(i, eewoVar.e, eewoVar.m(eewoVar.h, charSequence));
    }

    public final void k(boolean z) {
        eewo eewoVar = this.d;
        if (eewoVar.g == z) {
            return;
        }
        eewoVar.c();
        if (z) {
            eewoVar.h = new AppCompatTextView(eewoVar.a);
            eewoVar.h.setId(com.google.android.apps.messaging.R.id.textinput_error);
            eewoVar.h.setTextAlignment(5);
            eewoVar.h(eewoVar.k);
            eewoVar.i(eewoVar.l);
            eewoVar.g(eewoVar.i);
            eewoVar.f(eewoVar.j);
            eewoVar.h.setVisibility(4);
            eewoVar.a(eewoVar.h, 0);
        } else {
            eewoVar.d();
            eewoVar.e(eewoVar.h, 0);
            eewoVar.h = null;
            TextInputLayout textInputLayout = eewoVar.b;
            textInputLayout.w();
            textInputLayout.A();
        }
        eewoVar.g = z;
    }

    public final void l(boolean z) {
        eewo eewoVar = this.d;
        if (eewoVar.n == z) {
            return;
        }
        eewoVar.c();
        if (z) {
            eewoVar.o = new AppCompatTextView(eewoVar.a);
            eewoVar.o.setId(com.google.android.apps.messaging.R.id.textinput_helper_text);
            eewoVar.o.setTextAlignment(5);
            eewoVar.o.setVisibility(4);
            eewoVar.o.setAccessibilityLiveRegion(1);
            eewoVar.j(eewoVar.p);
            eewoVar.k(eewoVar.q);
            eewoVar.a(eewoVar.o, 1);
            eewoVar.o.setAccessibilityDelegate(new eewn(eewoVar));
        } else {
            eewoVar.c();
            int i = eewoVar.d;
            if (i == 2) {
                eewoVar.e = 0;
            }
            eewoVar.l(i, eewoVar.e, eewoVar.m(eewoVar.o, ""));
            eewoVar.e(eewoVar.o, 1);
            eewoVar.o = null;
            TextInputLayout textInputLayout = eewoVar.b;
            textInputLayout.w();
            textInputLayout.A();
        }
        eewoVar.n = z;
    }

    public final void m(CharSequence charSequence) {
        if (this.L) {
            if (!TextUtils.equals(charSequence, this.M)) {
                this.M = charSequence;
                this.q.E(charSequence);
                if (!this.p) {
                    Q();
                }
            }
            sendAccessibilityEvent(2048);
        }
    }

    public final void n(int i) {
        this.y = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public final void o(int i) {
        this.A = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.q.k(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        eewj eewjVar = this.b;
        eewjVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.aC = false;
        if (this.c != null) {
            int iMax = Math.max(eewjVar.getMeasuredHeight(), this.a.getMeasuredHeight());
            if (this.c.getMeasuredHeight() < iMax) {
                this.c.setMinimumHeight(iMax);
                z = true;
            }
        }
        boolean zD = D();
        if (z || zD) {
            this.c.post(new Runnable() { // from class: eewx
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.c;
        if (editText != null) {
            Rect rect = this.af;
            eeld.a(this, editText, rect);
            if (this.R != null) {
                this.R.setBounds(rect.left, rect.bottom - this.ab, rect.right, rect.bottom);
            }
            if (this.S != null) {
                this.S.setBounds(rect.left, rect.bottom - this.ac, rect.right, rect.bottom);
            }
            if (this.L) {
                eelc eelcVar = this.q;
                eelcVar.A(this.c.getTextSize());
                int gravity = this.c.getGravity();
                eelcVar.t((gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 48);
                eelcVar.z(gravity);
                eelcVar.o(H(rect));
                if (this.c == null) {
                    throw new IllegalStateException();
                }
                Rect rect2 = this.ag;
                float fE = ac() ? eelcVar.e() : eelcVar.d() * eelcVar.i;
                rect2.left = rect.left + this.c.getCompoundPaddingLeft();
                if (ad()) {
                    compoundPaddingTop = (int) (rect.centerY() - (fE / 2.0f));
                } else {
                    int iE = 0;
                    if (this.m == 0 && !ac()) {
                        iE = (int) (eelcVar.e() / 2.0f);
                    }
                    compoundPaddingTop = (rect.top + this.c.getCompoundPaddingTop()) - iE;
                }
                rect2.top = compoundPaddingTop;
                rect2.right = rect.right - this.c.getCompoundPaddingRight();
                rect2.bottom = ad() ? (int) (rect2.top + fE) : rect.bottom - this.c.getCompoundPaddingBottom();
                eelcVar.u(rect2.left, rect2.top, rect2.right, rect2.bottom);
                eelcVar.l();
                if (!ab() || this.p) {
                    return;
                }
                Q();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        if (!this.aC) {
            this.b.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.aC = true;
        }
        if (this.k != null && (editText = this.c) != null) {
            this.k.setGravity(editText.getGravity());
            this.k.setPadding(this.c.getCompoundPaddingLeft(), this.c.getCompoundPaddingTop(), this.c.getCompoundPaddingRight(), this.c.getCompoundPaddingBottom());
        }
        this.b.p();
        if (ac()) {
            return;
        }
        int measuredWidth = (this.c.getMeasuredWidth() - this.c.getCompoundPaddingLeft()) - this.c.getCompoundPaddingRight();
        eelc eelcVar = this.q;
        TextPaint textPaint = eelcVar.m;
        eelcVar.i(textPaint);
        float f = measuredWidth;
        eelcVar.s = eelcVar.g(eelcVar.r, textPaint, eelcVar.k, (eelcVar.g / eelcVar.f) * f, eelcVar.l).getHeight();
        eelcVar.j(textPaint);
        eelcVar.t = eelcVar.g(eelcVar.q, textPaint, eelcVar.k, f, eelcVar.l).getHeight();
        Rect rect = this.af;
        eeld.a(this, this.c, rect);
        eelcVar.o(H(rect));
        W();
        L();
        if (this.c == null) {
            return;
        }
        int i3 = eelcVar.t;
        float fE = i3 != -1 ? i3 : eelcVar.e();
        float height = 0.0f;
        if (this.i != null) {
            TextPaint textPaint2 = new TextPaint(129);
            textPaint2.set(this.k.getPaint());
            textPaint2.setTextSize(this.k.getTextSize());
            textPaint2.setTypeface(this.k.getTypeface());
            textPaint2.setLetterSpacing(this.k.getLetterSpacing());
            try {
                eema eemaVar = new eema(this.i, textPaint2, measuredWidth);
                eemaVar.e = getLayoutDirection() == 1;
                eemaVar.d = true;
                eemaVar.b(this.k.getLineSpacingExtra(), this.k.getLineSpacingMultiplier());
                eemaVar.g = new eewy(this);
                height = eemaVar.a().getHeight() + (this.m == 1 ? eelcVar.c() + this.W + this.v : 0.0f);
            } catch (eelz e) {
                Log.e("TextInputLayout", e.getCause().getMessage(), e);
            }
        }
        float fMax = Math.max(fE, height);
        if (this.c.getMeasuredHeight() < fMax) {
            this.c.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof eexf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        eexf eexfVar = (eexf) parcelable;
        super.onRestoreInstanceState(eexfVar.d);
        j(eexfVar.a);
        if (eexfVar.b) {
            post(new eexa(this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.U) {
            eeru eeruVar = this.T.f;
            RectF rectF = this.ah;
            float fA = eeruVar.a(rectF);
            float fA2 = this.T.g.a(rectF);
            float fA3 = this.T.i.a(rectF);
            float fA4 = this.T.h.a(rectF);
            eesj eesjVar = this.T;
            eerv eervVar = eesjVar.b;
            eerv eervVar2 = eesjVar.c;
            eerv eervVar3 = eesjVar.e;
            eerv eervVar4 = eesjVar.d;
            eesh eeshVar = new eesh();
            eeshVar.e(eervVar2);
            eeshVar.g(eervVar);
            eeshVar.a(eervVar4);
            eeshVar.c(eervVar3);
            eeshVar.f(fA2);
            eeshVar.h(fA);
            eeshVar.b(fA4);
            eeshVar.d(fA3);
            eesj eesjVar2 = new eesj(eeshVar);
            this.U = z;
            eesc eescVar = this.N;
            if (eescVar == null || eescVar.H() == eesjVar2) {
                return;
            }
            this.T = eesjVar2;
            M();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        eexf eexfVar = new eexf(super.onSaveInstanceState());
        if (C()) {
            eexfVar.a = c();
        }
        eewj eewjVar = this.b;
        boolean z = false;
        if (eewjVar.q() && eewjVar.d.a) {
            z = true;
        }
        eexfVar.b = z;
        return eexfVar;
    }

    public final void p(int i) {
        this.x = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public final void q(int i) {
        this.z = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public final void r(int i) {
        this.E = i;
        TextView textView = this.k;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public final void s(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            TextView textView = this.k;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        R(this, z);
        super.setEnabled(z);
    }

    public final void t(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(com.google.android.apps.messaging.R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(getContext().getColor(com.google.android.apps.messaging.R.color.design_error));
    }

    public final void u(eexc eexcVar) {
        EditText editText = this.c;
        if (editText != null) {
            ley.p(editText, eexcVar);
        }
    }

    public final void v(Editable editable) {
        int iB = b(editable);
        boolean z = this.g;
        int i = this.f;
        if (i == -1) {
            this.h.setText(String.valueOf(iB));
            this.h.setContentDescription(null);
            this.g = false;
        } else {
            this.g = iB > i;
            Context context = getContext();
            TextView textView = this.h;
            int i2 = this.f;
            int i3 = true != this.g ? com.google.android.apps.messaging.R.string.character_counter_content_description : com.google.android.apps.messaging.R.string.character_counter_overflowed_content_description;
            Integer numValueOf = Integer.valueOf(iB);
            textView.setContentDescription(context.getString(i3, numValueOf, Integer.valueOf(i2)));
            if (z != this.g) {
                U();
            }
            this.h.setText(lbo.a().b(getContext().getString(com.google.android.apps.messaging.R.string.character_counter_pattern, numValueOf, Integer.valueOf(this.f))));
        }
        if (this.c == null || z == this.g) {
            return;
        }
        y(false);
        A();
        w();
    }

    public final void w() {
        Drawable background;
        TextView textView;
        EditText editText = this.c;
        if (editText == null || this.m != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        Rect rect = th.a;
        Drawable drawableMutate = background.mutate();
        if (C()) {
            drawableMutate.setColorFilter(qu.b(a(), PorterDuff.Mode.SRC_IN));
        } else if (this.g && (textView = this.h) != null) {
            drawableMutate.setColorFilter(qu.b(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.c.refreshDrawableState();
        }
    }

    public final void x() {
        Drawable rippleDrawable;
        EditText editText = this.c;
        if (editText == null || this.N == null) {
            return;
        }
        if ((this.Q || editText.getBackground() == null) && this.m != 0) {
            EditText editText2 = this.c;
            if (!(editText2 instanceof AutoCompleteTextView) || eewe.a(editText2)) {
                rippleDrawable = this.N;
            } else {
                int iB = eehg.b(this.c, com.google.android.apps.messaging.R.attr.colorControlHighlight);
                int i = this.m;
                if (i == 2) {
                    Context context = getContext();
                    eesc eescVar = this.N;
                    int[][] iArr = t;
                    int iD = eehg.d(context, com.google.android.apps.messaging.R.attr.colorSurface, "TextInputLayout");
                    eesc eescVar2 = new eesc(eescVar.H());
                    int iF = eehg.f(iB, iD, 0.1f);
                    eescVar2.P(new ColorStateList(iArr, new int[]{iF, 0}));
                    eescVar2.setTint(iD);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iF, iD});
                    eesc eescVar3 = new eesc(eescVar.H());
                    eescVar3.setTint(-1);
                    rippleDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, eescVar2, eescVar3), eescVar});
                } else if (i == 1) {
                    eesc eescVar4 = this.N;
                    int i2 = this.ae;
                    rippleDrawable = new RippleDrawable(new ColorStateList(t, new int[]{eehg.f(iB, i2, 0.1f), i2}), eescVar4, eescVar4);
                } else {
                    rippleDrawable = null;
                }
            }
            this.c.setBackground(rippleDrawable);
            this.Q = true;
        }
    }

    public final void y(boolean z) {
        X(z, false);
    }

    public final void z(Editable editable) {
        if (b(editable) != 0 || this.p) {
            O();
            return;
        }
        if (this.k == null || !this.j || TextUtils.isEmpty(this.i)) {
            return;
        }
        this.k.setText(this.i);
        pnb.b(this.u, this.F);
        this.k.setVisibility(0);
        this.k.bringToFront();
        announceForAccessibility(this.i);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.textInputStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r20, android.util.AttributeSet r21, int r22) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
