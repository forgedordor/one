package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.ActivityRecognitionRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddnc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        WorkSource workSource = null;
        String strT = null;
        int[] iArrH = null;
        String strT2 = null;
        String strT3 = null;
        long jI = 0;
        long jI2 = 0;
        boolean zD = false;
        boolean zD2 = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    jI = dclv.i(parcel, i);
                    break;
                case 2:
                    zD = dclv.D(parcel, i);
                    break;
                case 3:
                    workSource = (WorkSource) dclv.n(parcel, i, WorkSource.CREATOR);
                    break;
                case 4:
                    strT = dclv.t(parcel, i);
                    break;
                case 5:
                    iArrH = dclv.H(parcel, i);
                    break;
                case 6:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 7:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 8:
                    jI2 = dclv.i(parcel, i);
                    break;
                case 9:
                    strT3 = dclv.t(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new ActivityRecognitionRequest(jI, zD, workSource, strT, iArrH, zD2, strT2, jI2, strT3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionRequest[i];
    }
}
