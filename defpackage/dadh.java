package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dadh extends vo {
    protected final Context a;
    protected final dacu d;
    protected final fcsu e;
    public boolean f = true;
    public int g;
    private final dafl h;
    private final boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private AlertDialog m;

    public dadh(Context context, dacu dacuVar, dafl daflVar, fcsu fcsuVar, boolean z) {
        this.a = context;
        this.d = dacuVar;
        this.h = daflVar;
        this.e = fcsuVar;
        this.i = z;
    }

    private final AlertDialog M() {
        if (this.m == null) {
            this.m = this.h.b(this.a, new Runnable() { // from class: dade
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d.w(5);
                }
            }).create();
        }
        return this.m;
    }

    protected abstract wv F(ViewGroup viewGroup);

    protected abstract void G(wv wvVar, int i);

    protected final void H(int i) {
        boolean z = this.i;
        boolean z2 = z && this.h.f();
        boolean z3 = !z && this.f && this.h.e();
        this.j = z3;
        this.k = this.f && !z2 && !z3 && this.h.g();
        if (this.j || z2) {
            ((dabm) this.e.b()).a("Search.ConsentDialog.Impression", this.h.a());
        }
        if (z2 && i > 0 && !M().isShowing()) {
            M().show();
        }
        I();
    }

    public final void I() {
        this.l = this.g;
        int i = 1;
        if (!this.j && !this.k) {
            i = 0;
        }
        this.g = i;
    }

    protected final boolean J() {
        return this.g != this.l;
    }

    @Override // defpackage.vo
    public final int a() {
        return l() + this.g;
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        if (i == 0) {
            if (this.j) {
                return 1;
            }
        } else if (i != 0) {
            return 0;
        }
        return this.k ? 2 : 0;
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return F(viewGroup);
        }
        if (i == 1) {
            return this.h.d(viewGroup);
        }
        cqaz.k(i == 2);
        return this.h.c(viewGroup);
    }

    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        int i2 = i - this.g;
        int iDF = dF(i);
        if (iDF == 0) {
            G(wvVar, i2);
        } else if (iDF == 1) {
            ((dafj) wvVar).C(new dadf(this));
        } else {
            cqaz.k(true);
            ((dafj) wvVar).C(new dadg(this));
        }
    }

    @Override // defpackage.vo
    public void k(wv wvVar) {
        if (wvVar instanceof dafj) {
            ((dafj) wvVar).D();
        }
    }

    protected abstract int l();
}
