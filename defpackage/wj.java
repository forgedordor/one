package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wj {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    int f;
    public wi g;
    public final /* synthetic */ RecyclerView h;

    public wj(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final int a(int i) {
        if (i >= 0) {
            RecyclerView recyclerView = this.h;
            ws wsVar = recyclerView.N;
            if (i < wsVar.a()) {
                return !wsVar.g ? i : recyclerView.g.a(i);
            }
        }
        StringBuilder sb = new StringBuilder("invalid position ");
        sb.append(i);
        sb.append(". State item count is ");
        RecyclerView recyclerView2 = this.h;
        sb.append(recyclerView2.N.a());
        sb.append(recyclerView2.o());
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final wi b() {
        if (this.g == null) {
            this.g = new wi();
            f();
        }
        return this.g;
    }

    public final View c(int i) {
        return q(i, Long.MAX_VALUE).a;
    }

    final void d(wv wvVar, boolean z) {
        RecyclerView.A(wvVar);
        RecyclerView recyclerView = this.h;
        View view = wvVar.a;
        wx wxVar = recyclerView.R;
        if (wxVar != null) {
            lcl lclVarJ = wxVar.j();
            ley.p(view, lclVarJ instanceof ww ? (lcl) ((ww) lclVarJ).b.remove(view) : null);
        }
        if (z) {
            List list = recyclerView.p;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((wk) list.get(i)).a();
            }
            vo voVar = recyclerView.n;
            if (voVar != null) {
                voVar.k(wvVar);
            }
            if (recyclerView.N != null) {
                recyclerView.i.h(wvVar);
            }
        }
        wvVar.r = null;
        wvVar.q = null;
        b().e(wvVar);
    }

    public final void e() {
        this.a.clear();
        j();
    }

    public final void f() {
        RecyclerView recyclerView;
        vo voVar;
        wi wiVar = this.g;
        if (wiVar == null || (voVar = (recyclerView = this.h).n) == null || !recyclerView.r) {
            return;
        }
        wiVar.c.add(voVar);
    }

    public final void g(vo voVar) {
        h(voVar, false);
    }

    public final void h(vo voVar, boolean z) {
        wi wiVar = this.g;
        if (wiVar == null) {
            return;
        }
        Set set = wiVar.c;
        set.remove(voVar);
        if (set.size() != 0 || z) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = wiVar.a;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((wh) sparseArray.get(sparseArray.keyAt(i))).a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ljc.b(((wv) arrayList.get(i2)).a);
            }
            i++;
        }
    }

    final void i(View view) {
        wv wvVarK = RecyclerView.k(view);
        wvVarK.m = null;
        wvVarK.n = false;
        wvVarK.i();
        m(wvVarK);
    }

    public final void j() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                k(size);
            }
        }
        arrayList.clear();
        if (RecyclerView.b) {
            this.h.M.b();
        }
    }

    public final void k(int i) {
        int i2 = RecyclerView.aa;
        ArrayList arrayList = this.c;
        d((wv) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void l(View view) {
        wv wvVarK = RecyclerView.k(view);
        if (wvVarK.x()) {
            this.h.removeDetachedView(view, false);
        }
        if (wvVarK.w()) {
            wvVarK.p();
        } else if (wvVarK.B()) {
            wvVarK.i();
        }
        m(wvVarK);
        RecyclerView recyclerView = this.h;
        if (recyclerView.E == null || wvVarK.u()) {
            return;
        }
        recyclerView.E.b(wvVarK);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void m(defpackage.wv r10) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj.m(wv):void");
    }

    final void n(View view) {
        vv vvVar;
        wv wvVarK = RecyclerView.k(view);
        if (!wvVarK.q(12) && wvVarK.y() && (vvVar = this.h.E) != null && !vvVar.h(wvVarK, wvVarK.gm())) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            wvVarK.o(this, true);
            this.b.add(wvVarK);
            return;
        }
        if (wvVarK.t() && !wvVarK.v()) {
            RecyclerView recyclerView = this.h;
            if (!recyclerView.n.b) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.o()));
            }
        }
        wvVarK.o(this, false);
        this.a.add(wvVarK);
    }

    public final void o(wv wvVar) {
        if (wvVar.n) {
            this.b.remove(wvVar);
        } else {
            this.a.remove(wvVar);
        }
        wvVar.m = null;
        wvVar.n = false;
        wvVar.i();
    }

    public final void p() {
        wb wbVar = this.h.o;
        this.f = this.e + (wbVar != null ? wbVar.D : 0);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || arrayList.size() <= this.f) {
                return;
            } else {
                k(size);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0196  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [vo] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [wv] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.wv q(int r23, long r24) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj.q(int, long):wv");
    }
}
