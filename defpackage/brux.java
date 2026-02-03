package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brux implements dqsj {
    @Override // defpackage.dqsj
    public final String a() {
        return "participants_audit_log";
    }

    @Override // defpackage.dqsj
    public final void b(dqsy dqsyVar) {
        dqsyVar.v(brvd.d(Alert.DURATION_SHOW_INDEFINITELY, "participants_audit_log"));
        for (String str : brvd.e(Alert.DURATION_SHOW_INDEFINITELY)) {
            dqsyVar.v(str);
        }
    }
}
