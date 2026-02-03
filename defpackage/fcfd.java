package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcfd implements fbpm, fcms {
    public final fcew a;
    public final ScheduledExecutorService b;
    public final fbpi c;
    public final fbnf d;
    public final boolean e;
    public final List f;
    public final fbtk g;
    public final fcex h;
    public volatile List i;
    public final ejxm j;
    public fbtj k;
    public fbtj l;
    public fchm m;
    public fcbc p;
    public volatile fchm q;
    public Status s;
    public volatile fbmw t;
    public fcdg u;
    private final fbpn v;
    private final String w;
    private final String x;
    private final fcas y;
    private final fcab z;
    public final Collection n = new ArrayList();
    public final fcef o = new fcel(this);
    public volatile fbnw r = fbnw.a(fbnv.IDLE);

    public fcfd(fbpx fbpxVar, String str, String str2, fcas fcasVar, ScheduledExecutorService scheduledExecutorService, fbtk fbtkVar, fcew fcewVar, fbpi fbpiVar, fcab fcabVar, fbpn fbpnVar, fbnf fbnfVar, List list) {
        Object obj;
        List list2 = fbpxVar.a;
        ejwl.b(!list2.isEmpty(), "addressGroups is empty");
        j(list2);
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list2));
        this.i = listUnmodifiableList;
        this.h = new fcex(listUnmodifiableList);
        this.w = str;
        this.x = str2;
        this.y = fcasVar;
        this.b = scheduledExecutorService;
        this.j = new ejxm();
        this.g = fbtkVar;
        this.a = fcewVar;
        this.c = fbpiVar;
        this.z = fcabVar;
        this.v = fbpnVar;
        this.d = fbnfVar;
        this.f = list;
        fbpw fbpwVar = fbqi.c;
        int i = 0;
        while (true) {
            Object[][] objArr = fbpxVar.c;
            if (i >= objArr.length) {
                obj = fbpwVar.a;
                break;
            } else {
                if (fbpwVar.equals(objArr[i][0])) {
                    obj = fbpxVar.c[i][1];
                    break;
                }
                i++;
            }
        }
        this.e = ((Boolean) obj).booleanValue();
    }

    public static void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public static final String k(Status status) {
        StringBuilder sb = new StringBuilder();
        sb.append(status.getCode());
        if (status.getDescription() != null) {
            sb.append("(");
            sb.append(status.getDescription());
            sb.append(")");
        }
        Throwable th = status.t;
        if (th != null) {
            sb.append("[");
            sb.append(th);
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // defpackage.fcms
    public final fcaq a() {
        fchm fchmVar = this.q;
        if (fchmVar != null) {
            return fchmVar;
        }
        this.g.execute(new fcen(this));
        return null;
    }

    public final void b(fbnv fbnvVar) {
        this.g.d();
        d(fbnw.a(fbnvVar));
    }

    @Override // defpackage.fbpt
    public final fbpn c() {
        return this.v;
    }

    public final void d(fbnw fbnwVar) {
        this.g.d();
        fbnv fbnvVar = this.r.a;
        fbnv fbnvVar2 = fbnwVar.a;
        if (fbnvVar != fbnvVar2) {
            ejwl.m(this.r.a != fbnv.SHUTDOWN, "Cannot transition out of SHUTDOWN to ".concat(fbnwVar.toString()));
            if (this.e && fbnvVar2 == fbnv.TRANSIENT_FAILURE) {
                this.r = fbnw.a(fbnv.IDLE);
            } else {
                this.r = fbnwVar;
            }
            fcew fcewVar = this.a;
            ejwl.m(true, "listener is null");
            ((fcgt) fcewVar).a.a(fbnwVar);
        }
    }

    public final void e() {
        this.g.execute(new fcer(this));
    }

    public final void f(fcbc fcbcVar, boolean z) {
        this.g.execute(new fces(this, fcbcVar, z));
    }

    public final void g(Status status) {
        this.g.execute(new fceq(this, status));
    }

    public final void h() {
        fbpd fbpdVar;
        fbtk fbtkVar = this.g;
        fbtkVar.d();
        ejwl.m(this.k == null, "Should have no reconnectTask scheduled");
        fcex fcexVar = this.h;
        if (fcexVar.b == 0 && fcexVar.c == 0) {
            ejxm ejxmVar = this.j;
            ejxmVar.e();
            ejxmVar.f();
        }
        SocketAddress socketAddressB = fcexVar.b();
        if (socketAddressB instanceof fbpd) {
            fbpd fbpdVar2 = (fbpd) socketAddressB;
            fbpdVar = fbpdVar2;
            socketAddressB = fbpdVar2.b;
        } else {
            fbpdVar = null;
        }
        fbmw fbmwVarA = fcexVar.a();
        String str = (String) fbmwVarA.a(fbop.a);
        fcar fcarVar = new fcar();
        if (str == null) {
            str = this.w;
        }
        str.getClass();
        fcarVar.a = str;
        fcarVar.b = fbmwVarA;
        fcarVar.c = this.x;
        fcarVar.d = fbpdVar;
        fcfc fcfcVar = new fcfc();
        fcfcVar.a = this.v;
        fcev fcevVar = new fcev(this.y.a(socketAddressB, fcarVar, fcfcVar), this.z);
        fcfcVar.a = fcevVar.c();
        fbpi.b(this.c.f, fcevVar);
        this.p = fcevVar;
        this.n.add(fcevVar);
        Runnable runnableE = fcevVar.e(new fcfb(this, fcevVar));
        if (runnableE != null) {
            fbtkVar.c(runnableE);
        }
        this.d.b(2, "Started transport {0}", fcfcVar.a);
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.g("logId", this.v.a);
        ejwfVarB.b("addressGroups", this.i);
        return ejwfVarB.toString();
    }
}
