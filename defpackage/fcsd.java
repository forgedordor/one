package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcsd extends fbsl {
    final /* synthetic */ fcse a;
    private final fbsm b;
    private final fcsb c;
    private boolean d = true;
    private boolean e;
    private Object f;

    public fcsd(fcse fcseVar, fcsb fcsbVar, fbsm fbsmVar) {
        this.a = fcseVar;
        this.b = fbsmVar;
        this.c = fcsbVar;
    }

    @Override // defpackage.fbsl
    public final void a() {
        this.c.b = true;
    }

    @Override // defpackage.fbsl
    public final void c() {
        if (this.d) {
            Object obj = this.f;
            if (obj == null) {
                this.b.a(Status.o.withDescription("Half-closed without a request"), new fbrg());
                return;
            }
            fcse fcseVar = this.a;
            fcseVar.a.a(obj, this.c);
            this.f = null;
            if (this.e) {
                e();
            }
        }
    }

    @Override // defpackage.fbsl
    public final void d(Object obj) {
        if (this.f == null) {
            this.f = obj;
        } else {
            this.b.a(Status.o.withDescription("Too many requests"), new fbrg());
            this.d = false;
        }
    }

    @Override // defpackage.fbsl
    public final void e() {
        this.e = true;
    }

    @Override // defpackage.fbsl
    public final void b() {
    }
}
