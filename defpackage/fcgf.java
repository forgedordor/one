package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcgf extends fbqa {
    fbzp a;
    final /* synthetic */ fcgx b;

    public fcgf(fcgx fcgxVar) {
        this.b = fcgxVar;
    }

    @Override // defpackage.fbqa
    public final fbnf a() {
        return this.b.H;
    }

    @Override // defpackage.fbqa
    public final /* bridge */ /* synthetic */ fbqf b(fbpx fbpxVar) {
        fcgx fcgxVar = this.b;
        fcgxVar.m.d();
        ejwl.m(!fcgxVar.C, "Channel is being terminated");
        return new fcgv(fcgxVar, fbpxVar);
    }

    @Override // defpackage.fbqa
    public final fbtk c() {
        return this.b.m;
    }

    @Override // defpackage.fbqa
    public final ScheduledExecutorService d() {
        return this.b.j;
    }

    @Override // defpackage.fbqa
    public final void e() {
        fbtk fbtkVar = this.b.m;
        fbtkVar.d();
        fbtkVar.execute(new fcge(this));
    }

    @Override // defpackage.fbqa
    public final void f(fbnv fbnvVar, fbqg fbqgVar) {
        fcgx fcgxVar = this.b;
        fcgxVar.m.d();
        fbnvVar.getClass();
        if (this != fcgxVar.u || fcgxVar.v) {
            return;
        }
        fcgxVar.o(fbqgVar);
        if (fbnvVar != fbnv.SHUTDOWN) {
            fcgxVar.H.b(2, "Entering {0} state with picker: {1}", fbnvVar, fbqgVar);
            fcgxVar.p.a(fbnvVar);
        }
    }
}
