package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcid implements fbqh {
    public fcik a;
    final /* synthetic */ fcil b;

    public fcid(fcil fcilVar) {
        this.b = fcilVar;
    }

    @Override // defpackage.fbqh
    public final void a(fbnw fbnwVar) {
        fcil fcilVar = this.b;
        if (fcilVar.o) {
            fcil.f.logp(Level.WARNING, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Ignoring health status {0} for subchannel {1} as this is not under a petiole policy", new Object[]{fbnwVar, this.a.a});
            return;
        }
        fcil.f.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", new Object[]{fbnwVar, this.a.a});
        this.a.d = fbnwVar;
        fcif fcifVar = fcilVar.i;
        if (fcifVar.f() && this.a == fcilVar.h.get(fcifVar.b())) {
            fcilVar.h(this.a);
        }
    }
}
