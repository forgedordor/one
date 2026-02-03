package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.metrics.MediaMetricsManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrn extends mae implements ExoPlayer {
    public static final /* synthetic */ int F = 0;
    public mde A;
    public mbr B;
    public mta C;
    public int D;
    public long E;
    private final mem G = new mem();
    private final mth[] H;
    private final mth[] I;
    private final nim J;
    private final CopyOnWriteArraySet K;
    private final mcj L;
    private final boolean M;
    private final nem N;
    private final nit O;
    private final long P;
    private final long Q;
    private final long R;
    private final mrl S;
    private final mts T;
    private final mtt U;
    private final long V;
    private int W;
    private boolean X;
    private boolean Y;
    private ekhx Z;
    private mtp aa;
    private mtq ab;
    private mqa ac;
    private Surface ad;
    private SurfaceHolder ae;
    private nmo af;
    private int ag;
    private mft ah;
    private boolean ai;
    private boolean aj;
    private int ak;
    private final mqm al;
    private ngf am;
    final nin b;
    final mcc c;
    public final Context d;
    public final mcg e;
    public final mew f;
    public final mry g;
    public final mfc h;
    public final List i;
    public final mtu j;
    public final Looper k;
    public final mej l;
    public final mrk m;
    public final meh n;
    public int o;
    public int p;
    public boolean q;
    public mcc r;
    public mbr s;
    public Object t;
    public boolean u;
    public TextureView v;
    public mac w;
    public boolean x;
    public mdw y;
    public boolean z;

    static {
        mbp.b("media3.exoplayer");
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, mtu] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, nit] */
    public mrn(mpz mpzVar) {
        try {
            mff.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.1] [" + mgb.a + "]");
            this.d = mpzVar.a.getApplicationContext();
            this.j = mpzVar.h.apply(mpzVar.b);
            this.ak = mpzVar.j;
            this.w = mpzVar.k;
            this.ag = mpzVar.l;
            this.x = false;
            this.V = mpzVar.t;
            mrk mrkVar = new mrk(this);
            this.m = mrkVar;
            this.S = new mrl();
            Handler handler = new Handler(mpzVar.i);
            mtn mtnVar = (mtn) mpzVar.c.get();
            mth[] mthVarArrB = mtnVar.b(handler, mrkVar, mrkVar, mrkVar, mrkVar);
            this.H = mthVarArrB;
            mee.c(mthVarArrB.length > 0);
            this.I = new mth[mthVarArrB.length];
            int i = 0;
            while (true) {
                mth[] mthVarArr = this.I;
                if (i >= mthVarArr.length) {
                    break;
                }
                mtnVar.a(this.H[i]);
                mthVarArr[i] = null;
                i++;
            }
            this.J = (nim) mpzVar.e.get();
            this.N = (nem) mpzVar.d.get();
            this.O = mpzVar.g.get();
            this.M = mpzVar.m;
            this.ab = mpzVar.n;
            this.P = mpzVar.p;
            this.Q = mpzVar.q;
            this.R = mpzVar.r;
            this.aa = mpzVar.o;
            Looper looper = mpzVar.i;
            this.k = looper;
            mej mejVar = mpzVar.b;
            this.l = mejVar;
            this.e = this;
            this.h = new mfc(looper, mejVar, new mfa() { // from class: mql
                @Override // defpackage.mfa
                public final void a(Object obj, mar marVar) {
                    ((mce) obj).D(new mcd(marVar));
                }
            });
            this.K = new CopyOnWriteArraySet();
            this.i = new ArrayList();
            this.am = new ngf();
            this.ac = mqa.a;
            int length = this.H.length;
            this.b = new nin(new mtl[length], new nif[length], mcs.a, null);
            this.L = new mcj();
            maq maqVar = new maq();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i2 = 0; i2 < 20; i2++) {
                maqVar.b(iArr[i2]);
            }
            this.J.l();
            mcb.c(29, true, maqVar);
            mcb.c(23, false, maqVar);
            mcb.c(25, false, maqVar);
            mcb.c(33, false, maqVar);
            mcb.c(26, false, maqVar);
            mcb.c(34, false, maqVar);
            mcc mccVarA = mcb.a(maqVar);
            this.c = mccVarA;
            maq maqVar2 = new maq();
            mcb.b(mccVarA, maqVar2);
            maqVar2.b(4);
            maqVar2.b(10);
            this.r = mcb.a(maqVar2);
            this.f = this.l.b(this.k, null);
            mqm mqmVar = new mqm(this);
            this.al = mqmVar;
            this.C = mta.i(this.b);
            mtu mtuVar = this.j;
            final mcg mcgVar = this.e;
            Looper looper2 = this.k;
            mee.c(((mwk) mtuVar).e == null || ((mwk) mtuVar).b.b.isEmpty());
            mee.f(mcgVar);
            ((mwk) mtuVar).e = mcgVar;
            ((mwk) mtuVar).f = ((mwk) mtuVar).a.b(looper2, null);
            final mwk mwkVar = (mwk) mtuVar;
            ((mwk) mtuVar).d = ((mwk) mtuVar).d.a(looper2, new mfa() { // from class: mum
                @Override // defpackage.mfa
                public final void a(Object obj, mar marVar) {
                    ((mtx) obj).b(mcgVar, new mtw(marVar, mwkVar.c));
                }
            });
            final mwx mwxVar = new mwx(mpzVar.w);
            mry mryVar = new mry(this.d, this.H, this.I, this.J, this.b, (mpi) mpzVar.f.get(), this.O, this.W, this.X, this.j, this.ab, mpzVar.x, mpzVar.s, this.k, this.l, mqmVar, mwxVar, this.ac, this.S);
            this.g = mryVar;
            Looper looper3 = mryVar.f;
            this.W = 0;
            mbr mbrVar = mbr.a;
            this.s = mbrVar;
            this.B = mbrVar;
            this.D = -1;
            this.y = mdw.a;
            this.ai = true;
            M(this.j);
            nit nitVar = this.O;
            Handler handler2 = new Handler(this.k);
            mtu mtuVar2 = this.j;
            mee.f(mtuVar2);
            mee.f(mtuVar2);
            nir nirVar = ((niw) nitVar).g;
            nirVar.a(mtuVar2);
            nirVar.a.add(new niq(handler2, mtuVar2));
            this.K.add(this.m);
            if (Build.VERSION.SDK_INT >= 31) {
                final Context context = this.d;
                final boolean z = mpzVar.u;
                this.l.b(mryVar.f, null).b(new Runnable() { // from class: mrc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        MediaMetricsManager mediaMetricsManagerM570m = kvh$$ExternalSyntheticApiModelOutline1.m570m(context2.getSystemService("media_metrics"));
                        mwt mwtVar = mediaMetricsManagerM570m == null ? null : new mwt(context2, mediaMetricsManagerM570m.createPlaybackSession());
                        if (mwtVar == null) {
                            mff.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z) {
                            this.Z(mwtVar);
                        }
                        mwxVar.b(mwtVar.a.getSessionId());
                    }
                });
            }
            meh mehVar = new meh(0, looper3, this.k, this.l, new mqn(this));
            this.n = mehVar;
            mehVar.a.b(new Runnable() { // from class: mqo
                @Override // java.lang.Runnable
                public final void run() {
                    String str = mgb.a;
                    mrn mrnVar = this.a;
                    final Integer numValueOf = Integer.valueOf(mdh.a(mrnVar.d).generateAudioSessionId());
                    final meh mehVar2 = mrnVar.n;
                    mehVar2.d = numValueOf;
                    mehVar2.b.b(new Runnable() { // from class: meg
                        @Override // java.lang.Runnable
                        public final void run() {
                            meh mehVar3 = mehVar2;
                            Object obj = mehVar3.c;
                            Object obj2 = numValueOf;
                            mehVar3.c = obj2;
                            if (obj.equals(obj2)) {
                                return;
                            }
                            mqn mqnVar = mehVar3.e;
                            ((Integer) obj).intValue();
                            Integer num = (Integer) obj2;
                            final int iIntValue = num.intValue();
                            mrn mrnVar2 = mqnVar.a;
                            mrnVar2.ap();
                            mrnVar2.ai(1, 10, num);
                            mrnVar2.ai(2, 10, num);
                            mrnVar2.h.f(21, new mez() { // from class: mqp
                                @Override // defpackage.mez
                                public final void a(Object obj3) {
                                    int i3 = mrn.F;
                                    ((mce) obj3).b(iIntValue);
                                }
                            });
                        }
                    });
                }
            });
            Context context2 = mpzVar.a;
            Looper looper4 = mpzVar.i;
            mej mejVar2 = this.l;
            context2.getApplicationContext();
            mejVar2.b(looper3, null);
            new mox(mejVar2.b(looper4, null));
            this.T = new mts(mpzVar.a, looper3, this.l);
            this.U = new mtt(mpzVar.a, looper3, this.l);
            int i3 = mak.a;
            this.A = mde.a;
            this.ah = mft.a;
            mryVar.e.d(38, this.aa).b();
            mryVar.e(this.w, false);
            ai(1, 3, this.w);
            ai(2, 4, Integer.valueOf(this.ag));
            ai(2, 5, 0);
            ai(1, 9, Boolean.valueOf(this.x));
            ai(6, 8, this.S);
            ai(-1, 16, Integer.valueOf(this.ak));
        } finally {
            this.G.e();
        }
    }

    private final void aA(SurfaceHolder surfaceHolder) {
        this.u = false;
        this.ae = surfaceHolder;
        surfaceHolder.addCallback(this.m);
        Surface surface = this.ae.getSurface();
        if (surface == null || !surface.isValid()) {
            ag(0, 0);
        } else {
            Rect surfaceFrame = this.ae.getSurfaceFrame();
            ag(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    private final void aB() {
        mcc mccVar = this.r;
        String str = mgb.a;
        mcg mcgVar = this.e;
        boolean zY = mcgVar.Y();
        boolean zP = mcgVar.p();
        boolean zL = mcgVar.l();
        boolean zK = mcgVar.k();
        boolean zO = mcgVar.o();
        boolean zN = mcgVar.n();
        boolean zQ = mcgVar.H().q();
        maq maqVar = new maq();
        mcb.b(this.c, maqVar);
        boolean z = !zY;
        mcb.c(4, z, maqVar);
        boolean z2 = false;
        mcb.c(5, zP && !zY, maqVar);
        mcb.c(6, zL && !zY, maqVar);
        mcb.c(7, !zQ && (zL || !zO || zP) && !zY, maqVar);
        mcb.c(8, zK && !zY, maqVar);
        mcb.c(9, !zQ && (zK || (zO && zN)) && !zY, maqVar);
        mcb.c(10, z, maqVar);
        mcb.c(11, zP && !zY, maqVar);
        if (zP && !zY) {
            z2 = true;
        }
        mcb.c(12, z2, maqVar);
        mcc mccVarA = mcb.a(maqVar);
        this.r = mccVarA;
        if (mccVarA.equals(mccVar)) {
            return;
        }
        this.h.d(13, new mez() { // from class: mqu
            @Override // defpackage.mez
            public final void a(Object obj) {
                ((mce) obj).c(this.a.r);
            }
        });
    }

    private final int ar(mta mtaVar) {
        mcl mclVar = mtaVar.b;
        return mclVar.q() ? this.D : mclVar.o(mtaVar.c.a, this.L).c;
    }

    private final long as(mta mtaVar) {
        nen nenVar = mtaVar.c;
        if (!nenVar.b()) {
            return mgb.B(at(mtaVar));
        }
        mcl mclVar = mtaVar.b;
        Object obj = nenVar.a;
        mcj mcjVar = this.L;
        mclVar.o(obj, mcjVar);
        long j = mtaVar.d;
        return j == -9223372036854775807L ? mclVar.p(ar(mtaVar), this.a).a() : mcjVar.f() + mgb.B(j);
    }

    private final long at(mta mtaVar) {
        mcl mclVar = mtaVar.b;
        if (mclVar.q()) {
            return mgb.w(this.E);
        }
        boolean z = mtaVar.q;
        long j = mtaVar.t;
        nen nenVar = mtaVar.c;
        return nenVar.b() ? j : ab(mclVar, nenVar, j);
    }

    private static long au(mta mtaVar) {
        mck mckVar = new mck();
        mcj mcjVar = new mcj();
        mcl mclVar = mtaVar.b;
        mclVar.o(mtaVar.c.a, mcjVar);
        long j = mtaVar.d;
        return j == -9223372036854775807L ? mclVar.p(mcjVar.c, mckVar).l : mcjVar.e + j;
    }

    private final Pair av(mcl mclVar, int i, long j) {
        if (mclVar.q()) {
            this.D = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.E = j;
            return null;
        }
        if (i == -1 || i >= mclVar.c()) {
            i = mclVar.g(this.X);
            j = mclVar.p(i, this.a).a();
        }
        return mclVar.l(this.a, this.L, i, mgb.w(j));
    }

    private static mcq aw(mcq mcqVar, ekhx ekhxVar) {
        mcp mcpVarA = mcqVar.a();
        ekqg ekqgVarListIterator = ekhxVar.listIterator();
        while (ekqgVarListIterator.hasNext()) {
            mcpVarA.e(((Integer) ekqgVarListIterator.next()).intValue(), true);
        }
        return mcpVarA.a();
    }

    private static mta ax(mta mtaVar, int i) {
        mta mtaVarG = mtaVar.g(i);
        return (i == 1 || i == 4) ? mtaVarG.a(false) : mtaVarG;
    }

    private final mta ay(mta mtaVar, mcl mclVar, Pair pair) {
        List list;
        mee.a(mclVar.q() || pair != null);
        mcl mclVar2 = mtaVar.b;
        long jAs = as(mtaVar);
        mta mtaVarH = mtaVar.h(mclVar);
        if (mclVar.q()) {
            nen nenVar = mta.a;
            long jW = mgb.w(this.E);
            nin ninVar = this.b;
            ngo ngoVar = ngo.a;
            int i = ekgb.d;
            mta mtaVarB = mtaVarH.c(nenVar, jW, jW, jW, 0L, ngoVar, ninVar, ekoe.a).b(nenVar);
            mtaVarB.r = mtaVarB.t;
            return mtaVarB;
        }
        nen nenVar2 = mtaVarH.c;
        Object obj = nenVar2.a;
        String str = mgb.a;
        boolean zEquals = obj.equals(pair.first);
        nen nenVar3 = !zEquals ? new nen(pair.first) : nenVar2;
        long jLongValue = ((Long) pair.second).longValue();
        long jW2 = mgb.w(jAs);
        if (!mclVar2.q()) {
            jW2 -= mclVar2.o(obj, this.L).e;
        }
        if (!zEquals || jLongValue < jW2) {
            nen nenVar4 = nenVar3;
            mee.c(!nenVar4.b());
            ngo ngoVar2 = !zEquals ? ngo.a : mtaVarH.i;
            nin ninVar2 = !zEquals ? this.b : mtaVarH.j;
            if (zEquals) {
                list = mtaVarH.k;
            } else {
                int i2 = ekgb.d;
                list = ekoe.a;
            }
            mta mtaVarB2 = mtaVarH.c(nenVar4, jLongValue, jLongValue, jLongValue, 0L, ngoVar2, ninVar2, list).b(nenVar4);
            mtaVarB2.r = jLongValue;
            return mtaVarB2;
        }
        if (jLongValue != jW2) {
            nen nenVar5 = nenVar3;
            mee.c(!nenVar5.b());
            long jMax = Math.max(0L, mtaVarH.s - (jLongValue - jW2));
            long j = mtaVarH.r;
            if (mtaVarH.l.equals(nenVar2)) {
                j = jLongValue + jMax;
            }
            mta mtaVarC = mtaVarH.c(nenVar5, jLongValue, jLongValue, jLongValue, jMax, mtaVarH.i, mtaVarH.j, mtaVarH.k);
            mtaVarC.r = j;
            return mtaVarC;
        }
        int iA = mclVar.a(mtaVarH.l.a);
        if (iA != -1) {
            mcj mcjVar = this.L;
            if (mclVar.n(iA, mcjVar).c == mclVar.o(nenVar3.a, mcjVar).c) {
                return mtaVarH;
            }
        }
        Object obj2 = nenVar3.a;
        mcj mcjVar2 = this.L;
        mclVar.o(obj2, mcjVar2);
        long jE = nenVar3.b() ? mcjVar2.e(nenVar3.b, nenVar3.c) : mcjVar2.d;
        nen nenVar6 = nenVar3;
        mta mtaVarB3 = mtaVarH.c(nenVar6, mtaVarH.t, mtaVarH.t, mtaVarH.e, jE - mtaVarH.t, mtaVarH.i, mtaVarH.j, mtaVarH.k).b(nenVar6);
        mtaVarB3.r = jE;
        return mtaVarB3;
    }

    private final mte az(mtd mtdVar) {
        ar(this.C);
        mcl mclVar = this.C.b;
        mry mryVar = this.g;
        return new mte(mryVar, mtdVar, mryVar.f);
    }

    @Override // defpackage.mcg
    public final long A() {
        ap();
        return this.R;
    }

    @Override // defpackage.mcg
    public final long B() {
        ap();
        return this.P;
    }

    @Override // defpackage.mcg
    public final long C() {
        ap();
        return this.Q;
    }

    @Override // defpackage.mcg
    public final Looper D() {
        throw null;
    }

    @Override // defpackage.mcg
    public final mbr E() {
        ap();
        return this.s;
    }

    @Override // defpackage.mcg
    public final mca F() {
        ap();
        return this.C.p;
    }

    @Override // defpackage.mcg
    public final mcc G() {
        ap();
        return this.r;
    }

    @Override // defpackage.mcg
    public final mcl H() {
        ap();
        return this.C.b;
    }

    @Override // defpackage.mcg
    public final mcq I() {
        ap();
        mcq mcqVarC = this.J.c();
        if (!this.Y) {
            return mcqVarC;
        }
        nhr nhrVar = new nhr((nhs) mcqVarC);
        nhrVar.g(this.Z);
        return new nhs(nhrVar);
    }

    @Override // defpackage.mcg
    public final mcs J() {
        ap();
        return this.C.j.d;
    }

    @Override // defpackage.mcg
    public final mde K() {
        ap();
        return this.A;
    }

    @Override // defpackage.mcg
    public final mdw L() {
        ap();
        return this.y;
    }

    @Override // defpackage.mcg
    public final void M(mce mceVar) {
        mee.f(mceVar);
        this.h.b(mceVar);
    }

    @Override // defpackage.mcg
    public final void N(SurfaceView surfaceView) throws CloneNotSupportedException {
        ap();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        ap();
        if (holder == null || holder != this.ae) {
            return;
        }
        af();
    }

    @Override // defpackage.mcg
    public final void O() throws CloneNotSupportedException {
        ap();
        mta mtaVar = this.C;
        if (mtaVar.f != 1) {
            return;
        }
        mta mtaVarE = mtaVar.e(null);
        mta mtaVarAx = ax(mtaVarE, true != mtaVarE.b.q() ? 2 : 4);
        this.o++;
        this.g.e.c(29).b();
        an(mtaVarAx, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.mcg
    public final void P(mce mceVar) {
        ap();
        mee.f(mceVar);
        mfc mfcVar = this.h;
        mfcVar.g();
        CopyOnWriteArraySet copyOnWriteArraySet = mfcVar.c;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            mfb mfbVar = (mfb) it.next();
            if (mfbVar.a.equals(mceVar)) {
                mfbVar.a(mfcVar.b);
                copyOnWriteArraySet.remove(mfbVar);
            }
        }
    }

    @Override // defpackage.mcg
    public final void Q(boolean z) throws CloneNotSupportedException {
        ap();
        am(z, 1);
    }

    @Override // defpackage.mcg
    public final void R(final int i) {
        ap();
        if (this.W != i) {
            this.W = i;
            this.g.e.e(11, i, 0).b();
            mfc mfcVar = this.h;
            mfcVar.d(8, new mez() { // from class: mqj
                @Override // defpackage.mez
                public final void a(Object obj) {
                    int i2 = mrn.F;
                    ((mce) obj).v(i);
                }
            });
            aB();
            mfcVar.c();
        }
    }

    @Override // defpackage.mcg
    public final void S(final boolean z) {
        ap();
        if (this.X != z) {
            this.X = z;
            this.g.e.e(12, z ? 1 : 0, 0).b();
            mfc mfcVar = this.h;
            mfcVar.d(9, new mez() { // from class: mqk
                @Override // defpackage.mez
                public final void a(Object obj) {
                    int i = mrn.F;
                    ((mce) obj).w(z);
                }
            });
            aB();
            mfcVar.c();
        }
    }

    @Override // defpackage.mcg
    public final void T(final mcq mcqVar) {
        mcq mcqVarAw;
        ap();
        nim nimVar = this.J;
        nimVar.l();
        mcq mcqVarI = I();
        if (this.Y) {
            this.Z = mcqVar.E;
            mcqVarAw = aw(mcqVar, this.aa.b);
        } else {
            mcqVarAw = mcqVar;
        }
        if (!mcqVarAw.equals(nimVar.c())) {
            nimVar.j(mcqVarAw);
        }
        if (mcqVarI.equals(mcqVar)) {
            return;
        }
        this.h.f(19, new mez() { // from class: mqs
            @Override // defpackage.mez
            public final void a(Object obj) {
                int i = mrn.F;
                ((mce) obj).A(mcqVar);
            }
        });
    }

    @Override // defpackage.mcg
    public final void U(SurfaceView surfaceView) throws CloneNotSupportedException {
        ap();
        if (surfaceView instanceof nky) {
            ah();
            al(surfaceView);
            aA(surfaceView.getHolder());
            return;
        }
        if (surfaceView instanceof nmo) {
            ah();
            this.af = (nmo) surfaceView;
            mte mteVarAz = az(this.S);
            mteVarAz.e(10000);
            mteVarAz.d(this.af);
            mteVarAz.c();
            this.af.a.add(this.m);
            al(this.af.e);
            aA(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        ap();
        if (holder == null) {
            af();
            return;
        }
        ah();
        this.u = true;
        this.ae = holder;
        holder.addCallback(this.m);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            al(null);
            ag(0, 0);
        } else {
            al(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            ag(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // defpackage.mcg
    public final void V(TextureView textureView) {
        throw null;
    }

    @Override // defpackage.mcg
    public final boolean W() {
        ap();
        return this.C.m;
    }

    @Override // defpackage.mcg
    public final boolean X() {
        ap();
        return this.X;
    }

    @Override // defpackage.mcg
    public final boolean Y() {
        ap();
        return this.C.c.b();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void Z(mtx mtxVar) {
        ((mwk) this.j).d.b(mtxVar);
    }

    @Override // defpackage.mcg
    public final int aC() {
        ap();
        if (Y()) {
            return this.C.c.b;
        }
        return -1;
    }

    @Override // defpackage.mcg
    public final int aD() {
        ap();
        if (Y()) {
            return this.C.c.c;
        }
        return -1;
    }

    @Override // defpackage.mcg
    public final int aE() {
        ap();
        int iAr = ar(this.C);
        if (iAr == -1) {
            return 0;
        }
        return iAr;
    }

    @Override // defpackage.mcg
    public final int aF() {
        ap();
        if (this.C.b.q()) {
            return 0;
        }
        mta mtaVar = this.C;
        return mtaVar.b.a(mtaVar.c.a);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void aa() {
        mff.e("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.1] [" + mgb.a + "] [" + mbp.a() + "]");
        ap();
        this.T.a(false);
        this.U.a(false);
        mry mryVar = this.g;
        if (!mryVar.k && mryVar.f.getThread().isAlive()) {
            mryVar.k = true;
            mej mejVar = mryVar.g;
            mem memVar = new mem();
            mryVar.e.d(7, memVar).b();
            if (!memVar.c(mryVar.i)) {
                this.h.f(10, new mez() { // from class: mqh
                    @Override // defpackage.mez
                    public final void a(Object obj) {
                        int i = mrn.F;
                        ((mce) obj).p(new mpn(2, new mrz(1), 1003));
                    }
                });
            }
        }
        this.h.e();
        this.f.i();
        nit nitVar = this.O;
        mtu mtuVar = this.j;
        ((niw) nitVar).g.a(mtuVar);
        boolean z = this.C.q;
        mta mtaVarAx = ax(this.C, 1);
        this.C = mtaVarAx;
        mta mtaVarB = mtaVarAx.b(mtaVarAx.c);
        this.C = mtaVarB;
        mtaVarB.r = mtaVarB.t;
        this.C.s = 0L;
        final mwk mwkVar = (mwk) mtuVar;
        mew mewVar = mwkVar.f;
        mee.g(mewVar);
        mewVar.b(new Runnable() { // from class: mvw
            @Override // java.lang.Runnable
            public final void run() {
                mwk mwkVar2 = mwkVar;
                mwkVar2.J(mwkVar2.E(), 1028, new mez() { // from class: mua
                    @Override // defpackage.mez
                    public final void a(Object obj) {
                    }
                });
                mwkVar2.d.e();
            }
        });
        ah();
        Surface surface = this.ad;
        if (surface != null) {
            surface.release();
            this.ad = null;
        }
        this.y = mdw.a;
        this.z = true;
    }

    public final long ab(mcl mclVar, nen nenVar, long j) {
        Object obj = nenVar.a;
        mcj mcjVar = this.L;
        mclVar.o(obj, mcjVar);
        return j + mcjVar.e;
    }

    public final mbr ac() throws CloneNotSupportedException {
        mcl mclVarH = H();
        if (mclVarH.q()) {
            return this.B;
        }
        mbo mboVar = mclVarH.p(aE(), this.a).d;
        mbq mbqVar = new mbq(this.B);
        mbr mbrVar = mboVar.d;
        if (mbrVar != null) {
            CharSequence charSequence = mbrVar.b;
            if (charSequence != null) {
                mbqVar.a = charSequence;
            }
            CharSequence charSequence2 = mbrVar.c;
            if (charSequence2 != null) {
                mbqVar.b = charSequence2;
            }
            CharSequence charSequence3 = mbrVar.d;
            if (charSequence3 != null) {
                mbqVar.c = charSequence3;
            }
            CharSequence charSequence4 = mbrVar.e;
            if (charSequence4 != null) {
                mbqVar.d = charSequence4;
            }
            CharSequence charSequence5 = mbrVar.f;
            if (charSequence5 != null) {
                mbqVar.e = charSequence5;
            }
            byte[] bArr = mbrVar.g;
            if (bArr != null) {
                Integer num = mbrVar.h;
                mbqVar.f = (byte[]) bArr.clone();
                mbqVar.g = num;
            }
            Integer num2 = mbrVar.i;
            if (num2 != null) {
                mbqVar.h = num2;
            }
            Integer num3 = mbrVar.j;
            if (num3 != null) {
                mbqVar.i = num3;
            }
            Integer num4 = mbrVar.k;
            if (num4 != null) {
                mbqVar.j = num4;
            }
            Boolean bool = mbrVar.l;
            if (bool != null) {
                mbqVar.k = bool;
            }
            Integer num5 = mbrVar.m;
            if (num5 != null) {
                mbqVar.l = num5;
            }
            Integer num6 = mbrVar.n;
            if (num6 != null) {
                mbqVar.l = num6;
            }
            Integer num7 = mbrVar.o;
            if (num7 != null) {
                mbqVar.m = num7;
            }
            Integer num8 = mbrVar.p;
            if (num8 != null) {
                mbqVar.n = num8;
            }
            Integer num9 = mbrVar.q;
            if (num9 != null) {
                mbqVar.o = num9;
            }
            Integer num10 = mbrVar.r;
            if (num10 != null) {
                mbqVar.p = num10;
            }
            Integer num11 = mbrVar.s;
            if (num11 != null) {
                mbqVar.q = num11;
            }
            CharSequence charSequence6 = mbrVar.t;
            if (charSequence6 != null) {
                mbqVar.r = charSequence6;
            }
            CharSequence charSequence7 = mbrVar.u;
            if (charSequence7 != null) {
                mbqVar.s = charSequence7;
            }
            CharSequence charSequence8 = mbrVar.v;
            if (charSequence8 != null) {
                mbqVar.t = charSequence8;
            }
            Integer num12 = mbrVar.w;
            if (num12 != null) {
                mbqVar.u = num12;
            }
            Integer num13 = mbrVar.x;
            if (num13 != null) {
                mbqVar.v = num13;
            }
            CharSequence charSequence9 = mbrVar.y;
            if (charSequence9 != null) {
                mbqVar.w = charSequence9;
            }
            CharSequence charSequence10 = mbrVar.z;
            if (charSequence10 != null) {
                mbqVar.x = charSequence10;
            }
            Integer num14 = mbrVar.A;
            if (num14 != null) {
                mbqVar.y = num14;
            }
            ekgb ekgbVar = mbrVar.B;
            if (!ekgbVar.isEmpty()) {
                mbqVar.z = ekgb.n(ekgbVar);
            }
        }
        return new mbr(mbqVar);
    }

    public final mpn ad() {
        ap();
        return this.C.g;
    }

    public final List ae(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((ekoe) list).c; i++) {
            arrayList.add(this.N.b((mbo) list.get(i)));
        }
        return arrayList;
    }

    public final void af() throws CloneNotSupportedException {
        ap();
        ah();
        al(null);
        ag(0, 0);
    }

    public final void ag(final int i, final int i2) {
        mft mftVar = this.ah;
        if (i == mftVar.c && i2 == mftVar.d) {
            return;
        }
        this.ah = new mft(i, i2);
        this.h.f(24, new mez() { // from class: mqg
            @Override // defpackage.mez
            public final void a(Object obj) {
                int i3 = mrn.F;
                ((mce) obj).y(i, i2);
            }
        });
        ai(2, 14, new mft(i, i2));
    }

    public final void ah() {
        if (this.af != null) {
            mte mteVarAz = az(this.S);
            mteVarAz.e(10000);
            mteVarAz.d(null);
            mteVarAz.c();
            nmo nmoVar = this.af;
            nmoVar.a.remove(this.m);
            this.af = null;
        }
        TextureView textureView = this.v;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.m) {
                mff.f("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.v.setSurfaceTextureListener(null);
            }
            this.v = null;
        }
        SurfaceHolder surfaceHolder = this.ae;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.m);
            this.ae = null;
        }
    }

    public final void ai(int i, int i2, Object obj) {
        for (mth mthVar : this.H) {
            if (i == -1 || mthVar.eM() == i) {
                mte mteVarAz = az(mthVar);
                mteVarAz.e(i2);
                mteVarAz.d(obj);
                mteVarAz.c();
            }
        }
        for (mth mthVar2 : this.I) {
            if (mthVar2 != null && (i == -1 || mthVar2.eM() == i)) {
                mte mteVarAz2 = az(mthVar2);
                mteVarAz2.e(i2);
                mteVarAz2.d(obj);
                mteVarAz2.c();
            }
        }
    }

    public final void aj(List list, int i, long j, boolean z) throws CloneNotSupportedException {
        long j2;
        int iG = i;
        int iAr = ar(this.C);
        long jY = y();
        this.o++;
        List list2 = this.i;
        if (!list2.isEmpty()) {
            int size = list2.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                list2.remove(i2);
            }
            ngf ngfVar = this.am;
            int[] iArr = ngfVar.b;
            int[] iArr2 = new int[iArr.length - size];
            int i3 = 0;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 < 0 || i5 >= size) {
                    int i6 = i4 - i3;
                    if (i5 >= 0) {
                        i5 -= size;
                    }
                    iArr2[i6] = i5;
                } else {
                    i3++;
                }
            }
            this.am = new ngf(iArr2, new Random(ngfVar.a.nextLong()));
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            msx msxVar = new msx((nep) list.get(i7), this.M);
            arrayList.add(msxVar);
            list2.add(i7, new mrm(msxVar.b, msxVar.a));
        }
        this.am = this.am.b(arrayList.size());
        mtg mtgVar = new mtg(list2, this.am);
        if (!mtgVar.q() && iG >= mtgVar.b) {
            throw new mba();
        }
        if (z) {
            iG = mtgVar.g(this.X);
            j2 = -9223372036854775807L;
        } else if (iG == -1) {
            iG = iAr;
            j2 = jY;
        } else {
            j2 = j;
        }
        mta mtaVarAy = ay(this.C, mtgVar, av(mtgVar, iG, j2));
        int i8 = mtaVarAy.f;
        if (iG != -1 && i8 != 1) {
            i8 = 4;
            if (!mtgVar.q() && iG < mtgVar.b) {
                i8 = 2;
            }
        }
        mta mtaVarAx = ax(mtaVarAy, i8);
        this.g.e.d(17, new mrt(arrayList, this.am, iG, mgb.w(j2))).b();
        an(mtaVarAx, 0, (this.C.c.a.equals(mtaVarAx.c.a) || this.C.b.q()) ? false : true, 4, at(mtaVarAx), -1, false);
    }

    public final void ak(SurfaceTexture surfaceTexture) throws CloneNotSupportedException {
        Surface surface = new Surface(surfaceTexture);
        al(surface);
        this.ad = surface;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void al(java.lang.Object r13) throws java.lang.CloneNotSupportedException {
        /*
            r12 = this;
            java.lang.Object r0 = r12.t
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L9
            if (r0 == r13) goto L9
            r1 = r2
        L9:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L13
            long r5 = r12.V
            goto L14
        L13:
            r5 = r3
        L14:
            mry r0 = r12.g
            boolean r7 = r0.k
            if (r7 != 0) goto L47
            android.os.Looper r7 = r0.f
            java.lang.Thread r7 = r7.getThread()
            boolean r7 = r7.isAlive()
            if (r7 != 0) goto L27
            goto L47
        L27:
            mej r7 = r0.g
            mem r7 = new mem
            r7.<init>()
            mew r8 = r0.e
            android.util.Pair r9 = new android.util.Pair
            r9.<init>(r13, r7)
            r10 = 30
            mfv r8 = r8.d(r10, r9)
            r8.b()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L47
            boolean r3 = r7.c(r5)
            goto L48
        L47:
            r3 = r2
        L48:
            if (r1 == 0) goto L56
            java.lang.Object r1 = r12.t
            android.view.Surface r4 = r12.ad
            if (r1 != r4) goto L56
            r4.release()
            r1 = 0
            r12.ad = r1
        L56:
            r12.t = r13
            if (r3 != 0) goto L9d
            mrz r13 = new mrz
            r1 = 3
            r13.<init>(r1)
            mpn r1 = new mpn
            r3 = 2
            r4 = 1003(0x3eb, float:1.406E-42)
            r1.<init>(r3, r13, r4)
            mta r13 = r12.C
            nen r3 = r13.c
            mta r13 = r13.b(r3)
            long r3 = r13.t
            r13.r = r3
            r3 = 0
            r13.s = r3
            mta r13 = ax(r13, r2)
            mta r4 = r13.e(r1)
            int r13 = r12.o
            int r13 = r13 + r2
            r12.o = r13
            mew r13 = r0.e
            r0 = 6
            mfv r13 = r13.c(r0)
            r13.b()
            r10 = -1
            r11 = 0
            r5 = 0
            r6 = 0
            r7 = 5
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r12
            r3.an(r4, r5, r6, r7, r8, r10, r11)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrn.al(java.lang.Object):void");
    }

    public final void am(boolean z, int i) throws CloneNotSupportedException {
        int i2;
        if (this.Y) {
            i2 = 4;
        } else {
            i2 = 0;
            if (this.C.o == 1 && !z) {
                i2 = 1;
            }
        }
        mta mtaVar = this.C;
        if (mtaVar.m == z && mtaVar.o == i2 && mtaVar.n == i) {
            return;
        }
        this.o++;
        boolean z2 = mtaVar.q;
        mta mtaVarD = mtaVar.d(z, i, i2);
        this.g.e.e(1, z ? 1 : 0, (i2 << 4) | i).b();
        an(mtaVarD, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void an(final defpackage.mta r33, final int r34, boolean r35, int r36, long r37, int r39, boolean r40) throws java.lang.CloneNotSupportedException {
        /*
            Method dump skipped, instructions count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrn.an(mta, int, boolean, int, long, int, boolean):void");
    }

    public final void ao() {
        int iT = t();
        if (iT != 2 && iT != 3) {
            this.T.a(false);
            this.U.a(false);
        } else {
            ap();
            boolean z = this.C.q;
            this.T.a(W());
            this.U.a(W());
        }
    }

    public final void ap() {
        this.G.b();
        Looper looper = this.k;
        if (Thread.currentThread() != looper.getThread()) {
            String strI = mgb.I("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), looper.getThread().getName());
            if (this.ai) {
                throw new IllegalStateException(strI);
            }
            mff.g("ExoPlayerImpl", strI, this.aj ? null : new IllegalStateException());
            this.aj = true;
        }
    }

    public final void aq(List list, long j) throws CloneNotSupportedException {
        ap();
        aj(list, 0, j, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        ap();
        return this.Y;
    }

    @Override // defpackage.mae
    public final void r(int i, long j, boolean z) throws CloneNotSupportedException {
        ap();
        if (i == -1) {
            return;
        }
        mee.a(i >= 0);
        mcl mclVar = this.C.b;
        if (mclVar.q() || i < mclVar.c()) {
            mwk mwkVar = (mwk) this.j;
            if (!mwkVar.g) {
                mtv mtvVarE = mwkVar.E();
                mwkVar.g = true;
                mwkVar.J(mtvVarE, -1, new mez() { // from class: mvr
                    @Override // defpackage.mez
                    public final void a(Object obj) {
                    }
                });
            }
            this.o++;
            if (Y()) {
                mff.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                mrw mrwVar = new mrw(this.C);
                mrwVar.a(1);
                this.al.a(mrwVar);
                return;
            }
            mta mtaVarAx = this.C;
            int i2 = mtaVarAx.f;
            if (i2 == 3 || (i2 == 4 && !mclVar.q())) {
                mtaVarAx = ax(this.C, 2);
            }
            int iAE = aE();
            mta mtaVarAy = ay(mtaVarAx, mclVar, av(mclVar, i, j));
            this.g.e.d(3, new mrx(mclVar, i, mgb.w(j))).b();
            an(mtaVarAy, 0, true, 1, at(mtaVarAy), iAE, z);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        ap();
        ai(4, 15, imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) throws CloneNotSupportedException {
        mcq mcqVarAw;
        ap();
        if (z == this.Y) {
            return;
        }
        this.Y = z;
        if (!this.aa.b.isEmpty()) {
            nim nimVar = this.J;
            nimVar.l();
            mcq mcqVarC = nimVar.c();
            if (z) {
                this.Z = mcqVarC.E;
                mcqVarAw = aw(mcqVarC, this.aa.b);
            } else {
                nhr nhrVar = new nhr((nhs) mcqVarC);
                nhrVar.d(this.Z);
                nhs nhsVar = new nhs(nhrVar);
                this.Z = null;
                mcqVarAw = nhsVar;
            }
            if (!mcqVarAw.equals(mcqVarC)) {
                nimVar.j(mcqVarAw);
            }
        }
        mry mryVar = this.g;
        mryVar.e.d(36, Boolean.valueOf(z)).b();
        mta mtaVar = this.C;
        am(mtaVar.m, mtaVar.n);
    }

    @Override // defpackage.mcg
    public final int t() {
        ap();
        return this.C.f;
    }

    @Override // defpackage.mcg
    public final int u() {
        ap();
        return this.C.o;
    }

    @Override // defpackage.mcg
    public final int v() {
        ap();
        return this.W;
    }

    @Override // defpackage.mcg
    public final long w() {
        ap();
        if (this.C.b.q()) {
            return this.E;
        }
        mta mtaVar = this.C;
        if (mtaVar.l.d != mtaVar.c.d) {
            return mtaVar.b.p(aE(), this.a).b();
        }
        long j = mtaVar.r;
        if (this.C.l.b()) {
            mta mtaVar2 = this.C;
            mtaVar2.b.o(mtaVar2.l.a, this.L).h(this.C.l.b);
            j = 0;
        }
        mta mtaVar3 = this.C;
        return mgb.B(ab(mtaVar3.b, mtaVar3.l, j));
    }

    @Override // defpackage.mcg
    public final long x() {
        ap();
        return as(this.C);
    }

    @Override // defpackage.mcg
    public final long y() {
        ap();
        return mgb.B(at(this.C));
    }

    @Override // defpackage.mcg
    public final long z() {
        ap();
        if (!Y()) {
            return c();
        }
        mta mtaVar = this.C;
        nen nenVar = mtaVar.c;
        mcl mclVar = mtaVar.b;
        Object obj = nenVar.a;
        mcj mcjVar = this.L;
        mclVar.o(obj, mcjVar);
        return mgb.B(mcjVar.e(nenVar.b, nenVar.c));
    }
}
