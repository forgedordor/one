package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbrc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        Uri uri = null;
        String strT5 = null;
        String strT6 = null;
        ArrayList arrayListZ = null;
        String strT7 = null;
        String strT8 = null;
        long jI = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 4:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 5:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 6:
                    uri = (Uri) dclv.n(parcel, i, Uri.CREATOR);
                    break;
                case 7:
                    strT5 = dclv.t(parcel, i);
                    break;
                case 8:
                    jI = dclv.i(parcel, i);
                    break;
                case 9:
                    strT6 = dclv.t(parcel, i);
                    break;
                case 10:
                    arrayListZ = dclv.z(parcel, i, Scope.CREATOR);
                    break;
                case 11:
                    strT7 = dclv.t(parcel, i);
                    break;
                case 12:
                    strT8 = dclv.t(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new GoogleSignInAccount(strT, strT2, strT3, strT4, uri, strT5, jI, strT6, arrayListZ, strT7, strT8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
