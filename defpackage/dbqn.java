package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbqn implements Parcelable.Creator {
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
        String strT7 = null;
        PublicKeyCredential publicKeyCredential = null;
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
                    uri = (Uri) dclv.n(parcel, i, Uri.CREATOR);
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
                    publicKeyCredential = (PublicKeyCredential) dclv.n(parcel, i, PublicKeyCredential.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new SignInCredential(strT, strT2, strT3, strT4, uri, strT5, strT6, strT7, publicKeyCredential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInCredential[i];
    }
}
