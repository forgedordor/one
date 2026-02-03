package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Response;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deba implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Status status = null;
        String[] strArrK = null;
        String[] strArrK2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                status = (Status) dclv.n(parcel, i, Status.CREATOR);
            } else if (iD == 2) {
                strArrK = dclv.K(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                strArrK2 = dclv.K(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new GetAppIndexingPackagesCall$Response(status, strArrK, strArrK2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetAppIndexingPackagesCall$Response[i];
    }
}
