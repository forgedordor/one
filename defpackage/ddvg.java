package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus;
import com.google.android.gms.people.consentprimitive.ContactsConsentsConfig;
import com.google.android.gms.people.consentprimitive.ContactsConsentsDetailedStatus;
import com.google.android.gms.people.consentprimitive.ContactsConsentsStatus;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddvg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = null;
        ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = null;
        ContactsConsentsConfig contactsConsentsConfig = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                contactsConsentsCoarseStatus = (ContactsConsentsCoarseStatus) dclv.n(parcel, i, ContactsConsentsCoarseStatus.CREATOR);
            } else if (iD == 2) {
                contactsConsentsDetailedStatus = (ContactsConsentsDetailedStatus) dclv.n(parcel, i, ContactsConsentsDetailedStatus.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                contactsConsentsConfig = (ContactsConsentsConfig) dclv.n(parcel, i, ContactsConsentsConfig.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new ContactsConsentsStatus(contactsConsentsCoarseStatus, contactsConsentsDetailedStatus, contactsConsentsConfig);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ContactsConsentsStatus[i];
    }
}
