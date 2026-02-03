package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusIMEInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbiv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String[] strArrK = null;
        String strT = null;
        String strT2 = null;
        String[] strArrK2 = null;
        String strT3 = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                strArrK = dclv.K(parcel, i);
            } else if (iD == 3) {
                strT = dclv.t(parcel, i);
            } else if (iD == 4) {
                strT2 = dclv.t(parcel, i);
            } else if (iD == 6) {
                strT3 = dclv.t(parcel, i);
            } else if (iD != 7) {
                dclv.C(parcel, i);
            } else {
                strArrK2 = dclv.K(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new RegisterCorpusIMEInfo(iF, strArrK, strT, strT2, strArrK2, strT3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterCorpusIMEInfo[i];
    }
}
