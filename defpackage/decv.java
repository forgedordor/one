package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Request;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class decv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String[] strArrK = null;
        PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr = null;
        Bundle bundleK = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strArrK = dclv.K(parcel, i);
            } else if (iD == 2) {
                phraseAffinityCorpusSpecArr = (PhraseAffinityCorpusSpec[]) dclv.J(parcel, i, PhraseAffinityCorpusSpec.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                bundleK = dclv.k(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new GetPhraseAffinityCall$Request(strArrK, phraseAffinityCorpusSpecArr, bundleK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetPhraseAffinityCall$Request[i];
    }
}
