package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vn {
    final /* synthetic */ RecyclerView a;

    public vn(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final wv a(int i) {
        RecyclerView recyclerView = this.a;
        int iB = recyclerView.h.b();
        int i2 = 0;
        wv wvVar = null;
        while (true) {
            if (i2 >= iB) {
                break;
            }
            wv wvVarK = RecyclerView.k(recyclerView.h.e(i2));
            if (wvVarK != null && !wvVarK.v() && wvVarK.c == i) {
                if (!recyclerView.h.k(wvVarK.a)) {
                    wvVar = wvVarK;
                    break;
                }
                wvVar = wvVarK;
            }
            i2++;
        }
        if (wvVar == null || recyclerView.h.k(wvVar.a)) {
            return null;
        }
        return wvVar;
    }

    final void b(qk qkVar) {
        int i = qkVar.a;
        if (i == 1) {
            this.a.o.x(qkVar.b, qkVar.d);
            return;
        }
        if (i == 2) {
            this.a.o.A(qkVar.b, qkVar.d);
            return;
        }
        if (i != 4) {
            if (i != 8) {
                return;
            }
            this.a.o.z(qkVar.b, qkVar.d);
        } else {
            wb wbVar = this.a.o;
            int i2 = qkVar.b;
            int i3 = qkVar.d;
            Object obj = qkVar.c;
            wbVar.B(i2, i3);
        }
    }

    public final void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.a;
        int iB = recyclerView.h.b();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= iB) {
                break;
            }
            View viewE = recyclerView.h.e(i6);
            wv wvVarK = RecyclerView.k(viewE);
            if (wvVarK != null && !wvVarK.A() && (i5 = wvVarK.c) >= i && i5 < i3) {
                wvVarK.f(2);
                wvVarK.e(obj);
                ((wc) viewE.getLayoutParams()).e = true;
            }
            i6++;
        }
        wj wjVar = recyclerView.e;
        ArrayList arrayList = wjVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                recyclerView.P = true;
                return;
            }
            wv wvVar = (wv) arrayList.get(size);
            if (wvVar != null && (i4 = wvVar.c) >= i && i4 < i3) {
                wvVar.f(2);
                wjVar.k(size);
            }
        }
    }

    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int iB = recyclerView.h.b();
        for (int i3 = 0; i3 < iB; i3++) {
            wv wvVarK = RecyclerView.k(recyclerView.h.e(i3));
            if (wvVarK != null && !wvVarK.A() && wvVarK.c >= i) {
                wvVarK.k(i2, false);
                recyclerView.N.f = true;
            }
        }
        ArrayList arrayList = recyclerView.e.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            wv wvVar = (wv) arrayList.get(i4);
            if (wvVar != null && wvVar.c >= i) {
                wvVar.k(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.O = true;
    }

    public final void e(int i, int i2) {
        int i3;
        RecyclerView recyclerView = this.a;
        int iB = recyclerView.h.b();
        int i4 = 0;
        while (true) {
            if (i4 >= iB) {
                break;
            }
            wv wvVarK = RecyclerView.k(recyclerView.h.e(i4));
            if (wvVarK != null) {
                int i5 = i < i2 ? i : i2;
                int i6 = wvVarK.c;
                if (i6 >= i5) {
                    if (i6 <= (i < i2 ? i2 : i)) {
                        if (i6 == i) {
                            wvVarK.k(i2 - i, false);
                        } else {
                            wvVarK.k(i >= i2 ? 1 : -1, false);
                        }
                        recyclerView.N.f = true;
                    }
                }
            }
            i4++;
        }
        wj wjVar = recyclerView.e;
        int i7 = i < i2 ? i2 : i;
        int i8 = i < i2 ? i : i2;
        ArrayList arrayList = wjVar.c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            wv wvVar = (wv) arrayList.get(i9);
            if (wvVar != null && (i3 = wvVar.c) >= i8 && i3 <= i7) {
                if (i3 == i) {
                    wvVar.k(i2 - i, false);
                } else {
                    wvVar.k(i < i2 ? -1 : 1, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.O = true;
    }

    public final void f(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.U(i, i2, true);
        recyclerView.O = true;
        recyclerView.N.c += i2;
    }
}
