package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.NotificationParams;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.firstparty.dataservice.AccountInterruptControls;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbmw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        BrowserResolutionCookie[] browserResolutionCookieArr = null;
        NotificationParams notificationParams = null;
        AccountInterruptControls accountInterruptControls = null;
        int iF = 0;
        int iF2 = 0;
        boolean zD = false;
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
                    iF2 = dclv.f(parcel, i);
                    break;
                case 4:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 5:
                    browserResolutionCookieArr = (BrowserResolutionCookie[]) dclv.J(parcel, i, BrowserResolutionCookie.CREATOR);
                    break;
                case 6:
                    zD = dclv.D(parcel, i);
                    break;
                case 7:
                    notificationParams = (NotificationParams) dclv.n(parcel, i, NotificationParams.CREATOR);
                    break;
                case 8:
                    accountInterruptControls = (AccountInterruptControls) dclv.n(parcel, i, AccountInterruptControls.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new ResolutionData(iF, strT, iF2, strT2, browserResolutionCookieArr, zD, notificationParams, accountInterruptControls);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolutionData[i];
    }
}
