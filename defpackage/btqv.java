package defpackage;

import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btqv extends dqye {
    public btqv() {
        super("restore_workflow_executions");
    }

    public final boolean a(Optional optional) {
        String[] strArr = btqy.a;
        btqx btqxVar = new btqx();
        btqxVar.b(optional);
        return aj(new btqw(btqxVar), "restore_workflow_executions-buildAndUpdateForSessionId");
    }

    @Override // defpackage.dqye
    public final /* bridge */ /* synthetic */ dqyd b() {
        ah();
        return new btqu(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(aiaf aiafVar) {
        if (aiafVar == null) {
            this.a.putNull("status");
        } else {
            this.a.put("status", Integer.valueOf(aiafVar.q));
        }
    }

    public final void d(Instant instant) {
        int iIntValue = btqy.c().intValue();
        int iIntValue2 = btqy.c().intValue();
        if (iIntValue2 < 60220) {
            dqru.x("status_timestamp", iIntValue2);
        }
        if (iIntValue >= 60220) {
            if (instant == null) {
                this.a.putNull("status_timestamp");
            } else {
                this.a.put("status_timestamp", Long.valueOf(bart.a(instant)));
            }
        }
    }
}
