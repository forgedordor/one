package defpackage;

import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcle implements fcmb {
    public final fclf a;
    private final fbsl b;
    private final fbnz c;

    public fcle(fclf fclfVar, fbsl fbslVar, fbnz fbnzVar) {
        this.a = fclfVar;
        this.b = fbslVar;
        this.c = fbnzVar;
        fbnzVar.d(new fcld(this), eoqg.a);
    }

    @Override // defpackage.fcmb
    public final void a(Status status) {
        int i = fcsr.a;
        fclf fclfVar = this.a;
        fbps fbpsVar = null;
        try {
            if (status.f()) {
                this.b.b();
            } else {
                fclfVar.c = true;
                this.b.a();
                Status statusWithDescription = Status.c.withDescription("RPC cancelled");
                fbrb fbrbVar = fbpr.a;
                fbpsVar = new fbps(statusWithDescription);
            }
        } finally {
            this.c.j(null);
        }
    }

    @Override // defpackage.fcmb
    public final void b() {
        int i = fcsr.a;
        if (this.a.c) {
            return;
        }
        this.b.c();
    }

    @Override // defpackage.fcmp
    public final void d(fcmo fcmoVar) throws IOException {
        int i = fcsr.a;
        fclf fclfVar = this.a;
        if (fclfVar.c) {
            fcdy.g(fcmoVar);
            return;
        }
        while (true) {
            try {
                InputStream inputStreamG = fcmoVar.g();
                if (inputStreamG == null) {
                    return;
                }
                try {
                    this.b.d(fclfVar.a.d.b(inputStreamG));
                    inputStreamG.close();
                } finally {
                }
            } catch (Throwable th) {
                fcdy.g(fcmoVar);
                ejxy.e(th);
                throw new RuntimeException(th);
            }
        }
    }

    @Override // defpackage.fcmp
    public final void e() {
        int i = fcsr.a;
        if (this.a.c) {
            return;
        }
        this.b.e();
    }
}
