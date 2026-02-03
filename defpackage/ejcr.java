package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejcr {
    public final /* synthetic */ ejcz a;

    public ejcr(ejcz ejczVar) {
        this.a = ejczVar;
    }

    public final void a(smq smqVar) {
        smqVar.getClass();
        ejcz ejczVar = this.a;
        ekrw ekrwVarH = ejczVar.d.h();
        ekrwVarH.X(eksq.a, "BuglePenpal");
        ((ekrd) ekrwVarH.h("com/google/chat/smartmessaging/penpal/server/v3/PenpalOnDeviceClientImpl$downloadCallback$1", "onDownloadCompleted", 551, "PenpalOnDeviceClientImpl.kt")).r("Feature %d downloaded successfully", smqVar.a());
        ejcp ejcpVar = (ejcp) ejczVar.e.get();
        ejcpVar.e.g(false, true);
        ejcpVar.a();
    }

    public final void b(smq smqVar, int i, smo smoVar) {
        smqVar.getClass();
        ejcz ejczVar = this.a;
        ekrw ekrwVarI = ejczVar.d.i();
        ekrwVarI.X(eksq.a, "BuglePenpal");
        ((ekrd) ((ekrd) ekrwVarI).g(smoVar).h("com/google/chat/smartmessaging/penpal/server/v3/PenpalOnDeviceClientImpl$downloadCallback$1", "onDownloadFailed", 532, "PenpalOnDeviceClientImpl.kt")).u("Feature %d download failed: status = %s", smqVar.a(), i);
        if (i == 1) {
            ejcp ejcpVar = (ejcp) ejczVar.e.get();
            ejcpVar.b.g(false, true);
            Instant instantA = ejcpVar.a.a();
            instantA.getClass();
            ejcpVar.j = instantA;
            ejcpVar.a();
        }
        ((ejcp) ejczVar.e.get()).a();
    }

    public final void c(smq smqVar, long j) {
        smqVar.getClass();
        ejcz ejczVar = this.a;
        ekrw ekrwVarG = ejczVar.d.g();
        ekrwVarG.X(eksq.a, "BuglePenpal");
        ((ekrd) ekrwVarG.h("com/google/chat/smartmessaging/penpal/server/v3/PenpalOnDeviceClientImpl$downloadCallback$1", "onDownloadProgress", 542, "PenpalOnDeviceClientImpl.kt")).v("Feature %d download progress: %d bytes downloaded", smqVar.a(), j);
        ejcp ejcpVar = (ejcp) ejczVar.e.get();
        ejcpVar.d.f(Long.valueOf(j));
        ejcpVar.a();
    }

    public final void d(smq smqVar, long j) {
        smqVar.getClass();
        ejcz ejczVar = this.a;
        ekrw ekrwVarI = ejczVar.d.i();
        ekrwVarI.X(eksq.a, "BuglePenpal");
        ((ekrd) ekrwVarI.h("com/google/chat/smartmessaging/penpal/server/v3/PenpalOnDeviceClientImpl$downloadCallback$1", "onDownloadStarted", 516, "PenpalOnDeviceClientImpl.kt")).v("Feature %d not available; download started: size = %d bytes", smqVar.a(), j);
        ejcp ejcpVar = (ejcp) ejczVar.e.get();
        ejcpVar.c.f(Long.valueOf(j));
        ejcpVar.a();
    }
}
