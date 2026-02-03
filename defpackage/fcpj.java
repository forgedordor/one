package defpackage;

import androidx.car.app.model.Alert;
import io.grpc.Status;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcpj implements fcbc, fcon, fcpv {
    private static final Map M;
    private static final Class N;
    public static final Logger a;
    static final boolean b;
    public final Deque A;
    public final fcqb B;
    public fcfk C;
    public boolean D;
    public long E;
    public long F;
    public final Runnable G;
    public final int H;
    public final fcmu I;
    public final Map J;
    final fbpd K;
    int L;
    private final fbpn O;
    private int P;
    private final fclc Q;
    private final ScheduledExecutorService R;
    private final int S;
    private boolean T;
    private boolean U;
    private final fcef V;
    public Socket c;
    public SSLSession d;
    public final InetSocketAddress e;
    public final String f;
    public final String g;
    public final Random h = new Random();
    public final int i;
    public fchl j;
    public fcoo k;
    public fcpx l;
    public final Object m;
    public final Map n;
    public final Executor o;
    public int p;
    public fcph q;
    public fbmw r;
    public Status s;
    public fcee t;
    public boolean u;
    public final SocketFactory v;
    public SSLSocketFactory w;
    public HostnameVerifier x;
    public Socket y;
    public int z;

    static {
        EnumMap enumMap = new EnumMap(fcqp.class);
        enumMap.put((EnumMap) fcqp.NO_ERROR, (fcqp) Status.o.withDescription("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) fcqp.PROTOCOL_ERROR, (fcqp) Status.o.withDescription("Protocol error"));
        enumMap.put((EnumMap) fcqp.INTERNAL_ERROR, (fcqp) Status.o.withDescription("Internal error"));
        enumMap.put((EnumMap) fcqp.FLOW_CONTROL_ERROR, (fcqp) Status.o.withDescription("Flow control error"));
        enumMap.put((EnumMap) fcqp.STREAM_CLOSED, (fcqp) Status.o.withDescription("Stream closed"));
        enumMap.put((EnumMap) fcqp.FRAME_TOO_LARGE, (fcqp) Status.o.withDescription("Frame too large"));
        enumMap.put((EnumMap) fcqp.REFUSED_STREAM, (fcqp) Status.p.withDescription("Refused stream"));
        enumMap.put((EnumMap) fcqp.CANCEL, (fcqp) Status.c.withDescription("Cancelled"));
        enumMap.put((EnumMap) fcqp.COMPRESSION_ERROR, (fcqp) Status.o.withDescription("Compression error"));
        enumMap.put((EnumMap) fcqp.CONNECT_ERROR, (fcqp) Status.o.withDescription("Connect error"));
        enumMap.put((EnumMap) fcqp.ENHANCE_YOUR_CALM, (fcqp) Status.k.withDescription("Enhance your calm"));
        enumMap.put((EnumMap) fcqp.INADEQUATE_SECURITY, (fcqp) Status.i.withDescription("Inadequate security"));
        M = DesugarCollections.unmodifiableMap(enumMap);
        a = Logger.getLogger(fcpj.class.getName());
        b = fcdy.i("GRPC_ENABLE_PER_RPC_AUTHORITY_CHECK", false);
        Class<?> cls = null;
        try {
            cls = Class.forName("javax.net.ssl.X509ExtendedTrustManager");
            cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, Socket.class);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
        N = cls;
    }

    public fcpj(fcow fcowVar, InetSocketAddress inetSocketAddress, String str, String str2, fbmw fbmwVar, ejxr ejxrVar, fbpd fbpdVar, Runnable runnable) {
        Object obj = new Object();
        this.m = obj;
        this.n = new HashMap();
        this.z = 0;
        this.A = new LinkedList();
        this.J = new fcpi();
        this.V = new fcpc(this);
        this.L = 30000;
        inetSocketAddress.getClass();
        this.e = inetSocketAddress;
        this.f = str;
        this.S = fcowVar.f;
        this.i = fcowVar.g;
        Executor executor = fcowVar.a;
        executor.getClass();
        this.o = executor;
        this.Q = new fclc(fcowVar.a);
        ScheduledExecutorService scheduledExecutorService = fcowVar.b;
        scheduledExecutorService.getClass();
        this.R = scheduledExecutorService;
        this.P = 3;
        this.v = SocketFactory.getDefault();
        this.w = fcowVar.d;
        this.x = fcqf.a;
        fcqb fcqbVar = fcowVar.e;
        fcqbVar.getClass();
        this.B = fcqbVar;
        ejxrVar.getClass();
        this.g = fcdy.e("okhttp", str2);
        this.K = fbpdVar;
        this.G = runnable;
        this.H = fcowVar.h;
        this.I = fcowVar.c.a();
        this.O = fbpn.a(getClass(), inetSocketAddress.toString());
        fbmw fbmwVar2 = fbmw.a;
        fbmu fbmuVar = new fbmu(fbmw.a);
        fbmuVar.b(fcdq.b, fbmwVar);
        this.r = fbmuVar.a();
        synchronized (obj) {
        }
    }

    static Status f(fcqp fcqpVar) {
        Status status = (Status) M.get(fcqpVar);
        if (status != null) {
            return status;
        }
        return Status.d.withDescription("Unknown http2 error code: " + fcqpVar.s);
    }

    public static String g(ffgb ffgbVar) throws EOFException {
        ffez ffezVar = new ffez();
        while (ffgbVar.b(ffezVar, 1L) != -1) {
            if (ffezVar.c(ffezVar.b - 1) == 10) {
                long jI = ffezVar.i((byte) 10, 0L, Long.MAX_VALUE);
                if (jI != -1) {
                    return ffgf.b(ffezVar, jI);
                }
                ffez ffezVar2 = new ffez();
                ffezVar.I(ffezVar2, 0L, Math.min(32L, ffezVar.b));
                throw new EOFException("\\n not found: limit=" + Math.min(ffezVar.b, Long.MAX_VALUE) + " content=" + ffezVar2.u().d() + "…");
            }
        }
        throw new EOFException("\\n not found: ".concat(ffezVar.u().d()));
    }

    private final void t() {
        if (this.s == null || !this.n.isEmpty() || !this.A.isEmpty() || this.u) {
            return;
        }
        this.u = true;
        fcfk fcfkVar = this.C;
        if (fcfkVar != null) {
            fcfkVar.e();
        }
        fcee fceeVar = this.t;
        if (fceeVar != null) {
            Status statusB = b();
            synchronized (fceeVar) {
                if (!fceeVar.d) {
                    fceeVar.d = true;
                    fceeVar.e = statusB;
                    Map map = fceeVar.c;
                    fceeVar.c = null;
                    for (Map.Entry entry : map.entrySet()) {
                        fcee.b((fcfi) entry.getKey(), (Executor) entry.getValue());
                    }
                }
            }
            this.t = null;
        }
        if (!this.T) {
            this.T = true;
            this.k.i(fcqp.NO_ERROR, new byte[0]);
        }
        this.k.close();
    }

    @Override // defpackage.fcon
    public final void a(Throwable th) {
        l(0, fcqp.INTERNAL_ERROR, Status.p.d(th));
    }

    public final Status b() {
        synchronized (this.m) {
            Status status = this.s;
            if (status != null) {
                return status;
            }
            return Status.p.withDescription("Connection closed");
        }
    }

    @Override // defpackage.fbpt
    public final fbpn c() {
        return this.O;
    }

    @Override // defpackage.fcaq
    public final /* bridge */ /* synthetic */ fcan d(fbrk fbrkVar, fbrg fbrgVar, fbnc fbncVar, fbnm[] fbnmVarArr) {
        fcpb fcpbVar;
        fcmm fcmmVarL = fcmm.l(fbnmVarArr, this.r);
        Object obj = this.m;
        synchronized (obj) {
            fcpbVar = new fcpb(fbrkVar, fbrgVar, this.k, this, this.l, obj, this.S, this.i, this.f, this.g, fcmmVarL, this.I, fbncVar);
        }
        return fcpbVar;
    }

    @Override // defpackage.fchm
    public final Runnable e(fchl fchlVar) throws Throwable {
        this.j = fchlVar;
        if (this.D) {
            fcfk fcfkVar = new fcfk(new fcfj(this), this.R, this.E, this.F);
            this.C = fcfkVar;
            fcfkVar.d();
        }
        fcom fcomVar = new fcom(this.Q, this);
        fcok fcokVar = new fcok(fcomVar, new fcqy(fffl.a(fcomVar)));
        synchronized (this.m) {
            try {
                this.k = new fcoo(this, fcokVar);
                this.l = new fcpx(this, this.k);
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        this.Q.execute(new fcpe(this, countDownLatch, cyclicBarrier, fcomVar, countDownLatch2));
        this.o.execute(new fcpf(cyclicBarrier, countDownLatch2));
        try {
            synchronized (this.m) {
                fcoo fcooVar = this.k;
                try {
                    ((fcop) fcooVar.b).b.b();
                } catch (IOException e) {
                    fcooVar.a.a(e);
                }
                fcrc fcrcVar = new fcrc();
                fcrcVar.d(7, this.i);
                fcoo fcooVar2 = this.k;
                fcooVar2.c.f(2, fcrcVar);
                try {
                    ((fcop) fcooVar2.b).b.g(fcrcVar);
                } catch (IOException e2) {
                    fcooVar2.a.a(e2);
                }
            }
            countDownLatch.countDown();
            this.Q.execute(new fcpg(this));
            return null;
        } catch (Throwable th3) {
            countDownLatch.countDown();
            throw th3;
        }
    }

    final void h(int i, Status status, fcao fcaoVar, boolean z, fcqp fcqpVar, fbrg fbrgVar) {
        synchronized (this.m) {
            fcpb fcpbVar = (fcpb) this.n.remove(Integer.valueOf(i));
            if (fcpbVar != null) {
                if (fcqpVar != null) {
                    this.k.f(i, fcqp.CANCEL);
                }
                if (status != null) {
                    fcpa fcpaVar = fcpbVar.f;
                    if (fbrgVar == null) {
                        fbrgVar = new fbrg();
                    }
                    fcpaVar.k(status, fcaoVar, z, fbrgVar);
                }
                if (!r()) {
                    t();
                }
                i(fcpbVar);
            }
        }
    }

    public final void i(fcpb fcpbVar) {
        if (this.U && this.A.isEmpty() && this.n.isEmpty()) {
            this.U = false;
            fcfk fcfkVar = this.C;
            if (fcfkVar != null) {
                fcfkVar.c();
            }
        }
        if (fcpbVar.s) {
            this.V.c(fcpbVar, false);
        }
    }

    public final void j(fcqp fcqpVar, String str) {
        l(0, fcqpVar, f(fcqpVar).b(str));
    }

    public final void k(fcpb fcpbVar) {
        if (!this.U) {
            this.U = true;
            fcfk fcfkVar = this.C;
            if (fcfkVar != null) {
                fcfkVar.b();
            }
        }
        if (fcpbVar.s) {
            this.V.c(fcpbVar, true);
        }
    }

    public final void l(int i, fcqp fcqpVar, Status status) {
        synchronized (this.m) {
            if (this.s == null) {
                this.s = status;
                this.j.c(status);
            }
            if (fcqpVar != null && !this.T) {
                this.T = true;
                this.k.i(fcqpVar, new byte[0]);
            }
            Iterator it = this.n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getKey()).intValue() > i) {
                    it.remove();
                    ((fcpb) entry.getValue()).f.k(status, fcao.REFUSED, false, new fbrg());
                    i((fcpb) entry.getValue());
                }
            }
            Deque<fcpb> deque = this.A;
            for (fcpb fcpbVar : deque) {
                fcpbVar.f.k(status, fcao.MISCARRIED, true, new fbrg());
                i(fcpbVar);
            }
            deque.clear();
            t();
        }
    }

    public final void m(fcpb fcpbVar) {
        fcpa fcpaVar = fcpbVar.f;
        ejwl.m(fcpaVar.x == -1, "StreamId already assigned");
        this.n.put(Integer.valueOf(this.P), fcpbVar);
        k(fcpbVar);
        int i = this.P;
        ejwl.n(fcpaVar.x == -1, "the stream has been started with id %s", i);
        fcpaVar.x = i;
        fcpx fcpxVar = fcpaVar.h;
        fcpaVar.w = new fcpu(fcpxVar, i, fcpxVar.c, fcpaVar);
        fcpb fcpbVar2 = fcpaVar.y;
        fcpbVar2.f.d();
        if (fcpaVar.u) {
            fcoo fcooVar = fcpaVar.g;
            try {
                ((fcop) fcooVar.b).b.j(false, fcpaVar.x, fcpaVar.b);
            } catch (IOException e) {
                fcooVar.a.a(e);
            }
            fcpbVar2.d.a();
            fcpaVar.b = null;
            ffez ffezVar = fcpaVar.c;
            if (ffezVar.b > 0) {
                fcpxVar.a(fcpaVar.d, fcpaVar.w, ffezVar, fcpaVar.e);
            }
            fcpaVar.u = false;
        }
        if (fcpbVar.s() == fbrj.UNARY || fcpbVar.s() == fbrj.SERVER_STREAMING) {
            boolean z = fcpbVar.g;
        } else {
            this.k.d();
        }
        int i2 = this.P;
        if (i2 < 2147483645) {
            this.P = i2 + 2;
        } else {
            this.P = Alert.DURATION_SHOW_INDEFINITELY;
            l(Alert.DURATION_SHOW_INDEFINITELY, fcqp.NO_ERROR, Status.p.withDescription("Stream ids exhausted"));
        }
    }

    @Override // defpackage.fchm
    public final void n(Status status) {
        synchronized (this.m) {
            if (this.s != null) {
                return;
            }
            this.s = status;
            this.j.c(status);
            t();
        }
    }

    @Override // defpackage.fchm
    public final void o(Status status) {
        n(status);
        synchronized (this.m) {
            Iterator it = this.n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                it.remove();
                ((fcpb) entry.getValue()).f.j(status, false, new fbrg());
                i((fcpb) entry.getValue());
            }
            Deque<fcpb> deque = this.A;
            for (fcpb fcpbVar : deque) {
                fcpbVar.f.k(status, fcao.MISCARRIED, true, new fbrg());
                i(fcpbVar);
            }
            deque.clear();
            t();
        }
    }

    final boolean p(int i) {
        boolean z;
        synchronized (this.m) {
            z = false;
            if (i < this.P && (i & 1) == 1) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.fcbc
    public final fbmw q() {
        return this.r;
    }

    public final boolean r() {
        boolean z = false;
        while (true) {
            Deque deque = this.A;
            if (deque.isEmpty() || this.n.size() >= this.z) {
                break;
            }
            m((fcpb) deque.poll());
            z = true;
        }
        return z;
    }

    @Override // defpackage.fcpv
    public final fcpu[] s() {
        fcpu[] fcpuVarArr;
        synchronized (this.m) {
            Map map = this.n;
            fcpuVarArr = new fcpu[map.size()];
            Iterator it = map.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                fcpuVarArr[i] = ((fcpb) it.next()).f.f();
                i++;
            }
        }
        return fcpuVarArr;
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.g("logId", this.O.a);
        ejwfVarB.b("address", this.e);
        return ejwfVarB.toString();
    }
}
