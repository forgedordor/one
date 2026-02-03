package defpackage;

import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aihu implements cldt, cldy {
    private final fcsu a;
    private final fcsu b;

    public aihu(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    @Override // defpackage.cldt
    public final void b() {
        if (((Boolean) clpp.a.e()).booleanValue()) {
            cmcx cmcxVar = (cmcx) this.b.b();
            String[] strArr = ScheduledSendTable.a;
            cmcs cmcsVar = new cmcs();
            cmcsVar.d(cmct.SENDING);
            cmcxVar.f(new cmcr(cmcsVar), cmct.SCHEDULED).k(auvh.b(), (Executor) this.a.b());
        }
    }

    @Override // defpackage.cldy
    public final void c() {
        if (((Boolean) clpp.a.e()).booleanValue()) {
            ((cmcx) this.b.b()).e().k(auvh.b(), (Executor) this.a.b());
        }
    }
}
