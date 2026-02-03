package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddvg;
import defpackage.ejwh;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ContactsConsentsStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ContactsConsentsStatus> CREATOR = new ddvg();
    public final ContactsConsentsCoarseStatus a;
    public final ContactsConsentsDetailedStatus b;
    public final ContactsConsentsConfig c;

    public ContactsConsentsStatus(ContactsConsentsCoarseStatus contactsConsentsCoarseStatus, ContactsConsentsDetailedStatus contactsConsentsDetailedStatus, ContactsConsentsConfig contactsConsentsConfig) {
        this.a = contactsConsentsCoarseStatus;
        this.b = contactsConsentsDetailedStatus;
        this.c = contactsConsentsConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsStatus)) {
            return false;
        }
        ContactsConsentsStatus contactsConsentsStatus = (ContactsConsentsStatus) obj;
        return ejwh.a(this.a, contactsConsentsStatus.a) && ejwh.a(this.b, contactsConsentsStatus.b) && ejwh.a(this.c, contactsConsentsStatus.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, contactsConsentsCoarseStatus, i, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.k(parcel, 3, this.c, i, false);
        dclw.c(parcel, iA);
    }
}
