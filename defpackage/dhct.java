package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadRequest;
import com.google.android.rcs.client.messaging.data.FileInformation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhct implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        dhcf dhcfVar = new dhcf();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                dhcfVar.c(dclv.j(parcel, i));
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                dhcfVar.b((FileInformation) dclv.n(parcel, i, FileInformation.CREATOR));
            }
        }
        return dhcfVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FileDownloadRequest[i];
    }
}
