package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.CpgDocumentRequest;
import com.google.android.gms.people.cpg.PreferenceDocumentRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddwj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        PreferenceDocumentRequest preferenceDocumentRequest = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                preferenceDocumentRequest = (PreferenceDocumentRequest) dclv.n(parcel, i, PreferenceDocumentRequest.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new CpgDocumentRequest(iF, preferenceDocumentRequest);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CpgDocumentRequest[i];
    }
}
