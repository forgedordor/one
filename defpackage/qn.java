package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qn {
    public yv a;
    private final View b;
    private yv e;
    private yv f;
    private int d = -1;
    private final qu c = qu.d();

    public qn(View view) {
        this.b = view;
    }

    public final void a() {
        View view = this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.e != null) {
                if (this.f == null) {
                    this.f = new yv();
                }
                yv yvVar = this.f;
                yvVar.a = null;
                yvVar.d = false;
                yvVar.b = null;
                yvVar.c = false;
                int[] iArr = ley.a;
                ColorStateList colorStateListC = len.c(view);
                if (colorStateListC != null) {
                    yvVar.d = true;
                    yvVar.a = colorStateListC;
                }
                PorterDuff.Mode modeD = len.d(view);
                if (modeD != null) {
                    yvVar.c = true;
                    yvVar.b = modeD;
                }
                if (yvVar.d || yvVar.c) {
                    xa.h(background, yvVar, view.getDrawableState());
                    return;
                }
            }
            yv yvVar2 = this.a;
            if (yvVar2 != null) {
                xa.h(background, yvVar2, view.getDrawableState());
                return;
            }
            yv yvVar3 = this.e;
            if (yvVar3 != null) {
                xa.h(background, yvVar3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        View view = this.b;
        Context context = view.getContext();
        int[] iArr = kt.C;
        yx yxVarL = yx.l(context, attributeSet, iArr, i, 0);
        ley.o(view, view.getContext(), iArr, attributeSet, yxVarL.b, i, 0);
        try {
            if (yxVarL.q(0)) {
                this.d = yxVarL.f(0, -1);
                ColorStateList colorStateListA = this.c.a(view.getContext(), this.d);
                if (colorStateListA != null) {
                    d(colorStateListA);
                }
            }
            if (yxVarL.q(1)) {
                len.h(view, yxVarL.g(1));
            }
            if (yxVarL.q(2)) {
                len.i(view, th.a(yxVarL.c(2, -1), null));
            }
        } finally {
            yxVarL.o();
        }
    }

    public final void c(int i) {
        this.d = i;
        qu quVar = this.c;
        d(quVar != null ? quVar.a(this.b.getContext(), i) : null);
        a();
    }

    final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.e == null) {
                this.e = new yv();
            }
            yv yvVar = this.e;
            yvVar.a = colorStateList;
            yvVar.d = true;
        } else {
            this.e = null;
        }
        a();
    }

    public final void e() {
        this.d = -1;
        d(null);
        a();
    }
}
