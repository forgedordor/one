package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbqb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        int iF = 0;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 3:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 4:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 5:
                    zD = dclv.D(parcel, i);
                    break;
                case 6:
                    iF = dclv.f(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new GetSignInIntentRequest(strT, strT2, strT3, strT4, zD, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetSignInIntentRequest[i];
    }
}
