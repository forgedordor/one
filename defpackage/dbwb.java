package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.proximity.gencode.server.api.BeaconSeedEntity;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbwb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        HashSet hashSet = new HashSet();
        long jI = 0;
        String str = null;
        long jI2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                String strT = dclv.t(parcel, i);
                hashSet.add(2);
                str = strT;
            } else if (iD == 3) {
                jI2 = dclv.i(parcel, i);
                hashSet.add(3);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                jI = dclv.i(parcel, i);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == iH) {
            return new BeaconSeedEntity(hashSet, str, jI2, jI);
        }
        throw new dclu(a.g(iH, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeaconSeedEntity[i];
    }
}
