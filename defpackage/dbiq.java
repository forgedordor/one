package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbiq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        CorpusId corpusId = null;
        Bundle bundleK = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                corpusId = (CorpusId) dclv.n(parcel, i, CorpusId.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                bundleK = dclv.k(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new PhraseAffinityCorpusSpec(corpusId, bundleK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PhraseAffinityCorpusSpec[i];
    }
}
