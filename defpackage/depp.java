package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class depp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        String strT7 = null;
        int iF = 0;
        byte bA = 0;
        byte bA2 = 0;
        byte bA3 = 0;
        byte bA4 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    iF = dclv.f(parcel, i);
                    break;
                case 3:
                    strT = dclv.t(parcel, i);
                    break;
                case 4:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 5:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 6:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 7:
                    strT5 = dclv.t(parcel, i);
                    break;
                case 8:
                    strT6 = dclv.t(parcel, i);
                    break;
                case 9:
                    bA = dclv.a(parcel, i);
                    break;
                case 10:
                    bA2 = dclv.a(parcel, i);
                    break;
                case 11:
                    bA3 = dclv.a(parcel, i);
                    break;
                case 12:
                    bA4 = dclv.a(parcel, i);
                    break;
                case 13:
                    strT7 = dclv.t(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new AncsNotificationParcelable(iF, strT, strT2, strT3, strT4, strT5, strT6, bA, bA2, bA3, bA4, strT7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AncsNotificationParcelable[i];
    }
}
