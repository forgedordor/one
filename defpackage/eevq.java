package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eevq extends eewk {
    public EditText a;
    private final int b;
    private final int c;
    private final TimeInterpolator d;
    private final TimeInterpolator i;
    private final View.OnClickListener j;
    private final View.OnFocusChangeListener k;
    private AnimatorSet l;
    private ValueAnimator m;

    public eevq(eewj eewjVar) {
        super(eewjVar);
        this.j = new View.OnClickListener() { // from class: eevj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eevq eevqVar = this.a;
                EditText editText = eevqVar.a;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                eevqVar.x();
            }
        };
        this.k = new View.OnFocusChangeListener() { // from class: eevk
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                eevq eevqVar = this.a;
                eevqVar.f(eevqVar.k());
            }
        };
        this.b = eepx.a(eewjVar.getContext(), R.attr.motionDurationShort3, 100);
        this.c = eepx.a(eewjVar.getContext(), R.attr.motionDurationShort3, 150);
        this.d = eenh.a(eewjVar.getContext(), R.attr.motionEasingLinearInterpolator, eecd.a);
        this.i = eenh.a(eewjVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, eecd.d);
    }

    private final ValueAnimator m(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.d);
        valueAnimatorOfFloat.setDuration(this.b);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eevl
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.eewk
    public final int a() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.eewk
    public final int b() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.eewk
    public final View.OnClickListener c() {
        return this.j;
    }

    @Override // defpackage.eewk
    public final View.OnFocusChangeListener d() {
        return this.k;
    }

    @Override // defpackage.eewk
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    public final void f(boolean z) {
        boolean zR = this.f.r();
        if (!z) {
            this.l.cancel();
            this.m.start();
            if (zR) {
                return;
            }
            this.m.end();
            return;
        }
        if (this.l.isRunning()) {
            return;
        }
        this.m.cancel();
        this.l.start();
        if (zR) {
            this.l.end();
        }
    }

    @Override // defpackage.eewk
    public final void g(EditText editText) {
        this.a = editText;
        this.e.i(k());
    }

    @Override // defpackage.eewk
    public final void h(boolean z) {
        if (this.f.h == null) {
            return;
        }
        f(z);
    }

    @Override // defpackage.eewk
    public final void i() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.i);
        valueAnimatorOfFloat.setDuration(this.c);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eevn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = this.a.h;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
            }
        });
        ValueAnimator valueAnimatorM = m(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorM);
        this.l.addListener(new eevo(this));
        ValueAnimator valueAnimatorM2 = m(1.0f, 0.0f);
        this.m = valueAnimatorM2;
        valueAnimatorM2.addListener(new eevp(this));
    }

    @Override // defpackage.eewk
    public final void j() {
        EditText editText = this.a;
        if (editText != null) {
            editText.post(new Runnable() { // from class: eevm
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f(true);
                }
            });
        }
    }

    public final boolean k() {
        EditText editText = this.a;
        if (editText != null) {
            return (editText.hasFocus() || this.h.hasFocus()) && this.a.getText().length() > 0;
        }
        return false;
    }

    @Override // defpackage.eewk
    public final void l() {
        if (this.f.h != null) {
            return;
        }
        f(k());
    }
}
