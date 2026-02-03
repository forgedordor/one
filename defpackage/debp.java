package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class debp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Status status = null;
        CorpusStatus corpusStatus = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                status = (Status) dclv.n(parcel, i, Status.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                corpusStatus = (CorpusStatus) dclv.n(parcel, i, CorpusStatus.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new GetCorpusStatusCall$Response(status, corpusStatus);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetCorpusStatusCall$Response[i];
    }
}
