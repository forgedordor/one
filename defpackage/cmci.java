package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmci implements dqsj {
    @Override // defpackage.dqsj
    public final String a() {
        return "scheduled_send";
    }

    @Override // defpackage.dqsj
    public final void b(dqsy dqsyVar) {
        ScheduledSendTable.e(dqsyVar, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
