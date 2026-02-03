package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddvd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListZ = null;
        ArrayList arrayListZ2 = null;
        ArrayList arrayListZ3 = null;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        String strT = "";
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
                    arrayListZ = dclv.z(parcel, i, Account.CREATOR);
                    break;
                case 4:
                    arrayListZ2 = dclv.z(parcel, i, Account.CREATOR);
                    break;
                case 5:
                    strT = dclv.t(parcel, i);
                    break;
                case 6:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 7:
                    arrayListZ3 = dclv.z(parcel, i, Account.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new ContactsConsentsCoarseStatus(zD, zD2, arrayListZ, arrayListZ2, strT, zD3, arrayListZ3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ContactsConsentsCoarseStatus[i];
    }
}
