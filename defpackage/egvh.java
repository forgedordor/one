package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egvh {
    private final ejwi a;

    public egvh(ejwi ejwiVar) {
        this.a = ejwiVar;
    }

    public final fcyh a(ScheduledExecutorService scheduledExecutorService) {
        fcyh fcyhVarPlus;
        Boolean bool = true;
        bool.getClass();
        if (((Boolean) this.a.e(false)).booleanValue()) {
            fcyhVarPlus = new fdlh(new egwb(scheduledExecutorService)).plus(egvt.a);
        } else {
            egvq egvqVar = new egvq(scheduledExecutorService);
            fcyhVarPlus = new fdlh(egvqVar).plus(egvqVar);
        }
        return fcyhVarPlus.plus(eiiw.b(null, 3));
    }
}
