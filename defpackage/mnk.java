package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mnk implements mdd {
    public final mag a;
    public final may b;
    public final mdc c;
    public final Executor d;
    public final Queue e;
    public final SparseArray f;
    public mda g;
    public mom h;
    public boolean i;
    public long j;
    public volatile boolean k;
    private final Context l;
    private final maj m;
    private final List n;
    private final SparseArray o;
    private final ExecutorService p;
    private final DefaultVideoFrameProcessor$Factory q;
    private final boolean r;
    private mft s;
    private boolean t;

    public mnk(Context context, mcy mcyVar, mag magVar, maj majVar, mdc mdcVar, Executor executor, List list, boolean z) {
        mee.a(true);
        this.l = context;
        this.a = magVar;
        this.m = majVar;
        this.c = mdcVar;
        this.d = executor;
        this.n = new ArrayList(list);
        this.r = z;
        this.j = -9223372036854775807L;
        this.o = new SparseArray();
        ScheduledExecutorService scheduledExecutorServiceS = mgb.S("Effect:MultipleInputVideoGraph:Thread");
        this.p = scheduledExecutorServiceS;
        mnj mnjVar = new mnj();
        this.b = mnjVar;
        DefaultVideoFrameProcessor$Factory.Builder builder = new DefaultVideoFrameProcessor$Factory.Builder((DefaultVideoFrameProcessor$Factory) mcyVar);
        builder.b = mnjVar;
        builder.a = scheduledExecutorServiceS;
        this.q = builder.build();
        this.e = new ArrayDeque();
        this.f = new SparseArray();
        this.s = mft.a;
    }

    private final mda q(int i) {
        SparseArray sparseArray = this.o;
        mee.c(mgb.U(sparseArray, i));
        return (mda) sparseArray.get(i);
    }

    @Override // defpackage.mdd
    public final int a(int i) {
        return q(i).a();
    }

    @Override // defpackage.mdd
    public final Surface b(int i) {
        return q(i).b();
    }

    @Override // defpackage.mdd
    public final void c() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.o;
            if (i >= sparseArray.size()) {
                return;
            }
            ((mda) sparseArray.get(sparseArray.keyAt(i))).c();
            i++;
        }
    }

    @Override // defpackage.mdd
    public final void d() throws mcw {
        boolean z = false;
        if (this.o.size() == 0 && this.h == null && this.g == null && !this.t) {
            z = true;
        }
        mee.c(z);
        DefaultVideoFrameProcessor$Factory defaultVideoFrameProcessor$Factory = this.q;
        Context context = this.l;
        mlb mlbVarA = defaultVideoFrameProcessor$Factory.a(context, this.m, this.a, this.r, eoqg.a, new mne(this));
        this.g = mlbVarA;
        mmw mmwVar = new mmw(this);
        SparseArray sparseArray = mlbVarA.e.g;
        mee.c(mgb.U(sparseArray, 3));
        ((mmo) sparseArray.get(3)).a.z(mmwVar);
        this.h = new mkk(context, this.b, this.p, new mnf(this), new mmx(this));
    }

    @Override // defpackage.mdd
    public final void e() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mdd
    public final void f(int i) {
        SparseArray sparseArray = this.o;
        mee.c(!mgb.U(sparseArray, i));
        mom momVar = this.h;
        mee.f(momVar);
        momVar.c(i);
        DefaultVideoFrameProcessor$Factory.Builder builder = new DefaultVideoFrameProcessor$Factory.Builder(this.q);
        builder.c = new mmy(this, i);
        mee.a(true);
        builder.d = 2;
        sparseArray.put(i, builder.build().a(this.l, maj.a, this.a, true, this.d, new mng(this, i)));
    }

    @Override // defpackage.mdd
    public final void g(int i, int i2, mau mauVar, List list, long j) {
        q(i).d(i2, mauVar, list, j);
    }

    @Override // defpackage.mdd
    public final void h() throws InterruptedException {
        if (this.t) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.o;
            if (i >= sparseArray.size()) {
                break;
            }
            ((mda) sparseArray.get(sparseArray.keyAt(i))).e();
            i++;
        }
        mom momVar = this.h;
        if (momVar != null) {
            momVar.d();
            this.h = null;
        }
        mda mdaVar = this.g;
        if (mdaVar != null) {
            mdaVar.e();
            this.g = null;
        }
        ExecutorService executorService = this.p;
        executorService.submit(new Runnable() { // from class: mmz
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.a.b.e(mev.h());
                } catch (Exception e) {
                    mff.d("MultiInputVG", "Error releasing GlObjectsProvider", e);
                }
            }
        });
        executorService.shutdown();
        try {
            executorService.awaitTermination(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            mff.c("MultiInputVG", "Thread interrupted while waiting for executor service termination");
        }
        this.t = true;
    }

    @Override // defpackage.mdd
    public final void i(long j) {
        mda mdaVar = this.g;
        mee.f(mdaVar);
        mdaVar.f(j);
    }

    @Override // defpackage.mdd
    public final void j(mch mchVar) {
        mda mdaVar = this.g;
        mee.f(mdaVar);
        mdaVar.g(mchVar);
    }

    @Override // defpackage.mdd
    public final void k(int i) {
        q(i).h();
    }

    @Override // defpackage.mdd
    public final boolean l() {
        return this.k;
    }

    @Override // defpackage.mdd
    public final boolean m(int i) {
        return q(i).i();
    }

    @Override // defpackage.mdd
    public final boolean n(int i, Bitmap bitmap, men menVar) {
        return q(i).j(bitmap, menVar);
    }

    public final void o(final Exception exc) {
        this.d.execute(new Runnable() { // from class: mmv
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c.b((mcw) exc);
            }
        });
    }

    public final void p() {
        Queue queue = this.e;
        mol molVar = (mol) queue.peek();
        if (molVar == null) {
            return;
        }
        mda mdaVar = this.g;
        mee.g(mdaVar);
        maz mazVar = molVar.a;
        int i = mazVar.d;
        int i2 = mazVar.e;
        mft mftVar = this.s;
        if (i != mftVar.c || i2 != mftVar.d) {
            mat matVar = new mat();
            matVar.C = this.a;
            matVar.t = i;
            matVar.u = i2;
            mdaVar.d(3, new mau(matVar), this.n, 0L);
            this.s = new mft(i, i2);
        }
        int i3 = mazVar.b;
        long j = molVar.b;
        mlb mlbVar = (mlb) mdaVar;
        mee.c(!mlbVar.l);
        if (!mlbVar.j.d() || mlbVar.m) {
            return;
        }
        mlbVar.e.a().y(i3, j);
        queue.remove();
        if (this.i && queue.isEmpty()) {
            mdaVar.h();
        }
    }
}
