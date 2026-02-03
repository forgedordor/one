package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bobx implements dqsj {
    @Override // defpackage.dqsj
    public final String a() {
        return "conversation_participants";
    }

    @Override // defpackage.dqsj
    public final void b(dqsy dqsyVar) {
        dqsyVar.v(bocg.e(Alert.DURATION_SHOW_INDEFINITELY, "conversation_participants"));
        for (String str : bocg.h()) {
            dqsyVar.v(str);
        }
    }
}
