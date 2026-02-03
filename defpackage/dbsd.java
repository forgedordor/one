package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbsd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        AppDescription appDescription = null;
        CaptchaSolution captchaSolution = null;
        AccountCredentials accountCredentials = null;
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    appDescription = (AppDescription) dclv.n(parcel, i, AppDescription.CREATOR);
                    break;
                case 3:
                    zD = dclv.D(parcel, i);
                    break;
                case 4:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 5:
                    captchaSolution = (CaptchaSolution) dclv.n(parcel, i, CaptchaSolution.CREATOR);
                    break;
                case 6:
                    accountCredentials = (AccountCredentials) dclv.n(parcel, i, AccountCredentials.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new AccountSignInRequest(iF, appDescription, zD, zD2, captchaSolution, accountCredentials);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountSignInRequest[i];
    }
}
