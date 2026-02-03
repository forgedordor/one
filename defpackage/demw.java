package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;
import com.google.android.gms.wallet.wobs.TimeInterval;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class demw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        LoyaltyPointsBalance loyaltyPointsBalance = null;
        TimeInterval timeInterval = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                loyaltyPointsBalance = (LoyaltyPointsBalance) dclv.n(parcel, i, LoyaltyPointsBalance.CREATOR);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                timeInterval = (TimeInterval) dclv.n(parcel, i, TimeInterval.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new LoyaltyPoints(strT, loyaltyPointsBalance, timeInterval);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyPoints[i];
    }
}
