package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest;
import com.google.android.rcs.client.messaging.data.FileInformation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhdi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        dhcp dhcpVar = new dhcp();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                dhcpVar.d(dclv.j(parcel, i));
            } else if (iD == 2) {
                dhcpVar.b(dclv.t(parcel, i));
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                dhcpVar.c((FileInformation) dclv.n(parcel, i, FileInformation.CREATOR));
            }
        }
        return dhcpVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ResumeDownloadRequest[i];
    }
}
