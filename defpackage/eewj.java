package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eewj extends LinearLayout {
    public final TextInputLayout a;
    public final CheckableImageButton b;
    public ColorStateList c;
    public final CheckableImageButton d;
    public int e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public CharSequence h;
    public final TextView i;
    public EditText j;
    public final TextWatcher k;
    private final FrameLayout l;
    private PorterDuff.Mode m;
    private final eewi n;
    private final LinkedHashSet o;
    private int p;
    private boolean q;
    private final AccessibilityManager r;
    private AccessibilityManager.TouchExplorationStateChangeListener s;
    private final eewg t;

    public eewj(TextInputLayout textInputLayout, yx yxVar) {
        super(textInputLayout.getContext());
        this.e = 0;
        this.o = new LinkedHashSet();
        this.k = new eewf(this);
        eewg eewgVar = new eewg(this);
        this.t = eewgVar;
        this.r = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.l = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonT = t(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.b = checkableImageButtonT;
        CheckableImageButton checkableImageButtonT2 = t(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.d = checkableImageButtonT2;
        this.n = new eewi(this, yxVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.i = appCompatTextView;
        int[] iArr = eewv.a;
        if (yxVar.q(38)) {
            this.c = eepy.d(getContext(), yxVar, 38);
        }
        if (yxVar.q(39)) {
            this.m = eemo.c(yxVar.c(39, -1), null);
        }
        if (yxVar.q(37)) {
            m(yxVar.h(37));
        }
        checkableImageButtonT.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonT.setImportantForAccessibility(2);
        checkableImageButtonT.setClickable(false);
        checkableImageButtonT.c = false;
        checkableImageButtonT.a(false);
        checkableImageButtonT.setFocusable(false);
        if (!yxVar.q(54)) {
            if (yxVar.q(32)) {
                this.f = eepy.d(getContext(), yxVar, 32);
            }
            if (yxVar.q(33)) {
                this.g = eemo.c(yxVar.c(33, -1), null);
            }
        }
        if (yxVar.q(30)) {
            k(yxVar.c(30, 0));
            if (yxVar.q(27)) {
                j(yxVar.m(27));
            }
            i(yxVar.p(26, true));
        } else if (yxVar.q(54)) {
            if (yxVar.q(55)) {
                this.f = eepy.d(getContext(), yxVar, 55);
            }
            if (yxVar.q(56)) {
                this.g = eemo.c(yxVar.c(56, -1), null);
            }
            k(yxVar.p(54, false) ? 1 : 0);
            j(yxVar.m(52));
        }
        int iB = yxVar.b(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (iB < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (iB != this.p) {
            this.p = iB;
            eewl.d(checkableImageButtonT2, iB);
            eewl.d(checkableImageButtonT, iB);
        }
        if (yxVar.q(31)) {
            ImageView.ScaleType scaleTypeA = eewl.a(yxVar.c(31, -1));
            checkableImageButtonT2.setScaleType(scaleTypeA);
            checkableImageButtonT.setScaleType(scaleTypeA);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(yxVar.f(73, 0));
        if (yxVar.q(74)) {
            appCompatTextView.setTextColor(yxVar.g(74));
        }
        CharSequence charSequenceM = yxVar.m(72);
        this.h = true != TextUtils.isEmpty(charSequenceM) ? charSequenceM : null;
        appCompatTextView.setText(charSequenceM);
        v();
        frameLayout.addView(checkableImageButtonT2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonT);
        textInputLayout.n.add(eewgVar);
        if (textInputLayout.c != null) {
            eewgVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new eewh(this));
    }

    private final CheckableImageButton t(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (eepy.f(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private final void u() {
        int i = 0;
        this.l.setVisibility((this.d.getVisibility() != 0 || s()) ? 8 : 0);
        boolean z = (this.h == null || this.q) ? 8 : false;
        if (!r() && !s() && z) {
            i = 8;
        }
        setVisibility(i);
    }

    private final void v() {
        TextView textView = this.i;
        int visibility = textView.getVisibility();
        int i = 8;
        if (this.h != null && !this.q) {
            i = 0;
        }
        if (visibility != i) {
            c().h(i == 0);
        }
        u();
        textView.setVisibility(i);
        this.a.D();
    }

    public final int a() {
        int marginStart;
        if (r() || s()) {
            CheckableImageButton checkableImageButton = this.d;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return getPaddingEnd() + this.i.getPaddingEnd() + marginStart;
    }

    public final Drawable b() {
        return this.d.getDrawable();
    }

    public final eewk c() {
        eewi eewiVar = this.n;
        SparseArray sparseArray = eewiVar.a;
        int i = this.e;
        eewk eevrVar = (eewk) sparseArray.get(i);
        if (eevrVar == null) {
            if (i == -1) {
                eevrVar = new eevr(eewiVar.b);
            } else if (i == 0) {
                eevrVar = new eews(eewiVar.b);
            } else if (i == 1) {
                eevrVar = new eewu(eewiVar.b, eewiVar.d);
            } else if (i == 2) {
                eevrVar = new eevq(eewiVar.b);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(a.g(i, "Invalid end icon mode: "));
                }
                eevrVar = new eewd(eewiVar.b);
            }
            sparseArray.append(i, eevrVar);
        }
        return eevrVar;
    }

    public final void d() {
        AccessibilityManager accessibilityManager;
        if (this.s == null || (accessibilityManager = this.r) == null || !isAttachedToWindow()) {
            return;
        }
        accessibilityManager.addTouchExplorationStateChangeListener(this.s);
    }

    public final void e(boolean z) {
        this.q = z;
        v();
    }

    public final void f() {
        eewl.c(this.a, this.d, this.f);
    }

    final void g(boolean z) {
        CheckableImageButton checkableImageButton;
        boolean zIsActivated;
        CheckableImageButton checkableImageButton2;
        boolean z2;
        eewk eewkVarC = c();
        boolean z3 = false;
        boolean z4 = true;
        if (eewkVarC.s() && (z2 = (checkableImageButton2 = this.d).a) != eewkVarC.t()) {
            checkableImageButton2.setChecked(!z2);
            z3 = true;
        }
        if (!eewkVarC.q() || (zIsActivated = (checkableImageButton = this.d).isActivated()) == eewkVarC.r()) {
            z4 = z3;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            f();
        }
    }

    public final void h() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.s;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.r) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    final void i(boolean z) {
        this.d.a(z);
    }

    final void j(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    final void k(int i) {
        if (this.e == i) {
            return;
        }
        eewk eewkVarC = c();
        h();
        this.s = null;
        eewkVarC.j();
        this.e = i;
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((eexd) it.next()).a();
        }
        l(i != 0);
        eewk eewkVarC2 = c();
        int iB = this.n.c;
        if (iB == 0) {
            iB = eewkVarC2.b();
        }
        Drawable drawableA = iB != 0 ? ku.a(getContext(), iB) : null;
        CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setImageDrawable(drawableA);
        if (drawableA != null) {
            eewl.b(this.a, checkableImageButton, this.f, this.g);
            f();
        }
        int iA = eewkVarC2.a();
        j(iA != 0 ? getResources().getText(iA) : null);
        i(eewkVarC2.s());
        TextInputLayout textInputLayout = this.a;
        int i2 = textInputLayout.m;
        if (!eewkVarC2.o(i2)) {
            throw new IllegalStateException(a.s(i, i2, "The current box background mode ", " is not supported by the end icon mode "));
        }
        eewkVarC2.i();
        this.s = eewkVarC2.A();
        d();
        eewl.e(checkableImageButton, eewkVarC2.c());
        EditText editText = this.j;
        if (editText != null) {
            eewkVarC2.g(editText);
            n(eewkVarC2);
        }
        eewl.b(textInputLayout, checkableImageButton, this.f, this.g);
        g(true);
    }

    public final void l(boolean z) {
        if (r() != z) {
            this.d.setVisibility(true != z ? 8 : 0);
            u();
            p();
            this.a.D();
        }
    }

    final void m(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.b;
        checkableImageButton.setImageDrawable(drawable);
        o();
        eewl.b(this.a, checkableImageButton, this.c, this.m);
    }

    public final void n(eewk eewkVar) {
        EditText editText = this.j;
        if (editText == null) {
            return;
        }
        if (eewkVar.d() != null) {
            editText.setOnFocusChangeListener(eewkVar.d());
        }
        if (eewkVar.e() != null) {
            this.d.setOnFocusChangeListener(eewkVar.e());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            r3 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r3.b
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            if (r1 == 0) goto L18
            com.google.android.material.textfield.TextInputLayout r1 = r3.a
            eewo r2 = r1.d
            boolean r2 = r2.g
            if (r2 == 0) goto L18
            boolean r1 = r1.C()
            if (r1 == 0) goto L18
            r1 = 0
            goto L1a
        L18:
            r1 = 8
        L1a:
            r0.setVisibility(r1)
            r3.u()
            r3.p()
            boolean r0 = r3.q()
            if (r0 != 0) goto L2e
            com.google.android.material.textfield.TextInputLayout r0 = r3.a
            r0.D()
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eewj.o():void");
    }

    public final void p() {
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.c == null) {
            return;
        }
        int paddingEnd = 0;
        if (!r() && !s()) {
            paddingEnd = textInputLayout.c.getPaddingEnd();
        }
        this.i.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.c.getPaddingTop(), paddingEnd, textInputLayout.c.getPaddingBottom());
    }

    public final boolean q() {
        return this.e != 0;
    }

    public final boolean r() {
        return this.l.getVisibility() == 0 && this.d.getVisibility() == 0;
    }

    public final boolean s() {
        return this.b.getVisibility() == 0;
    }
}
