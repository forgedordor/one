package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsbj implements dqsj {
    @Override // defpackage.dqsj
    public final String a() {
        return "participants";
    }

    @Override // defpackage.dqsj
    public final void b(dqsy dqsyVar) {
        dqsyVar.v(ParticipantsTable.m(Alert.DURATION_SHOW_INDEFINITELY, "participants"));
        for (String str : ParticipantsTable.o(Alert.DURATION_SHOW_INDEFINITELY)) {
            dqsyVar.v(str);
        }
    }
}
