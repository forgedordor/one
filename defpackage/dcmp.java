package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FieldMappingDictionary;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcmp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        int iF = 0;
        FastJsonResponse.Field field = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                field = (FastJsonResponse.Field) dclv.n(parcel, i, FastJsonResponse.Field.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new FieldMappingDictionary.FieldMapPair(iF, strT, field);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FieldMappingDictionary.FieldMapPair[i];
    }
}
