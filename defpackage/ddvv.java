package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddvv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                zD = dclv.D(parcel, i);
            } else if (iD == 2) {
                zD2 = dclv.D(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                zD3 = dclv.D(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new BackupAndSyncOptInOptions(zD, zD2, zD3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BackupAndSyncOptInOptions[i];
    }
}
