package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sm {
    public View d;
    public final vm e;
    public int c = 0;
    public final sl a = new sl();
    public final List b = new ArrayList();

    public sm(vm vmVar) {
        this.e = vmVar;
    }

    private final int m(int i) {
        if (i < 0) {
            return -1;
        }
        int iA = this.e.a();
        int i2 = i;
        while (i2 < iA) {
            sl slVar = this.a;
            int iA2 = i - (i2 - slVar.a(i2));
            if (iA2 == 0) {
                while (slVar.f(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iA2;
        }
        return -1;
    }

    public final int a() {
        return this.e.a() - this.b.size();
    }

    public final int b() {
        return this.e.a();
    }

    final int c(View view) {
        int iB = this.e.b(view);
        if (iB != -1) {
            sl slVar = this.a;
            if (!slVar.f(iB)) {
                return iB - slVar.a(iB);
            }
        }
        return -1;
    }

    public final View d(int i) {
        return this.e.c(m(i));
    }

    public final View e(int i) {
        return this.e.c(i);
    }

    public final void f(View view, int i, boolean z) {
        int iA = i < 0 ? this.e.a() : m(0);
        this.a.c(iA, z);
        if (z) {
            i(view);
        }
        RecyclerView recyclerView = this.e.a;
        recyclerView.addView(view, iA);
        wv wvVarK = RecyclerView.k(view);
        vo voVar = recyclerView.n;
        if (voVar != null && wvVarK != null) {
            voVar.i(wvVarK);
        }
        List list = recyclerView.x;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((wd) recyclerView.x.get(size)).c(view);
            }
        }
    }

    public final void g(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iA = i < 0 ? this.e.a() : m(i);
        this.a.c(iA, z);
        if (z) {
            i(view);
        }
        vm vmVar = this.e;
        wv wvVarK = RecyclerView.k(view);
        if (wvVarK != null) {
            if (!wvVarK.x() && !wvVarK.A()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + wvVarK + vmVar.a.o());
            }
            wvVarK.j();
        }
        vmVar.a.attachViewToParent(view, iA, layoutParams);
    }

    final void h(int i) {
        sl slVar = this.a;
        int iM = m(i);
        slVar.g(iM);
        vm vmVar = this.e;
        View viewC = vmVar.c(iM);
        if (viewC != null) {
            wv wvVarK = RecyclerView.k(viewC);
            if (wvVarK != null) {
                if (wvVarK.x() && !wvVarK.A()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + wvVarK + vmVar.a.o());
                }
                wvVarK.f(256);
            }
        } else {
            int i2 = RecyclerView.aa;
        }
        vmVar.a.detachViewFromParent(iM);
    }

    public final void i(View view) {
        this.b.add(view);
        wv wvVarK = RecyclerView.k(view);
        if (wvVarK != null) {
            vm vmVar = this.e;
            int i = wvVarK.p;
            if (i != -1) {
                wvVarK.o = i;
            } else {
                wvVarK.o = wvVarK.a.getImportantForAccessibility();
            }
            vmVar.a.aJ(wvVarK, 4);
        }
    }

    final void j(int i) {
        int i2 = this.c;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iM = m(i);
            vm vmVar = this.e;
            View viewC = vmVar.c(iM);
            if (viewC != null) {
                this.c = 1;
                this.d = viewC;
                if (this.a.g(iM)) {
                    l(viewC);
                }
                vmVar.e(iM);
            }
        } finally {
            this.c = 0;
            this.d = null;
        }
    }

    public final boolean k(View view) {
        return this.b.contains(view);
    }

    public final void l(View view) {
        if (this.b.remove(view)) {
            this.e.d(view);
        }
    }

    public final String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}
