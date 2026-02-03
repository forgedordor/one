package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.ime.GetCorpusHandlesRegisteredForIMECall$Response;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class decj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Status status = null;
        String[] strArrK = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                status = (Status) dclv.n(parcel, i, Status.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                strArrK = dclv.K(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new GetCorpusHandlesRegisteredForIMECall$Response(status, strArrK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetCorpusHandlesRegisteredForIMECall$Response[i];
    }
}
