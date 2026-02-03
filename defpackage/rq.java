package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rq extends us implements rt {
    public CharSequence a;
    ListAdapter b;
    public final Rect c;
    final /* synthetic */ ru d;
    private int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq(ru ruVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.d = ruVar;
        this.c = new Rect();
        this.l = ruVar;
        y();
        this.m = new rn(this);
    }

    @Override // defpackage.rt
    public final CharSequence d() {
        return this.a;
    }

    @Override // defpackage.us, defpackage.rt
    public final void e(ListAdapter listAdapter) {
        super.e(listAdapter);
        this.b = listAdapter;
    }

    @Override // defpackage.rt
    public final void h(int i) {
        this.s = i;
    }

    @Override // defpackage.rt
    public final void i(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.rt
    public final void k(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean zX = x();
        n();
        w();
        super.v();
        tm tmVar = this.e;
        tmVar.setChoiceMode(1);
        tmVar.setTextDirection(i);
        tmVar.setTextAlignment(i2);
        ru ruVar = this.d;
        int selectedItemPosition = ruVar.getSelectedItemPosition();
        tm tmVar2 = this.e;
        if (x() && tmVar2 != null) {
            tmVar2.a = false;
            tmVar2.setSelection(selectedItemPosition);
            if (tmVar2.getChoiceMode() != 0) {
                tmVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zX || (viewTreeObserver = ruVar.getViewTreeObserver()) == null) {
            return;
        }
        ro roVar = new ro(this);
        viewTreeObserver.addOnGlobalLayoutListener(roVar);
        t(new rp(this, roVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.widget.ListAdapter, android.widget.SpinnerAdapter] */
    final void n() {
        int i;
        Drawable drawableC = c();
        if (drawableC != null) {
            ru ruVar = this.d;
            Rect rect = ruVar.d;
            drawableC.getPadding(rect);
            i = zy.a(ruVar) ? rect.right : -rect.left;
        } else {
            Rect rect2 = this.d.d;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        ru ruVar2 = this.d;
        int paddingLeft = ruVar2.getPaddingLeft();
        int paddingRight = ruVar2.getPaddingRight();
        int width = ruVar2.getWidth();
        int i2 = ruVar2.c;
        if (i2 == -2) {
            int i3 = (width - paddingLeft) - paddingRight;
            int iA = ruVar2.a(this.b, c());
            int i4 = ruVar2.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = ruVar2.d;
            int i5 = (i4 - rect3.left) - rect3.right;
            if (iA > i5) {
                iA = i5;
            }
            r(Math.max(iA, i3));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.g = zy.a(ruVar2) ? i + (((width - paddingRight) - this.f) - this.s) : i + paddingLeft + this.s;
    }
}
