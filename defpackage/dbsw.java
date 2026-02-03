package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbsw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Bundle bundle = new Bundle();
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        int iF = 0;
        boolean zD4 = false;
        int iF2 = 0;
        int iF3 = 0;
        boolean zD5 = true;
        boolean zD6 = true;
        String strT = null;
        String strT2 = null;
        FACLConfig fACLConfig = null;
        PACLConfig pACLConfig = null;
        AppDescription appDescription = null;
        CaptchaSolution captchaSolution = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        String strT7 = null;
        long jI = 0;
        String strT8 = "com.google";
        String strT9 = "UNKNOWN";
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 4:
                    bundle = dclv.k(parcel, i);
                    break;
                case 5:
                    fACLConfig = (FACLConfig) dclv.n(parcel, i, FACLConfig.CREATOR);
                    break;
                case 6:
                    pACLConfig = (PACLConfig) dclv.n(parcel, i, PACLConfig.CREATOR);
                    break;
                case 7:
                    zD = dclv.D(parcel, i);
                    break;
                case 8:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 9:
                    strT9 = dclv.t(parcel, i);
                    break;
                case 10:
                    appDescription = (AppDescription) dclv.n(parcel, i, AppDescription.CREATOR);
                    break;
                case 11:
                    captchaSolution = (CaptchaSolution) dclv.n(parcel, i, CaptchaSolution.CREATOR);
                    break;
                case 12:
                default:
                    dclv.C(parcel, i);
                    break;
                case 13:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 14:
                    zD5 = dclv.D(parcel, i);
                    break;
                case 15:
                    strT8 = dclv.t(parcel, i);
                    break;
                case 16:
                    iF = dclv.f(parcel, i);
                    break;
                case 17:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 18:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 19:
                    strT5 = dclv.t(parcel, i);
                    break;
                case 20:
                    jI = dclv.i(parcel, i);
                    break;
                case 21:
                    zD4 = dclv.D(parcel, i);
                    break;
                case 22:
                    strT6 = dclv.t(parcel, i);
                    break;
                case 23:
                    strT7 = dclv.t(parcel, i);
                    break;
                case 24:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 25:
                    zD6 = dclv.D(parcel, i);
                    break;
                case 26:
                    iF3 = dclv.f(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new TokenRequest(strT, strT2, bundle, fACLConfig, pACLConfig, zD, zD2, strT9, appDescription, captchaSolution, zD3, zD5, strT8, iF, strT3, strT4, strT5, jI, zD4, strT6, strT7, iF2, zD6, iF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenRequest[i];
    }
}
