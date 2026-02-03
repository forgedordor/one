package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.IdToken;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbos implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        Uri uri = null;
        ArrayList arrayListZ = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
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
                    uri = (Uri) dclv.n(parcel, i, Uri.CREATOR);
                    break;
                case 4:
                    arrayListZ = dclv.z(parcel, i, IdToken.CREATOR);
                    break;
                case 5:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 6:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 7:
                case 8:
                default:
                    dclv.C(parcel, i);
                    break;
                case 9:
                    strT5 = dclv.t(parcel, i);
                    break;
                case 10:
                    strT6 = dclv.t(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new Credential(strT, strT2, uri, arrayListZ, strT3, strT4, strT5, strT6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Credential[i];
    }
}
