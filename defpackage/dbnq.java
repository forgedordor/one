package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.GoogleAccount;
import com.google.android.gms.auth.aang.SyncAccountStateRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbnq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        GoogleAccount googleAccount = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                googleAccount = (GoogleAccount) dclv.n(parcel, i, GoogleAccount.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new SyncAccountStateRequest(googleAccount, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SyncAccountStateRequest[i];
    }
}
