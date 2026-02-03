package androidx.media3.effect;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory;
import defpackage.ekfw;
import defpackage.eoqg;
import defpackage.mag;
import defpackage.maj;
import defpackage.mau;
import defpackage.mch;
import defpackage.mcv;
import defpackage.mcy;
import defpackage.mda;
import defpackage.mdb;
import defpackage.mdc;
import defpackage.mdd;
import defpackage.mee;
import defpackage.men;
import defpackage.mlb;
import defpackage.mno;
import defpackage.moc;
import defpackage.mot;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SingleInputVideoGraph implements mdd {
    public final mdc a;
    public final Executor b;
    public volatile boolean c;
    private final Context d;
    private final mcy e;
    private final mag f;
    private final maj g;
    private final List h;
    private final boolean i;
    private mda j;
    private mch k;
    private boolean l;
    private int m;

    /* compiled from: PG */
    public static final class Factory implements mdb {
        private final mcy a;

        public Factory(mcy mcyVar) {
            this.a = mcyVar;
        }

        @Override // defpackage.mdb
        public final /* bridge */ /* synthetic */ mdd a(Context context, mag magVar, maj majVar, mdc mdcVar, Executor executor, mcv mcvVar, List list, boolean z) {
            return new SingleInputVideoGraph(context, this.a, magVar, mdcVar, list, majVar, executor, mcvVar, z);
        }

        public Factory() {
            this(new DefaultVideoFrameProcessor$Factory.Builder().build());
        }
    }

    public SingleInputVideoGraph(Context context, mcy mcyVar, mag magVar, mdc mdcVar, List list, maj majVar, Executor executor, mcv mcvVar, boolean z) {
        mee.d(mcv.a.equals(mcvVar), "SingleInputVideoGraph does not use VideoCompositor, and therefore cannot apply VideoCompositorSettings");
        this.d = context;
        this.e = mcyVar;
        this.f = magVar;
        this.a = mdcVar;
        this.g = majVar;
        this.b = executor;
        this.h = list;
        this.i = z;
        this.m = -1;
    }

    @Override // defpackage.mdd
    public final int a(int i) {
        mee.g(this.j);
        return this.j.a();
    }

    @Override // defpackage.mdd
    public final Surface b(int i) {
        mee.g(this.j);
        return this.j.b();
    }

    @Override // defpackage.mdd
    public final void c() {
        mee.g(this.j);
        this.j.c();
    }

    @Override // defpackage.mdd
    public final void e() {
        mda mdaVar = this.j;
        mee.g(mdaVar);
        final mlb mlbVar = (mlb) mdaVar;
        mno mnoVar = mlbVar.k;
        if (mnoVar == null) {
            throw new UnsupportedOperationException("Replaying when enableReplayableCache is set to false");
        }
        if (mnoVar.m()) {
            return;
        }
        mlbVar.f.d(new mot() { // from class: mku
            @Override // defpackage.mot
            public final void a() {
                String str = mgb.a;
                mlb mlbVar2 = mlbVar;
                mno mnoVar2 = mlbVar2.k;
                long j = mnoVar2.m() ? -9223372036854775807L : mnoVar2.d[0].b;
                mlx mlxVar = mlbVar2.h;
                mlxVar.t = j;
                int i = 0;
                while (true) {
                    Queue queue = mlxVar.i;
                    if (i >= queue.size()) {
                        break;
                    }
                    mlxVar.p.b(((mol) queue.remove()).a);
                    i++;
                }
                if (mnoVar2.m()) {
                    return;
                }
                mol[] molVarArr = mnoVar2.d;
                mol molVar = molVarArr[0];
                mnoVar2.b.x(molVar.a, molVar.b);
                if (mnoVar2.e > 1) {
                    mol molVar2 = molVarArr[1];
                    mnoVar2.b.x(molVar2.a, molVar2.b);
                }
            }
        });
    }

    @Override // defpackage.mdd
    public final void f(int i) {
        mee.d(this.m == -1, "This VideoGraph supports only one input.");
        this.m = i;
        eoqg eoqgVar = eoqg.a;
        moc mocVar = new moc(this);
        boolean z = this.i;
        mag magVar = this.f;
        mda mdaVarA = this.e.a(this.d, this.g, magVar, z, eoqgVar, mocVar);
        this.j = mdaVarA;
        mch mchVar = this.k;
        if (mchVar != null) {
            mdaVarA.g(mchVar);
        }
    }

    @Override // defpackage.mdd
    public final void g(int i, int i2, mau mauVar, List list, long j) {
        mee.g(this.j);
        mda mdaVar = this.j;
        ekfw ekfwVar = new ekfw();
        ekfwVar.j(list);
        ekfwVar.j(this.h);
        mdaVar.d(i2, mauVar, ekfwVar.g(), j);
    }

    @Override // defpackage.mdd
    public final void h() {
        if (this.l) {
            return;
        }
        mda mdaVar = this.j;
        if (mdaVar != null) {
            mdaVar.e();
        }
        this.l = true;
    }

    @Override // defpackage.mdd
    public final void i(long j) {
        mee.g(this.j);
        this.j.f(j);
    }

    @Override // defpackage.mdd
    public final void j(mch mchVar) {
        this.k = mchVar;
        mda mdaVar = this.j;
        if (mdaVar != null) {
            mdaVar.g(mchVar);
        }
    }

    @Override // defpackage.mdd
    public final void k(int i) {
        mee.g(this.j);
        this.j.h();
    }

    @Override // defpackage.mdd
    public final boolean l() {
        return this.c;
    }

    @Override // defpackage.mdd
    public final boolean m(int i) {
        mee.g(this.j);
        return this.j.i();
    }

    @Override // defpackage.mdd
    public final boolean n(int i, Bitmap bitmap, men menVar) {
        mee.g(this.j);
        return this.j.j(bitmap, menVar);
    }

    @Override // defpackage.mdd
    public final void d() {
    }
}
