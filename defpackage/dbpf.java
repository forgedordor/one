package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.fido.BrowserOptions;
import com.google.android.gms.auth.api.identity.ChromeOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbpf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        byte[] bArrE = null;
        String strT = null;
        ChromeOptions chromeOptions = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                bArrE = dclv.E(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                chromeOptions = (ChromeOptions) dclv.n(parcel, i, ChromeOptions.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new BrowserOptions(strT, bArrE != null ? evqs.x(bArrE) : null, chromeOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BrowserOptions[i];
    }
}
