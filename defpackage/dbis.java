package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.appdatasearch.PhraseAffinitySpecification;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbis implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                phraseAffinityCorpusSpecArr = (PhraseAffinityCorpusSpec[]) dclv.J(parcel, i, PhraseAffinityCorpusSpec.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new PhraseAffinitySpecification(phraseAffinityCorpusSpecArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PhraseAffinitySpecification[i];
    }
}
