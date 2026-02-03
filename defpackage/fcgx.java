package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import io.grpc.Status;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcgx extends fbqm implements fbpm {
    static final Logger a = Logger.getLogger(fcgx.class.getName());
    static final Status b;
    static final Status c;
    public static final fchk d;
    public static final fbpk e;
    public static final fbqb f;
    public static final fbnh g;
    public final fcgw A;
    public final AtomicBoolean B;
    public boolean C;
    public volatile boolean D;
    public final fcaa E;
    public final fcab F;
    public final fcad G;
    public final fbnf H;
    public final fbpi I;
    public final fcgr J;
    public fchk K;
    public final fchk L;
    public boolean M;
    public final boolean N;
    public final fcjy O;
    public final long P;
    public final long Q;
    public final boolean R;
    final fcef S;
    public final fcfx T;
    public int U;
    private final String V;
    private final URI W;
    private final fbrv X;
    private final fbrn Y;
    private final fbzu Z;
    private final fchy aa;
    private final fcgb ab;
    private final fcgb ac;
    private final long ad;
    private final fbnd ae;
    private final Set af;
    private final CountDownLatch ag;
    private final fchl ah;
    private final fcjf ai;
    private final fchw aj;
    public final fbpn h;
    public final fcas i;
    public final fcgs j;
    public final Executor k;
    public final fcmq l;
    final fbtk m;
    public final fboo n;
    public final fbns o;
    public final fcbe p;
    public final List q;
    public final String r;
    public fbru s;
    public boolean t;
    public fcgf u;
    public boolean v;
    public final Set w;
    public Collection x;
    public final Object y;
    public final fccd z;

    static {
        Status.p.withDescription("Channel shutdownNow invoked");
        b = Status.p.withDescription("Channel shutdown invoked");
        c = Status.p.withDescription("Subchannel shutdown invoked");
        d = new fchk(null, new HashMap(), new HashMap(), null, null, null);
        e = new fcfo();
        f = new fcft();
        g = new fcfv();
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public fcgx(fchf fchfVar, fcas fcasVar, URI uri, fbrv fbrvVar, fchy fchyVar, ejxr ejxrVar, List list, fcmq fcmqVar) {
        fbtk fbtkVar = new fbtk(new fcfu(this));
        this.m = fbtkVar;
        this.p = new fcbe();
        this.w = new HashSet(16, 0.75f);
        this.y = new Object();
        this.af = new HashSet(1, 0.75f);
        this.A = new fcgw(this);
        this.B = new AtomicBoolean(false);
        this.ag = new CountDownLatch(1);
        this.U = 1;
        this.K = d;
        this.M = false;
        this.O = new fcjy();
        fbok fbokVar = fbol.a;
        fcga fcgaVar = new fcga(this);
        this.ah = fcgaVar;
        this.S = new fcgc(this);
        fcfx fcfxVar = new fcfx(this);
        this.T = fcfxVar;
        String str = fchfVar.h;
        str.getClass();
        this.V = str;
        fbpn fbpnVarB = fbpn.b("Channel", str);
        this.h = fbpnVarB;
        fcmqVar.getClass();
        this.l = fcmqVar;
        fchy fchyVar2 = fchfVar.d;
        fchyVar2.getClass();
        this.aa = fchyVar2;
        ?? A = fchyVar2.a();
        A.getClass();
        this.k = A;
        fchy fchyVar3 = fchfVar.e;
        fchyVar3.getClass();
        fcgb fcgbVar = new fcgb(fchyVar3);
        this.ac = fcgbVar;
        fbzz fbzzVar = new fbzz(fcasVar, fcgbVar);
        this.i = fbzzVar;
        new fbzz(fcasVar, fcgbVar);
        fcgs fcgsVar = new fcgs(fbzzVar.c());
        this.j = fcgsVar;
        fcad fcadVar = new fcad(fbpnVarB, fcmqVar.a(), "Channel for '" + str + "'");
        this.G = fcadVar;
        fcac fcacVar = new fcac(fcadVar, fcmqVar);
        this.H = fcacVar;
        fbsh fbshVar = fcdy.m;
        boolean z = fchfVar.r;
        this.R = z;
        fbzu fbzuVar = new fbzu(fbql.b(), fchfVar.j);
        this.Z = fbzuVar;
        this.W = uri;
        this.X = fbrvVar;
        fckx fckxVar = new fckx(z, 5, 5, fbzuVar);
        fbrl.a();
        fchw fchwVar = new fchw();
        this.aj = fchwVar;
        fbrm fbrmVar = new fbrm();
        fbrmVar.a = Integer.valueOf(fchfVar.y.a());
        fbshVar.getClass();
        fbrmVar.b = fbshVar;
        fbrmVar.c = fbtkVar;
        fbrmVar.e = fcgsVar;
        fbrmVar.d = fckxVar;
        fbrmVar.f = fcacVar;
        fbrmVar.g = fcgbVar;
        fbrmVar.h = fchwVar;
        fbrn fbrnVar = new fbrn(fbrmVar);
        this.Y = fbrnVar;
        this.s = p(uri, fbrvVar, fbrnVar);
        this.ab = new fcgb(fchyVar);
        fccd fccdVar = new fccd(A, fbtkVar);
        this.z = fccdVar;
        fccdVar.f = fcgaVar;
        fccdVar.c = new fcbx(fcgaVar);
        fccdVar.d = new fcby(fcgaVar);
        fccdVar.e = new fcbz(fcgaVar);
        Map map = fchfVar.t;
        if (map != null) {
            fbro fbroVarA = fckxVar.a(map);
            Status status = fbroVarA.a;
            ejwl.p(status == null, "Default config is invalid: %s", status);
            fchk fchkVar = (fchk) fbroVarA.b;
            this.L = fchkVar;
            fcfxVar.a = fchkVar.a;
        } else {
            this.L = null;
        }
        this.N = true;
        fcgr fcgrVar = new fcgr(this, this.s.a());
        this.J = fcgrVar;
        this.ae = fbnk.a(fcgrVar, list);
        this.q = new ArrayList(fchfVar.g);
        ejxrVar.getClass();
        long j = fchfVar.m;
        if (j == -1) {
            this.ad = -1L;
        } else {
            ejwl.e(j >= fchf.b, "invalid idleTimeoutMillis %s", j);
            this.ad = fchfVar.m;
        }
        this.ai = new fcjf(new fcgd(this), fbtkVar, fbzzVar.c(), new ejxm());
        fboo fbooVar = fchfVar.k;
        fbooVar.getClass();
        this.n = fbooVar;
        fbns fbnsVar = fchfVar.l;
        fbnsVar.getClass();
        this.o = fbnsVar;
        this.r = fchfVar.i;
        this.Q = 16777216L;
        this.P = 1048576L;
        fcfq fcfqVar = new fcfq(fcmqVar);
        this.E = fcfqVar;
        this.F = fcfqVar.a();
        fbpi fbpiVar = fchfVar.s;
        fbpiVar.getClass();
        this.I = fbpiVar;
        fbpi.b(fbpiVar.d, this);
    }

    static fbru p(URI uri, fbrv fbrvVar, fbrn fbrnVar) {
        fbru fbruVarA = fbrvVar.a(uri, fbrnVar);
        if (fbruVarA == null) {
            throw new IllegalArgumentException("cannot create a NameResolver for ".concat(String.valueOf(String.valueOf(uri))));
        }
        ScheduledExecutorService scheduledExecutorService = fbrnVar.e;
        if (scheduledExecutorService == null) {
            throw new IllegalStateException("ScheduledExecutorService not set in Builder");
        }
        fbtk fbtkVar = fbrnVar.c;
        return new fckw(fbruVarA, new fbzw(scheduledExecutorService, fbtkVar), fbtkVar);
    }

    @Override // defpackage.fbnd
    public final fbnh a(fbrk fbrkVar, fbnc fbncVar) {
        return this.ae.a(fbrkVar, fbncVar);
    }

    @Override // defpackage.fbnd
    public final String b() {
        return this.ae.b();
    }

    @Override // defpackage.fbpt
    public final fbpn c() {
        return this.h;
    }

    @Override // defpackage.fbqm
    public final /* bridge */ /* synthetic */ fbqm d() {
        q();
        return this;
    }

    @Override // defpackage.fbqm
    public final void e() {
        this.m.execute(new fcfr(this));
    }

    @Override // defpackage.fbqm
    public final boolean f(TimeUnit timeUnit) {
        return this.ag.await(2L, timeUnit);
    }

    @Override // defpackage.fbqm
    public final fbnv g() {
        fbnv fbnvVar = this.p.a;
        if (fbnvVar != null) {
            return fbnvVar;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    public final Executor h(fbnc fbncVar) {
        Executor executor = fbncVar.c;
        return executor == null ? this.k : executor;
    }

    public final void i(boolean z) {
        ScheduledFuture scheduledFuture;
        fcjf fcjfVar = this.ai;
        fcjfVar.e = false;
        if (!z || (scheduledFuture = fcjfVar.f) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        fcjfVar.f = null;
    }

    public final void j() {
        n(true);
        fccd fccdVar = this.z;
        fccdVar.a(null);
        this.H.a(2, "Entering IDLE state");
        this.p.a(fbnv.IDLE);
        Object[] objArr = {this.y, fccdVar};
        for (int i = 0; i < 2; i++) {
            if (this.S.b.contains(objArr[i])) {
                k();
                return;
            }
        }
    }

    final void k() {
        this.m.d();
        if (this.B.get() || this.v) {
            return;
        }
        if (this.S.b.isEmpty()) {
            m();
        } else {
            i(false);
        }
        if (this.u == null) {
            this.H.a(2, "Exiting idle mode");
            fcgf fcgfVar = new fcgf(this);
            fcgfVar.a = new fbzp(this.Z, fcgfVar);
            this.u = fcgfVar;
            this.p.a(fbnv.CONNECTING);
            this.s.c(new fcgi(this, fcgfVar, this.s));
            this.t = true;
        }
    }

    public final void l() {
        if (!this.D && this.B.get() && this.w.isEmpty() && this.af.isEmpty()) {
            this.H.a(2, "Terminated");
            fbpi.c(this.I.d, this);
            this.aa.b(this.k);
            this.ab.b();
            this.ac.b();
            this.i.close();
            this.D = true;
            this.ag.countDown();
        }
    }

    public final void m() {
        long j = this.ad;
        if (j == -1) {
            return;
        }
        fcjf fcjfVar = this.ai;
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long jA = fcjfVar.a() + nanos;
        fcjfVar.e = true;
        if (jA - fcjfVar.d < 0 || fcjfVar.f == null) {
            ScheduledFuture scheduledFuture = fcjfVar.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            fcjfVar.f = fcjfVar.a.schedule(new fcje(fcjfVar), nanos, TimeUnit.NANOSECONDS);
        }
        fcjfVar.d = jA;
    }

    public final void n(boolean z) {
        this.m.d();
        if (z) {
            ejwl.m(this.t, "nameResolver is not started");
            ejwl.m(this.u != null, "lbHelper is null");
        }
        fbru fbruVar = this.s;
        if (fbruVar != null) {
            fbruVar.b();
            this.t = false;
            if (z) {
                this.s = p(this.W, this.X, this.Y);
            } else {
                this.s = null;
            }
        }
        fcgf fcgfVar = this.u;
        if (fcgfVar != null) {
            fbzp fbzpVar = fcgfVar.a;
            fbzpVar.b.d();
            fbzpVar.b = null;
            this.u = null;
        }
    }

    public final void o(fbqg fbqgVar) {
        this.z.a(fbqgVar);
    }

    public final void q() {
        this.H.a(1, "shutdown() called");
        if (this.B.compareAndSet(false, true)) {
            fbtk fbtkVar = this.m;
            fbtkVar.execute(new fcfs(this));
            fcgr fcgrVar = this.J;
            fcgrVar.c.m.execute(new fcgk(fcgrVar));
            fbtkVar.execute(new fcfp(this));
        }
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.g("logId", this.h.a);
        ejwfVarB.b(GroupManagementRequest.TARGET_ATTRIBUTE, this.V);
        return ejwfVarB.toString();
    }
}
