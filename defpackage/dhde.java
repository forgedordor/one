package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhde implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        dhcl dhclVar = new dhcl();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                dhclVar.b(dclv.t(parcel, i));
            }
        }
        return dhclVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PauseDownloadRequest[i];
    }
}
