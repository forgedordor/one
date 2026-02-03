package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.GetConfigsResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dery implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ConnectionConfiguration[] connectionConfigurationArr = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                iF = dclv.f(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                connectionConfigurationArr = (ConnectionConfiguration[]) dclv.J(parcel, i, ConnectionConfiguration.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new GetConfigsResponse(iF, connectionConfigurationArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetConfigsResponse[i];
    }
}
