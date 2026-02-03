package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.kids.UriWithType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddhy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Uri uri = null;
        int iF = 0;
        String strT = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                uri = (Uri) dclv.n(parcel, i, Uri.CREATOR);
            } else if (iD == 2) {
                iF = dclv.f(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                strT = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new UriWithType(uri, iF, strT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UriWithType[i];
    }
}
