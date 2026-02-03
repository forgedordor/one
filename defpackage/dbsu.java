package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.PasswordCheckResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbsu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                strT2 = dclv.t(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                strT3 = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new PasswordCheckResponse(strT, strT2, strT3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PasswordCheckResponse[i];
    }
}
