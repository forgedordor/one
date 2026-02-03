package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentSection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbia implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        DocumentSection[] documentSectionArr = null;
        Account account = null;
        boolean zD = false;
        String strT = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                documentSectionArr = (DocumentSection[]) dclv.J(parcel, i, DocumentSection.CREATOR);
            } else if (iD == 2) {
                strT = dclv.t(parcel, i);
            } else if (iD == 3) {
                zD = dclv.D(parcel, i);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                account = (Account) dclv.n(parcel, i, Account.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new DocumentContents(documentSectionArr, strT, zD, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DocumentContents[i];
    }
}
