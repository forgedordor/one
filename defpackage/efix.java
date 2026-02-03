package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efix implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efho efhoVar = new efho();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efhoVar.c((FileInformation) dclv.n(parcel, i, FileInformation.CREATOR));
            } else if (iD == 2) {
                efhoVar.e((FileInformation) dclv.n(parcel, i, FileInformation.CREATOR));
            } else if (iD == 3) {
                efhoVar.b(evqs.x(dclv.E(parcel, i)));
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                efhoVar.d(evqs.x(dclv.E(parcel, i)));
            }
        }
        return efhoVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FileTransferInformation[i];
    }
}
