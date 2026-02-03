package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.WebSetupConfigRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbtb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        AppDescription appDescription = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                appDescription = (AppDescription) dclv.n(parcel, i, AppDescription.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new WebSetupConfigRequest(iF, appDescription);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WebSetupConfigRequest[i];
    }
}
