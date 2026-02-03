package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AccountWithZuulKeyRetrievalIntent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbpo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Account account = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                account = (Account) dclv.n(parcel, i, Account.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                pendingIntent = (PendingIntent) dclv.n(parcel, i, PendingIntent.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new AccountWithZuulKeyRetrievalIntent(account, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountWithZuulKeyRetrievalIntent[i];
    }
}
