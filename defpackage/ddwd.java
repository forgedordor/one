package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.contactssync.model.BackupSyncContactInfo;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddwd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        int iF = 0;
        BackupSyncContactInfo backupSyncContactInfo = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                backupSyncContactInfo = (BackupSyncContactInfo) dclv.n(parcel, i, BackupSyncContactInfo.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new GetBackupSyncSuggestionResponse(iF, strT, backupSyncContactInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetBackupSyncSuggestionResponse[i];
    }
}
