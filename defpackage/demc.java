package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class demc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        byte[] bArrE = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                bArrE = dclv.E(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new SetUpBiometricAuthenticationKeysResponse(bArrE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SetUpBiometricAuthenticationKeysResponse[i];
    }
}
