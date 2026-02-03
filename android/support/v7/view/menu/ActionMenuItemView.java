package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.kt;
import defpackage.nn;
import defpackage.no;
import defpackage.ob;
import defpackage.of;
import defpackage.oq;
import defpackage.pt;
import defpackage.tu;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements View.OnClickListener, oq, pt {
    public of a;
    public ob b;
    public no c;
    private CharSequence d;
    private Drawable e;
    private tu f;
    private boolean g;
    private int h;
    private int i;
    private int j;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    private final void m() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.d);
        if (this.e != null && ((this.a.o & 4) != 4 || !this.g)) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.d : null);
        CharSequence charSequence = this.a.m;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.a.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.a.n;
        if (TextUtils.isEmpty(charSequence2)) {
            setTooltipText(z3 ? null : this.a.e);
        } else {
            setTooltipText(charSequence2);
        }
    }

    private final boolean n() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        return i >= 480 || configuration.orientation == 2;
    }

    @Override // defpackage.oq
    public final of a() {
        return this.a;
    }

    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.pt
    public final boolean c() {
        return b();
    }

    @Override // defpackage.pt
    public final boolean d() {
        return b() && this.a.getIcon() == null;
    }

    @Override // defpackage.oq
    public final boolean e() {
        return true;
    }

    @Override // defpackage.oq
    public final void f(of ofVar) {
        this.a = ofVar;
        Drawable icon = ofVar.getIcon();
        this.e = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i = this.j;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            icon.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(icon, null, null, null);
        m();
        this.d = ofVar.f(this);
        m();
        setId(ofVar.a);
        setVisibility(true != ofVar.isVisible() ? 8 : 0);
        setEnabled(ofVar.isEnabled());
        if (ofVar.hasSubMenu() && this.f == null) {
            this.f = new nn(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ob obVar = this.b;
        if (obVar != null) {
            obVar.b(this.a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g = n();
        m();
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        boolean zB = b();
        if (zB && (i3 = this.i) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.h) : this.h;
        if (mode != 1073741824 && this.h > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zB || this.e == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tu tuVar;
        if (this.a.hasSubMenu() && (tuVar = this.f) != null && tuVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.i = i;
        super.setPadding(i, i2, i3, i4);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.g = n();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kt.c, i, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.j = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.i = -1;
        setSaveEnabled(false);
    }
}
