package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dckg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Bundle bundleK = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int iF = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                bundleK = dclv.k(parcel, i);
            } else if (iD == 2) {
                featureArr = (Feature[]) dclv.J(parcel, i, Feature.CREATOR);
            } else if (iD == 3) {
                iF = dclv.f(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) dclv.n(parcel, i, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new ConnectionInfo(bundleK, featureArr, iF, connectionTelemetryConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionInfo[i];
    }
}
