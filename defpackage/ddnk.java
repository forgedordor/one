package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.DeviceOrientation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddnk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        float fC = 0.0f;
        float fC2 = 0.0f;
        float fC3 = 0.0f;
        float fC4 = 0.0f;
        byte bA = 0;
        long jI = 0;
        float[] fArrG = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD != 1) {
                switch (iD) {
                    case 4:
                        fC = dclv.c(parcel, i);
                        break;
                    case 5:
                        fC2 = dclv.c(parcel, i);
                        break;
                    case 6:
                        jI = dclv.i(parcel, i);
                        break;
                    case 7:
                        bA = dclv.a(parcel, i);
                        break;
                    case 8:
                        fC3 = dclv.c(parcel, i);
                        break;
                    case 9:
                        fC4 = dclv.c(parcel, i);
                        break;
                    default:
                        dclv.C(parcel, i);
                        break;
                }
            } else {
                fArrG = dclv.G(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new DeviceOrientation(fArrG, fC, fC2, jI, bA, fC3, fC4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientation[i];
    }
}
