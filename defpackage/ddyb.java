package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.SourceStatsEntity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddyb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        Integer numR = null;
        Integer numR2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                numR = dclv.r(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                numR2 = dclv.r(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new SourceStatsEntity(strT, numR, numR2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SourceStatsEntity[i];
    }
}
