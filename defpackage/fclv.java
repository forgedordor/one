package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fclv extends fbsj implements fbpm {
    public static final Logger b = Logger.getLogger(fclv.class.getName());
    public static final fcmb c = new fclm();
    public Executor d;
    public final fbpc e;
    public final fbpc f;
    public final List g;
    public final fbso[] h;
    public final long i;
    public Status j;
    public boolean k;
    public boolean m;
    public final fbog o;
    public final fboo p;
    public final fbpi q;
    public final fcab r;
    public final fbok s;
    private final fbpn t;
    private final fchy u;
    private boolean v;
    private boolean w;
    private boolean x;
    private final fcek y;
    public final Object l = new Object();
    public final Set n = new HashSet();

    public fclv(fcly fclyVar, fcek fcekVar, fbog fbogVar) {
        fchy fchyVar = fclyVar.j;
        fchyVar.getClass();
        this.u = fchyVar;
        fcei fceiVar = fclyVar.d;
        HashMap map = new HashMap();
        Iterator it = fceiVar.a.values().iterator();
        while (it.hasNext()) {
            for (fbsr fbsrVar : ((fbst) it.next()).a()) {
                map.put(fbsrVar.a.b, fbsrVar);
            }
        }
        DesugarCollections.unmodifiableList(new ArrayList(fceiVar.a.values()));
        this.e = new fcej(DesugarCollections.unmodifiableMap(map));
        fbpc fbpcVar = fclyVar.i;
        fbpcVar.getClass();
        this.f = fbpcVar;
        this.y = fcekVar;
        this.t = fbpn.b("Server", String.valueOf(f()));
        fbogVar.getClass();
        this.o = new fbog(fbogVar.f, fbogVar.g + 1);
        this.p = fclyVar.k;
        this.g = DesugarCollections.unmodifiableList(new ArrayList(fclyVar.e));
        List list = fclyVar.f;
        this.h = (fbso[]) list.toArray(new fbso[list.size()]);
        this.i = fclyVar.m;
        fbpi fbpiVar = fclyVar.s;
        this.q = fbpiVar;
        this.r = new fcab(fcmq.a);
        fbok fbokVar = fclyVar.n;
        fbokVar.getClass();
        this.s = fbokVar;
        fbpi.b(fbpiVar.c, this);
    }

    private final List f() {
        List listUnmodifiableList;
        synchronized (this.l) {
            listUnmodifiableList = DesugarCollections.unmodifiableList(this.y.b());
        }
        return listUnmodifiableList;
    }

    @Override // defpackage.fbsj
    public final List a() {
        List listF;
        synchronized (this.l) {
            ejwl.m(this.v, "Not started");
            ejwl.m(!this.x, "Already terminated");
            listF = f();
        }
        return listF;
    }

    @Override // defpackage.fbsj
    public final /* bridge */ /* synthetic */ void b() {
        synchronized (this.l) {
            if (!this.w) {
                this.w = true;
                boolean z = this.v;
                if (!z) {
                    this.m = true;
                    e();
                }
                if (z) {
                    this.y.d();
                }
            }
        }
        Status statusWithDescription = Status.p.withDescription("Server shutdownNow invoked");
        synchronized (this.l) {
            if (this.j != null) {
                return;
            }
            this.j = statusWithDescription;
            ArrayList arrayList = new ArrayList(this.n);
            boolean z2 = this.k;
            if (z2) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((fcmc) arrayList.get(i)).o(statusWithDescription);
                }
            }
        }
    }

    @Override // defpackage.fbpt
    public final fbpn c() {
        return this.t;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.fbsj
    public final /* bridge */ /* synthetic */ void d() {
        synchronized (this.l) {
            ejwl.m(!this.v, "Already started");
            ejwl.m(!this.w, "Shutting down");
            this.y.e(new fcln(this));
            ?? A = this.u.a();
            A.getClass();
            this.d = A;
            this.v = true;
        }
    }

    public final void e() {
        Object obj = this.l;
        synchronized (obj) {
            if (this.w && this.n.isEmpty() && this.m) {
                if (this.x) {
                    throw new AssertionError("Server already terminated");
                }
                this.x = true;
                fbpi fbpiVar = this.q;
                fbpi.c(fbpiVar.c, this);
                Executor executor = this.d;
                if (executor != null) {
                    this.u.b(executor);
                    this.d = null;
                }
                obj.notifyAll();
            }
        }
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.g("logId", this.t.a);
        ejwfVarB.b("transportServer", this.y);
        return ejwfVarB.toString();
    }
}
