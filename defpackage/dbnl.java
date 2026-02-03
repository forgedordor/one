package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.GetTokenResponse;
import com.google.android.gms.auth.aang.Oauth2TokenMetadata;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbnl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        Oauth2TokenMetadata oauth2TokenMetadata = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                oauth2TokenMetadata = (Oauth2TokenMetadata) dclv.n(parcel, i, Oauth2TokenMetadata.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new GetTokenResponse(strT, oauth2TokenMetadata);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetTokenResponse[i];
    }
}
