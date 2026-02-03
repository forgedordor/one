package defpackage;

import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class wr {
    public RecyclerView h;
    public wb i;
    public boolean j;
    public boolean k;
    public View l;
    public boolean m;
    public int g = -1;
    private final wp a = new wp();

    protected static final void o(PointF pointF) {
        float fSqrt = (float) Math.sqrt((pointF.x * pointF.x) + (pointF.y * pointF.y));
        pointF.x /= fSqrt;
        pointF.y /= fSqrt;
    }

    protected abstract void f();

    protected abstract void h(int i, int i2, wp wpVar);

    protected abstract void i(View view, wp wpVar);

    public final int j() {
        return this.h.o.as();
    }

    public final int k(View view) {
        return this.h.d(view);
    }

    public PointF l(int i) {
        Object obj = this.i;
        if (obj instanceof wq) {
            return ((wq) obj).P(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement ".concat(String.valueOf(wq.class.getCanonicalName())));
        return null;
    }

    final void m(int i, int i2) {
        PointF pointFL;
        RecyclerView recyclerView = this.h;
        if (this.g == -1 || recyclerView == null) {
            n();
        }
        if (this.j && this.l == null && this.i != null && (pointFL = l(this.g)) != null && (pointFL.x != 0.0f || pointFL.y != 0.0f)) {
            recyclerView.ai((int) Math.signum(pointFL.x), (int) Math.signum(pointFL.y), null);
        }
        this.j = false;
        View view = this.l;
        if (view != null) {
            if (k(view) == this.g) {
                View view2 = this.l;
                ws wsVar = recyclerView.N;
                wp wpVar = this.a;
                i(view2, wpVar);
                wpVar.a(recyclerView);
                n();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.l = null;
            }
        }
        if (this.k) {
            ws wsVar2 = recyclerView.N;
            wp wpVar2 = this.a;
            h(i, i2, wpVar2);
            int i3 = wpVar2.a;
            wpVar2.a(recyclerView);
            if (i3 < 0 || !this.k) {
                return;
            }
            this.j = true;
            recyclerView.K.b();
        }
    }

    public final void n() {
        if (this.k) {
            this.k = false;
            f();
            this.h.N.a = -1;
            this.l = null;
            this.g = -1;
            this.j = false;
            wb wbVar = this.i;
            if (wbVar.x == this) {
                wbVar.x = null;
            }
            this.i = null;
            this.h = null;
        }
    }
}
