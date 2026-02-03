package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbqc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        ArrayList arrayListY = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    zD = dclv.D(parcel, i);
                    break;
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 4:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 5:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 6:
                    arrayListY = dclv.y(parcel, i);
                    break;
                case 7:
                    zD3 = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(zD, strT, strT2, zD2, strT3, arrayListY, zD3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
    }
}
