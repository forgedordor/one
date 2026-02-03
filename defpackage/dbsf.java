package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbsf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        int iF2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                iF2 = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new CheckFactoryResetPolicyComplianceResponse(iF, iF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CheckFactoryResetPolicyComplianceResponse[i];
    }
}
