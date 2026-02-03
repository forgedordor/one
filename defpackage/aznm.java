package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aznm implements dqsj {
    @Override // defpackage.dqsj
    public final String a() {
        return "parts_backup";
    }

    @Override // defpackage.dqsj
    public final void b(dqsy dqsyVar) {
        dqsyVar.v(azns.d(Alert.DURATION_SHOW_INDEFINITELY, "parts_backup"));
        for (String str : azns.f()) {
            dqsyVar.v(str);
        }
    }
}
