package defpackage;

import io.grpc.Status;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcil extends fbqi {
    public static final Logger f = Logger.getLogger(fcil.class.getName());
    public final fbqa g;
    public final Map h;
    public final fcif i;
    public int j;
    public boolean k;
    public fbtj l;
    public fbnv m;
    public fbnv n;
    public boolean o;
    public fbtj p;
    public fcdg q;
    private final boolean r;
    private final boolean s;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fcil(defpackage.fbqa r6) {
        /*
            r5 = this;
            r5.<init>()
            boolean r0 = i()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L17
            int r0 = defpackage.fcis.b
            java.lang.String r0 = "GRPC_PF_USE_HAPPY_EYEBALLS"
            boolean r0 = defpackage.fcdy.i(r0, r2)
            if (r0 == 0) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = r2
        L18:
            r5.r = r0
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r5.h = r3
            fcif r3 = new fcif
            int r4 = defpackage.ekgb.d
            ekgb r4 = defpackage.ekoe.a
            r3.<init>(r4, r0)
            r5.i = r3
            r5.j = r2
            r5.k = r1
            r0 = 0
            r5.l = r0
            fbnv r2 = defpackage.fbnv.IDLE
            r5.m = r2
            r5.n = r2
            r5.o = r1
            r5.p = r0
            boolean r0 = i()
            r5.s = r0
            r5.g = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcil.<init>(fbqa):void");
    }

    static boolean i() {
        return fcdy.i("GRPC_SERIALIZE_RETRIES", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.SocketAddress j(defpackage.fbqf r3) {
        /*
            fcgv r3 = (defpackage.fcgv) r3
            fcgx r0 = r3.j
            fbtk r0 = r0.m
            r0.d()
            boolean r0 = r3.g
            java.lang.String r1 = "not started"
            defpackage.ejwl.m(r0, r1)
            java.util.List r3 = r3.e
            r0 = 0
            if (r3 == 0) goto L1d
            int r1 = r3.size()
            r2 = 1
            if (r1 != r2) goto L1d
            goto L1e
        L1d:
            r2 = r0
        L1e:
            java.lang.String r1 = "%s does not have exactly one group"
            defpackage.ejwl.p(r2, r1, r3)
            java.lang.Object r3 = r3.get(r0)
            fbop r3 = (defpackage.fbop) r3
            java.util.List r3 = r3.b
            java.lang.Object r3 = r3.get(r0)
            java.net.SocketAddress r3 = (java.net.SocketAddress) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcil.j(fbqf):java.net.SocketAddress");
    }

    private final void k() {
        if (this.r) {
            fbtj fbtjVar = this.l;
            if (fbtjVar == null || !fbtjVar.b()) {
                fbqa fbqaVar = this.g;
                this.l = fbqaVar.c().a(new fcic(this), 250L, TimeUnit.MILLISECONDS, fbqaVar.d());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean l(ekgb ekgbVar) {
        Map map = this.h;
        HashSet<SocketAddress> hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        for (int i = 0; i < ((ekoe) ekgbVar).c; i++) {
            hashSet2.addAll(((fbop) ekgbVar.get(i)).b);
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((fcik) map.remove(socketAddress)).a.b();
            }
        }
        return hashSet.isEmpty();
    }

    @Override // defpackage.fbqi
    public final Status a(fbqe fbqeVar) {
        fcig fcigVar;
        Boolean bool;
        if (this.m == fbnv.SHUTDOWN) {
            return Status.l.withDescription("Already shut down");
        }
        fbmw fbmwVar = fbqeVar.b;
        Boolean bool2 = (Boolean) fbmwVar.a(e);
        this.o = bool2 == null || !bool2.booleanValue();
        List<fbop> list = fbqeVar.a;
        if (list.isEmpty()) {
            Status statusWithDescription = Status.p.withDescription(a.p(list, fbmwVar, "NameResolver returned no usable address. addrs=", ", attrs="));
            b(statusWithDescription);
            return statusWithDescription;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((fbop) it.next()) == null) {
                Status statusWithDescription2 = Status.p.withDescription(a.p(list, fbmwVar, "NameResolver returned address list with null endpoint. addrs=", ", attrs="));
                b(statusWithDescription2);
                return statusWithDescription2;
            }
        }
        this.k = true;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (fbop fbopVar : list) {
            ArrayList arrayList2 = new ArrayList();
            for (SocketAddress socketAddress : fbopVar.b) {
                if (hashSet.add(socketAddress)) {
                    arrayList2.add(socketAddress);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new fbop(arrayList2, fbopVar.c));
            }
        }
        Object obj = fbqeVar.c;
        if ((obj instanceof fcig) && (bool = (fcigVar = (fcig) obj).a) != null && bool.booleanValue()) {
            Long l = fcigVar.b;
            Collections.shuffle(arrayList, new Random());
        }
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfwVar.j(arrayList);
        ekgb ekgbVarG = ekfwVar.g();
        fbnv fbnvVar = this.m;
        fbnv fbnvVar2 = fbnv.READY;
        if (fbnvVar == fbnvVar2 || fbnvVar == fbnv.CONNECTING) {
            fcif fcifVar = this.i;
            SocketAddress socketAddressB = fcifVar.b();
            fcifVar.d(ekgbVarG);
            if (fcifVar.g(socketAddressB)) {
                fbqf fbqfVar = ((fcik) this.h.get(socketAddressB)).a;
                if (!fcifVar.f()) {
                    throw new IllegalStateException("Index is past the end of the address group list");
                }
                fcie fcieVar = (fcie) fcifVar.a.get(fcifVar.b);
                fbqfVar.d(Collections.singletonList(new fbop(fcieVar.b, fcieVar.a)));
                l(ekgbVarG);
                return Status.b;
            }
        } else {
            this.i.d(ekgbVarG);
        }
        if (l(ekgbVarG)) {
            fbnv fbnvVar3 = fbnv.CONNECTING;
            this.m = fbnvVar3;
            g(fbnvVar3, new fcih(fbqc.a));
        }
        fbnv fbnvVar4 = this.m;
        if (fbnvVar4 == fbnvVar2) {
            fbnv fbnvVar5 = fbnv.IDLE;
            this.m = fbnvVar5;
            g(fbnvVar5, new fcij(this, this));
        } else if (fbnvVar4 == fbnv.CONNECTING || fbnvVar4 == fbnv.TRANSIENT_FAILURE) {
            e();
            c();
        }
        return Status.b;
    }

    @Override // defpackage.fbqi
    public final void b(Status status) {
        if (this.m == fbnv.SHUTDOWN) {
            return;
        }
        Map map = this.h;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((fcik) it.next()).a.b();
        }
        map.clear();
        fcif fcifVar = this.i;
        int i = ekgb.d;
        fcifVar.d(ekoe.a);
        fbnv fbnvVar = fbnv.TRANSIENT_FAILURE;
        this.m = fbnvVar;
        g(fbnvVar, new fcih(fbqc.b(status)));
    }

    @Override // defpackage.fbqi
    public final void c() {
        fcif fcifVar = this.i;
        if (!fcifVar.f() || this.m == fbnv.SHUTDOWN) {
            return;
        }
        SocketAddress socketAddressB = fcifVar.b();
        Map map = this.h;
        fcik fcikVar = (fcik) map.get(socketAddressB);
        if (fcikVar == null) {
            if (!fcifVar.f()) {
                throw new IllegalStateException("Index is off the end of the address group list");
            }
            fbmw fbmwVar = ((fcie) fcifVar.a.get(fcifVar.b)).a;
            fcid fcidVar = new fcid(this);
            fbqa fbqaVar = this.g;
            fbpv fbpvVar = new fbpv();
            fbpvVar.c(ekjz.c(new fbop(socketAddressB, fbmwVar)));
            fbpvVar.b(b, fcidVar);
            fbpvVar.b(fbqi.c, Boolean.valueOf(this.s));
            fbqf fbqfVarB = fbqaVar.b(fbpvVar.a());
            final fcik fcikVar2 = new fcik(fbqfVarB, fbnv.IDLE);
            fcidVar.a = fcikVar2;
            map.put(socketAddressB, fcikVar2);
            fbpx fbpxVar = ((fcgv) fbqfVarB).a;
            if (this.o || fbpxVar.b.a(fbqi.d) == null) {
                fcikVar2.d = fbnw.a(fbnv.READY);
            }
            fbqfVarB.c(new fbqh() { // from class: fcia
                @Override // defpackage.fbqh
                public final void a(fbnw fbnwVar) {
                    fbnv fbnvVar;
                    fcil fcilVar = this.a;
                    Map map2 = fcilVar.h;
                    fcik fcikVar3 = fcikVar2;
                    fbqf fbqfVar = fcikVar3.a;
                    if (fcikVar3 == map2.get(fcil.j(fbqfVar)) && (fbnvVar = fbnwVar.a) != fbnv.SHUTDOWN) {
                        fbnv fbnvVar2 = fbnv.IDLE;
                        if (fbnvVar == fbnvVar2 && fcikVar3.b == fbnv.READY) {
                            fcilVar.g.e();
                        }
                        fcikVar3.b(fbnvVar);
                        fbnv fbnvVar3 = fcilVar.m;
                        fbnv fbnvVar4 = fbnv.TRANSIENT_FAILURE;
                        if (fbnvVar3 == fbnvVar4 || fcilVar.n == fbnvVar4) {
                            if (fbnvVar == fbnv.CONNECTING) {
                                return;
                            }
                            if (fbnvVar == fbnvVar2) {
                                fcilVar.c();
                                return;
                            }
                        }
                        int iOrdinal = fbnvVar.ordinal();
                        if (iOrdinal == 0) {
                            fbnv fbnvVar5 = fbnv.CONNECTING;
                            fcilVar.m = fbnvVar5;
                            fcilVar.g(fbnvVar5, new fcih(fbqc.a));
                            return;
                        }
                        if (iOrdinal == 1) {
                            fbtj fbtjVar = fcilVar.p;
                            if (fbtjVar != null) {
                                fbtjVar.a();
                                fcilVar.p = null;
                            }
                            fcilVar.q = null;
                            fcilVar.e();
                            Iterator it = map2.values().iterator();
                            while (it.hasNext()) {
                                fbqf fbqfVar2 = ((fcik) it.next()).a;
                                if (!fbqfVar2.equals(fbqfVar)) {
                                    fbqfVar2.b();
                                }
                            }
                            map2.clear();
                            fbnv fbnvVar6 = fbnv.READY;
                            fcikVar3.b(fbnvVar6);
                            map2.put(fcil.j(fbqfVar), fcikVar3);
                            fcilVar.i.g(fcil.j(fbqfVar));
                            fcilVar.m = fbnvVar6;
                            fcilVar.h(fcikVar3);
                            return;
                        }
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw new IllegalArgumentException("Unsupported state:".concat(fbnvVar.toString()));
                            }
                            fcilVar.i.c();
                            fcilVar.m = fbnvVar2;
                            fcilVar.g(fbnvVar2, new fcij(fcilVar, fcilVar));
                            return;
                        }
                        fcif fcifVar2 = fcilVar.i;
                        if (fcifVar2.f() && map2.get(fcifVar2.b()) == fcikVar3) {
                            if (fcifVar2.e()) {
                                fcilVar.e();
                                fcilVar.c();
                            } else if (map2.size() >= fcifVar2.a()) {
                                fcilVar.f();
                            } else {
                                fcifVar2.c();
                                fcilVar.c();
                            }
                        }
                        if (map2.size() >= fcifVar2.a()) {
                            Iterator it2 = map2.values().iterator();
                            while (it2.hasNext()) {
                                if (!((fcik) it2.next()).c) {
                                    return;
                                }
                            }
                            fcilVar.m = fbnvVar4;
                            fcilVar.g(fbnvVar4, new fcih(fbqc.b(fbnwVar.b)));
                            int i = fcilVar.j + 1;
                            fcilVar.j = i;
                            if (i >= fcifVar2.a() || fcilVar.k) {
                                fcilVar.k = false;
                                fcilVar.j = 0;
                                fcilVar.g.e();
                            }
                        }
                    }
                }
            });
            fcikVar = fcikVar2;
        }
        int iOrdinal = fcikVar.b.ordinal();
        if (iOrdinal == 0) {
            k();
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return;
            }
            fcikVar.a.a();
            fcikVar.b(fbnv.CONNECTING);
            k();
            return;
        }
        if (!this.s) {
            fcifVar.e();
            c();
        } else if (!fcifVar.f()) {
            f();
        } else {
            fcikVar.a.a();
            fcikVar.b(fbnv.CONNECTING);
        }
    }

    @Override // defpackage.fbqi
    public final void d() {
        Logger logger = f;
        Level level = Level.FINE;
        Map map = this.h;
        logger.logp(level, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        fbnv fbnvVar = fbnv.SHUTDOWN;
        this.m = fbnvVar;
        this.n = fbnvVar;
        e();
        fbtj fbtjVar = this.p;
        if (fbtjVar != null) {
            fbtjVar.a();
            this.p = null;
        }
        this.q = null;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((fcik) it.next()).a.b();
        }
        map.clear();
    }

    public final void e() {
        fbtj fbtjVar = this.l;
        if (fbtjVar != null) {
            fbtjVar.a();
            this.l = null;
        }
    }

    public final void f() {
        if (this.s && this.p == null) {
            if (this.q == null) {
                this.q = new fcdg();
            }
            long jA = this.q.a();
            fbqa fbqaVar = this.g;
            this.p = fbqaVar.c().a(new fcib(this), jA, TimeUnit.NANOSECONDS, fbqaVar.d());
        }
    }

    public final void g(fbnv fbnvVar, fbqg fbqgVar) {
        if (fbnvVar == this.n && (fbnvVar == fbnv.IDLE || fbnvVar == fbnv.CONNECTING)) {
            return;
        }
        this.n = fbnvVar;
        this.g.f(fbnvVar, fbqgVar);
    }

    public final void h(fcik fcikVar) {
        fbnv fbnvVar = fcikVar.b;
        fbnv fbnvVar2 = fbnv.READY;
        if (fbnvVar != fbnvVar2) {
            return;
        }
        if (this.o || fcikVar.a() == fbnvVar2) {
            g(fbnvVar2, new fbpz(fbqc.c(fcikVar.a)));
            return;
        }
        fbnv fbnvVarA = fcikVar.a();
        fbnv fbnvVar3 = fbnv.TRANSIENT_FAILURE;
        if (fbnvVarA == fbnvVar3) {
            g(fbnvVar3, new fcih(fbqc.b(fcikVar.d.b)));
        } else if (this.n != fbnvVar3) {
            g(fcikVar.a(), new fcih(fbqc.a));
        }
    }
}
