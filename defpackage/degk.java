package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.telephonyspam.SettingsLookupResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        boolean zD = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                zD = dclv.D(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new SettingsLookupResult(iF, zD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SettingsLookupResult[i];
    }
}
