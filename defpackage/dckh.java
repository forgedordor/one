package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dckh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArrH = null;
        int[] iArrH2 = null;
        boolean zD = false;
        boolean zD2 = false;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) dclv.n(parcel, i, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    zD = dclv.D(parcel, i);
                    break;
                case 3:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 4:
                    iArrH = dclv.H(parcel, i);
                    break;
                case 5:
                    iF = dclv.f(parcel, i);
                    break;
                case 6:
                    iArrH2 = dclv.H(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zD, zD2, iArrH, iF, iArrH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
