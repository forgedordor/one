package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fckv extends fbrq {
    final /* synthetic */ fckw a;
    private final fbrq b;

    public fckv(fckw fckwVar, fbrq fbrqVar) {
        this.a = fckwVar;
        this.b = fbrqVar;
    }

    @Override // defpackage.fbrq
    public final Status a(fbrs fbrsVar) {
        Status statusA = this.b.a(fbrsVar);
        if (statusA.f()) {
            this.a.c.a();
            return statusA;
        }
        fckw fckwVar = this.a;
        fckwVar.c.b(new fcks(fckwVar));
        return statusA;
    }

    @Override // defpackage.fbrq
    public final void b(Status status) {
        this.b.b(status);
        this.a.d.execute(new Runnable() { // from class: fcku
            @Override // java.lang.Runnable
            public final void run() {
                fckw fckwVar = this.a.a;
                fckwVar.c.b(new fcks(fckwVar));
            }
        });
    }

    @Override // defpackage.fbrq
    public final void c(fbrs fbrsVar) {
        fbmw fbmwVar = fbrsVar.b;
        fbmv fbmvVar = fckw.b;
        if (fbmwVar.a(fbmvVar) != null) {
            throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
        }
        fbrq fbrqVar = this.b;
        fbrr fbrrVar = new fbrr();
        fbrrVar.b(fbrsVar.a);
        fbrrVar.a = fbmwVar;
        fbrrVar.b = fbrsVar.c;
        fbmu fbmuVar = new fbmu(fbmwVar);
        fbmuVar.b(fbmvVar, new fckt(this.a));
        fbrrVar.a = fbmuVar.a();
        fbrqVar.c(fbrrVar.a());
    }
}
