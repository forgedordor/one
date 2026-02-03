package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhdk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        dhcr dhcrVar = new dhcr();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                dhcrVar.b((FileTransferResult) dclv.n(parcel, i, FileTransferResult.CREATOR));
            }
        }
        return dhcrVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ResumeDownloadResult[i];
    }
}
