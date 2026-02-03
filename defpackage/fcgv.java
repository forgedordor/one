package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcgv extends fbzk {
    final fbpx a;
    final fbpn b;
    final fcac c;
    final fcad d;
    List e;
    fcfd f;
    boolean g;
    boolean h;
    fbtj i;
    final /* synthetic */ fcgx j;

    public fcgv(fcgx fcgxVar, fbpx fbpxVar) {
        this.j = fcgxVar;
        this.e = fbpxVar.a;
        this.a = fbpxVar;
        fbpn fbpnVarB = fbpn.b("Subchannel", fcgxVar.b());
        this.b = fbpnVarB;
        fcad fcadVar = new fcad(fbpnVarB, fcgxVar.l.a(), "Subchannel for ".concat(fbpxVar.a.toString()));
        this.d = fcadVar;
        this.c = new fcac(fcadVar, fcgxVar.l);
    }

    @Override // defpackage.fbqf
    public final void a() {
        this.j.m.d();
        ejwl.m(this.g, "not started");
        this.f.a();
    }

    @Override // defpackage.fbqf
    public final void b() {
        fbtj fbtjVar;
        fcgx fcgxVar = this.j;
        fbtk fbtkVar = fcgxVar.m;
        fbtkVar.d();
        if (this.f == null) {
            this.h = true;
            return;
        }
        if (!this.h) {
            this.h = true;
        } else {
            if (!fcgxVar.C || (fbtjVar = this.i) == null) {
                return;
            }
            fbtjVar.a();
            this.i = null;
        }
        if (fcgxVar.C) {
            this.f.g(fcgx.b);
        } else {
            this.i = fbtkVar.a(new fcfl(new fcgu(this)), 5L, TimeUnit.SECONDS, fcgxVar.i.c());
        }
    }

    @Override // defpackage.fbqf
    public final void c(fbqh fbqhVar) {
        fcgx fcgxVar = this.j;
        fbtk fbtkVar = fcgxVar.m;
        fbtkVar.d();
        ejwl.m(!this.g, "already started");
        ejwl.m(!this.h, "already shutdown");
        ejwl.m(!fcgxVar.C, "Channel is being terminated");
        this.g = true;
        String strB = fcgxVar.b();
        fcas fcasVar = fcgxVar.i;
        ScheduledExecutorService scheduledExecutorServiceC = fcasVar.c();
        fcgt fcgtVar = new fcgt(this, fbqhVar);
        fbpi fbpiVar = fcgxVar.I;
        fcfd fcfdVar = new fcfd(this.a, strB, fcgxVar.r, fcasVar, scheduledExecutorServiceC, fbtkVar, fcgtVar, fbpiVar, fcgxVar.E.a(), this.b, this.c, fcgxVar.q);
        fbpe fbpeVar = new fbpe();
        fbpeVar.a = "Child Subchannel started";
        fbpeVar.b = fbpf.CT_INFO;
        fbpeVar.b(fcgxVar.l.a());
        fbpeVar.c = fcfdVar;
        fcgxVar.G.b(fbpeVar.a());
        this.f = fcfdVar;
        fbpi.b(fbpiVar.e, fcfdVar);
        fcgxVar.w.add(fcfdVar);
    }

    @Override // defpackage.fbqf
    public final void d(List list) {
        this.j.m.d();
        this.e = list;
        fcfd fcfdVar = this.f;
        list.getClass();
        fcfd.j(list);
        ejwl.b(!list.isEmpty(), "newAddressGroups is empty");
        fcfdVar.g.execute(new fcep(fcfdVar, DesugarCollections.unmodifiableList(new ArrayList(list))));
    }

    public final String toString() {
        return this.b.toString();
    }
}
