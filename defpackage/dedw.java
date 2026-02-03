package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ConnectionResult connectionResult = null;
        int iF = 0;
        ResolveAccountResponse resolveAccountResponse = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                connectionResult = (ConnectionResult) dclv.n(parcel, i, ConnectionResult.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                resolveAccountResponse = (ResolveAccountResponse) dclv.n(parcel, i, ResolveAccountResponse.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new SignInResponse(iF, connectionResult, resolveAccountResponse);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInResponse[i];
    }
}
