package defpackage;

import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import defpackage.wv;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class vo<VH extends wv> {
    private final vp a = new vp();
    public boolean b = false;
    public int c = 1;

    public void A(vq vqVar) {
        this.a.registerObserver(vqVar);
    }

    public final void B(boolean z) {
        if (this.a.h()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = z;
    }

    public void C(vq vqVar) {
        this.a.unregisterObserver(vqVar);
    }

    public final boolean D() {
        int i = this.c;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 1 ? i2 != 2 : a() > 0;
        }
        throw null;
    }

    public final void E(int i) {
        this.c = i;
        this.a.g();
    }

    public abstract int a();

    public int dE(vo voVar, wv wvVar, int i) {
        if (voVar == this) {
            return i;
        }
        return -1;
    }

    public int dF(int i) {
        return 0;
    }

    public abstract wv e(ViewGroup viewGroup, int i);

    public abstract void g(wv wvVar, int i);

    public long gH(int i) {
        return -1L;
    }

    public final wv n(ViewGroup viewGroup, int i) {
        try {
            if (lak.a()) {
                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i)));
            }
            wv wvVarE = e(viewGroup, i);
            if (wvVarE.a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            wvVarE.f = i;
            return wvVarE;
        } finally {
            Trace.endSection();
        }
    }

    public final void o(wv wvVar, int i) {
        boolean z = wvVar.r == null;
        if (z) {
            wvVar.c = i;
            if (this.b) {
                wvVar.e = gH(i);
            }
            wvVar.m(1, 519);
            if (lak.a()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(wvVar.f)));
            }
        }
        wvVar.r = this;
        int i2 = RecyclerView.aa;
        z(wvVar, i, wvVar.gm());
        if (z) {
            wvVar.h();
            ViewGroup.LayoutParams layoutParams = wvVar.a.getLayoutParams();
            if (layoutParams instanceof wc) {
                ((wc) layoutParams).e = true;
            }
            Trace.endSection();
        }
    }

    public final void p() {
        this.a.a();
    }

    public final void q(int i) {
        this.a.c(i, 1);
    }

    public final void r(int i, Object obj) {
        this.a.d(i, 1, obj);
    }

    public final void s(int i) {
        this.a.e(i, 1);
    }

    public final void t(int i, int i2) {
        this.a.b(i, i2);
    }

    public final void u(int i, int i2) {
        this.a.c(i, i2);
    }

    public final void v(int i, int i2, Object obj) {
        this.a.d(i, i2, obj);
    }

    public final void w(int i, int i2) {
        this.a.e(i, i2);
    }

    public final void x(int i, int i2) {
        this.a.f(i, i2);
    }

    public final void y(int i) {
        this.a.f(i, 1);
    }

    public void z(wv wvVar, int i, List list) {
        g(wvVar, i);
    }

    public void gI(RecyclerView recyclerView) {
    }

    public void h(RecyclerView recyclerView) {
    }

    public void i(wv wvVar) {
    }

    public void j(wv wvVar) {
    }

    public void k(wv wvVar) {
    }

    public void m(wv wvVar) {
    }
}
