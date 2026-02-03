package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.GetTokenRequest;
import com.google.android.gms.auth.aang.GoogleAccount;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbnk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        GoogleAccount googleAccount = null;
        String strT = null;
        ArrayList arrayListY = null;
        ArrayList arrayListY2 = null;
        ArrayList arrayListY3 = null;
        ArrayList arrayListY4 = null;
        String strT2 = null;
        byte[] bArrE = null;
        String strT3 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    googleAccount = (GoogleAccount) dclv.n(parcel, i, GoogleAccount.CREATOR);
                    break;
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    arrayListY = dclv.y(parcel, i);
                    break;
                case 4:
                    arrayListY2 = dclv.y(parcel, i);
                    break;
                case 5:
                    arrayListY3 = dclv.y(parcel, i);
                    break;
                case 6:
                    arrayListY4 = dclv.y(parcel, i);
                    break;
                case 7:
                    iF = dclv.f(parcel, i);
                    break;
                case 8:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 9:
                    zD = dclv.D(parcel, i);
                    break;
                case 10:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 11:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 12:
                    zD2 = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new GetTokenRequest(googleAccount, strT, arrayListY, arrayListY2, arrayListY3, arrayListY4, iF, strT2, zD, bArrE, strT3, zD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetTokenRequest[i];
    }
}
