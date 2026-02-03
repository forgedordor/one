package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class debq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        RegisterCorpusInfo registerCorpusInfo = null;
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
                registerCorpusInfo = (RegisterCorpusInfo) dclv.n(parcel, i, RegisterCorpusInfo.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new RegisterCorpusInfoCall$Request(strT, strT2, registerCorpusInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterCorpusInfoCall$Request[i];
    }
}
