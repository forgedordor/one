package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.BirthdayEntity;
import com.google.android.gms.people.protomodel.EmailEntity;
import com.google.android.gms.people.protomodel.NameEntity;
import com.google.android.gms.people.protomodel.PersonEntity;
import com.google.android.gms.people.protomodel.PhoneEntity;
import com.google.android.gms.people.protomodel.PhotoEntity;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddxx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        ArrayList arrayListZ = null;
        ArrayList arrayListZ2 = null;
        ArrayList arrayListZ3 = null;
        ArrayList arrayListZ4 = null;
        ArrayList arrayListZ5 = null;
        ArrayList arrayListZ6 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 9) {
                arrayListZ5 = dclv.z(parcel, i, BirthdayEntity.CREATOR);
            } else if (iD == 11) {
                arrayListZ3 = dclv.z(parcel, i, EmailEntity.CREATOR);
            } else if (iD == 13) {
                arrayListZ4 = dclv.z(parcel, i, PhoneEntity.CREATOR);
            } else if (iD == 148) {
                arrayListZ6 = dclv.z(parcel, i, PhotoEntity.CREATOR);
            } else if (iD == 4) {
                arrayListZ = dclv.z(parcel, i, NameEntity.CREATOR);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                arrayListZ2 = dclv.z(parcel, i, PhotoEntity.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new PersonEntity(strT, arrayListZ, arrayListZ2, arrayListZ3, arrayListZ4, arrayListZ5, arrayListZ6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PersonEntity[i];
    }
}
