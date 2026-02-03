package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fcsi {
    public final Object a;
    public final fbqi b;
    final /* synthetic */ fcsk e;
    public fbqg d = new fbpz(fbqc.a);
    public fbnv c = fbnv.CONNECTING;

    public fcsi(fcsk fcskVar, Object obj, fbpy fbpyVar) {
        this.e = fcskVar;
        this.a = obj;
        this.b = fbpyVar.a(a());
    }

    protected fcsh a() {
        return new fcsh(this);
    }

    protected final void b() {
        this.b.d();
        this.c = fbnv.SHUTDOWN;
        fcsk.f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer$ChildLbState", "shutdown", "Child balancer {0} deleted", this.a);
    }

    public final String toString() {
        return "Address = " + String.valueOf(this.a) + ", state = " + String.valueOf(this.c) + ", picker type: " + String.valueOf(this.d.getClass()) + ", lb: " + String.valueOf(this.b);
    }
}
