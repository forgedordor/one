package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.SignInButtonConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dclo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Scope[] scopeArr = null;
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                iF2 = dclv.f(parcel, i);
            } else if (iD == 3) {
                iF3 = dclv.f(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                scopeArr = (Scope[]) dclv.J(parcel, i, Scope.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new SignInButtonConfig(iF, iF2, iF3, scopeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInButtonConfig[i];
    }
}
