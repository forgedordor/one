package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.reporting.ReportingState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddpx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        int iF2 = 0;
        boolean zD = false;
        boolean zD2 = false;
        int iF3 = 0;
        int iF4 = 0;
        boolean zD3 = false;
        boolean zD4 = false;
        Integer numR = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    iF = dclv.f(parcel, i);
                    break;
                case 3:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 4:
                    zD = dclv.D(parcel, i);
                    break;
                case 5:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 6:
                default:
                    dclv.C(parcel, i);
                    break;
                case 7:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 8:
                    numR = dclv.r(parcel, i);
                    break;
                case 9:
                    iF4 = dclv.f(parcel, i);
                    break;
                case 10:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 11:
                    zD4 = dclv.D(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new ReportingState(iF, iF2, zD, zD2, iF3, iF4, numR, zD3, zD4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ReportingState[i];
    }
}
