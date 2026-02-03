package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.folsom.RecoveryRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbty implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        byte[] bArrE = null;
        byte[] bArrE2 = null;
        byte[] bArrE3 = null;
        byte[] bArrE4 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 3:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 4:
                    bArrE2 = dclv.E(parcel, i);
                    break;
                case 5:
                    bArrE3 = dclv.E(parcel, i);
                    break;
                case 6:
                    bArrE4 = dclv.E(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new RecoveryRequest(strT, strT2, bArrE, bArrE2, bArrE3, bArrE4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RecoveryRequest[i];
    }
}
