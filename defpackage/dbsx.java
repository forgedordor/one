package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AuthzenBeginTxData;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.PostSignInData;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbsx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayList = new ArrayList();
        Bundle bundle = new Bundle();
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        boolean zD4 = false;
        boolean zD5 = false;
        int iF2 = 0;
        boolean zD6 = false;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        String strT7 = null;
        String strT8 = null;
        CaptchaChallenge captchaChallenge = null;
        String strT9 = null;
        String strT10 = null;
        PostSignInData postSignInData = null;
        Account account = null;
        String strT11 = null;
        TokenData tokenData = null;
        String strT12 = null;
        ResolutionData resolutionData = null;
        AuthzenBeginTxData authzenBeginTxData = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 4:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 5:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 6:
                    strT5 = dclv.t(parcel, i);
                    break;
                case 7:
                    strT6 = dclv.t(parcel, i);
                    break;
                case 8:
                    strT7 = dclv.t(parcel, i);
                    break;
                case 9:
                    strT8 = dclv.t(parcel, i);
                    break;
                case 10:
                    zD = dclv.D(parcel, i);
                    break;
                case 11:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 12:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 13:
                    zD4 = dclv.D(parcel, i);
                    break;
                case 14:
                    captchaChallenge = (CaptchaChallenge) dclv.n(parcel, i, CaptchaChallenge.CREATOR);
                    break;
                case 15:
                    arrayList = dclv.z(parcel, i, ScopeDetail.CREATOR);
                    break;
                case 16:
                    strT9 = dclv.t(parcel, i);
                    break;
                case 17:
                    strT10 = dclv.t(parcel, i);
                    break;
                case 18:
                case 23:
                case 24:
                case 25:
                default:
                    dclv.C(parcel, i);
                    break;
                case 19:
                    zD5 = dclv.D(parcel, i);
                    break;
                case 20:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 21:
                    postSignInData = (PostSignInData) dclv.n(parcel, i, PostSignInData.CREATOR);
                    break;
                case 22:
                    account = (Account) dclv.n(parcel, i, Account.CREATOR);
                    break;
                case 26:
                    strT11 = dclv.t(parcel, i);
                    break;
                case 27:
                    tokenData = (TokenData) dclv.n(parcel, i, TokenData.CREATOR);
                    break;
                case 28:
                    bundle = dclv.k(parcel, i);
                    break;
                case 29:
                    strT12 = dclv.t(parcel, i);
                    break;
                case 30:
                    resolutionData = (ResolutionData) dclv.n(parcel, i, ResolutionData.CREATOR);
                    break;
                case 31:
                    authzenBeginTxData = (AuthzenBeginTxData) dclv.n(parcel, i, AuthzenBeginTxData.CREATOR);
                    break;
                case 32:
                    zD6 = dclv.D(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new TokenResponse(iF, strT, strT2, strT3, strT4, strT5, strT6, strT7, strT8, zD, zD2, zD3, zD4, captchaChallenge, arrayList, strT9, strT10, zD5, iF2, postSignInData, account, strT11, tokenData, bundle, strT12, resolutionData, authzenBeginTxData, zD6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenResponse[i];
    }
}
