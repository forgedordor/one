package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhdg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        dhcn dhcnVar = new dhcn();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                dhcnVar.b((FileTransferResult) dclv.n(parcel, i, FileTransferResult.CREATOR));
            }
        }
        return dhcnVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PauseDownloadResult[i];
    }
}
