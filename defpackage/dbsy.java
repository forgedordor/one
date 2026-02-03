package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbsy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        AccountCredentials accountCredentials = null;
        int iF = 0;
        CaptchaSolution captchaSolution = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                accountCredentials = (AccountCredentials) dclv.n(parcel, i, AccountCredentials.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                captchaSolution = (CaptchaSolution) dclv.n(parcel, i, CaptchaSolution.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new UpdateCredentialsRequest(iF, accountCredentials, captchaSolution);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UpdateCredentialsRequest[i];
    }
}
