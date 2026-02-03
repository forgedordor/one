package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dczq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        SignRequestParams signRequestParams = null;
        Uri uri = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                signRequestParams = (SignRequestParams) dclv.n(parcel, i, SignRequestParams.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                uri = (Uri) dclv.n(parcel, i, Uri.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new BrowserSignRequestParams(signRequestParams, uri);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BrowserSignRequestParams[i];
    }
}
