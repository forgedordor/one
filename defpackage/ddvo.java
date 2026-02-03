package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddvo extends AbstractContactsSyncServiceCallbacks {
    final /* synthetic */ defr a;

    public ddvo(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks, com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public final void onGetBackupAndSyncOptInState(Status status, BackupAndSyncOptInState backupAndSyncOptInState) {
        if (!status.d()) {
            dcjb.b(status, null, this.a);
            return;
        }
        int i = backupAndSyncOptInState.c;
        int i2 = ddvt.a;
        int i3 = 1;
        if (i != 1) {
            i3 = 2;
            if (i != 2) {
                i3 = i != 3 ? 0 : 3;
            }
        }
        dcjb.b(status, new DeviceContactsSyncSetting(i3, i3 == 3 ? new Account(backupAndSyncOptInState.a, "com.google") : null), this.a);
    }
}
