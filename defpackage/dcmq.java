package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcmq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListZ = null;
        int iF = 0;
        String strT = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                arrayListZ = dclv.z(parcel, i, FieldMappingDictionary.Entry.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                strT = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new FieldMappingDictionary(iF, arrayListZ, strT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FieldMappingDictionary[i];
    }
}
