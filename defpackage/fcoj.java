package defpackage;

import java.io.IOException;
import java.net.Socket;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcoj implements Runnable {
    final /* synthetic */ fcom a;

    public fcoj(fcom fcomVar) {
        this.a = fcomVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            fcom fcomVar = this.a;
            fffz fffzVar = fcomVar.f;
            if (fffzVar != null) {
                ffez ffezVar = fcomVar.b;
                long j = ffezVar.b;
                if (j > 0) {
                    fffzVar.hO(ffezVar, j);
                }
            }
        } catch (IOException e) {
            this.a.c.a(e);
        }
        try {
            fffz fffzVar2 = this.a.f;
            if (fffzVar2 != null) {
                fffzVar2.close();
            }
        } catch (IOException e2) {
            this.a.c.a(e2);
        }
        try {
            Socket socket = this.a.g;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e3) {
            this.a.c.a(e3);
        }
    }
}
