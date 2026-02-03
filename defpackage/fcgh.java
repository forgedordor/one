package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcgh implements Runnable {
    final /* synthetic */ fbrs a;
    final /* synthetic */ fcgi b;

    public fcgh(fcgi fcgiVar, fbrs fbrsVar) {
        this.a = fbrsVar;
        this.b = fcgiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcgi fcgiVar = this.b;
        fbrs fbrsVar = this.a;
        fbmw fbmwVar = fbrsVar.b;
        Status statusA = fcgiVar.a(fbrsVar);
        fckt fcktVar = (fckt) fbmwVar.a(fckw.b);
        if (statusA.f()) {
            fcktVar.a.c.a();
        } else {
            fckw fckwVar = fcktVar.a;
            fckwVar.c.b(new fcks(fckwVar));
        }
    }
}
