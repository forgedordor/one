package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.authzen.gencode.server.api.BeaconSeedEntity;
import com.google.android.gms.auth.proximity.AttestationVerifier;
import com.google.android.gms.auth.proximity.RemoteDevice;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbvw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        byte[] bArrE = null;
        String strT4 = null;
        ArrayList arrayListZ = null;
        String strT5 = null;
        AttestationVerifier attestationVerifier = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD != 1000) {
                switch (iD) {
                    case 1:
                        strT = dclv.t(parcel, i);
                        break;
                    case 2:
                        strT2 = dclv.t(parcel, i);
                        break;
                    case 3:
                        strT3 = dclv.t(parcel, i);
                        break;
                    case 4:
                        bArrE = dclv.E(parcel, i);
                        break;
                    case 5:
                        strT4 = dclv.t(parcel, i);
                        break;
                    case 6:
                        arrayListZ = dclv.z(parcel, i, BeaconSeedEntity.CREATOR);
                        break;
                    case 7:
                        strT5 = dclv.t(parcel, i);
                        break;
                    case 8:
                        attestationVerifier = (AttestationVerifier) dclv.n(parcel, i, AttestationVerifier.CREATOR);
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
        return new RemoteDevice(iF, strT, strT2, strT3, bArrE, strT4, arrayListZ, strT5, attestationVerifier);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RemoteDevice[i];
    }
}
