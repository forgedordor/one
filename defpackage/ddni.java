package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.CurrentLocationRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddni implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        WorkSource workSource = new WorkSource();
        ClientIdentity clientIdentity = null;
        int iF = 0;
        boolean zD = false;
        int iF2 = 0;
        long jI = Long.MAX_VALUE;
        long jI2 = Long.MAX_VALUE;
        int iF3 = 102;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    jI = dclv.i(parcel, i);
                    break;
                case 2:
                    iF = dclv.f(parcel, i);
                    break;
                case 3:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 4:
                    jI2 = dclv.i(parcel, i);
                    break;
                case 5:
                    zD = dclv.D(parcel, i);
                    break;
                case 6:
                    workSource = (WorkSource) dclv.n(parcel, i, WorkSource.CREATOR);
                    break;
                case 7:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 8:
                default:
                    dclv.C(parcel, i);
                    break;
                case 9:
                    clientIdentity = (ClientIdentity) dclv.n(parcel, i, ClientIdentity.CREATOR);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new CurrentLocationRequest(jI, iF, iF3, jI2, zD, iF2, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CurrentLocationRequest[i];
    }
}
