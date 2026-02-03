package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbov implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArrK = null;
        String strT = null;
        String strT2 = null;
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD != 1000) {
                switch (iD) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) dclv.n(parcel, i, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        zD = dclv.D(parcel, i);
                        break;
                    case 3:
                        zD2 = dclv.D(parcel, i);
                        break;
                    case 4:
                        strArrK = dclv.K(parcel, i);
                        break;
                    case 5:
                        zD3 = dclv.D(parcel, i);
                        break;
                    case 6:
                        strT = dclv.t(parcel, i);
                        break;
                    case 7:
                        strT2 = dclv.t(parcel, i);
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
        return new HintRequest(iF, credentialPickerConfig, zD, zD2, strArrK, zD3, strT, strT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new HintRequest[i];
    }
}
