package defpackage;

import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fclm implements fcmb {
    @Override // defpackage.fcmp
    public final void d(fcmo fcmoVar) throws IOException {
        while (true) {
            InputStream inputStreamG = fcmoVar.g();
            if (inputStreamG == null) {
                return;
            }
            try {
                inputStreamG.close();
            } catch (IOException e) {
                while (true) {
                    InputStream inputStreamG2 = fcmoVar.g();
                    if (inputStreamG2 == null) {
                        throw new RuntimeException(e);
                    }
                    try {
                        inputStreamG2.close();
                    } catch (IOException e2) {
                        fclv.b.logp(Level.WARNING, "io.grpc.internal.ServerImpl$NoopListener", "messagesAvailable", "Exception closing stream", (Throwable) e2);
                    }
                }
            }
        }
    }

    @Override // defpackage.fcmb
    public final void b() {
    }

    @Override // defpackage.fcmp
    public final void e() {
    }

    @Override // defpackage.fcmb
    public final void a(Status status) {
    }
}
