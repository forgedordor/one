package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddxy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iR = 3;
        Boolean boolO = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 3) {
                iR = dclv.r(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                boolO = dclv.o(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new PersonFieldMetadataEntity(iR, boolO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PersonFieldMetadataEntity[i];
    }
}
