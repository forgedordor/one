package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsuk implements dqsj {
    @Override // defpackage.dqsj
    public final String a() {
        return "profiles_table";
    }

    @Override // defpackage.dqsj
    public final void b(dqsy dqsyVar) {
        ProfilesTable.e(dqsyVar, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
