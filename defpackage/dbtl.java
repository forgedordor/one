package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbtl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        Bitmap bitmap = null;
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
                bitmap = (Bitmap) dclv.n(parcel, i, Bitmap.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new CaptchaChallenge(strT, strT2, bitmap);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CaptchaChallenge[i];
    }
}
