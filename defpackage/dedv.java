package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.SignInRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ResolveAccountRequest resolveAccountRequest = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                resolveAccountRequest = (ResolveAccountRequest) dclv.n(parcel, i, ResolveAccountRequest.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new SignInRequest(iF, resolveAccountRequest);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInRequest[i];
    }
}
