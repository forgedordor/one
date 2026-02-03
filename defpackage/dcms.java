package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import com.google.android.gms.common.server.response.SafeParcelResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcms implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Parcel parcelM = null;
        int iF = 0;
        FieldMappingDictionary fieldMappingDictionary = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                parcelM = dclv.m(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                fieldMappingDictionary = (FieldMappingDictionary) dclv.n(parcel, i, FieldMappingDictionary.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new SafeParcelResponse(iF, parcelM, fieldMappingDictionary);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
