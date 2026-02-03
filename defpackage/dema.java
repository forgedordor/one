package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dema implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        byte[][] bArrL = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                bArrL = dclv.L(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new InitializeBuyFlowRequest(iF, bArrL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InitializeBuyFlowRequest[i];
    }
}
