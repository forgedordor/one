package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bosw implements dqsj {
    @Override // defpackage.dqsj
    public final String a() {
        return "conversations";
    }

    @Override // defpackage.dqsj
    public final void b(dqsy dqsyVar) {
        dqsyVar.v(botm.l(Alert.DURATION_SHOW_INDEFINITELY, "conversations"));
        for (String str : botm.n(Alert.DURATION_SHOW_INDEFINITELY)) {
            dqsyVar.v(str);
        }
    }
}
