package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbso implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Bundle bundle = new Bundle();
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        AppDescription appDescription = null;
        AccountCredentials accountCredentials = null;
        CaptchaSolution captchaSolution = null;
        String strT6 = null;
        String strT7 = null;
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        boolean zD4 = false;
        boolean zD5 = false;
        boolean zD6 = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    bundle = dclv.k(parcel, i);
                    break;
                case 3:
                    zD = dclv.D(parcel, i);
                    break;
                case 4:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 5:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 6:
                    strT = dclv.t(parcel, i);
                    break;
                case 7:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 8:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 9:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 10:
                    zD4 = dclv.D(parcel, i);
                    break;
                case 11:
                    zD5 = dclv.D(parcel, i);
                    break;
                case 12:
                    zD6 = dclv.D(parcel, i);
                    break;
                case 13:
                    strT5 = dclv.t(parcel, i);
                    break;
                case 14:
                    appDescription = (AppDescription) dclv.n(parcel, i, AppDescription.CREATOR);
                    break;
                case 15:
                    accountCredentials = (AccountCredentials) dclv.n(parcel, i, AccountCredentials.CREATOR);
                    break;
                case 16:
                    captchaSolution = (CaptchaSolution) dclv.n(parcel, i, CaptchaSolution.CREATOR);
                    break;
                case 17:
                    strT6 = dclv.t(parcel, i);
                    break;
                case 18:
                    strT7 = dclv.t(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new GoogleAccountSetupRequest(iF, bundle, zD, zD2, zD3, strT, strT2, strT3, strT4, zD4, zD5, zD6, strT5, appDescription, accountCredentials, captchaSolution, strT6, strT7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleAccountSetupRequest[i];
    }
}
