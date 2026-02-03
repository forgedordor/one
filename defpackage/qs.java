package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qs {
    public PorterDuff.Mode a = null;
    public boolean b = false;
    public boolean c = false;
    private final CompoundButton d;
    private boolean e;

    public qs(CompoundButton compoundButton) {
        this.d = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.b || this.c) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.b) {
                    drawableMutate.setTintList(null);
                }
                if (this.c) {
                    drawableMutate.setTintMode(this.a);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        int iF;
        int iF2;
        CompoundButton compoundButton = this.d;
        Context context = compoundButton.getContext();
        int[] iArr = kt.n;
        yx yxVarL = yx.l(context, attributeSet, iArr, i, 0);
        ley.o(compoundButton, compoundButton.getContext(), iArr, attributeSet, yxVarL.b, i, 0);
        try {
            if (yxVarL.q(1) && (iF2 = yxVarL.f(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(ku.a(compoundButton.getContext(), iF2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (yxVarL.q(0) && (iF = yxVarL.f(0, 0)) != 0) {
                CompoundButton compoundButton2 = this.d;
                compoundButton2.setButtonDrawable(ku.a(compoundButton2.getContext(), iF));
            }
            if (yxVarL.q(2)) {
                this.d.setButtonTintList(yxVarL.g(2));
            }
            if (yxVarL.q(3)) {
                this.d.setButtonTintMode(th.a(yxVarL.c(3, -1), null));
            }
        } finally {
            yxVarL.o();
        }
    }

    public final void c() {
        if (this.e) {
            this.e = false;
        } else {
            this.e = true;
            a();
        }
    }
}
