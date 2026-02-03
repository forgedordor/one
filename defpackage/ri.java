package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ri extends re {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public ri(SeekBar seekBar) {
        super(seekBar);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = seekBar;
    }

    private final void c() {
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.f || this.g) {
                Drawable drawableMutate = drawable.mutate();
                this.c = drawableMutate;
                if (this.f) {
                    drawableMutate.setTintList(this.d);
                }
                if (this.g) {
                    this.c.setTintMode(this.e);
                }
                if (this.c.isStateful()) {
                    this.c.setState(this.b.getDrawableState());
                }
            }
        }
    }

    @Override // defpackage.re
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, i);
        SeekBar seekBar = this.b;
        Context context = seekBar.getContext();
        int[] iArr = kt.h;
        yx yxVarL = yx.l(context, attributeSet, iArr, i, 0);
        ley.o(seekBar, seekBar.getContext(), iArr, attributeSet, yxVarL.b, i, 0);
        Drawable drawableI = yxVarL.i(0);
        if (drawableI != null) {
            seekBar.setThumb(drawableI);
        }
        Drawable drawableH = yxVarL.h(1);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = drawableH;
        if (drawableH != null) {
            drawableH.setCallback(seekBar);
            drawableH.setLayoutDirection(seekBar.getLayoutDirection());
            if (drawableH.isStateful()) {
                drawableH.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (yxVarL.q(3)) {
            this.e = th.a(yxVarL.c(3, -1), this.e);
            this.g = true;
        }
        if (yxVarL.q(2)) {
            this.d = yxVarL.g(2);
            this.f = true;
        }
        yxVarL.o();
        c();
    }
}
