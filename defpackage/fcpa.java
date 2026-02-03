package defpackage;

import io.grpc.Status;
import java.io.EOFException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcpa extends fceb implements fcpt {
    public static final /* synthetic */ int z = 0;
    private final int A;
    private int B;
    private int C;
    public final Object a;
    public List b;
    public final ffez c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final fcoo g;
    public final fcpx h;
    public final fcpj i;
    public boolean u;
    public final fcss v;
    public fcpu w;
    public int x;
    final /* synthetic */ fcpb y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcpa(fcpb fcpbVar, int i, fcmm fcmmVar, Object obj, fcoo fcooVar, fcpx fcpxVar, fcpj fcpjVar, int i2) {
        super(i, fcmmVar, fcpbVar.r);
        this.y = fcpbVar;
        this.c = new ffez();
        this.d = false;
        this.e = false;
        this.f = false;
        this.u = true;
        this.x = -1;
        this.a = obj;
        this.g = fcooVar;
        this.h = fcpxVar;
        this.i = fcpjVar;
        this.B = i2;
        this.C = i2;
        this.A = i2;
        int i3 = fcsr.a;
        this.v = fcsq.a;
    }

    @Override // defpackage.fchn
    public final void a(int i) {
        int i2 = this.C - i;
        this.C = i2;
        int i3 = this.A;
        if (i2 <= i3 * 0.5f) {
            int i4 = i3 - i2;
            this.B += i4;
            this.C = i2 + i4;
            this.g.h(this.x, i4);
        }
    }

    @Override // defpackage.fchn
    public final void b(Throwable th) throws EOFException {
        r(Status.c(th), true, new fbrg());
    }

    @Override // defpackage.fceb
    protected final void c(Status status, boolean z2, fbrg fbrgVar) throws EOFException {
        r(status, false, fbrgVar);
    }

    @Override // defpackage.fbzi
    protected final void d() {
        super.d();
        fcmu fcmuVar = this.q;
        fcmuVar.c++;
        fcmuVar.b.a();
    }

    @Override // defpackage.fbzl
    public final void e(Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }

    final fcpu f() {
        fcpu fcpuVar;
        synchronized (this.a) {
            fcpuVar = this.w;
        }
        return fcpuVar;
    }

    @Override // defpackage.fbze, defpackage.fchn
    public final void i(boolean z2) {
        if (this.m) {
            this.i.h(this.x, null, fcao.PROCESSED, false, null, null);
        } else {
            this.i.h(this.x, null, fcao.PROCESSED, false, fcqp.CANCEL, null);
        }
        super.i(z2);
    }

    public final void r(Status status, boolean z2, fbrg fbrgVar) throws EOFException {
        if (this.f) {
            return;
        }
        this.f = true;
        if (!this.u) {
            this.i.h(this.x, status, fcao.PROCESSED, z2, fcqp.CANCEL, fbrgVar);
            return;
        }
        fcpj fcpjVar = this.i;
        fcpb fcpbVar = this.y;
        fcpjVar.A.remove(fcpbVar);
        fcpjVar.i(fcpbVar);
        this.b = null;
        this.c.B();
        this.u = false;
        if (fbrgVar == null) {
            fbrgVar = new fbrg();
        }
        j(status, true, fbrgVar);
    }

    public final void s(ffez ffezVar, boolean z2, int i) {
        int i2 = this.B - (((int) ffezVar.b) + i);
        this.B = i2;
        this.C -= i;
        if (i2 >= 0) {
            super.o(new fcpp(ffezVar), z2);
        } else {
            this.g.f(this.x, fcqp.FLOW_CONTROL_ERROR);
            this.i.h(this.x, Status.o.withDescription("Received data size exceeded our receiving window size"), fcao.PROCESSED, false, null, null);
        }
    }
}
