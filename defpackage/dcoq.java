package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.constellation.IdTokenRequest;
import com.google.android.gms.constellation.ImsiRequest;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcoq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        IdTokenRequest idTokenRequest = null;
        Bundle bundleK = null;
        ArrayList arrayListZ = null;
        ArrayList arrayListW = null;
        boolean zD = false;
        int iF = 0;
        long jI = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    jI = dclv.i(parcel, i);
                    break;
                case 3:
                    idTokenRequest = (IdTokenRequest) dclv.n(parcel, i, IdTokenRequest.CREATOR);
                    break;
                case 4:
                    bundleK = dclv.k(parcel, i);
                    break;
                case 5:
                    arrayListZ = dclv.z(parcel, i, ImsiRequest.CREATOR);
                    break;
                case 6:
                    zD = dclv.D(parcel, i);
                    break;
                case 7:
                    iF = dclv.f(parcel, i);
                    break;
                case 8:
                    arrayListW = dclv.w(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new VerifyPhoneNumberRequest(strT, jI, idTokenRequest, bundleK, arrayListZ, zD, iF, arrayListW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new VerifyPhoneNumberRequest[i];
    }
}
