package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhcy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        FileTransferResult fileTransferResult = FileTransferResult.a;
        dhcj dhcjVar = new dhcj();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) == 1) {
                dhcjVar.b((dhda) efkv.b(parcel, i, dhda.class));
            } else {
                dclv.C(parcel, i);
            }
        }
        return dhcjVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FileTransferResult[i];
    }
}
