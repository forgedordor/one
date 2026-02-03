package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.telephonyspam.SpamLookupResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        int iF4 = 0;
        int iF5 = 0;
        int iF6 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 3:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 4:
                    iF4 = dclv.f(parcel, i);
                    break;
                case 5:
                    iF5 = dclv.f(parcel, i);
                    break;
                case 6:
                    iF6 = dclv.f(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new SpamLookupResult(iF, iF2, iF3, iF4, iF5, iF6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SpamLookupResult[i];
    }
}
