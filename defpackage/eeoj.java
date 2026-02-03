package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.R;
import defpackage.eeok;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eeoj<S extends eeok> extends ProgressBar {
    public final eeok a;
    public int b;
    public boolean c;
    public final int d;
    public long e;
    public boolean f;
    public final int g;
    public final Runnable h;
    public final Runnable i;
    private final boolean j;
    private final int k;
    private final pnz l;
    private final pnz m;

    protected eeoj(Context context, AttributeSet attributeSet, int i, int i2) {
        super(eexh.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.e = -1L;
        this.f = false;
        this.g = 4;
        this.h = new eeof(this);
        this.i = new eeog(this);
        this.l = new eeoh(this);
        this.m = new eeoi(this);
        Context context2 = getContext();
        this.a = a(context2, attributeSet);
        TypedArray typedArrayA = eemh.a(context2, attributeSet, eept.a, i, i2, new int[0]);
        this.k = typedArrayA.getInt(7, -1);
        this.d = Math.min(typedArrayA.getInt(5, -1), 1000);
        typedArrayA.recycle();
        this.j = true;
    }

    private final eeph i() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().a;
        }
        if (getProgressDrawable() != null) {
            return getProgressDrawable().a;
        }
        return null;
    }

    public abstract eeok a(Context context, AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final eepa getProgressDrawable() {
        return (eepa) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final eepj getIndeterminateDrawable() {
        return (eepj) super.getIndeterminateDrawable();
    }

    protected final void d(boolean z) {
        if (this.j) {
            ((eepe) getCurrentDrawable()).l(h(), false, z);
        }
    }

    public final void e() {
        if (this.d > 0) {
            this.e = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    public void f(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.b = i;
            this.c = false;
            this.f = true;
            if (!getIndeterminateDrawable().isVisible() || eeoe.a(getContext().getContentResolver()) == 0.0f) {
                this.l.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().b.c();
            }
        }
    }

    public final void g() {
        int i = this.k;
        if (i <= 0) {
            this.h.run();
            return;
        }
        Runnable runnable = this.h;
        removeCallbacks(runnable);
        postDelayed(runnable, i);
    }

    @Override // android.widget.ProgressBar
    public final Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    final boolean h() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b.b(this.l);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().h(this.m);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().h(this.m);
        }
        if (h()) {
            e();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.i);
        removeCallbacks(this.h);
        ((eepe) getCurrentDrawable()).n();
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().o(this.m);
            getIndeterminateDrawable().b.e();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().o(this.m);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        eeph eephVarI = i();
        if (eephVarI == null) {
            return;
        }
        setMeasuredDimension(eephVarI.b() < 0 ? getDefaultSize(getSuggestedMinimumWidth(), i) : eephVarI.b() + getPaddingLeft() + getPaddingRight(), eephVarI.a() < 0 ? getDefaultSize(getSuggestedMinimumHeight(), i2) : eephVarI.a() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        d(i == 0);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        d(false);
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable != null) {
            ((eepe) currentDrawable).n();
        }
        super.setIndeterminate(z);
        Drawable currentDrawable2 = getCurrentDrawable();
        if (currentDrawable2 != null) {
            ((eepe) currentDrawable2).l(h(), false, false);
        }
        if ((currentDrawable2 instanceof eepj) && h()) {
            ((eepj) currentDrawable2).b.d();
        }
        this.f = false;
    }

    @Override // android.widget.ProgressBar
    public final void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof eepj)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((eepe) drawable).n();
            super.setIndeterminateDrawable(drawable);
        }
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        f(i, false);
    }

    @Override // android.widget.ProgressBar
    public final void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof eepa)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            eepa eepaVar = (eepa) drawable;
            eepaVar.n();
            super.setProgressDrawable(eepaVar);
            eepaVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }
}
