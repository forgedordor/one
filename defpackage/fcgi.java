package defpackage;

import io.grpc.Status;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcgi extends fbrq {
    final fcgf a;
    final fbru b;
    final /* synthetic */ fcgx c;

    public fcgi(fcgx fcgxVar, fcgf fcgfVar, fbru fbruVar) {
        this.c = fcgxVar;
        this.a = fcgfVar;
        fbruVar.getClass();
        this.b = fbruVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01dd  */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fbrq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.grpc.Status a(defpackage.fbrs r19) throws defpackage.fbzt {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcgi.a(fbrs):io.grpc.Status");
    }

    @Override // defpackage.fbrq
    public final void b(Status status) {
        ejwl.b(!status.f(), "the error status must not be OK");
        this.c.m.execute(new fcgg(this, status));
    }

    @Override // defpackage.fbrq
    public final void c(fbrs fbrsVar) {
        this.c.m.execute(new fcgh(this, fbrsVar));
    }

    public final void d(Status status) {
        Logger logger = fcgx.a;
        Level level = Level.WARNING;
        fcgx fcgxVar = this.c;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{fcgxVar.h, status});
        fcgr fcgrVar = fcgxVar.J;
        if (fcgrVar.a.get() == fcgx.e) {
            fcgx fcgxVar2 = fcgrVar.c;
            fchk fchkVar = fcgxVar2.L;
            if (fchkVar != null) {
                fcgrVar.d(fchkVar.a());
                fcgxVar2.K = fchkVar;
                fcgxVar2.H.a(4, "Initial Name Resolution error, using default service config");
            } else {
                fcgrVar.d(null);
            }
        }
        if (fcgxVar.U != 3) {
            fcgxVar.H.b(3, "Failed to resolve name: {0}", status);
            fcgxVar.U = 3;
        }
        fcgf fcgfVar = this.a;
        if (fcgfVar != fcgxVar.u) {
            return;
        }
        fcgfVar.a.b.b(status);
    }
}
