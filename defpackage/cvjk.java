package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvjk extends vo {
    private final eidm d;
    private final List e = new ArrayList();
    public final SparseArray a = new SparseArray();

    public cvjk(eidm eidmVar) {
        this.d = eidmVar;
    }

    private final cvjj F(int i) {
        Iterator it = this.e.iterator();
        if (!it.hasNext()) {
            throw new IllegalArgumentException(a.g(i, "position not in adapter "));
        }
        vo voVar = ((cvjj) it.next()).a;
        throw null;
    }

    @Override // defpackage.vo
    public final int a() {
        Iterator it = this.e.iterator();
        if (!it.hasNext()) {
            return 0;
        }
        vo voVar = ((cvjj) it.next()).a;
        throw null;
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        cvjj cvjjVarF = F(i);
        l(cvjjVarF);
        vo voVar = cvjjVarF.a;
        throw null;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        cvjj cvjjVar = (cvjj) this.a.get(i);
        int i2 = cvji.t;
        vo voVar = cvjjVar.a;
        throw null;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        cvji cvjiVar = (cvji) wvVar;
        eifp eifpVarA = this.d.a("CompositeRecyclerViewAdapter onBindViewHolder");
        try {
            l(F(i));
            cvjj cvjjVar = cvjiVar.s;
            throw null;
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        cvjj cvjjVarF = F(i);
        l(cvjjVarF);
        vo voVar = cvjjVarF.a;
        throw null;
    }

    @Override // defpackage.vo
    public final void gI(RecyclerView recyclerView) {
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            vo voVar = ((cvjj) it.next()).a;
            throw null;
        }
    }

    @Override // defpackage.vo
    public final void h(RecyclerView recyclerView) {
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            vo voVar = ((cvjj) it.next()).a;
            throw null;
        }
    }

    @Override // defpackage.vo
    public final /* synthetic */ void i(wv wvVar) {
        throw null;
    }

    @Override // defpackage.vo
    public final /* synthetic */ void j(wv wvVar) {
        throw null;
    }

    @Override // defpackage.vo
    public final /* synthetic */ void k(wv wvVar) {
        cvjj cvjjVar = ((cvji) wvVar).s;
        throw null;
    }

    public final void l(cvjj cvjjVar) {
        vo voVar = cvjjVar.a;
        Iterator it = this.e.iterator();
        if (!it.hasNext()) {
            throw new IllegalStateException("Partition not in adapter ".concat(toString()));
        }
        vo voVar2 = ((cvjj) it.next()).a;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void m(wv wvVar) {
        cvjj cvjjVar = ((cvji) wvVar).s;
        throw null;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void z(wv wvVar, int i, List list) {
        cvji cvjiVar = (cvji) wvVar;
        eifp eifpVarA = this.d.a("CompositeRecyclerViewAdapter onBindViewHolder");
        try {
            l(F(i));
            cvjj cvjjVar = cvjiVar.s;
            throw null;
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
