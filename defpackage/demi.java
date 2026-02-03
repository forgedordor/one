package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class demi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String[] strArrK = null;
        int[] iArrH = null;
        RemoteViews remoteViews = null;
        byte[] bArrE = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strArrK = dclv.K(parcel, i);
            } else if (iD == 2) {
                iArrH = dclv.H(parcel, i);
            } else if (iD == 3) {
                remoteViews = (RemoteViews) dclv.n(parcel, i, RemoteViews.CREATOR);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                bArrE = dclv.E(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new GetSaveInstrumentDetailsResponse(strArrK, iArrH, remoteViews, bArrE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetSaveInstrumentDetailsResponse[i];
    }
}
