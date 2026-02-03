package defpackage;

import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yn {
    public final ArrayList a = new ArrayList();
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = 0;
    public final int e;
    public final /* synthetic */ StaggeredGridLayoutManager f;

    public yn(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.e = i;
    }

    public static final yh r(View view) {
        return (yh) view.getLayoutParams();
    }

    public final int a() {
        return this.f.e ? q(this.a.size() - 1, -1) : q(0, this.a.size());
    }

    public final int b() {
        return this.f.e ? q(0, this.a.size()) : q(this.a.size() - 1, -1);
    }

    public final int c() {
        int i = this.c;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        i();
        return this.c;
    }

    public final int d(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        i();
        return this.c;
    }

    public final int e() {
        int i = this.b;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        j();
        return this.b;
    }

    public final int f(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        j();
        return this.b;
    }

    public final View g(int i, int i2) {
        View view = null;
        if (i2 != -1) {
            ArrayList arrayList = this.a;
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
                if ((staggeredGridLayoutManager.e && StaggeredGridLayoutManager.bu(view2) >= i) || ((!staggeredGridLayoutManager.e && StaggeredGridLayoutManager.bu(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        ArrayList arrayList2 = this.a;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList2.get(i3);
            StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.f;
            if ((staggeredGridLayoutManager2.e && StaggeredGridLayoutManager.bu(view3) <= i) || ((!staggeredGridLayoutManager2.e && StaggeredGridLayoutManager.bu(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public final void h(View view) {
        yh yhVarR = r(view);
        yhVarR.a = this;
        ArrayList arrayList = this.a;
        arrayList.add(view);
        this.c = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.b = Integer.MIN_VALUE;
        }
        if (yhVarR.c() || yhVarR.b()) {
            this.d += this.f.b.b(view);
        }
    }

    final void i() {
        yj yjVarA;
        View view = (View) this.a.get(r0.size() - 1);
        yh yhVarR = r(view);
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        this.c = staggeredGridLayoutManager.b.a(view);
        if (yhVarR.b && (yjVarA = staggeredGridLayoutManager.i.a(yhVarR.a())) != null && yjVarA.b == 1) {
            this.c += yjVarA.a(this.e);
        }
    }

    final void j() {
        yj yjVarA;
        View view = (View) this.a.get(0);
        yh yhVarR = r(view);
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        this.b = staggeredGridLayoutManager.b.d(view);
        if (yhVarR.b && (yjVarA = staggeredGridLayoutManager.i.a(yhVarR.a())) != null && yjVarA.b == -1) {
            this.b -= yjVarA.a(this.e);
        }
    }

    public final void k() {
        this.a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final void l(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            this.b = i2 + i;
        }
        int i3 = this.c;
        if (i3 != Integer.MIN_VALUE) {
            this.c = i3 + i;
        }
    }

    public final void m() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        yh yhVarR = r(view);
        yhVarR.a = null;
        if (yhVarR.c() || yhVarR.b()) {
            this.d -= this.f.b.b(view);
        }
        if (size == 1) {
            this.b = Integer.MIN_VALUE;
        }
        this.c = Integer.MIN_VALUE;
    }

    public final void n() {
        ArrayList arrayList = this.a;
        View view = (View) arrayList.remove(0);
        yh yhVarR = r(view);
        yhVarR.a = null;
        if (arrayList.size() == 0) {
            this.c = Integer.MIN_VALUE;
        }
        if (yhVarR.c() || yhVarR.b()) {
            this.d -= this.f.b.b(view);
        }
        this.b = Integer.MIN_VALUE;
    }

    public final void o(View view) {
        yh yhVarR = r(view);
        yhVarR.a = this;
        ArrayList arrayList = this.a;
        arrayList.add(0, view);
        this.b = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.c = Integer.MIN_VALUE;
        }
        if (yhVarR.c() || yhVarR.b()) {
            this.d += this.f.b.b(view);
        }
    }

    public final void p(int i) {
        this.b = i;
        this.c = i;
    }

    final int q(int i, int i2) {
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        int iJ = staggeredGridLayoutManager.b.j();
        int iF = staggeredGridLayoutManager.b.f();
        int i3 = i;
        while (true) {
            int i4 = -1;
            if (i3 == i2) {
                return -1;
            }
            view = (View) this.a.get(i3);
            int iD = staggeredGridLayoutManager.b.d(view);
            int iA = staggeredGridLayoutManager.b.a(view);
            boolean z = iD <= iF;
            boolean z2 = iA >= iJ;
            if (z && z2 && (iD < iJ || iA > iF)) {
                break;
            }
            if (i2 > i) {
                i4 = 1;
            }
            i3 += i4;
        }
        return StaggeredGridLayoutManager.bu(view);
    }
}
