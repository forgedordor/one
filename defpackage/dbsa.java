package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckResponse;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbsa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        ArrayList arrayListY = null;
        String strT2 = null;
        CaptchaChallenge captchaChallenge = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                arrayListY = dclv.y(parcel, i);
            } else if (iD == 4) {
                strT2 = dclv.t(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                captchaChallenge = (CaptchaChallenge) dclv.n(parcel, i, CaptchaChallenge.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new AccountNameCheckResponse(strT, arrayListY, strT2, captchaChallenge);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountNameCheckResponse[i];
    }
}
