package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahze implements Runnable {
    final /* synthetic */ ahzi a;
    final /* synthetic */ UUID b;
    final /* synthetic */ aiad c;
    final /* synthetic */ szu d;

    public ahze(ahzi ahziVar, UUID uuid, aiad aiadVar, szu szuVar) {
        this.a = ahziVar;
        this.b = uuid;
        this.c = aiadVar;
        this.d = szuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ahzi ahziVar = this.a;
        fcsu fcsuVar = ahziVar.b;
        ahwd ahwdVar = (ahwd) fcsuVar.b();
        UUID uuid = this.b;
        ahwdVar.u(uuid, this.c);
        szu szuVar = this.d;
        boolean z = szuVar.d > 150;
        ahzu ahzuVar = ahziVar.o;
        ahzuVar.h("Backup database schema out of date: %s", Boolean.valueOf(z));
        boolean z2 = szuVar.e > 5;
        ahzuVar.h("Restore workflow version out of date: %s", Boolean.valueOf(z2));
        if (!((apve) ahziVar.h.b()).a() || (!z && !z2)) {
            ((aibb) ahziVar.c.b()).c(uuid, 5);
        } else {
            ahzuVar.i("App update needed for restore: workflowVersion: [%s] sessionId: [%s]", 5, uuid);
            ((ahwd) fcsuVar.b()).w(uuid, aiaf.WAITING_ON_APP_UPDATE);
        }
    }
}
