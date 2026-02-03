package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.CompleteSignInResult;
import com.google.android.gms.auth.api.identity.SignInCredential;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbpx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        SignInCredential signInCredential = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                signInCredential = (SignInCredential) dclv.n(parcel, i, SignInCredential.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new CompleteSignInResult(signInCredential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CompleteSignInResult[i];
    }
}
