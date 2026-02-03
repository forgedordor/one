package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class yc extends we {
    RecyclerView a;
    public Scroller b;
    private final wg c = new ya(this);

    public abstract int a(wb wbVar, int i, int i2);

    public abstract View b(wb wbVar);

    public abstract int[] c(wb wbVar, View view);

    protected wr d(wb wbVar) {
        if (wbVar instanceof wq) {
            return new yb(this, this.a.getContext());
        }
        return null;
    }

    @Override // defpackage.we
    public final boolean e(int i, int i2) {
        wr wrVarD;
        int iA;
        RecyclerView recyclerView = this.a;
        wb wbVar = recyclerView.o;
        if (wbVar == null || recyclerView.n == null) {
            return false;
        }
        int i3 = recyclerView.H;
        if ((Math.abs(i2) <= i3 && Math.abs(i) <= i3) || !(wbVar instanceof wq) || (wrVarD = d(wbVar)) == null || (iA = a(wbVar, i, i2)) == -1) {
            return false;
        }
        wrVarD.g = iA;
        wbVar.bi(wrVarD);
        return true;
    }

    public final void f(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.ah(this.c);
            this.a.G = null;
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.G != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            recyclerView.y(this.c);
            RecyclerView recyclerView3 = this.a;
            recyclerView3.G = this;
            this.b = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
            g();
        }
    }

    final void g() {
        wb wbVar;
        View viewB;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (wbVar = recyclerView.o) == null || (viewB = b(wbVar)) == null) {
            return;
        }
        int[] iArrC = c(wbVar, viewB);
        int i = 0;
        int i2 = iArrC[0];
        if (i2 != 0) {
            i = i2;
        } else if (iArrC[1] == 0) {
            return;
        }
        this.a.ar(i, iArrC[1]);
    }
}
