package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.ParcelableGeofence;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddpq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = -1;
        int iF2 = 0;
        short sA = 0;
        int iF3 = 0;
        long jI = 0;
        float fC = 0.0f;
        double dB = 0.0d;
        double dB2 = 0.0d;
        String strT = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    jI = dclv.i(parcel, i);
                    break;
                case 3:
                    sA = dclv.A(parcel, i);
                    break;
                case 4:
                    dB = dclv.b(parcel, i);
                    break;
                case 5:
                    dB2 = dclv.b(parcel, i);
                    break;
                case 6:
                    fC = dclv.c(parcel, i);
                    break;
                case 7:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 8:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 9:
                    iF = dclv.f(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new ParcelableGeofence(strT, iF2, sA, dB, dB2, fC, jI, iF3, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableGeofence[i];
    }
}
