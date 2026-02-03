package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dczp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        RegisterRequestParams registerRequestParams = null;
        Uri uri = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                registerRequestParams = (RegisterRequestParams) dclv.n(parcel, i, RegisterRequestParams.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                uri = (Uri) dclv.n(parcel, i, Uri.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new BrowserRegisterRequestParams(registerRequestParams, uri);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BrowserRegisterRequestParams[i];
    }
}
