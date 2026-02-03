package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.people.data.AudienceMember;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcmj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        Bundle bundleK = null;
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD != 1000) {
                switch (iD) {
                    case 1:
                        iF2 = dclv.f(parcel, i);
                        break;
                    case 2:
                        iF3 = dclv.f(parcel, i);
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
                        bundleK = dclv.k(parcel, i);
                        break;
                    default:
                        dclv.C(parcel, i);
                        break;
                }
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new AudienceMember(iF, iF2, iF3, strT, strT2, strT3, strT4, bundleK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AudienceMember[i];
    }
}
