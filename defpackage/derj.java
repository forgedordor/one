package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.DataItemParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class derj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Uri uri = null;
        Bundle bundleK = null;
        byte[] bArrE = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                uri = (Uri) dclv.n(parcel, i, Uri.CREATOR);
            } else if (iD == 4) {
                bundleK = dclv.k(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                bArrE = dclv.E(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new DataItemParcelable(uri, bundleK, bArrE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataItemParcelable[i];
    }
}
