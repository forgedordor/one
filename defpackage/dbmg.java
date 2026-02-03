package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.GetHubTokenInternalResponse;
import com.google.android.gms.auth.TokenData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbmg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        TokenData tokenData = null;
        String strT = null;
        Intent intent = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                tokenData = (TokenData) dclv.n(parcel, i, TokenData.CREATOR);
            } else if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                intent = (Intent) dclv.n(parcel, i, Intent.CREATOR);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                pendingIntent = (PendingIntent) dclv.n(parcel, i, PendingIntent.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new GetHubTokenInternalResponse(tokenData, strT, intent, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetHubTokenInternalResponse[i];
    }
}
