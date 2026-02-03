package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.GoogleAccount;
import com.google.android.gms.auth.aang.HasCapabilitiesRequest;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbnn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        GoogleAccount googleAccount = null;
        ArrayList arrayListY = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                googleAccount = (GoogleAccount) dclv.n(parcel, i, GoogleAccount.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                arrayListY = dclv.y(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new HasCapabilitiesRequest(googleAccount, arrayListY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new HasCapabilitiesRequest[i];
    }
}
