package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AuthAccountRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcjs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        boolean zD = false;
        IBinder iBinderL = null;
        Scope[] scopeArr = null;
        Integer numR = null;
        Integer numR2 = null;
        Account account = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    iBinderL = dclv.l(parcel, i);
                    break;
                case 3:
                    scopeArr = (Scope[]) dclv.J(parcel, i, Scope.CREATOR);
                    break;
                case 4:
                    numR = dclv.r(parcel, i);
                    break;
                case 5:
                    numR2 = dclv.r(parcel, i);
                    break;
                case 6:
                    account = (Account) dclv.n(parcel, i, Account.CREATOR);
                    break;
                case 7:
                    zD = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new AuthAccountRequest(iF, iBinderL, scopeArr, numR, numR2, account, zD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthAccountRequest[i];
    }
}
