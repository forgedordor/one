package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.PrivacyRecordOptinRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deta implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        int iF = 0;
        boolean zD = false;
        String strT2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                strT = dclv.t(parcel, i);
            } else if (iD == 2) {
                iF = dclv.f(parcel, i);
            } else if (iD == 3) {
                zD = dclv.D(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                strT2 = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new PrivacyRecordOptinRequest(strT, iF, zD, strT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PrivacyRecordOptinRequest[i];
    }
}
