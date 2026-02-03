package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class delf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            dclv.C(parcel, parcel.readInt());
        }
        dclv.B(parcel, iH);
        return new NotifyTransactionStatusRequest();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NotifyTransactionStatusRequest[i];
    }
}
