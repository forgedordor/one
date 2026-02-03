package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        int iF4 = 0;
        int iF5 = 0;
        int iF6 = 0;
        ArrayList arrayListZ = null;
        IBinder iBinderL = null;
        IBinder iBinderL2 = null;
        ArrayList arrayListZ2 = null;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        float fC = 0.0f;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    arrayListZ = dclv.z(parcel, i, shd.CREATOR);
                    break;
                case 2:
                    fC = dclv.c(parcel, i);
                    break;
                case 3:
                    iF = dclv.f(parcel, i);
                    break;
                case 4:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 5:
                    iBinderL = dclv.l(parcel, i);
                    break;
                case 6:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 7:
                    iBinderL2 = dclv.l(parcel, i);
                    break;
                case 8:
                    arrayListZ2 = dclv.z(parcel, i, ParcelFileDescriptor.CREATOR);
                    break;
                case 9:
                    iF4 = dclv.f(parcel, i);
                    break;
                case 10:
                    iF5 = dclv.f(parcel, i);
                    break;
                case 11:
                    strT = dclv.t(parcel, i);
                    break;
                case 12:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 13:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 14:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 15:
                    iF6 = dclv.f(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new shh(arrayListZ, fC, iF, iF2, iBinderL, iF3, iBinderL2, arrayListZ2, iF4, iF5, strT, strT2, strT3, strT4, iF6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new shh[i];
    }
}
