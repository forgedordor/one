package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LocationRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddnw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        WorkSource workSource = new WorkSource();
        ClientIdentity clientIdentity = null;
        boolean zD = false;
        int iF = 0;
        int iF2 = 0;
        boolean zD2 = false;
        long jI = -1;
        float fC = 0.0f;
        int iF3 = Integer.MAX_VALUE;
        long jI2 = Long.MAX_VALUE;
        long jI3 = Long.MAX_VALUE;
        long jI4 = 0;
        long jI5 = 600000;
        long jI6 = 3600000;
        int iF4 = 102;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF4 = dclv.f(parcel, i);
                    break;
                case 2:
                    jI6 = dclv.i(parcel, i);
                    break;
                case 3:
                    jI5 = dclv.i(parcel, i);
                    break;
                case 4:
                case 14:
                default:
                    dclv.C(parcel, i);
                    break;
                case 5:
                    jI2 = dclv.i(parcel, i);
                    break;
                case 6:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 7:
                    fC = dclv.c(parcel, i);
                    break;
                case 8:
                    jI4 = dclv.i(parcel, i);
                    break;
                case 9:
                    zD = dclv.D(parcel, i);
                    break;
                case 10:
                    jI3 = dclv.i(parcel, i);
                    break;
                case 11:
                    jI = dclv.i(parcel, i);
                    break;
                case 12:
                    iF = dclv.f(parcel, i);
                    break;
                case 13:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 15:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 16:
                    workSource = (WorkSource) dclv.n(parcel, i, WorkSource.CREATOR);
                    break;
                case 17:
                    clientIdentity = (ClientIdentity) dclv.n(parcel, i, ClientIdentity.CREATOR);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new LocationRequest(iF4, jI6, jI5, jI4, jI2, jI3, iF3, fC, zD, jI, iF, iF2, zD2, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
