package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.AccountWithAppRestrictionState;
import com.google.android.gms.auth.aang.GetAccountsResponse;
import com.google.android.gms.auth.aang.GoogleAccount;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbnj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListZ = null;
        ArrayList arrayListZ2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                arrayListZ = dclv.z(parcel, i, GoogleAccount.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                arrayListZ2 = dclv.z(parcel, i, AccountWithAppRestrictionState.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new GetAccountsResponse(arrayListZ, arrayListZ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetAccountsResponse[i];
    }
}
