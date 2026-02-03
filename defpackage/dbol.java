package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbol implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        HashSet hashSet = new HashSet();
        int iF = 0;
        String strT = null;
        byte[] bArrE = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int iF2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    hashSet.add(1);
                    break;
                case 2:
                    strT = dclv.t(parcel, i);
                    hashSet.add(2);
                    break;
                case 3:
                    iF2 = dclv.f(parcel, i);
                    hashSet.add(3);
                    break;
                case 4:
                    bArrE = dclv.E(parcel, i);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) dclv.n(parcel, i, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) dclv.n(parcel, i, DeviceMetaData.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        if (parcel.dataPosition() == iH) {
            return new AuthenticatorTransferInfo(hashSet, iF, strT, iF2, bArrE, pendingIntent, deviceMetaData);
        }
        throw new dclu(a.g(iH, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticatorTransferInfo[i];
    }
}
