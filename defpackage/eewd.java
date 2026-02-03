package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.apps.messaging.R;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eewd extends eewk {
    public AutoCompleteTextView a;
    public boolean b;
    public boolean c;
    public ValueAnimator d;
    private final int i;
    private final int j;
    private final TimeInterpolator k;
    private final View.OnClickListener l;
    private final View.OnFocusChangeListener m;
    private final AccessibilityManager.TouchExplorationStateChangeListener n;
    private boolean o;
    private long p;
    private AccessibilityManager q;
    private ValueAnimator r;

    public eewd(eewj eewjVar) {
        super(eewjVar);
        this.l = new View.OnClickListener() { // from class: eevy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.m();
            }
        };
        this.m = new View.OnFocusChangeListener() { // from class: eevz
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                eewd eewdVar = this.a;
                eewdVar.b = z;
                eewdVar.x();
                if (z) {
                    return;
                }
                eewdVar.k(false);
                eewdVar.c = false;
            }
        };
        this.n = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: eewa
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                eewd eewdVar = this.a;
                AutoCompleteTextView autoCompleteTextView = eewdVar.a;
                if (autoCompleteTextView == null || eewe.a(autoCompleteTextView)) {
                    return;
                }
                eewdVar.h.setImportantForAccessibility(true == z ? 2 : 1);
            }
        };
        this.p = Long.MAX_VALUE;
        this.j = eepx.a(eewjVar.getContext(), R.attr.motionDurationShort3, 67);
        this.i = eepx.a(eewjVar.getContext(), R.attr.motionDurationShort3, 50);
        this.k = eenh.a(eewjVar.getContext(), R.attr.motionEasingLinearInterpolator, eecd.a);
    }

    private final ValueAnimator z(int i, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.k);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eevv
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.eewk
    public final AccessibilityManager.TouchExplorationStateChangeListener A() {
        return this.n;
    }

    @Override // defpackage.eewk
    public final int a() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.eewk
    public final int b() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.eewk
    public final View.OnClickListener c() {
        return this.l;
    }

    @Override // defpackage.eewk
    public final View.OnFocusChangeListener d() {
        return this.m;
    }

    @Override // defpackage.eewk
    public final void g(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.a = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: eevw
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    eewd eewdVar = this.a;
                    if (eewdVar.p()) {
                        eewdVar.c = false;
                    }
                    eewdVar.m();
                    eewdVar.n();
                }
                return false;
            }
        });
        this.a.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: eevx
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                eewd eewdVar = this.a;
                eewdVar.n();
                eewdVar.k(false);
            }
        });
        this.a.setThreshold(0);
        TextInputLayout textInputLayout = this.e;
        textInputLayout.b.m(null);
        if (!eewe.a(editText) && this.q.isTouchExplorationEnabled()) {
            this.h.setImportantForAccessibility(2);
        }
        textInputLayout.i(true);
    }

    @Override // defpackage.eewk
    public final void i() {
        this.d = z(this.j, 0.0f, 1.0f);
        ValueAnimator valueAnimatorZ = z(this.i, 1.0f, 0.0f);
        this.r = valueAnimatorZ;
        valueAnimatorZ.addListener(new eewc(this));
        this.q = (AccessibilityManager) this.g.getSystemService("accessibility");
    }

    @Override // defpackage.eewk
    public final void j() {
        AutoCompleteTextView autoCompleteTextView = this.a;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.a.setOnDismissListener(null);
        }
    }

    public final void k(boolean z) {
        if (this.o != z) {
            this.o = z;
            this.d.cancel();
            this.r.start();
        }
    }

    @Override // defpackage.eewk
    public final void l() {
        if (this.q.isTouchExplorationEnabled() && eewe.a(this.a) && !this.h.hasFocus()) {
            this.a.dismissDropDown();
        }
        this.a.post(new Runnable() { // from class: eewb
            @Override // java.lang.Runnable
            public final void run() {
                eewd eewdVar = this.a;
                boolean zIsPopupShowing = eewdVar.a.isPopupShowing();
                eewdVar.k(zIsPopupShowing);
                eewdVar.c = zIsPopupShowing;
            }
        });
    }

    public final void m() {
        if (this.a == null) {
            return;
        }
        if (p()) {
            this.c = false;
        }
        if (this.c) {
            this.c = false;
            return;
        }
        k(!this.o);
        if (!this.o) {
            this.a.dismissDropDown();
        } else {
            this.a.requestFocus();
            this.a.showDropDown();
        }
    }

    public final void n() {
        this.c = true;
        this.p = SystemClock.uptimeMillis();
    }

    @Override // defpackage.eewk
    public final boolean o(int i) {
        return i != 0;
    }

    public final boolean p() {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.p;
        return jUptimeMillis < 0 || jUptimeMillis > 300;
    }

    @Override // defpackage.eewk
    public final boolean q() {
        return true;
    }

    @Override // defpackage.eewk
    public final boolean r() {
        return this.b;
    }

    @Override // defpackage.eewk
    public final boolean s() {
        return true;
    }

    @Override // defpackage.eewk
    public final boolean t() {
        return this.o;
    }

    @Override // defpackage.eewk
    public final boolean u() {
        return true;
    }

    @Override // defpackage.eewk
    public final void v(lhg lhgVar) {
        if (!eewe.a(this.a)) {
            lhgVar.s(Spinner.class.getName());
        }
        if (lhgVar.a.isShowingHintText()) {
            lhgVar.D(null);
        }
    }

    @Override // defpackage.eewk
    public final void w(AccessibilityEvent accessibilityEvent) {
        if (!this.q.isEnabled() || eewe.a(this.a)) {
            return;
        }
        boolean z = false;
        if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.o && !this.a.isPopupShowing()) {
            z = true;
        }
        if (accessibilityEvent.getEventType() == 1 || z) {
            m();
            n();
        }
    }
}
