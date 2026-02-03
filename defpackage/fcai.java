package defpackage;

import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcai extends fcbf {
    final /* synthetic */ fcmo a;
    final /* synthetic */ fcal b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcai(fcal fcalVar, fcmo fcmoVar) {
        super(fcalVar.c.e);
        this.a = fcmoVar;
        this.b = fcalVar;
    }

    @Override // defpackage.fcbf
    public final void a() throws IOException {
        int i = fcsr.a;
        fcal fcalVar = this.b;
        fcam fcamVar = fcalVar.c;
        if (fcalVar.b != null) {
            fcdy.g(this.a);
            return;
        }
        while (true) {
            try {
                InputStream inputStreamG = this.a.g();
                if (inputStreamG == null) {
                    return;
                }
                try {
                    fcalVar.a.c(fcamVar.b.e.b(inputStreamG));
                    inputStreamG.close();
                } catch (Throwable th) {
                    fcdy.h(inputStreamG);
                    throw th;
                }
            } catch (Throwable th2) {
                fcdy.g(this.a);
                this.b.b(Status.c.d(th2).withDescription("Failed to read message."));
                return;
            }
        }
    }
}
