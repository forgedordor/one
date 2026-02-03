package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.NameEntity;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddxw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        PersonFieldMetadataEntity personFieldMetadataEntity = null;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD != 17) {
                switch (iD) {
                    case 2:
                        personFieldMetadataEntity = (PersonFieldMetadataEntity) dclv.n(parcel, i, PersonFieldMetadataEntity.CREATOR);
                        break;
                    case 3:
                        strT = dclv.t(parcel, i);
                        break;
                    case 4:
                        strT6 = dclv.t(parcel, i);
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
                    default:
                        dclv.C(parcel, i);
                        break;
                }
            } else {
                strT2 = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new NameEntity(personFieldMetadataEntity, strT, strT2, strT3, strT4, strT5, strT6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NameEntity[i];
    }
}
