package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class uk extends wr {
    protected PointF c;
    private final DisplayMetrics f;
    private float o;
    protected final LinearInterpolator a = new LinearInterpolator();
    protected final DecelerateInterpolator b = new DecelerateInterpolator();
    private boolean n = false;
    protected int d = 0;
    protected int e = 0;

    public uk(Context context) {
        this.f = context.getResources().getDisplayMetrics();
    }

    public static final int g(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            return i4 - i2;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    private static final int p(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    protected float a(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int b(View view, int i) {
        wb wbVar = this.i;
        if (wbVar == null || !wbVar.ae()) {
            return 0;
        }
        wc wcVar = (wc) view.getLayoutParams();
        return g(wb.bp(view) - wcVar.leftMargin, wb.bs(view) + wcVar.rightMargin, wbVar.az(), wbVar.H - wbVar.aA(), i);
    }

    public int c(View view, int i) {
        wb wbVar = this.i;
        if (wbVar == null || !wbVar.af()) {
            return 0;
        }
        wc wcVar = (wc) view.getLayoutParams();
        return g(wb.bt(view) - wcVar.topMargin, wb.bo(view) + wcVar.bottomMargin, wbVar.aB(), wbVar.I - wbVar.ay(), i);
    }

    protected final int d(int i) {
        return (int) Math.ceil(e(i) / 0.3356d);
    }

    protected int e(int i) {
        float fAbs = Math.abs(i);
        if (!this.n) {
            this.o = a(this.f);
            this.n = true;
        }
        return (int) Math.ceil(fAbs * this.o);
    }

    @Override // defpackage.wr
    protected final void f() {
        this.e = 0;
        this.d = 0;
        this.c = null;
    }

    @Override // defpackage.wr
    protected final void h(int i, int i2, wp wpVar) {
        if (j() == 0) {
            n();
            return;
        }
        int iP = p(this.d, i);
        this.d = iP;
        int iP2 = p(this.e, i2);
        this.e = iP2;
        if (iP == 0 && iP2 == 0) {
            PointF pointFL = l(this.g);
            if (pointFL == null || (pointFL.x == 0.0f && pointFL.y == 0.0f)) {
                wpVar.a = this.g;
                n();
                return;
            }
            o(pointFL);
            this.c = pointFL;
            this.d = (int) (pointFL.x * 10000.0f);
            this.e = (int) (pointFL.y * 10000.0f);
            int iE = e(10000);
            wpVar.b((int) (this.d * 1.2f), (int) (this.e * 1.2f), (int) (iE * 1.2f), this.a);
        }
    }

    @Override // defpackage.wr
    protected void i(View view, wp wpVar) {
        PointF pointF = this.c;
        int i = 1;
        int iB = b(view, (pointF == null || pointF.x == 0.0f) ? 0 : this.c.x > 0.0f ? 1 : -1);
        PointF pointF2 = this.c;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i = 0;
        } else if (this.c.y <= 0.0f) {
            i = -1;
        }
        int iC = c(view, i);
        int iD = d((int) Math.sqrt((iB * iB) + (iC * iC)));
        if (iD > 0) {
            wpVar.b(-iB, -iC, iD, this.b);
        }
    }
}
