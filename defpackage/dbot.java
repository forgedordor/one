package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbot implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        int iF2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                zD = dclv.D(parcel, i);
            } else if (iD == 2) {
                zD2 = dclv.D(parcel, i);
            } else if (iD == 3) {
                zD3 = dclv.D(parcel, i);
            } else if (iD == 4) {
                iF2 = dclv.f(parcel, i);
            } else if (iD != 1000) {
                dclv.C(parcel, i);
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new CredentialPickerConfig(iF, zD, zD2, zD3, iF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
