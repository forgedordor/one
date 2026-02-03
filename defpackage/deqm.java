package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AccountConsentRecordParcelable;
import com.google.android.gms.wearable.internal.ConsentResponse;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deqm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListZ = null;
        String strT = null;
        Long lS = null;
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        boolean zD4 = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    zD = dclv.D(parcel, i);
                    break;
                case 3:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 4:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 5:
                    zD4 = dclv.D(parcel, i);
                    break;
                case 6:
                    arrayListZ = dclv.z(parcel, i, AccountConsentRecordParcelable.CREATOR);
                    break;
                case 7:
                    strT = dclv.t(parcel, i);
                    break;
                case 8:
                    lS = dclv.s(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new ConsentResponse(iF, zD, zD2, zD3, zD4, arrayListZ, strT, lS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConsentResponse[i];
    }
}
