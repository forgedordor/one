package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class knj extends jgl implements knm, ldn {
    public final Window a;
    public boolean b;
    public boolean c;
    public boolean d;
    private final hox e;
    private boolean f;

    public knj(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.a = window;
        this.e = new hpl(kne.a, hsi.a);
        int[] iArr = ley.a;
        len.k(this, this);
        lgb.d(this, new knh(this));
    }

    @Override // defpackage.knm
    public final Window a() {
        return this.a;
    }

    @Override // defpackage.jgl
    public final void b(hml hmlVar, int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1735448596);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (hmlVarC.J((i2 & 3) != 2, i2 & 1)) {
            ((fdat) this.e.a()).a(hmlVarC, 0);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new kni(this, i);
        }
    }

    public final void c(hnb hnbVar, fdat fdatVar) {
        super.i(hnbVar);
        this.e.b(fdatVar);
        this.f = true;
        e();
    }

    @Override // defpackage.jgl
    protected final boolean d() {
        return this.f;
    }

    @Override // defpackage.ldn
    public final lgt ez(View view, lgt lgtVar) {
        if (!this.c) {
            int i = 0;
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0) {
                i = iMax;
            } else if (iMax2 == 0) {
                if (iMax3 != 0) {
                    iMax2 = 0;
                } else if (iMax4 != 0) {
                    iMax2 = 0;
                    iMax3 = 0;
                }
            }
            return lgtVar.n(i, iMax2, iMax3, iMax4);
        }
        return lgtVar;
    }

    @Override // defpackage.jgl
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft2 = getPaddingLeft() + (((i5 - measuredWidth) - paddingLeft) / 2);
        int paddingTop2 = getPaddingTop() + (((i6 - measuredHeight) - paddingTop) / 2);
        childAt.layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
    }

    @Override // defpackage.jgl
    public final void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.h(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int i3 = (mode != Integer.MIN_VALUE || this.b || this.c || this.a.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i4 = size - paddingLeft;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = i3 - paddingTop;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingLeft);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingLeft;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingTop : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingTop));
        if (this.c || childAt.getMeasuredHeight() + paddingTop <= size2) {
            return;
        }
        Window window = this.a;
        if (window.getAttributes().height == -2) {
            window.addFlags(Integer.MIN_VALUE);
            if (this.b) {
                return;
            }
            window.setLayout(-1, -1);
        }
    }
}
