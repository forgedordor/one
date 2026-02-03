package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azku implements dqsj {
    @Override // defpackage.dqsj
    public final String a() {
        return "messages_backup";
    }

    @Override // defpackage.dqsj
    public final void b(dqsy dqsyVar) {
        dqsyVar.v(azlc.d(Alert.DURATION_SHOW_INDEFINITELY, "messages_backup"));
        for (String str : azlc.f(Alert.DURATION_SHOW_INDEFINITELY)) {
            dqsyVar.v(str);
        }
    }
}
