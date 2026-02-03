package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbir implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        CorpusId[] corpusIdArr = null;
        int[] iArrH = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                corpusIdArr = (CorpusId[]) dclv.J(parcel, i, CorpusId.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                iArrH = dclv.H(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new PhraseAffinityResponse(strT, corpusIdArr, iArrH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PhraseAffinityResponse[i];
    }
}
