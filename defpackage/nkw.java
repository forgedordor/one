package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkw implements mdc {
    public static final Executor a = new Executor() { // from class: nkg
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };
    public final Context b;
    public final mdb c;
    public final SparseArray d;
    public final boolean e;
    public final nlx f;
    public final mej g;
    public final CopyOnWriteArraySet h;
    public mfx i = new mfx();
    public final mcv j;
    public final ekgb k;
    public mew l;
    public mdd m;
    public nkz n;
    public Pair o;
    public int p;
    public int q;
    public long r;
    public long s;
    public boolean t;
    public int u;
    public int v;
    private final nlv w;
    private mau x;
    private long y;
    private int z;

    public nkw(nkj nkjVar) {
        this.b = nkjVar.a;
        mdb mdbVar = nkjVar.c;
        mee.g(mdbVar);
        this.c = mdbVar;
        this.d = new SparseArray();
        int i = ekgb.d;
        this.k = ekoe.a;
        this.j = mcv.a;
        this.e = nkjVar.d;
        mej mejVar = nkjVar.e;
        this.g = mejVar;
        this.f = new njt(nkjVar.b, mejVar);
        this.w = new nki(this);
        this.h = new CopyOnWriteArraySet();
        this.x = new mau(new mat());
        this.y = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.u = -1;
        this.q = 0;
    }

    public static mag f(mag magVar) {
        return (magVar == null || !magVar.g()) ? mag.a : magVar;
    }

    private final void k() {
        mau mauVar = this.x;
        long j = this.y;
        int i = this.z;
        int i2 = ekgb.d;
        this.f.w(mauVar, j, i, ekoe.a);
    }

    @Override // defpackage.mdc
    public final void b(mcw mcwVar) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((nkr) it.next()).y(mcwVar);
        }
    }

    @Override // defpackage.mdc
    public final void c(long j, boolean z) {
        if (this.p > 0) {
            return;
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((nkr) it.next()).A();
        }
        if (z) {
            nkz nkzVar = this.n;
            if (nkzVar != null) {
                nkzVar.c(j, -9223372036854775807L, this.x, null);
                return;
            }
            return;
        }
        this.r = j;
        nkv nkvVar = (nkv) this.i.d(j);
        if (nkvVar != null) {
            this.y = nkvVar.a;
            this.z = nkvVar.b;
            k();
        }
        this.f.s(j, this.w);
        long j2 = this.s;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        j();
    }

    @Override // defpackage.mdc
    public final void d(float f) {
        mat matVar = new mat(this.x);
        matVar.x = f;
        this.x = new mau(matVar);
        k();
    }

    @Override // defpackage.mdc
    public final void e(int i, int i2) {
        mat matVar = new mat(this.x);
        matVar.t = i;
        matVar.u = i2;
        this.x = new mau(matVar);
        k();
    }

    public final void g() {
        this.f.b();
    }

    public final void h(boolean z) {
        if (this.q == 1) {
            this.p++;
            this.f.d(z);
            while (this.i.a() > 1) {
                this.i.c();
            }
            if (this.i.a() == 1) {
                nkv nkvVar = (nkv) this.i.c();
                mee.f(nkvVar);
                this.y = nkvVar.a;
                this.z = nkvVar.b;
                k();
            }
            this.r = -9223372036854775807L;
            this.s = -9223372036854775807L;
            this.t = false;
            mew mewVar = this.l;
            mee.g(mewVar);
            mewVar.b(new Runnable() { // from class: nkf
                @Override // java.lang.Runnable
                public final void run() {
                    nkw nkwVar = this.a;
                    nkwVar.p--;
                }
            });
        }
    }

    public final void i(Surface surface, int i, int i2) {
        mdd mddVar = this.m;
        if (mddVar == null) {
            return;
        }
        if (surface != null) {
            mddVar.j(new mch(surface, i, i2, 0, false));
            this.f.l(surface, new mft(i, i2));
        } else {
            mddVar.j(null);
            this.f.c();
        }
    }

    public final void j() {
        this.f.p();
        this.t = true;
    }

    @Override // defpackage.mdc
    public final void a(long j) {
    }
}
