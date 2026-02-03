package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.fido.GetGooglePasskeyForExportResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbph implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        String strT7 = null;
        String strT8 = null;
        String strT9 = null;
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
                    strT5 = dclv.t(parcel, i);
                    break;
                case 7:
                    strT6 = dclv.t(parcel, i);
                    break;
                case 8:
                    strT7 = dclv.t(parcel, i);
                    break;
                case 9:
                    strT8 = dclv.t(parcel, i);
                    break;
                case 10:
                    strT9 = dclv.t(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new GetGooglePasskeyForExportResponse(strT, strT2, strT3, strT4, strT5, strT6, strT7, strT8, strT9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetGooglePasskeyForExportResponse[i];
    }
}
