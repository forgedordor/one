package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eegq extends AppCompatCheckBox {
    private static final int a = 2132151637;
    private static final int[] f = {R.attr.state_indeterminate};
    private static final int[] g = {R.attr.state_error};
    private static final int[][] h = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private static final int i = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    ColorStateList b;
    ColorStateList c;
    public int[] d;
    public CompoundButton.OnCheckedChangeListener e;
    private final LinkedHashSet j;
    private ColorStateList k;
    private boolean l;
    private boolean m;
    private boolean n;
    private CharSequence o;
    private Drawable p;
    private Drawable q;
    private boolean r;
    private PorterDuff.Mode s;
    private int t;
    private boolean u;
    private CharSequence v;
    private final poe w;
    private final pnz x;

    public eegq(Context context) {
        this(context, null);
    }

    private final void c() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Animator.AnimatorListener animatorListener;
        this.p = eejo.h(this.p, this.b, getButtonTintMode());
        this.q = eejo.h(this.q, this.c, this.s);
        if (this.r) {
            poe poeVar = this.w;
            if (poeVar != null) {
                pnz pnzVar = this.x;
                if (pnzVar != null) {
                    Drawable drawable = poeVar.e;
                    if (drawable != null) {
                        poe.c((AnimatedVectorDrawable) drawable, pnzVar);
                    }
                    ArrayList arrayList = poeVar.c;
                    if (arrayList != null) {
                        arrayList.remove(pnzVar);
                        if (poeVar.c.size() == 0 && (animatorListener = poeVar.b) != null) {
                            poeVar.a.c.removeListener(animatorListener);
                            poeVar.b = null;
                        }
                    }
                }
                if (pnzVar != null) {
                    Drawable drawable2 = poeVar.e;
                    if (drawable2 != null) {
                        poe.b((AnimatedVectorDrawable) drawable2, pnzVar);
                    } else {
                        if (poeVar.c == null) {
                            poeVar.c = new ArrayList();
                        }
                        if (!poeVar.c.contains(pnzVar)) {
                            poeVar.c.add(pnzVar);
                            if (poeVar.b == null) {
                                poeVar.b = new pob(poeVar);
                            }
                            poeVar.a.c.addListener(poeVar.b);
                        }
                    }
                }
            }
            Drawable drawable3 = this.p;
            if ((drawable3 instanceof AnimatedStateListDrawable) && poeVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, poeVar, false);
                ((AnimatedStateListDrawable) this.p).addTransition(R.id.indeterminate, R.id.unchecked, poeVar, false);
            }
        }
        Drawable drawable4 = this.p;
        if (drawable4 != null && (colorStateList2 = this.b) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.q;
        if (drawable5 != null && (colorStateList = this.c) != null) {
            drawable5.setTintList(colorStateList);
        }
        super.setButtonDrawable(eejo.c(this.p, this.q, -1, -1));
        refreshDrawableState();
    }

    private final void d() {
        if (Build.VERSION.SDK_INT < 30 || this.v != null) {
            return;
        }
        int i2 = this.t;
        super.setStateDescription(i2 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i2 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate));
    }

    public final void f(int i2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.t != i2) {
            this.t = i2;
            super.setChecked(i2 == 1);
            refreshDrawableState();
            d();
            if (this.u) {
                return;
            }
            this.u = true;
            LinkedHashSet linkedHashSet = this.j;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((eegn) it.next()).a();
                }
            }
            if (this.t != 2 && (onCheckedChangeListener = this.e) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManagerM139m = akc$$ExternalSyntheticApiModelOutline0.m139m(getContext().getSystemService(akc$$ExternalSyntheticApiModelOutline0.m143m()));
            if (autofillManagerM139m != null) {
                autofillManagerM139m.notifyValueChanged(this);
            }
            this.u = false;
        }
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.p;
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.b;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.t == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l && this.b == null && this.c == null) {
            this.l = true;
            if (this.k == null) {
                int[][] iArr = h;
                int length = iArr.length;
                int iB = eehg.b(this, R.attr.colorControlActivated);
                int iB2 = eehg.b(this, R.attr.colorError);
                int iB3 = eehg.b(this, R.attr.colorSurface);
                int iB4 = eehg.b(this, R.attr.colorOnSurface);
                this.k = new ColorStateList(iArr, new int[]{eehg.f(iB3, iB2, 1.0f), eehg.f(iB3, iB, 1.0f), eehg.f(iB3, iB4, 0.54f), eehg.f(iB3, iB4, 0.38f), eehg.f(iB3, iB4, 0.38f)});
            }
            setButtonTintList(this.k);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (this.t == 2) {
            mergeDrawableStates(iArrOnCreateDrawableState, f);
        }
        if (this.n) {
            mergeDrawableStates(iArrOnCreateDrawableState, g);
        }
        this.d = eejo.g(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.m || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int i2 = true == eemo.k(this) ? -1 : 1;
        int width = getWidth() - buttonDrawable.getIntrinsicWidth();
        int iSave = canvas.save();
        int i3 = (width / 2) * i2;
        canvas.translate(i3, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + i3, bounds.top, bounds.right + i3, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.n) {
            accessibilityNodeInfo.setText(String.valueOf(accessibilityNodeInfo.getText()) + ", " + String.valueOf(this.o));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof eegp)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        eegp eegpVar = (eegp) parcelable;
        super.onRestoreInstanceState(eegpVar.getSuperState());
        f(eegpVar.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        eegp eegpVar = new eegp(super.onSaveInstanceState());
        eegpVar.a = this.t;
        return eegpVar;
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.CompoundButton
    public final void setButtonDrawable(int i2) {
        setButtonDrawable(ku.a(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.b == colorStateList) {
            return;
        }
        this.b = colorStateList;
        c();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        gT(mode);
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        f(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.e = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(CharSequence charSequence) {
        this.v = charSequence;
        if (charSequence == null) {
            d();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        f(!isChecked() ? 1 : 0);
    }

    public eegq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.p = drawable;
        this.r = false;
        c();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public eegq(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        int i3 = a;
        super(eexh.a(context, attributeSet, i2, i3), attributeSet, i2);
        new LinkedHashSet();
        this.j = new LinkedHashSet();
        Context context2 = getContext();
        poe poeVar = new poe(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        WeakHashMap weakHashMap = kyy.a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        drawable.setCallback(poeVar.d);
        new pod(drawable.getConstantState());
        poeVar.e = drawable;
        this.w = poeVar;
        this.x = new eegm(this);
        Context context3 = getContext();
        this.p = getButtonDrawable();
        ColorStateList colorStateList = this.b;
        this.b = colorStateList == null ? super.getButtonTintList() != null ? super.getButtonTintList() : null : colorStateList;
        gU();
        yx yxVarB = eemh.b(context3, attributeSet, eegr.a, i2, i3, new int[0]);
        this.q = yxVarB.h(2);
        if (this.p != null && eemh.e(context3)) {
            int iF = yxVarB.f(0, 0);
            int iF2 = yxVarB.f(1, 0);
            if (iF == i && iF2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.p = ku.a(context3, R.drawable.mtrl_checkbox_button);
                this.r = true;
                if (this.q == null) {
                    this.q = ku.a(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.c = eepy.d(context3, yxVarB, 3);
        this.s = eemo.c(yxVarB.c(4, -1), PorterDuff.Mode.SRC_IN);
        this.l = yxVarB.p(10, false);
        this.m = yxVarB.p(6, true);
        this.n = yxVarB.p(9, false);
        this.o = yxVarB.m(8);
        if (yxVarB.q(7)) {
            f(yxVarB.c(7, 0));
        }
        yxVarB.o();
        c();
    }
}
