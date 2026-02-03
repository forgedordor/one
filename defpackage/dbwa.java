package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.proximity.AttestationVerifier;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.auth.proximity.gencode.server.api.BeaconSeedEntity;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbwa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        byte[] bArrE = null;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        ArrayList arrayListY = null;
        ArrayList arrayListY2 = null;
        ArrayList arrayListZ = null;
        AttestationVerifier attestationVerifier = null;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        boolean zD4 = false;
        boolean zD5 = false;
        long jI = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 4:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 5:
                    zD = dclv.D(parcel, i);
                    break;
                case 6:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 7:
                    jI = dclv.i(parcel, i);
                    break;
                case 8:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 9:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 10:
                    zD4 = dclv.D(parcel, i);
                    break;
                case 11:
                    zD5 = dclv.D(parcel, i);
                    break;
                case 12:
                    arrayListY = dclv.y(parcel, i);
                    break;
                case 13:
                    arrayListY2 = dclv.y(parcel, i);
                    break;
                case 14:
                    arrayListZ = dclv.z(parcel, i, BeaconSeedEntity.CREATOR);
                    break;
                case 15:
                    attestationVerifier = (AttestationVerifier) dclv.n(parcel, i, AttestationVerifier.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new SyncedCryptauthDevice(bArrE, strT, strT2, strT3, zD, zD2, jI, zD3, strT4, zD4, zD5, arrayListY, arrayListY2, arrayListZ, attestationVerifier);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SyncedCryptauthDevice[i];
    }
}
