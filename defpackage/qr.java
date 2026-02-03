package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qr {
    public boolean a;
    private final CheckedTextView b;

    public qr(CheckedTextView checkedTextView) {
        this.b = checkedTextView;
    }

    final void a() {
        this.b.getCheckMarkDrawable();
    }

    final void b(AttributeSet attributeSet) {
        int iF;
        int iF2;
        CheckedTextView checkedTextView = this.b;
        Context context = checkedTextView.getContext();
        int[] iArr = kt.m;
        yx yxVarL = yx.l(context, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        ley.o(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, yxVarL.b, R.attr.checkedTextViewStyle, 0);
        try {
            if (yxVarL.q(1) && (iF2 = yxVarL.f(1, 0)) != 0) {
                try {
                    checkedTextView.setCheckMarkDrawable(ku.a(checkedTextView.getContext(), iF2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (yxVarL.q(0) && (iF = yxVarL.f(0, 0)) != 0) {
                CheckedTextView checkedTextView2 = this.b;
                checkedTextView2.setCheckMarkDrawable(ku.a(checkedTextView2.getContext(), iF));
            }
            if (yxVarL.q(2)) {
                this.b.setCheckMarkTintList(yxVarL.g(2));
            }
            if (yxVarL.q(3)) {
                this.b.setCheckMarkTintMode(th.a(yxVarL.c(3, -1), null));
            }
        } finally {
            yxVarL.o();
        }
    }
}
