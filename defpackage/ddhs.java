package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.kids.IndividualContactRequest;
import com.google.android.gms.kids.UriWithType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddhs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        UriWithType[] uriWithTypeArr = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                uriWithTypeArr = (UriWithType[]) dclv.J(parcel, i, UriWithType.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new IndividualContactRequest(strT, uriWithTypeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new IndividualContactRequest[i];
    }
}
