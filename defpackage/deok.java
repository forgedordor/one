package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.PutDataRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deok implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        long jI = 0;
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
            } else if (iD == 5) {
                bArrE = dclv.E(parcel, i);
            } else if (iD != 6) {
                dclv.C(parcel, i);
            } else {
                jI = dclv.i(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new PutDataRequest(uri, bundleK, bArrE, jI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PutDataRequest[i];
    }
}
