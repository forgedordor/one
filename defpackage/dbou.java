package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbou implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        String[] strArrK = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String strT = null;
        String strT2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD != 1000) {
                switch (iD) {
                    case 1:
                        zD = dclv.D(parcel, i);
                        break;
                    case 2:
                        strArrK = dclv.K(parcel, i);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) dclv.n(parcel, i, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) dclv.n(parcel, i, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        zD2 = dclv.D(parcel, i);
                        break;
                    case 6:
                        strT = dclv.t(parcel, i);
                        break;
                    case 7:
                        strT2 = dclv.t(parcel, i);
                        break;
                    case 8:
                        zD3 = dclv.D(parcel, i);
                        break;
                    default:
                        dclv.C(parcel, i);
                        break;
                }
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new CredentialRequest(iF, zD, strArrK, credentialPickerConfig, credentialPickerConfig2, zD2, strT, strT2, zD3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialRequest[i];
    }
}
