package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.consentprimitive.ContactsConsentsConfig;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddve implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        boolean zD4 = false;
        boolean zD5 = false;
        boolean zD6 = false;
        Account account = null;
        String strT = null;
        ArrayList arrayListZ = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    zD = dclv.D(parcel, i);
                    break;
                case 2:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 3:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 4:
                    account = (Account) dclv.n(parcel, i, Account.CREATOR);
                    break;
                case 5:
                    zD4 = dclv.D(parcel, i);
                    break;
                case 6:
                    zD5 = dclv.D(parcel, i);
                    break;
                case 7:
                    strT = dclv.t(parcel, i);
                    break;
                case 8:
                    arrayListZ = dclv.z(parcel, i, Account.CREATOR);
                    break;
                case 9:
                    zD6 = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new ContactsConsentsConfig(zD, zD2, zD3, account, zD4, zD5, strT, arrayListZ, zD6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ContactsConsentsConfig[i];
    }
}
