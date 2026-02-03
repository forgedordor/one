package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.usagereporting.ConsentInformation;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deje implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        byte[] bArrE = null;
        ArrayList arrayListW = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                bArrE = dclv.E(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                arrayListW = dclv.w(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new ConsentInformation.AccountConsentInformation(strT, bArrE, arrayListW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConsentInformation.AccountConsentInformation[i];
    }
}
