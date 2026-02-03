package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class debs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        long jI = 0;
        String strT = null;
        String strT2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                strT2 = dclv.t(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                jI = dclv.i(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new RequestIndexingCall$Request(strT, strT2, jI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RequestIndexingCall$Request[i];
    }
}
